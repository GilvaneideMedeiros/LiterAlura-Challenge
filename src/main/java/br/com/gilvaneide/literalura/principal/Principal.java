package br.com.gilvaneide.literalura.principal;

import br.com.gilvaneide.literalura.model.DadosBusca;
import br.com.gilvaneide.literalura.model.DadosLivro;
import br.com.gilvaneide.literalura.service.ConsumoApi;
import br.com.gilvaneide.literalura.service.ConverteDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Optional;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

@Component
public class Principal {
    private Scanner leitura = new Scanner(System.in);

    @Autowired
    private ConsumoApi consumo;

    @Autowired
    private ConverteDados conversor;
    private final String ENDERECO = "https://gutendex.com/books/?search=";

    public void exibeMenu() {
        var opcao = -1;
        while (opcao != 0) {
            var menu = """
                1 - Buscar livro pelo título
                2 - Listar livros registrados
                3 - Listar nossos autores
                4 - Listar autores em determinado ano
                5 - Listar livros em determinado idioma
                        
                0 - Sair                                 
                """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    buscarLivroWeb();
                    break;
//              case 2:
//                  listarLivroRegistrado();
//                  break;
//              case 3:
//                  listarAutores();
//                  break;
//              case 4:
//                  listarAutoresPorAno();
//                  break;
//              case 5:
//                  listarLivrosPorIdioma();
//                  break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void buscarLivroWeb() {
        System.out.println("Digite o título do livro: ");
        var nomeLivro = leitura.nextLine();
        var nomeLivroCodificado = URLEncoder.encode(nomeLivro, StandardCharsets.UTF_8);
        var json = consumo.obterDados(ENDERECO + nomeLivroCodificado);
        var dadosBusca = conversor.obterDados(json, DadosBusca.class);
        Optional<DadosLivro> livroBuscado = dadosBusca.livros().stream().findFirst();

        if (livroBuscado.isPresent()) {
            DadosLivro dadosLivro = livroBuscado.get();
            System.out.println("\nLivro encontrado: ");
            System.out.println("Titulo: " + dadosLivro.titulo());
            System.out.println("Autores: " + dadosLivro.autores());
            System.out.println("Idiomas: " + dadosLivro.idiomas());
            //System.out.println("Ano: " + dadosLivro.ano());

            if (!dadosLivro.autores().isEmpty()) {
                System.out.println("Autor(es): " + dadosLivro.autores().get(0).nome());
            } else {
                System.out.println("Autor(es): Desconhecido");
            }

            System.out.println("Idioma: " + String.join(", ", dadosLivro.idiomas()));
            System.out.println("Downloads: " + dadosLivro.numeroDownloads());
            System.out.println("########################\n");

        } else {
            System.out.println("\nNenhum livro encontrado com esse título.\n");
        }
    }

    private DadosLivro getDadosLivro () {
        System.out.println("Digite o título do livro: ");
        String titulo = leitura.nextLine();
        var tituloCodificado = URLEncoder.encode(titulo, StandardCharsets.UTF_8);
        String json = consumo.obterDados(ENDERECO + tituloCodificado);
        DadosLivro dados = conversor.obterDados(json, DadosLivro.class);
        return dados;
    }
}









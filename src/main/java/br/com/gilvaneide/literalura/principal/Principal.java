package br.com.gilvaneide.literalura.principal;

import br.com.gilvaneide.literalura.model.DadosLivro;
import br.com.gilvaneide.literalura.service.ConsumoApi;
import br.com.gilvaneide.literalura.service.ConverteDados;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
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
        var livro = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + livro);
        var dados = conversor.obterDados(json, DadosLivro.class);
        System.out.println(livro);
    }

    private DadosLivro getDadosLivro () {
        String titulo = leitura.nextLine();
        String json = consumo.obterDados(ENDERECO + titulo);
        DadosLivro dados = conversor.obterDados(json, DadosLivro.class);
        return dados;
    }
}









package br.com.gilvaneide.literalura.service;

import br.com.gilvaneide.literalura.model.Autor;
import br.com.gilvaneide.literalura.model.Livro;
import br.com.gilvaneide.literalura.repository.AutorRepository;
import br.com.gilvaneide.literalura.repository.LivroRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CatalogoService {

    private final LivroRepository livroRepository;
    private final AutorRepository autorRepository;

    public CatalogoService(LivroRepository livroRepository, AutorRepository autorRepository) {
        this.livroRepository = livroRepository;
        this.autorRepository = autorRepository;
    }

    // A anotação @Transactional garante que a sessão com o banco de dados
    // permaneça aberta durante a execução de todo o método.
    // readOnly = true é uma otimização para operações de apenas leitura.
    @Transactional(readOnly = true)
    public List<Livro> listarLivrosRegistrados() {
        return livroRepository.findAllWithAutores();
    }

    @Transactional(readOnly = true)
    public List<Autor> listarAutoresRegistrados() {
        return autorRepository.findAllWithLivros();
    }

    @Transactional(readOnly = true)
    public List<Autor> listarAutoresVivosPorAno(int ano) {
        return autorRepository.buscarAutoresVivosNoAno(ano);
    }

    @Transactional(readOnly = true)
    public List<Livro> listarLivrosPorIdioma(String idioma) {
        return livroRepository.findByIdioma(idioma);
    }
}

package br.com.gilvaneide.literalura.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosLivro(@JsonAlias("title") String titulo,
                         @JsonAlias("id") String id,
                         @JsonAlias("authors") List<DadosAutor> autores,
                         @JsonAlias("published") String ano,
                         @JsonAlias("languages") List<String> idiomas) {
}

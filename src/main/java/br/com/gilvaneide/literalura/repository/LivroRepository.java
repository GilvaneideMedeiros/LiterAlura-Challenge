package br.com.gilvaneide.literalura.repository;

import br.com.gilvaneide.literalura.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}

package br.usjt.json_livro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.json_livro.model.Livro;

public interface LivroRepo extends JpaRepository<Livro, Long>{
	
}

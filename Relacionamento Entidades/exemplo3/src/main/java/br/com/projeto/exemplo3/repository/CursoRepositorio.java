package br.com.projeto.exemplo3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.exemplo3.model.Curso;

@Repository
public interface CursoRepositorio extends CrudRepository<Curso, Long> {
    
}

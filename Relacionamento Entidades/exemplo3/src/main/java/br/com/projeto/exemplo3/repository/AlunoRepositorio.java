package br.com.projeto.exemplo3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.exemplo3.model.Aluno;

@Repository
public interface AlunoRepositorio extends CrudRepository<Aluno, Long> {
    
}

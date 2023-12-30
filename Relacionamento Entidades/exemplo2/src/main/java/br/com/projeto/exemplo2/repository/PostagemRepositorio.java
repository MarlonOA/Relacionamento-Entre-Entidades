package br.com.projeto.exemplo2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.exemplo2.model.Postagem;

@Repository
public interface PostagemRepositorio extends CrudRepository<Postagem, Long> {
    
}

package br.com.projeto.exemplo1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.exemplo1.model.Colaborador;

@Repository
public interface ColaboradorRepositorio extends CrudRepository<Colaborador, Long> {

}

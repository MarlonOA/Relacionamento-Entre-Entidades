package br.com.projeto.exemplo1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.projeto.exemplo1.model.Cargo;

@Repository
public interface CargoRepositorio extends CrudRepository<Cargo, Long>{
    
}

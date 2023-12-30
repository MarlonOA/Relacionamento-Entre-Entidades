package br.com.projeto.exemplo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo1.model.Cargo;
import br.com.projeto.exemplo1.repository.CargoRepositorio;

@RestController
@RequestMapping("/cargos")
public class CargoController {

    @Autowired //com isso eu tenho acesso a comando de banco de dados como seleção, alteração, cadastramneto, exclusão. sem precisar instanciar o objeto
    private CargoRepositorio cargo_repositorio;

    //metodo para listar todos os cargos que temos adicionados na nossa tabela
    @GetMapping("/listar")
    public Iterable<Cargo> listar(){
        return cargo_repositorio.findAll();
    }

    //metodo responsavel pelo cadastramento dos cargos
    @PostMapping("/cadastrar")
    public Cargo cadastrar(@RequestBody Cargo obj){
        return cargo_repositorio.save(obj);
    }
}

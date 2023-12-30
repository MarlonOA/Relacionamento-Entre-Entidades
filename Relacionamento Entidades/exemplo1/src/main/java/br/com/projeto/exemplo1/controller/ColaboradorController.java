package br.com.projeto.exemplo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo1.model.Colaborador;
import br.com.projeto.exemplo1.repository.ColaboradorRepositorio;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorController {

    @Autowired //com isso eu tenho acesso a comando de banco de dados como seleção, alteração, cadastramneto, exclusão. sem precisar instanciar o objeto
    private ColaboradorRepositorio colaborador_repositorio;


    //metodo para listar todos os colaboradores que temos adicionados na nossa tabela
    @GetMapping("/listar")
    public Iterable<Colaborador> listar(){
        return colaborador_repositorio.findAll();//findAll funciona como um select
    }


    //metodo responsavel pelo cadastramento dos Colaboradores
    @PostMapping("/cadastrar")
    public Colaborador cadastrar(@RequestBody Colaborador obj){
        return colaborador_repositorio.save(obj);//o save vai cadastrar um obj do tipo colaborador que vai conter um codigo colaborador, um nome, e os dados referentes ao colaborador
    }
    
}

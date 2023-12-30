package br.com.projeto.exemplo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.exemplo2.model.Postagem;
import br.com.projeto.exemplo2.repository.PostagemRepositorio;

@RestController
@RequestMapping("/postagem")
public class PostagemController {

    //objeto private
    @Autowired
    private PostagemRepositorio postagem_repositorio;

    //metodo public
    @GetMapping("/listar")
    public Iterable<Postagem> listar(){
        return postagem_repositorio.findAll();
    }


    @PostMapping("/cadastrar")
    public Postagem cadastrar(@RequestBody Postagem obj) {
        return postagem_repositorio.save(obj);
    }



    
}

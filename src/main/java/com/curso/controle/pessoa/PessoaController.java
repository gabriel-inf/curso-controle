package com.curso.controle.pessoa;

import com.curso.model.pessoa.Pessoa;
import com.curso.model.pessoa.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class PessoaController{

    @Autowired
    private PessoaRepository pessoaRepo; 
    
    @GetMapping("/listarPessoas")
    public Iterable<Pessoa> listarPessoas(){
        return this.pessoaRepo.findAll(); 
    }


}
package com.curso.controle.pessoa;

import com.curso.model.pessoa.Pessoa;
import com.curso.model.pessoa.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/")
public class PessoaController{

    @Autowired
    private PessoaRepository pessoaRepo; 

    @GetMapping("/listarPessoas")
    public Iterable<Pessoa> listarPessoas(){
        return this.pessoaRepo.findAll(); 
    }

    @PostMapping(value="/cadastrarPessoa")
    public Pessoa postMethodName(@RequestBody Pessoa novaPessoa) {        
        return pessoaRepo.save(novaPessoa);
    }
    



}
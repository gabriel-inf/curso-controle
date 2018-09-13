package com.curso.controle.pessoa;

import com.curso.model.pessoa.Pessoa;
import com.curso.model.pessoa.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin
@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepo;

    @GetMapping("/listar")
    public Iterable<Pessoa> listarPessoas() {
        return this.pessoaRepo.findAll();
    }

    @PostMapping("/cadastrar")
    public Pessoa postMethodName(@RequestBody Pessoa novaPessoa) {
        return pessoaRepo.save(novaPessoa);
    }

}
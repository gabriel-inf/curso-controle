package com.curso.controle.pessoa;

import com.curso.model.pessoa.Pessoa;
import com.curso.model.pessoa.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin
@RestController
@RequestMapping("/apiPessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepo;

    /**
     * List all people in the repository
     * @return Iterable<pessoa>
     */
    @GetMapping("/pessoa")
    public Iterable<Pessoa> listarPessoas() {
        return this.pessoaRepo.findAll();
    }

    @PostMapping("/pessoa")
    public Pessoa postMethodName(@RequestBody Pessoa novaPessoa) {
        return pessoaRepo.save(novaPessoa);
    }


    

}
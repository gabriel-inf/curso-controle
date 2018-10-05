package com.curso.controle.pessoa;

import java.util.Optional;

import com.curso.model.pessoa.Pessoa;
import com.curso.model.pessoa.PessoaRepository;

import org.hibernate.PropertyNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javassist.NotFoundException;

//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin
@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    // GET, POST, PUT, DELETE

    @Autowired
    private PessoaRepository pessoaRepo;

    /**
     * List all people in the repository
     * 
     * @return Iterable<pessoa>
     */
    @GetMapping
    public Iterable<Pessoa> listarPessoas() {
        return this.pessoaRepo.findAll();
    }

    /**
     * Search a person by id
     * 
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Pessoa one(@PathVariable Long id) {
        return this.pessoaRepo.findById(id).orElseThrow(() -> new PropertyNotFoundException("Pessoa não encontrada"));
    }

    /**
     * Create a new Pessoa from object
     * 
     * @param novaPessoa
     * @return pessoa
     */
    @PostMapping
    public Pessoa postPessoa(@RequestBody Pessoa novaPessoa) {
        return pessoaRepo.save(novaPessoa);
    }

    /**
     * Put a pessoa in the system
     * 
     * @param id
     * @param newObjPessoa
     * @return
     */
    @PutMapping("/{id}")
    public Pessoa putPessoa(@PathVariable Long id, @RequestBody Pessoa newObjPessoa) {
        return this.pessoaRepo.findById(id).map(pessoa -> {
            pessoa.setNome(newObjPessoa.getNome());
            pessoa.setAtiva(newObjPessoa.getAtiva());
            pessoa.setRg(newObjPessoa.getRg());
            pessoa.setOnibus(newObjPessoa.getOnibus());
            pessoa.setParoquia(newObjPessoa.getParoquia());
            pessoa.setQuarto(newObjPessoa.getQuarto());
            pessoa.setSexo(newObjPessoa.getSexo());
            pessoa.setTamanhoCamisa(newObjPessoa.getTamanhoCamisa());
            return this.pessoaRepo.save(pessoa);
        }).orElseGet(() -> {
            return this.pessoaRepo.save(newObjPessoa);
        });
    }

    /**
     * Delete a person by id
     * 
     * @param id
     */
    @DeleteMapping("/{id}")
    public void deletePessoa(@PathVariable Long id) {
        this.pessoaRepo.deleteById(id);
    }

}
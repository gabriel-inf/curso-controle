package com.curso.controle.cursista;

import javax.websocket.server.PathParam;

import com.curso.model.cursista.Cursista;
import com.curso.model.cursista.CursistaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javassist.NotFoundException;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin
@RestController
@RequestMapping("/cursista")
public class CursistaController {

    @Autowired
    private CursistaRepository cursistaRepo;

    @GetMapping
    public Iterable<Cursista> listar() {
        return cursistaRepo.findAll();
    }

    @GetMapping("/{id}")
    public Cursista getOne(@PathVariable Long id) {
        return this.cursistaRepo.findById(id).get();
    }

    @PostMapping
    public Cursista cadastrar(@RequestBody Cursista novoCursista) {
        return cursistaRepo.save(novoCursista);
    }

    @PutMapping(value = "/{id}")
    public Cursista putMethodName(@PathVariable Long id, @RequestBody Cursista novoCursista) {

        return this.cursistaRepo.findById(id).map(cursista -> {

            cursista.setNome(novoCursista.getNome());
            cursista.setAtiva(novoCursista.getAtiva());
            cursista.setCanhoto(novoCursista.getCanhoto());
            cursista.setRg(novoCursista.getRg());
            cursista.setDescricao(novoCursista.getDescricao());
            cursista.setFoto(novoCursista.getDescricao());
            cursista.setFoto(novoCursista.getFoto());
            cursista.setOnibus(novoCursista.getOnibus());
            cursista.setParoquia(novoCursista.getParoquia());
            cursista.setQuarto(novoCursista.getQuarto());
            cursista.setSexo(novoCursista.getSexo());
            cursista.setTamanhoCamisa(novoCursista.getTamanhoCamisa());
            return this.cursistaRepo.save(cursista);

        }).orElseGet(() -> {
            return this.cursistaRepo.save(novoCursista);
        });
    }

    @DeleteMapping("/{id}")
    public void deactivateCursista(@PathVariable Long id) {
        Cursista c = this.cursistaRepo.findById(id).get();
        c.setAtiva(false);
        this.cursistaRepo.save(c);
    }

    

}
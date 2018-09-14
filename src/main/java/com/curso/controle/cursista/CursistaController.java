package com.curso.controle.cursista;

import com.curso.model.cursista.Cursista;
import com.curso.model.cursista.CursistaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin
@RestController
@RequestMapping("/cursista")
public class CursistaController {

    @Autowired
    private CursistaRepository cursistaRepo;

    @RequestMapping("/listar")
    public Iterable<Cursista> listar() {
        return cursistaRepo.findAll();
    }

    @PostMapping("/cadastrar")
    public Cursista cadastrar(@RequestBody Cursista novoCursista) {
        return cursistaRepo.save(novoCursista);
    }

}
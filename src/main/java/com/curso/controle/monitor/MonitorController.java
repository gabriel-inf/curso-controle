package com.curso.controle.monitor;

import java.util.Optional;

import com.curso.model.monitor.Monitor;
import com.curso.model.monitor.MonitorRepository;
import com.curso.model.pessoa.PessoaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin
@RestController
@RequestMapping("/monitor")
public class MonitorController {

    @Autowired
    private MonitorRepository monitorRepo;

    @RequestMapping("/listar")
    public Iterable<Monitor> listar() {
        return monitorRepo.findAll();
    }

    @PostMapping("/cadastrar")
    public Monitor cadastrar(@RequestBody Monitor novoMonitor) {
        return monitorRepo.save(novoMonitor);
    }

    @GetMapping("/desativar")
    public int desativar(Long id){
        return this.monitorRepo.desativarMonitor(id);
         
    }
}
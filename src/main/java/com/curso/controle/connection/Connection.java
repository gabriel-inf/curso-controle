package com.curso.controle.connection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/connection")
public class Connection {

    @GetMapping
    public String getRequest() {
        return "Puxou!";
    }


}
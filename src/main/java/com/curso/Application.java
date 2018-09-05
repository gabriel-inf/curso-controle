package com.curso;

import com.curso.model.pessoa.Pessoa;
import com.curso.model.pessoa.PessoaRepository;

import com.curso.FuncoesEnum;
import com.curso.ParoquiasEnum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner{


	@Autowired
    private PessoaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	//public Pessoa(String nome, ParoquiasEnum paroquia, FuncoesEnum funcao, String cpf, char tamanhoCamisa, Integer quarto, Integer onibus){

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Pessoa("Gabriel", ParoquiasEnum.ES, FuncoesEnum.COORDENADOR, "026.616.640-76", 'm', 13, 2));
	}
}

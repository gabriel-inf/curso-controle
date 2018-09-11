package com.curso;

import com.curso.model.monitor.Monitor;
import com.curso.model.monitor.MonitorRepository;
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
	
	@Autowired
	private MonitorRepository repo; 

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	//public Pessoa(String nome, ParoquiasEnum paroquia, FuncoesEnum funcao, String cpf, char tamanhoCamisa, Integer quarto, Integer onibus){

	@Override
	public void run(String... args) throws Exception {
		
		Monitor m1 = new Monitor("Gabriel", ParoquiasEnum.ES,  "026.616.640-76", 'm', 13, 2,
				FuncoesEnum.COORDENADOR);
		Monitor m2 = new Monitor("Bruno", ParoquiasEnum.ES,  "026.623.640-12", 'm', 13, 2,
				FuncoesEnum.COORDENADOR);
	
		repo.save(m1);
		repo.save(m2);

		System.out.println(repo.findAll().toString());
		
	
	}
}

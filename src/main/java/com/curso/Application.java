package com.curso;

import com.curso.model.cursista.Cursista;
import com.curso.model.cursista.CursistaRepository;
import com.curso.model.monitor.Monitor;
import com.curso.model.monitor.MonitorRepository;
import com.curso.model.pessoa.Pessoa;
import com.curso.model.pessoa.PessoaRepository;

import javax.management.loading.ClassLoaderRepository;

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
	private MonitorRepository repoMonitor;
	
	@Autowired
	private CursistaRepository repoCursista; 

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	//public Pessoa(String nome, ParoquiasEnum paroquia, FuncoesEnum funcao, String cpf, char tamanhoCamisa, Integer quarto, Integer onibus){

	@Override
	public void run(String... args) throws Exception {
		
		Monitor m1 = new Monitor("Gabriel", ParoquiasEnum.ES,  "026.616.640-76", 'm', 13, 2,
				FuncoesEnum.COORDENADOR, 'm', true);
		Monitor m2 = new Monitor("Bruno", ParoquiasEnum.NSFc,  "026.623.640-12", 'm', 13, 2,
				FuncoesEnum.BASE, 'm', true);

		Monitor m3 = new Monitor("Reba", ParoquiasEnum.ES,  "026.325.151-16", 'p', 12, 2,
				FuncoesEnum.COORDENADOR, 'f', true);	

		Cursista c1 = new Cursista("Ribelton", ParoquiasEnum.ES,  "026.623.640-12", 'g', 32, 1,
		"Ele é muito massa, geralmente sabe agir em situações de perigo.", 'm', false, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/User_icon_2.svg/220px-User_icon_2.svg.png");

		Cursista c2 = new Cursista("Artur", ParoquiasEnum.ES,  "026.623.640-12", 'g', 32, 1,
		"Ele é muito massa, geralmente sabe agir em situações de perigo.", 'm', false, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/User_icon_2.svg/220px-User_icon_2.svg.png");

		Cursista c3 = new Cursista("Roger", ParoquiasEnum.ES,  "026.623.640-12", 'g', 32, 1,
		"Ele é muito massa, geralmente sabe agir em situações de perigo.", 'm', false, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/User_icon_2.svg/220px-User_icon_2.svg.png");

		Cursista c4 = new Cursista("Amanda", ParoquiasEnum.ES,  "026.623.640-12", 'g', 32, 1,
		"Ele é muito massa, geralmente sabe agir em situações de perigo.", 'm', false, "https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/User_icon_2.svg/220px-User_icon_2.svg.png");

	
		// repository.save(m1);
		// repoMonitor.save(m2);
		// repoCursista.save(c2);
		// repoCursista.save(c3);
		// repoCursista.save(c4);
		// repository.save(m3);	
		
	
	}
}

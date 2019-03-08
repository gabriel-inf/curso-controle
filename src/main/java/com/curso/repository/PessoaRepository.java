package com.curso.repository;

import com.curso.model.Pessoa;

import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Long>{
    public Iterable<Pessoa> findAllByOrderByNomeAsc(); 
}
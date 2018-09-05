package com.curso.model.pessoa;


import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Long>{
    public Iterable<Pessoa> findAllByOrderByNomeAsc(); 
}
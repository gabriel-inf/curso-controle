package com.curso.repository;

import com.curso.model.Cursista;

import org.springframework.data.repository.CrudRepository;


public interface  CursistaRepository extends CrudRepository <Cursista, Long>{

    /**
        method that find all cursistas by university 
     */
    public Iterable<Cursista> findAllByComunidade(String comunidade);
}
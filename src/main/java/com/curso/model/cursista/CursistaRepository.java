package com.curso.model.cursista;

import org.springframework.data.repository.CrudRepository;

public interface  CursistaRepository extends CrudRepository <Cursista, Long>{

    /**
        method that find all cursistas by university 
     */
    public Iterable<Cursista> findAllByComunidade(String comunidade);
}
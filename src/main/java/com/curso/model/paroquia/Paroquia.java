package com.curso.model.paroquia;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.curso.ParoquiasEnum;

@Entity
public class Paroquia{
    

    @Id
    private Integer id;
    private ParoquiasEnum nome;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public ParoquiasEnum getNome() {
        return nome;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(ParoquiasEnum nome) {
        this.nome = nome;
    }
}
package com.curso.model.cursista;

import com.curso.model.pessoa.Pessoa;

public class Cursista extends Pessoa{
    
    private String descricao;

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }



}
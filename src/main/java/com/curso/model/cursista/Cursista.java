package com.curso.model.cursista;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.curso.FuncoesEnum;
import com.curso.ParoquiasEnum;
import com.curso.model.pessoa.Pessoa;

@Entity
@DiscriminatorValue( value="CUR" )
public class Cursista extends Pessoa{

    private String descricao;

    public Cursista(){
        super();
    }

    public Cursista(String nome, ParoquiasEnum paroquia,
        String cpf, char tamanhoCamisa, 
        Integer quarto, Integer onibus, String descricao, char sexo){
        super(nome, paroquia, cpf, tamanhoCamisa, quarto, onibus, sexo);    
        this.descricao = descricao;
    }

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
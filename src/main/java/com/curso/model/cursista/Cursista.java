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
    private String foto;

    public Cursista(){
        super();
    }

    public Cursista(String nome, ParoquiasEnum paroquia,
        String cpf, char tamanhoCamisa, 
        Integer quarto, Integer onibus, String descricao, 
        char sexo, Boolean ativa, String foto){
        super(nome, paroquia, cpf, tamanhoCamisa, quarto, onibus, sexo, ativa);    
        this.descricao = descricao;
        this.foto = foto;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
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
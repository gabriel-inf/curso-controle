package com.curso.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.*;


import com.curso.ParoquiasEnum;


@Entity
@DiscriminatorValue( value="CUR" )
public class Cursista extends Pessoa{

    @Column (length = 10000)
    private String descricao;
    @Column (length = 1000)
    private String foto;
    private Boolean canhoto; 
    private String comunidade;

    public Cursista(){
        super();
    }

    public Cursista(String nome, ParoquiasEnum paroquia,
        String cpf, String tamanhoCamisa, 
        String quarto, Integer onibus, String descricao, 
        char sexo, Boolean ativa, String foto, Boolean canhoto, String comunidade){
        super(nome, paroquia, cpf, tamanhoCamisa, quarto, onibus, sexo, ativa);    
        this.descricao = descricao;
        this.foto = foto;
        this.canhoto = canhoto;
        this.comunidade = comunidade;

    }


    /**
     * @return the comunidade
     */
    public String getComunidade() {
        return comunidade;
    }
    /**
     * @param comunidade the comunidade to set
     */
    public void setComunidade(String comunidade) {
        this.comunidade = comunidade;
    }

    /**
     * @return the canhoto
     */
    public Boolean getCanhoto() {
        return canhoto;
    }

    /**
     * @param canhoto the canhoto to set
     */
    public void setCanhoto(Boolean canhoto) {
        this.canhoto = canhoto;
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
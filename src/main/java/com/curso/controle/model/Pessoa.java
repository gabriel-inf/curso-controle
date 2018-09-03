package com.curso.controle.model;

import com.curso.controle.*;

public class Pessoa{

    private Integer id;
    private String nome;
    private ParoquiasEnum paroquia;
    private FuncoesEnum funcao;
    private String cpf;
    private char tamanhoCamisa;
    private Integer quarto;
    private Integer onibus;


    /**
     * @return the funcao
     */
    public FuncoesEnum getFuncao() {
        return funcao;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    /**
     * @return the paroquia
     */
    public ParoquiasEnum getParoquia() {
        return paroquia;
    }
    
    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(FuncoesEnum funcao) {
        this.funcao = funcao;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * @param paroquia the paroquia to set
     */
    public void setParoquia(ParoquiasEnum paroquia) {
        this.paroquia = paroquia;
    }





    
}
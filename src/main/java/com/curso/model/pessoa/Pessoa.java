package com.curso.model.pessoa;

import javax.persistence.Entity;

import com.curso.FuncoesEnum;
import com.curso.ParoquiasEnum;

@Entity
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
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @return the onibus
     */
    public Integer getOnibus() {
        return onibus;
    }

    /**
     * @return the quarto
     */
    public Integer getQuarto() {
        return quarto;
    }
    
    /**
     * @return the tamanhoCamisa
     */
    public char getTamanhoCamisa() {
        return tamanhoCamisa;
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

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @param onibus the onibus to set
     */
    public void setOnibus(Integer onibus) {
        this.onibus = onibus;
    }

    /**
     * @param quarto the quarto to set
     */
    public void setQuarto(Integer quarto) {
        this.quarto = quarto;
    }

    /**
     * @param tamanhoCamisa the tamanhoCamisa to set
     */
    public void setTamanhoCamisa(char tamanhoCamisa) {
        this.tamanhoCamisa = tamanhoCamisa;
    }




    
}
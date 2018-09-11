package com.curso.model.pessoa;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.curso.FuncoesEnum;
import com.curso.ParoquiasEnum;

@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn( name = "type" )
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private ParoquiasEnum paroquia;
    private String cpf;
    private char tamanhoCamisa;
    private Integer quarto;
    private Integer onibus;

    public Pessoa() {

    }

    public Pessoa(String nome, ParoquiasEnum paroquia, FuncoesEnum funcao, String cpf, char tamanhoCamisa,
            Integer quarto, Integer onibus) {

        this.nome = nome;
        this.paroquia = paroquia;
        this.cpf = cpf;
        this.tamanhoCamisa = tamanhoCamisa;
        this.quarto = quarto;
        this.onibus = onibus;
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
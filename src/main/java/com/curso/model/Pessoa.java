package com.curso.model;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.curso.ParoquiasEnum;

@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn( name = "type" )
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nome;
    private ParoquiasEnum paroquia;
    private String rg;
    private String tamanhoCamisa;
    private String quarto;
    private Integer onibus;
    private char sexo;
    private Boolean ativa;


    public Pessoa() {

    }

    public Pessoa(String nome, ParoquiasEnum paroquia, String rg, String tamanhoCamisa,
            String quarto, Integer onibus, char sexo, Boolean ativa) {

        this.nome = nome;
        this.paroquia = paroquia;
        this.rg = rg;
        this.tamanhoCamisa = tamanhoCamisa;
        this.quarto = quarto;
        this.onibus = onibus;
        this.sexo = sexo;
        this.ativa = ativa;
      
    }

    /**
     * @return the ativa
     */
    public Boolean getAtiva() {
        return ativa;
    }
    /**
     * @param ativa the ativa to set
     */
    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }


    /**
     * @return the id
     */
    public Long getId() {
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
     * @return the rg
     */
    public String getRg() {
        return rg;
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
    public String getQuarto() {
        return quarto;
    }

    /**
     * @return the tamanhoCamisa
     */
    public String getTamanhoCamisa() {
        return tamanhoCamisa;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
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
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
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
    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }

    /**
     * @param tamanhoCamisa the tamanhoCamisa to set
     */
    public void setTamanhoCamisa(String tamanhoCamisa) {
        this.tamanhoCamisa = tamanhoCamisa;
    }

}
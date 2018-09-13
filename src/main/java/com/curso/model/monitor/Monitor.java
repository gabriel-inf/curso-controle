package com.curso.model.monitor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.curso.FuncoesEnum;
import com.curso.ParoquiasEnum;
import com.curso.model.pessoa.Pessoa;

@Entity
@DiscriminatorValue( value="MON" )
public class Monitor extends Pessoa{
    
    private FuncoesEnum funcao;

    public Monitor(){
        super();
    }

    public Monitor(String nome, ParoquiasEnum paroquia,
    String cpf, char tamanhoCamisa, 
    Integer quarto, Integer onibus, FuncoesEnum funcao, char sexo){
    super(nome, paroquia, cpf, tamanhoCamisa, quarto, onibus, sexo);    
    this.funcao = funcao;
}

    /**
     * @return the funcao
     */
    public FuncoesEnum getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(FuncoesEnum funcao) {
        this.funcao = funcao;
    }

}
package com.curso.model.monitor;

import com.curso.FuncoesEnum;
import com.curso.model.pessoa.Pessoa;

public class Monitor extends Pessoa{
    
    private FuncoesEnum funcao;

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
package com.curso;

public enum FuncoesEnum{

    MONITOR_JOVEM_SALA("Jovem sala"),
    MONITOR_JOVEM_EXTERNA("Jovem externa"),
    MONITOR_ADULTO_SALA("Adulto sala"),
    MONITOR_ADULTO_EXTERNA("Adulto externa"),
    MONITOR_FOLCLORE("Folclore"),
    COORDENADOR("Coordenador"),
    BASE("Base"),
    LITURGIA("Liturgia"),
    COORDENADOR_DE_FOLCLORE("Coordenador folclore"),
    DIRETOR_ESPIRITUAL("Diretor esperitual"),
    FREI("Frei"),
    COORDENADOR_EXTERNA("Coordenador externa"),
    BEM_ESTAR_SALA("Bem estar sala"),
    BEM_ESTAR_EXTERNA("Bem estar externa");

    private String valor;


    private FuncoesEnum(String valorFuncao){
        valor = valorFuncao;
    }

}
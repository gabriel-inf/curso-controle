package com.curso;

public enum ParoquiasEnum{
    IC("IC"), SMG("SMG"), SR("SR"), SP("SP"), SA("SA"),
    NSFc("NSFc"), NSAe("NSAe"), NSCAR("NSCAR"), ES("ES"),
    NSR("NSR"), SV("SV"),
    NSG("NSG"),
    SL("SL"),
    NSC("NSC"),
    NSAc("NSAC"),
    SSC("SSC"),
    SCJ("SCJ"),
    SI("SI"),
    NSFs("NSFs"),
    SAMC("SAMC"),
    ICM("ICM");

    private String valor;

    private ParoquiasEnum(String valorParoquia){
        this.valor = valorParoquia;
    }

    public String getValue(){
        return this.valor;
    }

}
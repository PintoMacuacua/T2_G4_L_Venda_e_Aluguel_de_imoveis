package com.housesale;

public class Endereco {
    private static int cod = 0;
    private int id = 0;
    private String distrito;
    private String bairro;
    private String quarteirao;

    public Endereco(String distrito, String bairro, String quarteirao) {
        this.id = ++cod;
        this.bairro = bairro;
        this.distrito = distrito;
        this.quarteirao = quarteirao;
    }

    public int getId() {
        return id;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getQuarteirao() {
        return quarteirao;
    }

    public void setQuarteirao(String quarteirao) {
        this.quarteirao = quarteirao;
    }


}
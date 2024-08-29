package com.housesale;

import java.util.ArrayList;

public class Casa {
    private static int codigo = 1000;
    private int id;
    private double preco;
    private String tipo_casa;
    private String localizacao;

    public Casa(double preco, String tipo, String localizacao) {
        this.tipo_casa = tipo;
        this.preco = preco;
        this.localizacao = localizacao;
        this.id = ++codigo;
    }

    public String getTipo_casa() {
        return tipo_casa;
    }

    public int getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void listar() {
        System.out.println("\nCodigo da Casa: " + this.id);
        System.out.println("\nTipo da Casa: " + this.tipo_casa);
        System.out.println("\nPreco: " + this.preco);
        System.out.println("\nLocalizacao: " + this.localizacao);
        System.out.println("- - - - - - - - - - - - - - - - -");
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String toString() {
        return "\nCodigo da Casa: " + this.id +
                "\nTipo da Casa: " + this.getTipo_casa() +
                "\nPreco: " + this.getPreco() +
                "\nLocalizacao: " + this.getLocalizacao();
    }

}

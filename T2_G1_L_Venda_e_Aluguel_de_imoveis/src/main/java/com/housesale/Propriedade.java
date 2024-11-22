package com.housesale;

public class Propriedade {
    private static int cod = 0;
    private int id = 0;
    private int nr_quartos;
    private double preco_por_dia;
    private String disponibilidade;
    private Proprietario proprietario;
    private String descricao;

    public Propriedade(String disponibilidade, int nr_quartos, double preco_por_dia, Proprietario proprietario, String descricao) {
        this.disponibilidade = disponibilidade;
        this.nr_quartos = nr_quartos;
        this.preco_por_dia = preco_por_dia;
        this.proprietario = proprietario;
        this.descricao =descricao;
        this.id = ++cod;
    }
    

    public int getNr_quartos() {
        return nr_quartos;
    }

    public void setNr_quartos(int nr_quartos) {
        this.nr_quartos = nr_quartos;
    }

    public double getPreco_por_dia() {
        return preco_por_dia;
    }

    public void setPreco_por_dia(double preco_por_dia) {
        this.preco_por_dia = preco_por_dia;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }




}

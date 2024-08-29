package com.housesale;

public class Pessoa {
    private static int cod = 0;
    private int id;
    private String nome;
    private String email;
    private int telefone;
    private String endereco;

    public Pessoa(String nome, String email, int telefone, String endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;

        this.id = ++cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelfone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String toString() {
        return "\nId: " + this.id +
                "\nNome: " + this.getNome() +
                "\nEmail: " + this.getEmail() +
                "\nTelefone: " + this.getTelefone() +
                "\nEndereco: " + this.getEndereco();
    }
}

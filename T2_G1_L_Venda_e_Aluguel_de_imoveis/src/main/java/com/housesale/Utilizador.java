package com.housesale;

public class Utilizador {
    private static int cod = 0;
    private int id = 0;
    private String nome;
    private String email;
    private String telefone;
    private String senha;

    public Utilizador(String nome, String email, String telefone, String senha) {

        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;

        this.id = ++cod;
    }

    public void iniciarSessao() {

    }

    public void terminarSessao() {

    }

    public void visualizarPerfil() {

    }

    public void editarPerfil() {

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void listar() {
        System.out.println("\nId do Usuario: " + this.getId());
        System.out.println("\nNome: " + this.getNome());
        System.out.println("\nEmail: " + this.getEmail());
        System.out.println("\nTelefone: " + this.getTelefone());
        System.out.println("- - - - - - - - - - - - - - - - -");
    }
 
    public int getId() {
        return id;
    }

    public String toString() {
        return "\nId do Usuario: " + this.getId() +
                "\nNome: " + this.getNome() +
                "\nEmail: " + this.getEmail() +
                "\nTelefone: " + this.getTelefone();
    }

    public static int getCod() {
        return cod;
    }            
}

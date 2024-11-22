package com.housesale;

public class Arrendatario extends  Utilizador{
    private static int cod = 0;
    private int id = 0;
    private String nome;
    
    public Arrendatario(String nome, String email, String telefone, String senha) {
        super(nome, email, telefone, senha);  
        
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email inválido.");
        }
        this.id = ++cod;
    }

    

    public void recuperarSenha() {

    }

    public void fazerReserva() {

    }

    public void buscarPropriedade() {

    }

    public void avaliarPropriedade() {

    }

    public void setId(int id) {
        this.id = id;
    }



    public int getId() {
        return id;
    }

    
    
}

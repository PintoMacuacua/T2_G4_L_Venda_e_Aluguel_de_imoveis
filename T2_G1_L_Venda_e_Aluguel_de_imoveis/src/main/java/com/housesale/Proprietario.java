package com.housesale;

public class Proprietario extends Utilizador{
    private static int cod = 0;
    private int id =0;

    public Proprietario(String nome, String email, String telefone, String senha) {
        super(nome, email, telefone, senha);

        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email inválido.");
        }

        this.id = ++cod;
    }
    
    public void cadastrarPropriedade() {

    }

    public void editarPropriedade() {

    }

    public void removerPropriedade() {

    }

    public void visualizarReservas() {
        
    }
}

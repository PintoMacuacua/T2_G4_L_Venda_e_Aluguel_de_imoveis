package com.housesale;

public class Admin extends Utilizador{

    public Admin(String nome, String email, String telefone, String senha) {
        super(nome, email, telefone, senha);

        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email inválido.");
        }
    }
    
    
}

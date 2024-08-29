package com.housesale;

public class User extends Pessoa {
    private static int cod = 0;
    private int id = ++cod;

    public User(String nome, String email, int telefone, String endereco) {
        super(nome, email, telefone, endereco);

        this.id++;
    }

    public void listar() {
        System.out.println("\nId do Usuario: " + this.id);
        System.out.println("\nNome: " + this.getNome());
        System.out.println("\nEmail: " + this.getEmail());
        System.out.println("\nTelefone: " + this.getTelefone());
        System.out.println("\nMorada: " + this.getEndereco());
        System.out.println("- - - - - - - - - - - - - - - - -");
    }
 
    public int getId() {
        return id;
    }

    public String toString() {
        return "\nId do Usuario: " + this.id +
                "\nNome: " + this.getNome() +
                "\nEmail: " + this.getEmail() +
                "\nTelefone: " + this.getTelefone() +
                "\nEndereco: " + this.getEndereco();
    }
}

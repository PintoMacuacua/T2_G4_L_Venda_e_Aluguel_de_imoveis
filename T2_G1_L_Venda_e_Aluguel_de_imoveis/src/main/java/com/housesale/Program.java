package com.housesale;

import java.util.ArrayList;

public class Program {
    private ArrayList<Casa> listaDeCasas;
    private ArrayList<User> listaDeUsers;
    private ArrayList<Object> casa_usuario;

    public Program() {
        this.listaDeCasas = new ArrayList<>();
        this.listaDeUsers = new ArrayList<>();
        this.casa_usuario = new ArrayList<>();
    }

    public ArrayList<Casa> getListaDeCasas() {
        return listaDeCasas;
    }

    public void setListaDeCasas(ArrayList<Casa> listaDeCasas) {
        this.listaDeCasas = listaDeCasas;
    }

    public void cadastrarCasas(Casa novaCasa) {
        listaDeCasas.add(novaCasa);
        System.out.println("Casa adicionada com sucesso!");
    }

    public void listarCasas() {
        System.out.println("\nLista de Casas: ");

        for (Casa casaNaLista : listaDeCasas) {
            casaNaLista.listar();
        }

    }

    public void listarUsuarios() {
        System.out.println("\nLista de Usuarios: ");

        for (User usuariosNaLista : listaDeUsers) {
            usuariosNaLista.listar();
        }

    }

    public void cadastrarUsuario(User usuario) {
        listaDeUsers.add(usuario);
    }

    public void arrendarCasar(int codigo) {

        if (listaDeCasas.size() > 0) {
            for (Casa casa : listaDeCasas) {
                if (casa.getId() == codigo) {
                    for (User usuario : listaDeUsers) {
                        casa_usuario.add("\nid do usuario:" + usuario.getId() + "\nId da Casa: " + casa.getId());
                    }
                } else {
                    System.out.println("Casa nao encontrada!");
                }
            }

            System.out.println(casa_usuario);
        } else {
            System.out.println("Nao ha casas disponiveis");
        }
    }
}

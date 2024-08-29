package com.housesale;

import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Program relacionamento = new Program();

        int opc;

        do {
            System.out.println("\n#############################################");
            System.out.println("\n- - - - Venda e arrendamento de casas - - - -");
            System.out.println("\n1 - Arrendar");
            System.out.println("\n2 - Cadastrar Casa");
            System.out.println("\n0 - Sair");
            opc = input.nextInt();
            input.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("\n1 - Ver casas");
                    System.out.println("\n2 - Cadastrar-se");
                    System.out.println("\n0 - Voltar");
                    int esc = input.nextInt();
                    input.nextLine();

                    switch (esc) {
                        case 1:
                            relacionamento.listarCasas();

                            System.out.println("\n1 - Codigo da Casa a arrendar: ");
                            int cod = input.nextInt();

                            relacionamento.arrendarCasar(cod);
                            break;
                        case 2:
                            System.out.println("\nIntroduz o seu nome: ");
                            String nome = input.nextLine();
                            System.out.println("\nIntroduz o seu Email: ");
                            String email = input.next();
                            System.out.println("\nIntroduz o seu Telefone: ");
                            int telefone = input.nextInt();
                            System.out.println("\nIntroduz a sua morada: ");
                            String morada = input.nextLine();

                            User usuario = new User(nome, email, telefone, morada);

                            relacionamento.cadastrarUsuario(usuario);

                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Opcao Invalida!");
                            break;
                    }
                    break;

                case 2:
                    String res = "";
                    int i = 0;

                    System.out.println("Cadastre Casas e Clique - N - para terminar");
                    do {
                        System.out.println("\nInformacoes da " + (i + 1) + "ª Casa");
                        System.out.println("\nTipo da Casa: ");
                        String tipo_casa = input.nextLine();
                        System.out.println("\nPreco: ");
                        double preco = input.nextDouble();
                        input.nextLine();
                        System.out.println("\nLocalizacao: ");
                        String localizacao = input.nextLine();

                        Casa casa = new Casa(preco, tipo_casa, localizacao);
                        relacionamento.cadastrarCasas(casa);

                        relacionamento.listarUsuarios();

                        System.out.println("\nQuer Continuar? Y/N");
                        res = input.next();

                        input.nextLine();

                        i++;
                    } while (!res.equalsIgnoreCase("n"));
                    break;

                case 0:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcao Invalida!");
                    break;
            }
        } while (opc != 0);
    }
}
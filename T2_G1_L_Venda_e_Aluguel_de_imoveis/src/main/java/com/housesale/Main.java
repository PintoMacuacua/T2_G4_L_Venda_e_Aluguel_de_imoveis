/* Grupo 1 Laboral , Sistema de Aluguel e Venda de Imoveis 
  Discentes
  Alexandre Sumbane
  Alfredo Langa
  Pinto Armando
  Noel Martins
  Dionisio Laronha
  Ayram Muchate
*/
package com.housesale;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Program relacionamento = new Program();

        int opc;

        while (true) {
            try {
                System.out.println("\n#############################################");
                System.out.println("\n- - - - Venda e arrendamento de casas - - - -");
                System.out.println("\n1 - Arrendar");
                System.out.println("\n2 - Cadastrar Casa");
                System.out.println("\n0 - Sair");
                opc = input.nextInt();
                if (opc == 0) {
                    System.out.println("Fechando...");
                    break;
                }

                switch (opc) {
                    case 1:
                        int esc;
                        while (true) {
                            try {
                                System.out.println("\n1 - Ver casas");
                                System.out.println("\n2 - Cadastrar-se");
                                System.out.println("\n0 - Voltar");
                                esc = input.nextInt();
                                switch (esc) {
                                    case 1:
                                        relacionamento.listarCasas();

                                        while (true) {
                                            try {
                                                System.out.println("\n1 - Codigo da Casa a arrendar: ");
                                                int cod = input.nextInt();
                                                relacionamento.arrendarCasar(cod);
                                                break;
                                            } catch (InputMismatchException e) {
                                                System.out.println("Introduza um código válido! Tente novamente...");
                                                input.next();
                                            }
                                        }
                                        break;
                                    case 2:
                                        while (true) {
                                            try {
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
                                            } catch (InputMismatchException e) {
                                                System.out.println("Introduza dados válidos! Tente novamente...");
                                                input.next();
                                            }
                                        }
                                        break;
                                    case 0:
                                        break;
                                    default:
                                        System.out.println("Opcao Invalida!");
                                        break;
                                }
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Introduza um número inteiro! Tente novamente...");
                                input.next();
                            }
                        }

                    case 2:
                        while (true) {
                            try {
                                System.out.println("Cadastre Casas e Clique - N - para terminar");
                                int i = 0;
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
                                    String resposta = input.next();

                                    if (resposta.equalsIgnoreCase("y")) {
                                        // continuar
                                    } else if (resposta.equalsIgnoreCase("n")) {
                                        break;
                                    } else {
                                        System.out.println("Resposta inválida! Tente novamente...");
                                        continue;
                                    }

                                    i++;

                                } while (true);
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Introduza dados válidos! Tente novamente...");
                                input.next();
                            }
                        }
                        break;

                    default:
                        System.out.println("Opcao Invalida!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduza um número inteiro! Tente novamente...");
                input.next();
            }
        }
    }
}
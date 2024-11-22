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

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    // Simulamos uma lista de propriedades e utilizadores no sistema
    private static ArrayList<Propriedade> propriedades = new ArrayList<>();
    private static ArrayList<Arrendatario> arrendatarios = new ArrayList<>();
    private static ArrayList<Reserva> reservas = new ArrayList<>();

    public static void main(String[] args) {
        // Inicializar dados
        inicializarDados();

        // Simular arrendamento
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Sistema de Arrendamento de Imóveis ===");

        System.out.println("Escolha um Arrendatário pelo ID:");
        for (Arrendatario arr : arrendatarios) {
            System.out.println("ID: " + arr.getId() + " | Nome: " + arr.getNome());
        }
        int idArrendatario = scanner.nextInt();
        Arrendatario arrendatario = encontrarArrendatarioPorId(idArrendatario);

        if (arrendatario == null) {
            System.out.println("Arrendatário não encontrado.");
            return;
        }

        System.out.println("Escolha uma Propriedade pelo ID:");
        for (Propriedade prop : propriedades) {
            System.out.println("ID: " + prop.getId() + " | Preço: " + prop.getPreco_por_dia());
        }
        int idPropriedade = scanner.nextInt();
        Propriedade propriedade = encontrarPropriedadePorCodigo(idPropriedade);

        if (propriedade == null) {
            System.out.println("Propriedade não encontrada.");
            return;
        }

        System.out.println("Digite o valor total do pagamento:");
        double valorPagamento = scanner.nextDouble();

        if(valorPagamento < propriedade.getPreco_por_dia()) {
            System.out.println("Valor Insuficiente, deve pagar:"+ propriedade.getPreco_por_dia());

            return;
        }

        // Criar uma reserva
        Reserva reserva = new Reserva(arrendatario, propriedade, new Date(), new Date(), valorPagamento);
        reservas.add(reserva);

        // Processar pagamento
        Pagamento pagamento = new Pagamento(reserva, valorPagamento, "Cartão de Crédito");
        System.out.println("Pagamento processado com sucesso! Detalhes:");
        System.out.println("Valor: " + pagamento.getValor() + " | Método: " + pagamento.getMetodoPagamento());

        // Confirmar arrendamento
        System.out.println("Reserva confirmada para a propriedade " + propriedade.getDescricao() + ".");
    }

    private static void inicializarDados() {
        // Criar proprietários
        Proprietario proprietario1 = new Proprietario("João Silva", "joao@gmail.com", "864922", "1234");
        Proprietario proprietario2 = new Proprietario("Maria Santos","maria@gmail.com", "847777", "5678");

        // Criar propriedadesn
        propriedades.add(new Propriedade("Disponivel", 4 , 2000, proprietario1, "Dois banheros e piscina"));
        propriedades.add(new Propriedade("Disponivel", 3, 1200, proprietario2, "jardim e salao de eventos"));

        // Criar arrendatários
        arrendatarios.add(new Arrendatario("Carlos Oliveira", "carlos@gmail.com", "83111","senha123"));
        arrendatarios.add(new Arrendatario("Ana Pereira", "ana@gmail.com", "86777", "senha456"));
    }

    private static Propriedade encontrarPropriedadePorCodigo(int id) {
        for (Propriedade p : propriedades) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    private static Arrendatario encontrarArrendatarioPorId(int id) {
        for (Arrendatario a : arrendatarios) {
            if (a.getId() == id) return a;
        }
        return null;
    }
}


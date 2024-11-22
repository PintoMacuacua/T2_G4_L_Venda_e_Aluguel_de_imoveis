package com.housesale;

import java.util.Date;

public class Reserva {
    private static int cod = 0;
    private int id = 0;
    private Date data_inicio;
    private Date data_fim;
    private double  valor_total;
    private Arrendatario arrendatario;
    private Propriedade propriedade;
    private String status;

    public Reserva(Arrendatario arrendatario ,Propriedade propriedade, Date dataInicio, Date dataFim, double valorTotal) {
        this.arrendatario = arrendatario;
        this.propriedade = propriedade;
        this.data_inicio = dataInicio;
        this.valor_total = valorTotal;
        this.data_fim = dataFim;
        this.id = ++cod;
    }

    

    public void criarReserva() {

    }

    public void cancelarReserva() {

    }

    public void confirmarReserva() {

    }

    public void visualizarStatus() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public Arrendatario getArrendatario() {
        return arrendatario;
    }

    public void setArrendatario(Arrendatario arrendatario) {
        this.arrendatario = arrendatario;
    }

    public Propriedade getPropriedade() {
        return propriedade;
    }

    public void setPropriedade(Propriedade propriedade) {
        this.propriedade = propriedade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

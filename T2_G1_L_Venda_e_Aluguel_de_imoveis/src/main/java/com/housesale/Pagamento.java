package com.housesale;

import java.util.Date;

public class Pagamento {
    private static int cod = 0;
    private int id = 0;
    private Date data_pagamento;
    private String status;
    private Reserva reserva;
    private double valor;
    private String metodoPagamento;

    public Pagamento() {
        this.id = ++cod;
    }

    public Pagamento(Reserva reserva, double valor, String metodoPagamento) {
        this.id = ++cod;
        this.reserva = reserva;
        this.valor = valor;
        this.metodoPagamento = metodoPagamento;
    }

    
    public void efectuarPagamento() {

    }

    public void confirmarPagamento() {

    }

    public void cancelarPagamento() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(Date data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
}

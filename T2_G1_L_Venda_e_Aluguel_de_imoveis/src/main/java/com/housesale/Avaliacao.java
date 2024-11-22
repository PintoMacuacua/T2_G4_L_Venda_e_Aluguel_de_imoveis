package com.housesale;

import java.util.Date;

public class Avaliacao {
    private static int cod = 0;
    private int id = 0;
    private Arrendatario arrendatario;
    private Propriedade propriedade;
    private Date data; 
    private int nota;
    private String comentario;

    // Construtor
    public Avaliacao(int id, Arrendatario arrendatario, Propriedade propriedade, int nota, String comentario) {
        this.id = ++cod;
        this.arrendatario = arrendatario;
        this.propriedade = propriedade;
        this.nota = nota;
        this.comentario = comentario;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

}

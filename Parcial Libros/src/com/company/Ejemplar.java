package com.company;

import java.time.LocalDate;

public abstract class Ejemplar implements MetodoObligado{
    private int codigo;
    private String tituloOtitular;
    private LocalDate fechaPublicacion;
    private boolean Alquilado;

    public Ejemplar(int codigo, String tituloOtitular, LocalDate fechaPublicacion, boolean alquilado) {
        this.codigo = codigo;
        this.tituloOtitular = tituloOtitular;
        this.fechaPublicacion = fechaPublicacion;
        Alquilado = alquilado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTituloOtitular() {
        return tituloOtitular;
    }

    public void setTituloOtitular(String tituloOtitular) {
        this.tituloOtitular = tituloOtitular;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public boolean isAlquilado() {
        return Alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        Alquilado = alquilado;
    }



    @Override
    public String toString() {
        return " | Ejemplar[ " +
                " | Codigo: " + codigo +
                " | Titulo/ar: " + tituloOtitular +
                " | Fecha de Publicacion: " + fechaPublicacion +
                " | Alquilado: " + Alquilado +
                " ]";
    }


}

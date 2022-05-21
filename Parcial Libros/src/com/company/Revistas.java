package com.company;

import java.time.LocalDate;

public class Revistas extends Ejemplar implements MetodoObligado {

    public Revistas(int codigo, String tituloOtitular, LocalDate fechaPublicacion, boolean alquilado) {
        super(codigo, tituloOtitular, fechaPublicacion, alquilado);
    }

    @Override
    public Ejemplar alquilar(Ejemplar item) {
        if(item!=null) {
            if (item.isAlquilado()) {
                System.out.println("La revista " + item.getTituloOtitular() + " ya esta alquilado.");
            } else {
                System.out.println("La revista " + item.getTituloOtitular() + " esta disponible.");
                item.setAlquilado(true);
            }
        }
        return item;
    }

    @Override
    public Ejemplar devolver(Ejemplar item) {
        if(item!=null)
        {
            if(item.isAlquilado())
            {
                System.out.println("La revista fue devuelto con exito");
                item.setAlquilado(false);
            }
            else
            {
                System.out.println("La revista nunca fue retirado de la biblioteca.");
            }
        }
        return item;
    }

    @Override
    public void alquilado(Ejemplar item) {
        if(item!=null)
        {
            if(item.isAlquilado())
            {
                System.out.println("La revista esta alquilado.");
            }
            else
            {
                System.out.println("La revista esta disponible.");
            }
        }
    }
}
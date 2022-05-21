package com.company;

import java.time.LocalDate;

public class Libros extends Ejemplar implements MetodoObligado{
    private String Genero;

    public Libros(int codigo, String tituloOtitular, LocalDate fechaPublicacion, boolean alquilado, String genero) {
        super(codigo, tituloOtitular, fechaPublicacion, alquilado);
        Genero = genero;
    }

    @Override
    public Ejemplar alquilar(Ejemplar item) {
        if(item!=null) {
            if (item.isAlquilado()) {
                System.out.println("El libro " + item.getTituloOtitular() + " ya esta alquilado.");
            } else {
                System.out.println("El libro " + item.getTituloOtitular() + " esta disponible.");
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
                System.out.println("El libro fue devuelto con exito");
                item.setAlquilado(false);
            }
            else
            {
                System.out.println("El libro nunca fue retirado de la biblioteca.");
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
                System.out.println("El libro esta alquilado.");
            }
            else
            {
                System.out.println("El libro esta disponible.");
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Libros [" +
                " | Genero: " + Genero +
                ']';
    }
}

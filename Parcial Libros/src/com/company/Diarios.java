package com.company;

import java.time.LocalDate;

public class Diarios extends Ejemplar implements MetodoObligado{

        public Diarios(int codigo, String tituloOtitular, LocalDate fechaPublicacion, boolean alquilado) {
                super(codigo, tituloOtitular, fechaPublicacion, alquilado);
        }

        @Override
        public Ejemplar alquilar(Ejemplar item) {
                if(item!=null) {
                        if (item.isAlquilado()) {
                                System.out.println("El diario " + item.getTituloOtitular() + " ya esta alquilado.");
                        } else {
                                System.out.println("El diario " + item.getTituloOtitular() + " esta disponible.");
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
                                System.out.println("El dario fue devuelto con exito");
                                item.setAlquilado(false);
                        }
                        else
                        {
                                System.out.println("El diario nunca fue retirado de la biblioteca.");
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
                                System.out.println("El diario esta alquilado.");
                        }
                        else
                        {
                                System.out.println("El diario esta disponible.");
                        }
                }
        }
}

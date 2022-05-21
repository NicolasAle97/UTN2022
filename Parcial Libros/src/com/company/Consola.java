package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consola {
    List<Ejemplar>ListaBiblioteca=new ArrayList<Ejemplar>();

    public void CreateInstanse()
    {
        ListaBiblioteca.add(new Diarios(1,"Clarin", LocalDate.of(2015,04,19),false));
        ListaBiblioteca.add(new Diarios(2,"La Nacion",LocalDate.of(2012,04,19),false));
        ListaBiblioteca.add(new Libros(3,"Duendes",LocalDate.of(2000,04,19),false,Genero.Cuento.name()));
        ListaBiblioteca.add(new Libros(4, "Aliens",LocalDate.of(2005,04,19),false,Genero.Documental.name()));
        ListaBiblioteca.add(new Revistas(5,"Cocina",LocalDate.of(2008,04,19),false));
        ListaBiblioteca.add(new Revistas(6,"Peluqueria",LocalDate.of(2002,04,19),false));
    }

    public void ShowBiblioteca()
    {
        for(Ejemplar producto: ListaBiblioteca)
        {
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(producto.toString());
        }
    }


    public void Alquilar()
    {
        System.out.println(" [ MENU ALQUILER ] ");
        Scanner input=new Scanner(System.in);
        System.out.println("Ingresar titulo: ");
        String titulo=input.nextLine();

        for (Ejemplar producto:ListaBiblioteca)
        {
            if(producto.getTituloOtitular().equals(titulo))
            {
                producto=producto.alquilar(producto);
                break;
            }
        }
    }

    public void Devolver()
    {
        System.out.println(" [ MENU DEVOLVER ] ");
        Scanner input=new Scanner(System.in);
        System.out.println("Ingresar titulo: ");
        String titulo=input.nextLine();

        for (Ejemplar producto:ListaBiblioteca)
        {
            if(producto.getTituloOtitular().equals(titulo))
            {
                producto=producto.devolver(producto);
                break;
            }
        }
    }

    public void ConsultarAlquilados()
    {
            System.out.println(" [ MENU ALQUILADOS ] ");
            Scanner input=new Scanner(System.in);
            System.out.println("Ingresar titulo: ");
            String titulo=input.nextLine();

            for (Ejemplar producto:ListaBiblioteca)
            {
                if(producto.getTituloOtitular().equals(titulo))
                {
                    producto.alquilado(producto);
                }
            }
        }
    }




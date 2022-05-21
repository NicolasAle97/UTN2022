package com.company;

import java.util.*;

public class Consola {

    private List<Producto>ListaProductos=new ArrayList<>();

    public void CrearProductos()
    {
        ListaProductos.add(new Escritorio(10000,10,"Escritorio Negro",150,90));
        ListaProductos.add(new Escritorio(20000,15,"Escritorio Blanco",150,90));

        ListaProductos.add(new Silla(5000,10,"Silla Gamer Boy",true));
        ListaProductos.add(new Silla(5000,15,"Silla Gamer Girl",true));

        ListaProductos.add(new Notebook(15000,5,"Lenovo","Nicolas Ale",1500));
        ListaProductos.add(new Notebook(25000,15,"Apple","Nicolas Ale",1500));

        ListaProductos.add(new Impresora(50000,5,"HP","Nicolas Ale",45));
        ListaProductos.add(new Impresora(150000,15,"HD Print","Nicolas Ale",75));
    }

    public void ImprimirProductos()
    {
        for(Producto list:ListaProductos)
        {
            System.out.println(list.toString());
        }
    }

    public void AplicarDescuento()
    {
        for(Producto list:ListaProductos)
        {
            if(list instanceof Silla)
            {
                list.setPrice(((Silla) list).AplicarDescuento(50));
            }
            if(list instanceof Impresora)
            {
                list.setPrice(((Impresora) list).AplicarDescuento(50));
            }
        }
    }

    public void AplicarDescuentoATodo()
    {
        for(Producto list:ListaProductos)
        {
            if(list instanceof Silla)
            {
                list.setPrice(((Silla) list).AplicarDescuento(5));
            }
            if(list instanceof Impresora)
            {
                list.setPrice(((Impresora) list).AplicarDescuento(10));
            }
            if(list instanceof Escritorio)
            {
                list.setPrice(((Escritorio) list).AplicarDescuento(15));
            }
            if(list instanceof Notebook)
            {
                list.setPrice(((Notebook) list).AplicarDescuento(20));
            }
        }
    }
}

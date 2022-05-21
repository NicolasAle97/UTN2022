package com.company;

public class Main {

    public static void main(String[] args) {

        Consola consola=new Consola();

        consola.CrearProductos();
        consola.ImprimirProductos();

        System.out.println("------------Descuento a todos los productos----------------");
        consola.AplicarDescuentoATodo();
        System.out.println("-------------------Precios Modificados---------------------");
        consola.ImprimirProductos();


    }
}

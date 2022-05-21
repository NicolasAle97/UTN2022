package com.company;

public class Main {

    public static void main(String[] args) {

        Consola ejecutar=new Consola();
        ejecutar.CreateInstanse();
        ejecutar.ShowBiblioteca();

        System.out.println("------------------------------------------------");
        ejecutar.Alquilar();
        ejecutar.ConsultarAlquilados();
        ejecutar.Devolver();
        ejecutar.ConsultarAlquilados();
    }
}

/*

Roberto tiene 2 bibliotecas, ambas almacenan libros, diarios y revistas. Los cuales tienen las siguientes caracteristicas: codigo, titulo (o titular en caso de los diarios y revistas) y año de publicacion, que son pasadas por parametro al momento de crear los objetos.

Los libros pueden ser de distintos generos, novelas, cuentos, etc.
Los libros y las revistas poseen los siguientes metodos : alquilar(), devolver() y alquilado().
Los diarios solo se pueden leer en la biblioteca y Roberto quiere saber si el diario se esta leyendo o no.

Cosas obligatorias del ejercicio:

Superclase para aplicar herencia (Ejemplar)
Interfaz (alquilar(), devolver() y alquilado())
Enum (generos, novelas, cuentos, etc.)

Crear 3 libros (de distinto genero), 3 revistas y 3 diarios
Alquilar un libro y devolverlo
Mostrar errores si se quiere alquilar un libro alquilado
Mostrar errores si se quiere devolver una revista devuelta
Mostrar errores si se esta leyendo un diario

Mostrar un listado de libros, revistas y diarios disponibles y no disponibles.

 */


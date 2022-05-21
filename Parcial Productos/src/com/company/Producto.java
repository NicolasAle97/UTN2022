package com.company;

import java.util.Locale;

public abstract class Producto {
    public int price;
    public int stock;
    public String nombre;

    public Producto(int price, int stock, String nombre) {
        this.price = price;
        this.stock = stock;
        this.nombre = nombre;
    }

    /// El getter muestra el nombre con la primer letra mayuscula y las demas minusculas.
    public String getNombre() {
        String output = nombre.substring(0,1).toUpperCase()+ nombre.substring(1);
        return output;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return " | Producto [" +
                " | Price: " + price +
                " | Stock: " + stock +
                " | Nombre: " + getNombre() +
                ']';
    }
}

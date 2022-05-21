package com.company;

public abstract class ProductosTecnologicos extends Producto {
    public String NombreFabricante;

    public ProductosTecnologicos(int price, int stock, String nombre, String nombreFabricante) {
        super(price, stock, nombre);
        NombreFabricante = nombreFabricante;
    }

}

package com.company;

public class Escritorio extends Producto implements Descuento{
private double alto;
private double ancho;

    public Escritorio(int price, int stock, String nombre, double alto, double ancho) {
        super(price, stock, nombre);
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public int AplicarDescuento(int descuento) {
        int precio=0;
        int nuevoPrecio=0;
        precio=(this.getPrice()*descuento)/100;
        nuevoPrecio=this.getPrice()-precio;

        return nuevoPrecio;
    }

    @Override
    public String toString() {
        return  super.toString() +" | Escritorio ["  +
                " | Alto: " + alto +
                " | Ancho: " + ancho +
                        ']';
    }


}

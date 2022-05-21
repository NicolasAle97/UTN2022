package com.company;

public class Notebook extends ProductosTecnologicos implements Descuento{
    private int cantidadMemoria;

    public Notebook(int price, int stock, String nombre, String nombreFabricante, int cantidadMemoria) {
        super(price, stock, nombre, nombreFabricante);
        this.cantidadMemoria = cantidadMemoria;
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
        return super.toString() + " | Notebook [" + " | Cantidad De Memoria: " + cantidadMemoria +
                ']';
    }
}

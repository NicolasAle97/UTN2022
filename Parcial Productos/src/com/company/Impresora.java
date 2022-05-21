package com.company;

public class Impresora extends ProductosTecnologicos implements Descuento{

private int impresionesPorMinuto;

    public Impresora(int price, int stock, String nombre, String nombreFabricante, int impresionesPorMinuto) {
        super(price, stock, nombre, nombreFabricante);
        this.impresionesPorMinuto = impresionesPorMinuto;
    }

    @Override
    public int AplicarDescuento(int descuento) {
        int precio=0;
        int nuevoPrecio=0;

        precio=(this.getPrice()*descuento)/100;
        nuevoPrecio=(this.getPrice()-precio);

        return nuevoPrecio;
    }

    public int getImpresionesPorMinuto() {
        return impresionesPorMinuto;
    }

    @Override
    public String toString() {
        return super.toString() +" | Impresora [" +
                " | impresionesPorMinuto: " + impresionesPorMinuto +
                ']';
    }

}

package com.company;

public class Silla extends Producto implements Descuento{
    private boolean ruedas;

    public Silla(int price, int stock, String nombre, boolean ruedas) {
        super(price, stock, nombre);
        this.ruedas = ruedas;
    }

    public boolean isRuedas() {
        return ruedas;
    }

    public void setRuedas(boolean ruedas) {
        this.ruedas = ruedas;
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
        return super.toString() + " | Silla [" +
                " | Ruedas: " + ruedas +
                ']';
    }
}



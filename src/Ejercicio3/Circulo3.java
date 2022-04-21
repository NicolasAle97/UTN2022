package Ejercicio3;

public class Circulo3 extends Figuras{

    public Circulo3(String nombre, String color, double radio) {
        super(nombre, color, radio, 0.0, 0.0);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "Nombre='" + Nombre + '\'' +
                ", Color='" + Color + '\'' +
                ", Radio=" + Radio +
                '}';
    }
}


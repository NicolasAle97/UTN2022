package Ejercicio3;

public class Cilindro3 extends Figuras{

    public Cilindro3(String nombre, String color, double radio, double alto) {
        super(nombre, color, radio, 0, alto);
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "Nombre='" + Nombre + '\'' +
                ", Color='" + Color + '\'' +
                ", Radio=" + Radio +
                '}';
    }
}

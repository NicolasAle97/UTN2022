package Ejercicio3;

public class Cuadrado3 extends Figuras{
    public Cuadrado3(String nombre, String color, double base, double alto) {
        super(nombre, color, 0, base, alto);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "Nombre='" + Nombre + '\'' +
                ", Color='" + Color + '\'' +
                ", Base=" + Base +
                ", Alto=" + Alto +
                '}';
    }
}

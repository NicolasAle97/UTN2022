package Ejercicio3;

public class Rectangulo3 extends Figuras{

    public Rectangulo3(String nombre, String color, double base, double alto) {
        super(nombre, color, 0, base, alto);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "Nombre='" + Nombre + '\'' +
                ", Color='" + Color + '\'' +
                ", Base=" + Base +
                ", Alto=" + Alto +
                '}';
    }
}

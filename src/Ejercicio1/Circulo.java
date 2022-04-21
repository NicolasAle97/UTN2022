package Ejercicio1;

public class Circulo {

    private double Radio=1.0;
    private String Color="Rojo";


    public Circulo(double radio, String color) {
        Radio = radio;
        Color = color;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double radio) {
        Radio = radio;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void ImprimirCaracteristicasCirculo()
    {
        System.out.println("----------------------------");
        System.out.println(" Radio: "+Radio);
        System.out.println(" Color: "+Color);
        System.out.println("----------------------------");
    }

    public double CalcularAreaDelCirculo()
    {
        return (Radio*Radio*3.14);
    }


    public String toStringCirculo() {
        return "Circulo{" +
                "Radio=" + Radio +
                ", Color='" + Color + '\'' +
                '}';
    }
}


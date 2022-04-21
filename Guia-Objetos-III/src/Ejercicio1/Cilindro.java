package Ejercicio1;

public class Cilindro extends Circulo{
    private double Altura=1.0;

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        Altura = altura;
    }

    public double CalcularVolumenDeCilindro()
    {
        return ((3.14*Altura)*(getRadio()*getRadio()));
    }

    ///AreaCilindro = 2 π r ( r + h )
    public double CalcularAreaDelCilindro()
    {
        return (Math.pow(3.14,2)*getRadio()*(getRadio()+Altura));
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public void ImprimirCaracteristicasCilindro()
    {
        System.out.println("----------------------------------------------------------------");
        System.out.println("--CARACTERISTICAS DEL CILINDRO--");
        System.out.println("   Radio: "+getRadio());
        System.out.println("   Color: "+getColor());
        System.out.println("   Altura: "+Altura);
        System.out.println("----------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return "Cilindro:subclase de{" +toStringCirculo()+
                "Altura=" +Altura+
                '}';
    }
}

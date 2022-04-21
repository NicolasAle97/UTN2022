package Ejercicio3;

public abstract class Figuras {
    protected String Nombre="FiguraDefault";
    protected String Color="Rojo";
    protected double Radio=1.0;
    protected double Base=1.0;
    protected double Alto=1.0;

    public Figuras(String nombre, String color, double radio, double base, double alto) {
        Nombre = nombre;
        Color = color;
        Radio = radio;
        Base = base;
        Alto = alto;
    }

    public double getRadio() {
        return Radio;
    }


    /* CALCULAR VOLUMEN Y AREA DE UN CILINDRO */

    public double CalcularVolumenCilindro()
    {
        return ((3.14*Alto)*(getRadio()*getRadio()));
    }

    ///AreaCilindro = 2 π r ( r + h )
    public double CalcularAreaCilindro()
    {
        return (Math.pow(3.14,2)*getRadio()*(getRadio()+Alto));
    }

    /* CALCULAR PERIMETRO Y AREA DE UN CIRCULO */

    public double CalcularAreaDelCirculo()
    {
        return (Radio*Radio*3.14);
    }

    public double CalcularPerimetroCirculo()
    {
        return 2*3.14*Radio;
    }
    /* CALCULAR PERIMETRO Y AREA DE UN RECTANGULO */

    public double CalcularPerimetroRectangulo()
    {
        return 2*(Base+Alto);
    }

    /// resultado en cm2
    public double CalcularAreaRectangulo()
    {
        return Base*Alto;
    }

    /* CALCULAR PERIMETRO Y AREA DE UN CUADRADO */
    /// Se puede usar las mismas funciones que en el rectangulo.
    public double CalcularAreaCuadrado()
    {
        return Base*Alto;
    }

    public double CalcularPerimetroCuadrado()
    {
        return 2*(Base+Alto);
    }

}


import Ejercicio1.Cilindro;
import Ejercicio2.Estudiantes;
import Ejercicio2.Persona;
import Ejercicio2.Staff;
import Ejercicio3.*;


public class main {

    public static void main(String[] args) {

        System.out.println("\n\n\n---------------------EJERCICIO 1----------------------------");

        Cilindro cilindroUno = new Cilindro(1.0,"Rojo",1.0);
        cilindroUno.ImprimirCaracteristicasCilindro();
        System.out.println("El volumen del cilindro es: "+cilindroUno.CalcularVolumenDeCilindro());
        System.out.println("El radio del cilindro es: "+cilindroUno.CalcularAreaDelCirculo());


        Cilindro cilindroDos = new Cilindro(10, "Gris",10);
        cilindroDos.ImprimirCaracteristicasCilindro();
        System.out.println("El volumen del cilindro es: "+cilindroDos.CalcularVolumenDeCilindro());
        System.out.println("El radio del cilindro es: "+cilindroDos.CalcularAreaDelCilindro());

        /// Modificar el método toString() de la clase cilindro para que imprima por
        /// pantalla lo siguiente
        System.out.println(cilindroDos.toString());
        /// Cilindro: subclase de + {toString() de Círculo} +altura= {alturaCilindro};

        System.out.println("\n\n\n---------------------EJERCICIO 2----------------------------");

        Estudiantes Nicolas=new Estudiantes("40.222.111","Nicolas","Ale","Nico@hotmail.com","Maiamee",2022,1000,"Programacion");
        Estudiantes Nacho=new Estudiantes("40.333.222","Nacho","Ali","Nacho@hotmail.com","Maiamee",2022,1000,"Diseño");
        Estudiantes Nora=new Estudiantes("40.444.333","Nora","Ala","Nora@hotmail.com","Maiamee",2022,1000,"Enginner");
        Estudiantes Nata=new Estudiantes("40.555.444","Nata","Alo","Nata@hotmail.com","Maiamee",2022,1000,"Natacion");

        Staff Mica=new Staff("30.111.722","Micaela","Macchi","Mica@hotmail.com","Noruegaa",4000,"Mañana");
        Staff Maca=new Staff("30.222.522","Maca","acchi","Maik@hotmail.com","Noruegaa",4000,"Mañana");
        Staff Mora=new Staff("30.333.122","Mora","Mocchi","Mochi@hotmail.com","Noruegaa",4000,"Noche");
        Staff Maluma=new Staff("30.444.322","Maluma","chi","Micha@hotmail.com","Noruegaa",4000,"Noche");

        System.out.println("------------------------------------------------------------");
        System.out.println("Recorrer el Array y contar cuales son Estudiantes o Staff.");

        Persona [] personas = new Persona[8];

        personas[0]=Nicolas;
        personas[1]=Nacho;
        personas[2]=Nora;
        personas[3]=Nata;
        personas[4]=Mica;
        personas[5]=Maca;
        personas[6]=Mora;
        personas[7]=Maluma;

        int i=0;
        int ContadorStaff=0;
        int ContadorEstudiantes=0;

        while (i<=7) {
            if(personas[i]!=null) {
                if (personas[i] instanceof Estudiantes) {
                ContadorEstudiantes++;
                }
                else if(personas[i] instanceof Staff) {
                ContadorStaff++;
                }
            }
            i++;
        }
        System.out.println("Cantidad de Estudiantes: "+ContadorEstudiantes);
        System.out.println("Cantidad de Staff: "+ContadorStaff);

        i=0;
        int DineroTotal=0;

        while (i<=7) {
            if (personas[i] != null) {
                if (personas[i] instanceof Estudiantes) {
                    DineroTotal = ((Estudiantes) personas[i]).getCuotaMensual() + DineroTotal;
                }
            }
            i++;
        }
        System.out.println("La institucion percibe el monto total de $"+DineroTotal+" de parte de todos los Estudiantes.");


        System.out.println("\n\n\n---------------------EJERCICIO 3----------------------------");

        Figuras [] ArregloDeFiguras=new Figuras[4];

        Cilindro3 unCilindro=new Cilindro3("unCilindro","Blanco",50, 50);
        Rectangulo3 unRectangulo=new Rectangulo3("unRectangulo","Azul",50,50);
        Cuadrado3 unCuadrado=new Cuadrado3("unCuadrado","Amarillo",20,20);
        Circulo3 unCirculo=new Circulo3("unCirculo","Rojo",30);

        ArregloDeFiguras[0]=unCilindro;
        ArregloDeFiguras[1]=unRectangulo;
        ArregloDeFiguras[2]=unCuadrado;
        ArregloDeFiguras[3]=unCirculo;

        for(int j=0;j<ArregloDeFiguras.length;j++)
        {
            System.out.println("-------------------------------------------------------------------");
            System.out.println(ArregloDeFiguras[j].toString());
            if(ArregloDeFiguras[j] instanceof Circulo3) {
                System.out.println("El Area del Circulo es: "+ArregloDeFiguras[j].CalcularAreaDelCirculo());
                System.out.println("El Perimetro del Circulo es: "+ArregloDeFiguras[j].CalcularPerimetroCirculo());
            }else if(ArregloDeFiguras[j] instanceof Rectangulo3)
            {
                System.out.println("El Area del Rectangulo es: "+ArregloDeFiguras[j].CalcularAreaRectangulo());
                System.out.println("El Perimetro del Rectangulo es: "+ArregloDeFiguras[j].CalcularPerimetroRectangulo());
            }else if(ArregloDeFiguras[j] instanceof Cuadrado3)
            {
                System.out.println("El Area del Cuadrado es: "+ArregloDeFiguras[j].CalcularAreaCuadrado());
                System.out.println("El Perimetro del Cuadrado es: "+ArregloDeFiguras[j].CalcularPerimetroCuadrado());
            }else if(ArregloDeFiguras[j] instanceof Cilindro3)
            {
                System.out.println("El Area del Cilindro es: "+ArregloDeFiguras[j].CalcularAreaCilindro());
                System.out.println("El Volumen del Cilindro es: "+ArregloDeFiguras[j].CalcularVolumenCilindro());
            }
            System.out.println("-------------------------------------------------------------------");
        }

    }
}

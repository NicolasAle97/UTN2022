package Ejercicio2;

public class Staff extends Persona{

    private double salario;
    private String turno; /// Mañana o Noche.

    public Staff(String dni, String nombre, String apellido, String email, String direccion, double salario, String turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }


}

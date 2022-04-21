package Ejercicio2;

public class Estudiantes extends Persona{

    private int AñoIngreso;
    private int CuotaMensual;
    private String Carrera;

    public Estudiantes(String dni, String nombre, String apellido, String email, String direccion, int añoIngreso, int cuotaMensual, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        AñoIngreso = añoIngreso;
        CuotaMensual = cuotaMensual;
        Carrera = carrera;
    }

    public int getCuotaMensual() {
        return CuotaMensual;
    }
}

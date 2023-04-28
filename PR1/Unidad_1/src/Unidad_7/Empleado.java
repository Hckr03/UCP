package Unidad_7;

public class Empleado {

    private final String primerNombre;
    private final String apellidoPaterno;
    private final Fecha fechaNacimiento;
    private final Fecha fechaContratacion;

    public Empleado(String nombre, String apellido, Fecha fechaDeContratacion, Fecha fechaDeNacimiento) {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        fechaContratacion = fechaDeContratacion;
        fechaNacimiento = fechaDeNacimiento;
    }

    public String toString() {
        return String.format("%s, %s Nacimiento: %s Contratado: %s", apellidoPaterno, primerNombre, fechaNacimiento, fechaContratacion);
    }

}

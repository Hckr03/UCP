package Unidad_7;

public class EmpleadoP6 {
    private String primerNombre;
    private String apellidoPaterno;
    private static int cuenta = 0;
    static int num = 0;

    public EmpleadoP6(String nombre, String apellido) {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        ++cuenta;
        System.out.printf("Constructor de Empleado: %s %s; cuenta = %d\n", primerNombre, apellidoPaterno, cuenta);
    }
    public String getPrimerNombre() {
        return primerNombre;
    }
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public static int getCuenta() {
        return cuenta;
    }
    public static void setCuenta(int cuenta) {
        EmpleadoP6.cuenta = cuenta;
    }
    public static int getNum() {
        return num;
    }
    public static void setNum(int num) {
        EmpleadoP6.num = num;
    }
}

package Unidad_7;

public class PruebaEmpleadoP6 {

    public static void main(String[] args) {
        System.out.printf("Empleados antes de instanciar: %d\n", EmpleadoP6.getCuenta());
        EmpleadoP6 e1 = new EmpleadoP6("Susan", "Baker");
        EmpleadoP6 e2 = new EmpleadoP6("Bob", "Blue");

        System.out.println("\nEmpleados despues de instanciar: ");
        System.out.printf("mediante e1.getCuenta(): %d\n", EmpleadoP6.getCuenta());
        System.out.printf("mediante e2.getCuenta(): %d\n", EmpleadoP6.getCuenta());
        System.out.printf("mediante Empleado.getCuenta(): %d\n", EmpleadoP6.getCuenta());

        EmpleadoP6 e3 = new EmpleadoP6("", "");
        System.out.println("Cuenta " + EmpleadoP6.getCuenta());
        System.out.printf("\nEmpleado 1: %s %s \nEmpleado 2: %s %s\n\n", e1.getPrimerNombre(), e1.getApellidoPaterno(),
                e2.getPrimerNombre(), e2.getApellidoPaterno());
        e1 = null;
        e2 = null;
    }
}

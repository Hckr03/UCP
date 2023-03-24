package Unidad_3.tarea;
import java.util.Scanner;

public class PruebaEmpleado {
    public static void main(String[] args) {
        //cargando valores directamente en el constructor
        Empleado employee1 = new Empleado("Gabriel", "Caballero", 3500000);

        //cargando valores por medio de la consola
        Empleado employee2 = new Empleado();
        Scanner sc = new Scanner(System.in);

        System.out.print("Cargar nombre del empleado: ");
        var nombre = sc.nextLine();
        employee2.setNombre(nombre);

        System.out.print("Cargar apellido del empleado: ");
        var apellido = sc.nextLine();
        employee2.setApellido(apellido);

        System.out.print("Cargar apellido del empleado: ");
        var salary1 = sc.nextDouble();
        employee2.setSalarioMensual(salary1);

        System.out.printf("El salario anual del Empleado1 es: %.2f\n",
                employee1.getSalarioMensual()*12);
        System.out.printf("El salario anual del Empleado2 es: %.2f\n\n",
                salary1*12);

        var salary2 = employee1.getSalarioMensual();
        var salarioAumentado1 = (((salary2*0.1) + salary2)*12);
        System.out.printf("El salario anual con el aumento del 10 del Empleado1 es: %.2f\n",
                salarioAumentado1);

        var salarioAumentado2 = (((salary1*0.1) + salary1)*12);
        System.out.printf("El salario anual con el aumento del 10 del Empleado1 es: %.2f\n",
                salarioAumentado2);
    }
}
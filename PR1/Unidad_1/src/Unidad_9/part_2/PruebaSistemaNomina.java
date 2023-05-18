package Unidad_9.part_2;

public class PruebaSistemaNomina {
    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado
                = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        EmpleadoPorHoras empleadoPorHoras
                = new EmpleadoPorHoras("Karen", "Price", "222-22-2222", 16.75, 40);
        EmpleadoPorComision empleadoPorComision
                = new EmpleadoPorComision("Sue", "Jones", "333-33-3333", 10000, .06);
        EmpleadoBaseMasComision empleadoBaseMasComision
                = new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444", 5000, .04, 300);

        System.out.println("Empleados procesados por separado:\n");

        System.out.printf("%s\n%s: $%.2f\n\n",
                empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%.2f\n\n",
                empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());
        System.out.printf("%s\n%s: $%.2f\n\n",
                empleadoPorComision, "ingresos", empleadoPorComision.ingresos());
        System.out.printf("%s\n%s: $%.2f\n\n",
                empleadoBaseMasComision, "ingresos", empleadoBaseMasComision.ingresos());

        Empleado[] empleados = new Empleado[4];

        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;

        for(Empleado empleadoActual : empleados){
            System.out.println(empleadoActual.toString());

            if(empleadoActual instanceof  EmpleadoBaseMasComision){
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision)empleadoActual;

                empleado.setSalarioBase(1.10 * empleado.getSalarioBase());

                System.out.printf(
                        "el nuevo salario base con 10%% de aumento es: $%,.2f\n",
                        empleado.getSalarioBase()
                );
            }
            System.out.printf(
                    "ingresos $%.2f\n\n", empleadoActual.ingresos()
            );
        }
    }
}

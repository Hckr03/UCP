package Unidad_9.Tarea_1;


public class PruebaSistemNomina {

    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado(
                "John",
                "Smith",
                "111-11-1111",
                800.00
        );
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras(
                "Karen",
                "Price",
                "222-22-2222",
                16.75,
                40
        );
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision(
                "Sue",
                "Jones",
                "333-33-3333",
                10000,
                .06
        );
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision(
                "Bob",
                "Lewis",
                "444-44-4444",
                5000,
                .04,
                300
        );
        EmpleadoPorPiezas empleadoPorPiezas = new EmpleadoPorPiezas(
                "Pepe",
                "Gonzalez",
                "123-45-6789",
                1200,
                21
        );

        System.out.println("Empleados procesados en forma polimorfica:\n");

        Empleado[] empleados = new Empleado[5];

        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;
        empleados[4] = empleadoPorPiezas;

        for(Empleado empleadoActual : empleados){
            System.out.println(empleadoActual.toString());

            if(empleadoActual instanceof EmpleadoBaseMasComision){
                EmpleadoBaseMasComision empleado = (EmpleadoBaseMasComision)empleadoActual;

                empleado.setSalarioBase(1.10 * empleado.getSalarioBase());

                System.out.printf(
                        "el nuevo salario base con 10%% de aumento es: $%,.2f\n",
                        empleado.getSalarioBase()
                );
            }
            System.out.printf(
                    "ingresos $%,.2f\n\n", empleadoActual.ingresos()
            );
        }

        for (int i = 0; i < empleados.length; i++){
            System.out.printf("El empleado %d es un %s\n",
                    i,
                    empleados[i].getClass().getName());
        }
    }
}

package Unidad_9.part_1;

public class PruebaPolimorfismo {
    public static void main(String[] args) {
        EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision(
                "Sue",
                "Jones",
                "222-22-2222",
                10000,
                .06
        );

        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision(
                "Don",
                "Torreto",
                "333-33-3333",
                5000,
                .04,
                300
        );

        System.out.printf("%s %s:\n\n%s\n\n",
                "Llamada a ToString de EmpleadosBasePorComision con referencia",
                "a un objeto de la superclase",
                empleadoBaseMasComision.toString()
        );

        System.out.printf("%s %s:\n\n%s\n\n",
                "Llamada a ToString de EmpleadosBasePorComision con referencia",
                "de subclase a un objeto de la subclase",
                empleadoBaseMasComision.toString()
        );

        System.out.printf("%s %s:\n\n%s\n\n",
                "Llamada a ToString de EmpleadosBasePorComision con referencia",
                "de super clase",
                empleadoBaseMasComision.toString()
        );
    }
}

package Unidad_8;

/**
 * @author hckr
 */
public class PruebaEmpleandoPorComision {
    public static void main(String[] args) {
        EmpleadoPorComision empleado = new EmpleadoPorComision(
                "Sue", "Jones", "222-22-222", 1000, .06
        );
        System.out.println(
                "Informacion del empleado obtenida por los metodos establecer: \n"
        );
        System.out.printf("%s %s\n", "El primer nombre es",
                empleado.getPrimerNombre()
        );
        System.out.printf("%s %s\n", "El apellido paterno es",
                empleado.getApellidoPaterno()
        );
        System.out.printf("%s %s\n", "El numero de seguro social es",
                empleado.getNumeroSeguroSocial()
        );
        System.out.printf("%s %.2f\n", "Las ventas brutas son",
                empleado.getVentasBrutas()
        );
        System.out.printf("%s %.2f\n", "La tarifa de comision es",
                empleado.getTarifaComision()
        );
    }
}

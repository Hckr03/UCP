package Unidad_8;

/**
 * @author hckr
 */
public class PruebaEmpleadoBaseMasComision {
    public static void main(String[] args) {
        EmpleadoBaseMasComision empleado = new EmpleadoBaseMasComision(
                "Bob", "Lewis", "333-33-3333",
                5000, .04, 300
        );
        System.out.println(
                "Informacion del empleado obtenida por metodos establecer: \n"
        );
        System.out.printf("%s %s\n", "El primer nombre es",
                empleado.getPrimerNombre()
        );
        System.out.printf("%s %s\n", "El apellido es",
                empleado.getApellidoPaterno()
        );
        System.out.printf("%s %s\n", "El numero de seguro social es",
                empleado.getNumeroSeguroSocial()
        );
        System.out.printf("%s %.2f\n", "Las ventas brustas son",
                empleado.getVentasBrutas()
        );
        System.out.printf("%s %.2f\n", "La tarifa de comision es",
                empleado.getTarifaComision()
        );
        System.out.printf("%s %.2f\n", "El salario base es",
                empleado.getSalarioBase()
        );
        try{
            empleado.setSalarioBase(-1000);
        }catch(IllegalArgumentException e){
            System.out.println("Error " + e.getMessage());
        }
        System.out.printf("\n%s:\n\n%s\n",
                "Informacion actualizada del empleado, obtenida por toString",
                empleado.toString()
        );
    }
}

package Unidad_9.part_2;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;
    public EmpleadoBaseMasComision(String primerNombre,
                                   String apellidoPaterno,
                                   String numeroSeguroSocial,
                                   double ventasBrutas,
                                   double tarifaComision,
                                   double salarioBase) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);
        setSalarioBase(salarioBase);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if(salarioBase >= 0.0){
            this.salarioBase = salarioBase;
        }else{
            throw new IllegalArgumentException(
                    "El salario base debe ser >= 0.0"
            );
        }
    }

    @Override
    public double ingresos() {
        return salarioBase + super.ingresos();
    }

    @Override
    public String toString() {
        return String.format("%s %s\n%s: %,.2f",
                "con sueldo base",  super.toString(),
                "sueldo base", salarioBase);
    }

}

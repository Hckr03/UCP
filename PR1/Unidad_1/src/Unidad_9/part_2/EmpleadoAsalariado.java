package Unidad_9.part_2;

public class EmpleadoAsalariado extends Empleado{
    private double salarioSemanal;
    public EmpleadoAsalariado(String primerNombre,
                              String apellidoPaterno,
                              String numeroSeguroSocial,
                              double salarioSemanal) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        setSalarioSemanal(salarioSemanal);
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        if(salarioSemanal >= 0.0){
            this.salarioSemanal = salarioSemanal;
        }else{
            throw new IllegalArgumentException(
                    "El salario semanal debe ser >= 0.0"
            );
        }
    }

    @Override
    public double ingresos() {
        return salarioSemanal;
    }

    @Override
    public String toString() {
        return String.format("empleado asalariado: %s\n%s: $%,.2f",
                super.toString(), "salario semanal", salarioSemanal);
    }
}

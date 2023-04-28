package Unidad_8.AplicandoHerencia_2;

import Unidad_8.AplicandoHerencia.EmpleadoPorComision;

/**
 * @author hckr
 */
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
    @Override
    public double ingresos() {
        return salarioBase + super.ingresos();
    }

    @Override
    public String toString() {
        return "EmpleadoBaseMasComision{" +
                "primerNombre='" + getPrimerNombre() + '\'' +
                ", apellidoPaterno='" + getApellidoPaterno() + '\'' +
                ", numeroSeguroSocial='" + getNumeroSeguroSocial() + '\'' +
                ", ventasBrutas=" + getVentasBrutas() +
                ", tarifaComision=" + getTarifaComision() +
                ", salarioBase=" + salarioBase +
                '}';
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if(getVentasBrutas() >= 0.0){
            this.salarioBase = salarioBase;
        }else{
            throw new IllegalArgumentException(
                    "El salario base debe ser >= 0.0!"
            );
        }
    }
}

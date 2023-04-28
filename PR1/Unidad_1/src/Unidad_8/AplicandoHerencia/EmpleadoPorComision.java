package Unidad_8.AplicandoHerencia;

import Unidad_8.Empleado;

/**
 * @author hckr
 */
public class EmpleadoPorComision extends Empleado {
    private String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String primerNombre,
                               String apellidoPaterno,
                               String numeroSeguroSocial,
                               double ventasBrutas,
                               double tarifaComision) {
        super(primerNombre, apellidoPaterno);
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
        setVentasBrutas(ventasBrutas);
        setTarifaComision(tarifaComision);
    }

    public double ingresos(){
        return tarifaComision * ventasBrutas;
    }

    @Override
    public String toString() {
        return "EmpleadoPorComision{" +
                "numeroSeguroSocial='" + numeroSeguroSocial + '\'' +
                ", ventasBrutas=" + ventasBrutas +
                ", tarifaComision=" + tarifaComision +
                ", primerNombre='" + primerNombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                '}';
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        if(ventasBrutas >= 0.0){
            this.ventasBrutas = ventasBrutas;
        }else{
            throw new IllegalArgumentException(
                    "Las ventas brutas deben ser >= 0.0!"
            );
        }
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        if(tarifaComision > 0.0 && tarifaComision <1.0){
            this.tarifaComision = tarifaComision;
        }else{
            throw new IllegalArgumentException(
                    "La tarifa de comisión debe ser > 0.0 y < 1.0!"
            );
        }
    }
}

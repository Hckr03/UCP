package Unidad_9.Tarea_1;

public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas;
    private double tarifaComision;
    public EmpleadoPorComision(String primerNombre,
                               String apellidoPaterno,
                               String numeroSeguroSocial,
                               double ventasBrutas,
                               double tarifaComision) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        setVentasBrutas(ventasBrutas);
        setTarifaComision(tarifaComision);
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        if(ventasBrutas >= 0){
            this.ventasBrutas = ventasBrutas;
        }else{
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0");
        }
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        if(tarifaComision > 0.0 && tarifaComision < 1.0){
            this.tarifaComision = tarifaComision;
        }else{
            throw new IllegalArgumentException(
                    "La tarifa de comision debe ser > 0.0 y < 1.0"
            );
        }
    }

    @Override
    public double ingresos() {
        return tarifaComision * ventasBrutas;
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f; %s: %,.2f",
                "empleado por comision", super.toString(),
                "ventas brutas", ventasBrutas,
                "tarifa de comision", tarifaComision
        );
    }
}

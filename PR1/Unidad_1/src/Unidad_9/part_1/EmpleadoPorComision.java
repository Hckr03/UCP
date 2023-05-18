package Unidad_9.part_1;

public class EmpleadoPorComision {
    private String primerNombre;
    private String apellidoPaternoo;
    private String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision(String primerNombre,
                               String apellidoPaternoo,
                               String numeroSeguroSocial,
                               double ventasBrutas,
                               double tarifaComision) {
        this.primerNombre = primerNombre;
        this.apellidoPaternoo = apellidoPaternoo;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
        setVentasBrutas(ventasBrutas);
        setTarifaComision(tarifaComision);
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaternoo() {
        return apellidoPaternoo;
    }

    public void setApellidoPaternoo(String apellidoPaternoo) {
        this.apellidoPaternoo = apellidoPaternoo;
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
                    "Las ventas brutas deben ser >= 0.0"
            );
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

    public double ingresos(){
        return tarifaComision * ventasBrutas;
    }

    @Override
    public String toString() {
        return "EmpleadoPorComision{" +
                "primerNombre='" + primerNombre + '\'' +
                ", apellidoPaternoo='" + apellidoPaternoo + '\'' +
                ", numeroSeguroSocial='" + numeroSeguroSocial + '\'' +
                ", ventasBrutas=" + ventasBrutas +
                ", tarifaComision=" + tarifaComision +
                '}';
    }
}

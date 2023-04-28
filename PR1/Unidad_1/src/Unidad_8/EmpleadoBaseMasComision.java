package Unidad_8;

/**
 * @author hckr
 */
public class EmpleadoBaseMasComision {
    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;
    private double salarioBase;

    public EmpleadoBaseMasComision(String primerNombre,
                                   String apellidoPaterno,
                                   String numeroSeguroSocial,
                                   double ventasBrutas,
                                   double tarifaComision,
                                   double salarioBase) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        setVentasBrutas(ventasBrutas);
        setTarifaComision(tarifaComision);
        setSalarioBase(salarioBase);
    }
    public double ingresos() {
        return salarioBase + (tarifaComision * ventasBrutas);
    }

    @Override
    public String toString() {
        return "EmpleadoBaseMasComision{" +
                "primerNombre='" + primerNombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", numeroSeguroSocial='" + numeroSeguroSocial + '\'' +
                ", ventasBrutas=" + ventasBrutas +
                ", tarifaComision=" + tarifaComision +
                ", salarioBase=" + salarioBase +
                '}';
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
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

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if(ventasBrutas >= 0.0){
            this.salarioBase = salarioBase;
        }else{
            throw new IllegalArgumentException(
                    "El salario base debe ser >= 0.0!"
            );
        }
    }
}

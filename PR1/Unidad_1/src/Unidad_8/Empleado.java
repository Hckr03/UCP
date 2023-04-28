package Unidad_8;

/**
 * @author hckr
 */
public class Empleado {
    protected String primerNombre;
    protected String apellidoPaterno;

    public Empleado(String primerNombre, String apellidoPaterno) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
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
}

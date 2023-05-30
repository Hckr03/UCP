

public class Pytyvo {
    private Integer nroCedula;
    private String nombresApellidos;
    private String departamentos;
    private String districto;

    public Pytyvo() {
    }

    public Pytyvo(Integer nroCedula, String nombresApellidos, String departamentos, String districto) {
        this.nroCedula = nroCedula;
        this.nombresApellidos = nombresApellidos;
        this.departamentos = departamentos;
        this.districto = districto;
    }
    
    public Integer getNroCedula() {
        return nroCedula;
    }

    public void setNroCedula(Integer nroCedula) {
        this.nroCedula = nroCedula;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }

    public String getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String departamentos) {
        this.departamentos = departamentos;
    }

    public String getDistricto() {
        return districto;
    }

    public void setDistricto(String districto) {
        this.districto = districto;
    }
    
    
}

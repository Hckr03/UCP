package ExamenALC;

/**
 * @author hckr
 */
public class AlumnosDTO {
    private Integer id;
    private String nombres;
    private String apellidos;
    private Integer nroCedula;
    private MateriasDTO materia;

    public AlumnosDTO(Integer id) {
        this.id = id;
    }

    public AlumnosDTO(String nombres, String apellidos, Integer nroCedula, MateriasDTO materia) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nroCedula = nroCedula;
        this.materia = materia;
    }

    public AlumnosDTO(Integer id, String nombres, String apellidos, Integer nroCedula, MateriasDTO materia) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nroCedula = nroCedula;
        this.materia = materia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getNroCedula() {
        return nroCedula;
    }

    public void setNroCedula(Integer nroCedula) {
        this.nroCedula = nroCedula;
    }

    public MateriasDTO getMateria() {
        return materia;
    }

    public void setMateria(MateriasDTO materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "AlumnosDTO{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nroCedula=" + nroCedula +
                ", materia=" + materia +
                '}';
    }
}

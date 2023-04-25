package ExamenALC;

/**
 * @author hckr
 */
public class MateriasDTO {
    private Integer id;
    private String Materia;
    private Integer cargaHoraria;
    private String comentario;

    public MateriasDTO(Integer id) {
        this.id = id;
    }

    public MateriasDTO(String materia, Integer cargaHoraria, String comentario) {
        Materia = materia;
        this.cargaHoraria = cargaHoraria;
        this.comentario = comentario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String materia) {
        Materia = materia;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "MateriasDTO{" +
                "id=" + id +
                ", Materia='" + Materia + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}

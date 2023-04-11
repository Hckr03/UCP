
package Models;


public class BaseDTO {
    private Integer id;
    private String descrip;
    private String comentarios;

    public BaseDTO() {
    }

    public BaseDTO(Integer id, String descrip) {
        this.id = id;
        this.descrip = descrip;
    }

    public BaseDTO(Integer id, String descrip, String comentarios) {
        this.id = id;
        this.descrip = descrip;
        this.comentarios = comentarios;
    }

    public BaseDTO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "BaseDTO{" + "id=" + id
                + ", descrip=" + descrip
                + ", comentarios=" + comentarios + '}';
    }
    
    
}

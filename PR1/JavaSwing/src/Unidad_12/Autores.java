
package Unidad_12;

/**
 *
 * @author hckr
 */
class Autores {
    private Integer idAutor;
    private String nombrePila;
    private String apellidoPaterno;

    public Autores() {
    }

    public Autores(Integer idAutor, String nombrePila, String apellidoPaterno) {
        this.idAutor = idAutor;
        this.nombrePila = nombrePila;
        this.apellidoPaterno = apellidoPaterno;
    }

    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public String getNombrePila() {
        return nombrePila;
    }

    public void setNombrePila(String nombrePila) {
        this.nombrePila = nombrePila;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
}


package Models.Cliente;

import Models.Ciudad.CiudadDTO;
import Models.Nacionalidad.NacionalidadDTO;

/**
 *
 * @author hckr
 */
public class ClienteDTO{
    private Integer id;
    private String razon_social;
    private String nro_ruc;
    private String direccion;
    private Integer telefono;
    private NacionalidadDTO nacionalidad;
    private CiudadDTO ciudad;

    public ClienteDTO() {
    }

    public ClienteDTO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getNro_ruc() {
        return nro_ruc;
    }

    public void setNro_ruc(String nro_ruc) {
        this.nro_ruc = nro_ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public NacionalidadDTO getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(NacionalidadDTO nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public CiudadDTO getCiudad() {
        return ciudad;
    }

    public void setCiudad(CiudadDTO ciudad) {
        this.ciudad = ciudad;
    }
    
}

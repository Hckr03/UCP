package ExamenParcial;

public class ProveedorDTO {
    private Integer ep_id;
    private String ep_razon_social;
    private String ep_direccion;
    private String ep_nro_contacto;
    private String ep_nro_telefono;

    public ProveedorDTO(Integer ep_id,
                        String ep_razon_social,
                        String ep_direccion,
                        String ep_nro_contacto,
                        String ep_nro_telefono) {
        this.ep_id = ep_id;
        this.ep_razon_social = ep_razon_social;
        this.ep_direccion = ep_direccion;
        this.ep_nro_contacto = ep_nro_contacto;
        this.ep_nro_telefono = ep_nro_telefono;
    }

    public ProveedorDTO(String ep_razon_social,
                        String ep_direccion,
                        String ep_nro_contacto,
                        String ep_nro_telefono) {
        this.ep_razon_social = ep_razon_social;
        this.ep_direccion = ep_direccion;
        this.ep_nro_contacto = ep_nro_contacto;
        this.ep_nro_telefono = ep_nro_telefono;
    }

    public ProveedorDTO(Integer ep_id) {
        this.ep_id = ep_id;
    }

    public Integer getEp_id() {
        return ep_id;
    }

    public void setEp_id(Integer ep_id) {
        this.ep_id = ep_id;
    }

    public String getEp_razon_social() {
        return ep_razon_social;
    }

    public void setEp_razon_social(String ep_razon_social) {
        this.ep_razon_social = ep_razon_social;
    }

    public String getEp_direccion() {
        return ep_direccion;
    }

    public void setEp_direccion(String ep_direccion) {
        this.ep_direccion = ep_direccion;
    }

    public String getEp_nro_contacto() {
        return ep_nro_contacto;
    }

    public void setEp_nro_contacto(String ep_nro_contacto) {
        this.ep_nro_contacto = ep_nro_contacto;
    }

    public String getEp_nro_telefono() {
        return ep_nro_telefono;
    }

    public void setEp_nro_telefono(String ep_nro_telefono) {
        this.ep_nro_telefono = ep_nro_telefono;
    }

    @Override
    public String toString() {
        return "ProveedorDTO{" +
                "ep_id=" + ep_id +
                ", ep_razon_social='" + ep_razon_social + '\'' +
                ", ep_direccion='" + ep_direccion + '\'' +
                ", ep_nro_contacto='" + ep_nro_contacto + '\'' +
                ", ep_nro_telefono='" + ep_nro_telefono + '\'' +
                '}';
    }
}


package Models.Producto;

/**
 *
 * @author hckr
 */
public class ProductosDTO {
    private Integer id_gc;
    private String descripcion_gc;
    private Integer precio_gc;
    private Integer cantidad_gc;
    private Integer iva_gc;

    public ProductosDTO() {
    }

    public ProductosDTO(Integer id_gc) {
        this.id_gc = id_gc;
    }

    public Integer getId_gc() {
        return id_gc;
    }

    public void setId_gc(Integer id) {
        this.id_gc = id;
    }

    public String getDescripcion_gc() {
        return descripcion_gc;
    }

    public void setDescripcion_gc(String descripcion_gc) {
        this.descripcion_gc = descripcion_gc;
    }

    public Integer getPrecio_gc() {
        return precio_gc;
    }

    public void setPrecio_gc(Integer precio_gc) {
        this.precio_gc = precio_gc;
    }

    public Integer getCantidad_gc() {
        return cantidad_gc;
    }

    public void setCantidad_gc(Integer cantidad_gc) {
        this.cantidad_gc = cantidad_gc;
    }

    public Integer getIva_gc() {
        return iva_gc;
    }

    public void setIva_gc(Integer iva_gc) {
        this.iva_gc = iva_gc;
    }
    
}

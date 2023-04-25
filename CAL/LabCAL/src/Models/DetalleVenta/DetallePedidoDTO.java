package Models.DetalleVenta;

import Models.Producto.ProductosDTO;

/**
 *
 * @author hckr
 */
public class DetallePedidoDTO {

    private ProductosDTO producto;
    private Integer cantidad;

    public DetallePedidoDTO() {
    }

    public DetallePedidoDTO(ProductosDTO producto, Integer cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public ProductosDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductosDTO producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

}

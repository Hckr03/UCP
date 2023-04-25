
package Models.PedidoVenta;

import Models.Cliente.ClienteDTO;
import Models.DetalleVenta.DetallePedidoDTO;
import java.util.List;

/**
 *
 * @author hckr
 */
public class PedidoVentaDTO {
    private Integer id;
    private String comentario;
    private ClienteDTO cliente;
    private List<DetallePedidoDTO> pedidos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public ClienteDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }

    public List<DetallePedidoDTO> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<DetallePedidoDTO> pedidos) {
        this.pedidos = pedidos;
    }
}

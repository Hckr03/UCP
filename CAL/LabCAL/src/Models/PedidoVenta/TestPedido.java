
package Models.PedidoVenta;

import Models.Cliente.ClienteDTO;
import Models.DetalleVenta.DetallePedidoDTO;
import Models.Producto.ProductosDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hckr
 */
public class TestPedido {
    PedidoVenta pedido;
    PedidoVentaDTO pedidoDto;
    List<DetallePedidoDTO> detallePedido;

    public TestPedido() {
        detallePedido = new ArrayList<>();
        detallePedido.add(new DetallePedidoDTO(new ProductosDTO(1), 6));
        detallePedido.add(new DetallePedidoDTO(new ProductosDTO(2), 7));
        detallePedido.add(new DetallePedidoDTO(new ProductosDTO(4), 8));
        
        pedidoDto = new PedidoVentaDTO();
        pedidoDto.setCliente(new ClienteDTO(3));
        pedidoDto.setComentario("3ra insercion");
        pedidoDto.setPedidos(detallePedido);
        
        pedido = new PedidoVenta();
        
        if(pedido.agregarPedido(pedidoDto)){
            System.out.println("Pedido guardado con exito!");
        }else{
            System.out.println("Error al crear el pedido!");
        }
    }
    public static void main(String[] args) {
        new TestPedido();
    }
}

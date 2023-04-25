package Models.PedidoVenta;

import Models.DetalleVenta.DetallePedidoDTO;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import labcal.ConnectionDB.ConnectionDB;

/**
 *
 * @author hckr
 */
public class PedidoVenta {

    private String sql;
    private PreparedStatement ps;
    private ResultSet rs;

    public PedidoVenta() {
        ConnectionDB.getConnection();
    }

    public boolean agregarPedido(PedidoVentaDTO pedido) {

        try {
            sql = "INSERT INTO public.pedido_venta(\n"
                    + "	id_cliente, comentario)\n"
                    + "	VALUES (?, ?);";
            ps = ConnectionDB.getConnection().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getCliente().getId());
            ps.setString(2, pedido.getComentario());
            if (ps.executeUpdate() > 0) {
                int idGenerado;
                rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    idGenerado = rs.getInt("id");
                    for (DetallePedidoDTO x : pedido.getPedidos()) {
                        sql = "INSERT INTO public.detalle_pedido(\n"
                                + "	id_producto, id_pedido_venta, cantidad)\n"
                                + "	VALUES (?, ?, ?);";
                        ps = ConnectionDB.getConnection().prepareStatement(sql);
                        ps.setInt(1, x.getProducto().getId_gc());
                        ps.setInt(2, idGenerado);
                        ps.setInt(3, x.getCantidad());
                        if(ps.executeUpdate() <= 0){
                            return false;
                        }
                    }
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoVenta.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }
}

package Models.Producto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import labcal.ConnectionDB.ConnectionDB;

/**
 *
 * @author hckr
 */
public class ProductosController {

    private String sql;
    private PreparedStatement ps;

    public ProductosController() {
        ConnectionDB.getConnection();
    }

    public boolean agregarProducto(ProductosDTO producto) {
        try {
            sql = "INSERT INTO public.productos_gabriel_caballero(\n"
                    + "	descripcion_gc, precio_gc, cantidad_gc, iva_gc)\n"
                    + "	VALUES (?, ?, ?, ?);";
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ps.setString(1, producto.getDescripcion_gc());
            ps.setInt(2, producto.getPrecio_gc());
            ps.setInt(3, producto.getCantidad_gc());
            ps.setInt(4, producto.getIva_gc());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(ProductosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean modificarProducto(ProductosDTO producto) {
        try {
            sql = "UPDATE public.productos_gabriel_caballero\n"
                    + "	SET descripcion_gc=?, precio_gc=?, cantidad_gc=?, iva_gc=?\n"
                    + "	WHERE id_gc=?;";
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ps.setString(1, producto.getDescripcion_gc());
            ps.setInt(2, producto.getPrecio_gc());
            ps.setInt(3, producto.getCantidad_gc());
            ps.setInt(4, producto.getIva_gc());
            ps.setInt(5, producto.getId_gc());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(ProductosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean eliminarProducto(ProductosDTO producto) {
        try {
            sql = "DELETE FROM public.productos_gabriel_caballero\n"
                    + "	WHERE id_gc=?;";
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ps.setInt(1, producto.getId_gc());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(ProductosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public List<ProductosDTO> recuperarProductos() {
        try {
            sql = "SELECT id_gc, descripcion_gc, precio_gc, cantidad_gc, iva_gc\n"
                    + "	FROM public.productos_gabriel_caballero;";
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<ProductosDTO> listaProductos = new ArrayList<>();
            ProductosDTO producto;
            while(rs.next()){
                producto = new ProductosDTO();
                producto.setId_gc(rs.getInt("id_gc"));
                producto.setDescripcion_gc(rs.getString("descripcion_gc"));
                producto.setPrecio_gc(rs.getInt("precio_gc"));
                producto.setCantidad_gc(rs.getInt("cantidad_gc"));
                producto.setIva_gc(rs.getInt("iva_gc"));
                listaProductos.add(producto);
            }
            return listaProductos;
        } catch (SQLException ex) {
            Logger.getLogger(ProductosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

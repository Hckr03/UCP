package ExamenParcial;

import Connection.ConnectionDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Proveedor {
    private String sql;
    private PreparedStatement ps;

    public Proveedor() {
        ConnectionDB.getConnection();
    }

    public boolean agregarProveedor(ProveedorDTO proveedor) {
        try {
            sql = "insert into proveedores (ep_razon_social, ep_direccion, ep_nro_contacto, ep_nro_telefono)\n" +
                    "values (?, ?, ?, ?);";
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ps.setString(1, proveedor.getEp_razon_social());
            ps.setString(2, proveedor.getEp_direccion());
            ps.setString(3, proveedor.getEp_nro_contacto());
            ps.setString(4, proveedor.getEp_nro_telefono());

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean modificarProveedor(ProveedorDTO proveedor) {
        try {
            sql = "update proveedores\n" +
                    "set  ep_razon_social = ?, ep_direccion = ?, ep_nro_contacto = ?, ep_nro_telefono = ?\n" +
                    "where ep_id = ?;";
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ps.setString(1, proveedor.getEp_razon_social());
            ps.setString(2, proveedor.getEp_direccion());
            ps.setString(3, proveedor.getEp_nro_contacto());
            ps.setString(4, proveedor.getEp_nro_contacto());
            ps.setInt(5, proveedor.getEp_id());

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean eliminarProveedor(ProveedorDTO proveedor) {
        try {
            sql = "delete\n" +
                    "from proveedores\n" +
                    "where ep_id = ?;";
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ps.setInt(1, proveedor.getEp_id());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public List<ProveedorDTO> recuperarProveedor(){
        try {
            sql = "select *\n" +
                    "from proveedores;";
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<ProveedorDTO>  listarProveedor = new ArrayList<>();
            ProveedorDTO dto;
            while(rs.next()){
                dto = new ProveedorDTO(rs.getInt("ep_id"),
                        rs.getString("ep_razon_social"),
                        rs.getString("ep_direccion"),
                        rs.getString("ep_nro_contacto"),
                        rs.getString("ep_nro_telefono")
                );
                listarProveedor.add(dto);
            }
            return listarProveedor;
        } catch (SQLException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

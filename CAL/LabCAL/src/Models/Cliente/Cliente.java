package Models.Cliente;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import labcal.ConnectionDB.ConnectionDB;

/**
 *
 * @author hckr
 */
public class Cliente {

    private String sql;
    private PreparedStatement ps;

    public Cliente() {
        ConnectionDB.getConnection();
    }

    public boolean agregarCliente(ClienteDTO cliente) {
        try {
            sql = "insert into clientes (razon_social, nro_ruc, direccion, telefono, id_nacionalidad, id_ciudad)\n"
                    + "values (?, ?, ?, ?, ?, ?);";
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ps.setString(1, cliente.getRazon_social());
            ps.setString(2, cliente.getNro_ruc());
            ps.setString(3, cliente.getDireccion());
            ps.setInt(4, cliente.getTelefono());
            ps.setInt(5, cliente.getNacionalidad().getId());
            ps.setInt(6, cliente.getCiudad().getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean modificarPersonas(ClienteDTO cliente) {
        try {
            sql = "UPDATE public.clientes\n"
                    + "	SET razon_social=?, nro_ruc=?, direccion=?, telefono=?, id_nacionalidad=?, id_ciudad=?\n"
                    + "	WHERE id=?;";
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ps.setString(1, cliente.getRazon_social());
            ps.setString(2, cliente.getNro_ruc());
            ps.setString(3, cliente.getDireccion());
            ps.setInt(4, cliente.getTelefono());
            ps.setInt(5, cliente.getNacionalidad().getId());
            ps.setInt(6, cliente.getCiudad().getId());
            ps.setInt(7, cliente.getId());

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean eliminarPersona(Integer id) {
        try {
            sql = "DELETE FROM public.clientes\n"
                    + "WHERE id = ?;";
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}

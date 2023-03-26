package model;

import labcal.ConnectionDB.ConnectionDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hckr
 */
public class Personas {

    private String sql;
    private PreparedStatement ps;

    public Personas() {
        ConnectionDB.getConnection();
    }

    public boolean agregarPersonas(PersonaDTO persona) {
        try {
            sql = "INSERT INTO public.\"Personas\"(\n"
                    + "	nro_cedula, nombres, apellidos, direccion)\n"
                    + "	VALUES ( ?, ?, ?, ? );";
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ps.setInt(1, persona.getCedula());
            ps.setString(2, persona.getNombres());
            ps.setString(3, persona.getApellidos());
            ps.setString(4, persona.getDireccion());
            return ps.executeUpdate() > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(Personas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}

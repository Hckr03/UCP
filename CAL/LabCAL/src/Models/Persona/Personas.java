package Models.Persona;

import labcal.ConnectionDB.ConnectionDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
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

    public boolean modificarPersonas(PersonaDTO persona) {
        try {
            sql = "UPDATE public.\"Personas\"\n"
                    + "	SET nro_cedula=?, nombres=?, apellidos=?, direccion=?\n"
                    + "	WHERE id=?;";
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ps.setInt(1, persona.getCedula());
            ps.setString(2, persona.getNombres());
            ps.setString(3, persona.getApellidos());
            ps.setString(4, persona.getDireccion());
            ps.setInt(5, persona.getId());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(Personas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean eliminarPersona(Integer id) {
        try {
            sql = "DELETE FROM public.\"Personas\"\n" +
                    "	WHERE id = ?;";
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(Personas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public List<PersonaDTO> recuperarRegistros(){
        try {
            sql = "SELECT id, nro_cedula, nombres, apellidos, direccion\n" +
                    "	FROM public.\"Personas\";";
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<PersonaDTO>  listaPersona = new ArrayList<>();
            PersonaDTO dto;
            while(rs.next()){
                dto = new PersonaDTO();
                dto.setId(rs.getInt("id"));
                dto.setCedula(rs.getInt("nro_cedula"));
                dto.setNombres( rs.getString("nombres"));
                dto.setApellidos(rs.getString("apellidos"));
                dto.setDireccion(rs.getString("direccion"));
                listaPersona.add(dto);
            }
            return listaPersona;
        } catch (SQLException ex) {
            Logger.getLogger(Personas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

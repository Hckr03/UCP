package ExamenALC;

import Connection.ConnectionDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author hckr
 */
public class Alumno {
    private String sql;
    private PreparedStatement ps;

    public Alumno() {
        ConnectionDB.getConnection();
    }

    public boolean agregarAlumno(AlumnosDTO alumno) {
        try {
            sql = "insert into alumnos (nombres, apellidos, nro_cedula, id_materia)\n" +
                    "values (?, ?, ?, ?);";
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ps.setString(1, alumno.getNombres());
            ps.setString(2, alumno.getApellidos());
            ps.setInt(3, alumno.getNroCedula());
            ps.setInt(4, alumno.getMateria().getId());

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean modificarAlumno(AlumnosDTO alumno) {
        try {
            sql = "update alumnos\n" +
                    "set nombres = ?, apellidos = ?, nro_cedula = ?, id_materia = ?\n" +
                    "where id = ?;";
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ps.setString(1, alumno.getNombres());
            ps.setString(2, alumno.getApellidos());
            ps.setInt(3, alumno.getNroCedula());
            ps.setInt(4, alumno.getMateria().getId());
            ps.setInt(5, alumno.getId());

            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean eliminarAlumno(AlumnosDTO alumno) {
        try {
            sql = "delete from alumnos\n" +
                    "where id=?;";
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ps.setInt(1, alumno.getId());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public List<AlumnosDTO> recuperarAlumnos(){
        try {
            sql = "select *\n" +
                    "from alumnos;";
            ps = ConnectionDB.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<AlumnosDTO>  listaPersona = new ArrayList<>();
            AlumnosDTO dto;
            while(rs.next()){
                dto = new AlumnosDTO(rs.getInt("id"),
                        rs.getString("nombres"),
                        rs.getString("apellidos"),
                        rs.getInt("nro_cedula"),
                        new MateriasDTO(rs.getInt("id"))
                );
                listaPersona.add(dto);
            }
            return listaPersona;
        } catch (SQLException ex) {
            Logger.getLogger(Alumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

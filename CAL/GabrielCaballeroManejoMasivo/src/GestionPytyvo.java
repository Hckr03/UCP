
import ConexionDB.ConexionDB;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class GestionPytyvo {
    
    private String sql;
    private PreparedStatement ps;

    public GestionPytyvo() {
        ConexionDB.getConexion();
    }
    
    public void agregarRegistro(Pytyvo pytyvo){
        try {
            sql = """
                  INSERT INTO public."GestionArchivo"(
                  \t"nroCedula", "nombresApellidos", departamentos, distritos)
                  \tVALUES (?, ?, ?, ?);""";
            
            ps = ConexionDB.getConexion().prepareStatement(sql);
            ps.setInt(1, pytyvo.getNroCedula());
            ps.setString(2, pytyvo.getNombresApellidos());
            ps.setString(3, pytyvo.getDepartamentos());
            ps.setString(4, pytyvo.getDistricto());
            
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void agregar (List<Pytyvo> lista){
        sql = """
              INSERT INTO public."GestionArchivo"(
              \t"nroCedula", "nombresApellidos", departamentos, distritos)
              \tVALUES (?, ?, ?, ?);""";
                
        for (Pytyvo pytyvo : lista) {
            try {
                ps = ConexionDB.getConexion().prepareStatement(sql);
                ps.setInt(1, pytyvo.getNroCedula());
                ps.setString(2, pytyvo.getNombresApellidos());
                ps.setString(3, pytyvo.getDepartamentos());
                ps.setString(4, pytyvo.getDistricto());

                ps.executeUpdate();
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Terminado!!");
    }

    public boolean agregarBloque(List<Pytyvo> lista){
        int bloqueAgru = 100;
        int cont = 1;
        String cadena = "", query = "";
        try{
            for (Pytyvo py : lista){
                String dato = "(" + py.getNroCedula() + ",'" + py.getNombresApellidos() +
                        "','" + py.getDepartamentos() + "','" + py.getDistricto() + "')";
                cadena += (cadena.isEmpty() ? dato : "," + dato);
                if(cont == bloqueAgru){
                    query = "insert into public.\"GestionArchivo\" (\"nroCedula\", \"nombresApellidos\", departamentos, distritos)\n" +
                            "values" +cadena + ";";
                    ps = ConexionDB.getConexion().prepareStatement(query);
                    ps.executeUpdate();
                    cadena = "";
                    cont = 0;
                }
                cont++;
            }
            if(cont > 0){
                query = "insert into public.\"GestionArchivo\" (\"nroCedula\", \"nombresApellidos\", departamentos, distritos)\n" +
                        "values" +cadena + ";";
                ps = ConexionDB.getConexion().prepareStatement(query);
                ps.executeUpdate();
            }
            return true;
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            //logger.getLogger(.class.getName()).log(Level.SEVER, null, ex);
            return false;
        }
    }
}

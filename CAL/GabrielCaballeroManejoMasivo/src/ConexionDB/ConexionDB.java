
package ConexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionDB {
    private static Connection connection;
    private static String msg;

    private ConexionDB() {
        establecerConexion(ParametrosDB.POSTGRESQL);
    }
    
    private void establecerConexion(ParametrosDB parametros){
        String url = "jdbc:"+parametros.getMotorDB()
                     +"://"+parametros.getHost()
                     +"/"+parametros.getNombreDB();
        
        try {
            Class.forName(parametros.getControlador());
            connection = DriverManager.getConnection(url, parametros.getUsuarioDB(), parametros.getClaveDB());
        
            if(connection == null){
                msg = "Error durante la conexion";
            }else{
                msg = "Conexion establecida";
            }
        } catch (ClassNotFoundException e) {
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Connection getConexion(){
        if(connection == null){
            new ConexionDB();
        }
        return connection;
    }

    public  static String getMsg() {
        return msg;
    }
}

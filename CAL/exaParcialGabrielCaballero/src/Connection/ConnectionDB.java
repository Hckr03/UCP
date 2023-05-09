package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDB {
    private static Connection connection;
    private static String msg;

    private ConnectionDB() {
        establishConnectionDB(ParametersDB.POSTGRESQL);
    }


    private void establishConnectionDB(ParametersDB parameters){
        String url = "jdbc:" + parameters.getMotorDB()+ "://"
                + parameters.getHost() +"/"
                + parameters.getNameDB();

        try {
            Class.forName(parameters.getController());
            connection = DriverManager.getConnection(url,
                    parameters.getUserDB(), parameters.getPasswordDB());

            if (connection == null) {
                msg = "Error! Conexion no establecida";
            } else {
                msg = "Conexion establecida exitosamente";
            }
        } catch (ClassNotFoundException e) {
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, msg, ex);
        }
    }

    public static Connection getConnection(){
        if(connection == null){
            new ConnectionDB();
        }
        return connection;
    }

    public static String getMsg() {
        return msg;
    }
}

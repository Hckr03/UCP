
package Unidad_12;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hckr
 */
public class MostrarAutores {
    static final String CONTROLADOR = "org.postgresql.Driver";
    static final String URL_BASEDATOS = "jdbc:postgresql://localhost:5432/libros";
    static final String USUARIO = "postgres";
    static final String CLAVE = "12345";
    
    public static void main(String[] args) {

            Connection conexion = null;
            Statement instruccion = null;
            ResultSet resultado = null;
        try {
            Class.forName(CONTROLADOR);
                try {
                    conexion = DriverManager.getConnection(URL_BASEDATOS, 
                            USUARIO, 
                            CLAVE);
                    
                    instruccion = conexion.createStatement();
                    resultado = instruccion.executeQuery("SELECT idautor, nombrepila, apellidopaterno FROM autores");
                    ResultSetMetaData metaDatos = resultado.getMetaData();
                    int numeroDeColumnas = metaDatos.getColumnCount();
                    System.out.println("Tabla Autores de la base de datos Libros: \n");
                    for (int i = 1; i <= numeroDeColumnas; i++) {
                        System.out.printf("%-8s\t", metaDatos.getColumnName(i));
                    }
                    System.out.println();
                    while(resultado.next()){
                        for (int i = 1; i <= numeroDeColumnas; i++) {
                            System.out.printf("%-8s\t", resultado.getObject(i));
                        }
                        System.out.println();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(MostrarAutores.class.getName()).log(Level.SEVERE, null, ex);
                }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MostrarAutores.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
                try {
                    resultado.close();
                    instruccion.close();
                    conexion.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MostrarAutores.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
}

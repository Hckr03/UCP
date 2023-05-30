
package ConexionDB;

public enum ParametrosDB {
    
    POSTGRESQL ("postgresql", "org.postgresql.Driver",
            "GestionArchivo", "postgres", "12345", "5432", "localhost");
    
    private final String motorDB;
    private final String controlador;
    private final String nombreDB;
    private final String usuarioDB;
    private final String claveDB;
    private final String puertoDB;
    private final String host; 

    private ParametrosDB(String motorDB, String controlador, String nombreDB, String usuarioDB, String claveDB, String puertoDB, String host) {
        this.motorDB = motorDB;
        this.controlador = controlador;
        this.nombreDB = nombreDB;
        this.usuarioDB = usuarioDB;
        this.claveDB = claveDB;
        this.puertoDB = puertoDB;
        this.host = host;
    }

    public String getMotorDB() {
        return motorDB;
    }

    public String getControlador() {
        return controlador;
    }

    public String getNombreDB() {
        return nombreDB;
    }

    public String getUsuarioDB() {
        return usuarioDB;
    }

    public String getClaveDB() {
        return claveDB;
    }

    public String getPuertoDB() {
        return puertoDB;
    }

    public String getHost() {
        return host;
    }
    
    
}

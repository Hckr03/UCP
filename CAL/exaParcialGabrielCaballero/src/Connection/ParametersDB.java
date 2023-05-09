package Connection;

public enum ParametersDB {
    POSTGRESQL("postgresql","org.postgresql.Driver",
            "practica_ep","postgres","12345",
            "5432","localhost"),

    MYSQL("mysql","com.mysql.jdcb.Driver",
            "laboratorio_sc","root","1",
            "3306","localhost");

    private final String motorDB;
    private final String controller;
    private final String nameDB;
    private final String userDB;
    private final String passwordDB;
    private final String portDB;
    private final String host;

    private ParametersDB(String motorDB,
                         String controller,
                         String nameDB,
                         String userDB,
                         String passwordDB,
                         String portDB,
                         String host) {
        this.motorDB = motorDB;
        this.controller = controller;
        this.nameDB = nameDB;
        this.userDB = userDB;
        this.passwordDB = passwordDB;
        this.portDB = portDB;
        this.host = host;
    }


    public String getMotorDB() {
        return motorDB;
    }

    public String getController() {
        return controller;
    }

    public String getNameDB() {
        return nameDB;
    }

    public String getUserDB() {
        return userDB;
    }

    public String getPasswordDB() {
        return passwordDB;
    }

    public String getPortDB() {
        return portDB;
    }

    public String getHost() {
        return host;
    }
}

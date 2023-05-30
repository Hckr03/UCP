
package ConexionDB;

public class TestConexion {

    public TestConexion(){
        ConexionDB.getConexion();
        System.out.println("MSG2 " + ConexionDB.getMsg());
    }

    public static void main(String[] args) {
        new TestConexion();
    }
}

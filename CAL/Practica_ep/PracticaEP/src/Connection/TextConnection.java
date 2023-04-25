package Connection;

/**
 * @author hckr
 */
public class TextConnection {
    public TextConnection() {
        ConnectionDB.getConnection();
        System.out.println(ConnectionDB.getMsg());
    }

    public static void main(String[] args) {
        new TextConnection();
    }
}

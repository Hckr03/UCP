
package labcal.ConnectionDB;

/**
 *
 * @author hckr
 */
public class ExampleConnectionDB {
    
    public ExampleConnectionDB(){
        ConnectionDB.getConnection();
        System.out.println("MSG2" + ConnectionDB.getMsg());
    }
}

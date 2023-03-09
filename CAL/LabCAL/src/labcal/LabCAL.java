
package labcal;

import labcal.ConnectionDB.ConnectionDB;

/**
 *
 * @author hckr
 */
public class LabCAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConnectionDB.getConnection();
        System.out.println(ConnectionDB.getMsg());
    }
    
}

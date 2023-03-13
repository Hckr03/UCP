
package labcal.ConnectionDB;


public class LaboratorioALC {
    
    public LaboratorioALC(){
        ConnectionDB.getConnection();
        System.out.println(ConnectionDB.getMsg());
        
        ExampleConnectionDB e = new ExampleConnectionDB();
    }
    
    public static void main(String[] args) {
        new LaboratorioALC();
    }
}


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GestionarArchivo {
    
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    String urlArchivo, linea ;
    String d[];
    
    public void procesarArchivo(){
        try {
            urlArchivo = "D:\\Columbia\\Tercer año\\Primer semestre\\UCP\\UCP\\CAL\\GabrielCaballeroManejoMasivo\\pytyvo.csv";
//            urlArchivo = "/Users/hckr/Documents/UCP/CAL/GabrielCaballeroManejoMasivo/pytyvo.csv";
            archivo = new File(urlArchivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            int c=1;
            GestionPytyvo gestion = new GestionPytyvo();
            Pytyvo pytyvo = null;
            while ( (linea = br.readLine()) != null)  {                
                System.out.println("Linea " + linea);
                if (c > 1) {
                   // System.out.println("Linea " + c);
                    d = linea.split(";");
                    if (d.length == 4) {
                        pytyvo = new Pytyvo();
                        pytyvo.setNroCedula(Integer.valueOf( d[0] ) );
                        pytyvo.setNombresApellidos(d[1]);
                        pytyvo.setDepartamentos(d[2]);
                        pytyvo.setDistricto(d[3]);
                        gestion.agregarRegistro(pytyvo);
                    }
                }
                c++;
            }
       
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionarArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionarArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void procesarListaArchivo(){
        try {
            urlArchivo = "D:\\Columbia\\Tercer año\\Primer semestre\\UCP\\UCP\\CAL\\GabrielCaballeroManejoMasivo\\pytyvo.csv";
//            urlArchivo = "/Users/hckr/Documents/UCP/CAL/GabrielCaballeroManejoMasivo/pytyvo.csv";
            archivo = new File(urlArchivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            int c=1;
            GestionPytyvo gestion = new GestionPytyvo();
            Pytyvo pytyvo = null;
            List<Pytyvo> lista = new ArrayList<>();
            while ( (linea = br.readLine()) != null)  {                
//                System.out.println("Linea " + linea);
                if (c > 1) {
                    System.out.println("Linea " + c);
                    d = linea.split(";");
                    if (d.length == 4) {
                        pytyvo = new Pytyvo();
                        pytyvo.setNroCedula(Integer.valueOf( d[0] ) );
                        pytyvo.setNombresApellidos(d[1]);
                        pytyvo.setDepartamentos(d[2]);
                        pytyvo.setDistricto(d[3]);
                        lista.add(pytyvo);
                    }
                }
                c++;
            }
            gestion.agregarBloque(lista);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionarArchivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionarArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

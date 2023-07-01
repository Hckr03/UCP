
package Tema_2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author hckr
 */
public class TestRectangulo {
    Rectangulo rectangulo = new Rectangulo();
    Scanner sc = new Scanner(System.in);

    public TestRectangulo() {
        System.out.print("Favor ingresar el largo del rectangulo: ");
        rectangulo.setLargo(sc.nextDouble());
        
        System.out.print("Favor ingresar el ancho del rectangulo: ");
        rectangulo.setAncho(sc.nextDouble());
        
         System.out.printf("\nEl perimetro del rectangulo es: %.2f",
            rectangulo.perimetro(rectangulo.getLargo(), rectangulo.getAncho())
         );
         
        System.out.printf("\nEl area del rectangulo es: %.2f \n",
            rectangulo.area(rectangulo.getLargo(), rectangulo.getAncho())
        );
    }
    
    
    public static void main(String[] args) {
        new TestRectangulo();
    }
}

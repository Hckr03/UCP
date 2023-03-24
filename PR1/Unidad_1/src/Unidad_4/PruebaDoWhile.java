package Unidad_4;

/**
 * @author hckr
 */
public class PruebaDoWhile {
    public static void main(String[] args) {
        int contador = 1;

        do{
            System.out.printf("%d ", contador++);
        }while (contador <= 10);
    }
}

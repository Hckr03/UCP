package Unidad_4;

/**
 * @author hckr
 */
public class PruebaContinue {
    public static void main(String[] args) {
        int cuenta;
        for (cuenta = 1; cuenta <= 10; cuenta++) {
            if (cuenta == 5){
                continue;
            }
            System.out.printf("%d ", cuenta);
        }
        System.out.println("\nSe uso continue para omitir imprimir 5");
    }
}

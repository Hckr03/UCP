package Unidad_6;

/**
 * @author hckr
 */
public class SumaArreglo {
    public static void main(String[] args) {
        int[] arreglo = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37, 40};
        int total = 0;

        for(int i = 0; i < arreglo.length; i++){
            total += arreglo[i];
        }
        System.out.printf("Total de los elementos del arreglo: %d\n", total);
    }
}

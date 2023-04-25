package Unidad_6;

/**
 * @author hckr
 */
public class PruebaForMejorada {
    public static void main(String[] args) {
        int[] arreglo = {87, 60, 94, 100, 83, 70, 85, 91, 76, 87};
        int total = 0;

        for(int numero : arreglo){
            total += numero;
        }

        System.out.printf("Total de elementos del arreglo: %d\n", total);
        total = 0;

        for (int i = 0; i < arreglo.length; i++) {
            total += arreglo[i];
        }

        System.out.printf("Total de elementos del arreglo: %d\n", total);
    }
}

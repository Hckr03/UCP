package Unidad_6;

/**
 * @author hckr
 */
public class InicArreglo_2 {
    public static void main(String[] args) {
        int[] arreglo = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37, 40};
        System.out.printf("%s%8s\n", "Indice", "Valor");

        for(int i = 0; i < arreglo.length; i++){
            System.out.printf("%6d%8d\n", i, arreglo[i]);
        }
    }
}

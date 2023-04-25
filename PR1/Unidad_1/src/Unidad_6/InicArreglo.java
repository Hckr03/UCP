package Unidad_6;

/**
 * @author hckr
 */
public class InicArreglo {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        System.out.printf("%s%8s\n", "Indice", "Valor");

        for(int i = 0; i < arreglo.length; i++){
            System.out.printf("%6d%8d\n", i, arreglo[i]);
        }
    }
}

package Unidad_6;

/**
 * @author hckr
 */
public class PasoArreglo {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};

        System.out.println(
                "Efectos de pasar una referencia a un arreglo completo:\n"
                + "Los valores del arreglo original son:"
        );
        for (int valor : arreglo){
            System.out.printf("    %d", valor);
        }

        modificarArreglo(arreglo);
        System.out.println("\n\nLos valores del arreglo modificado son:");
        for (int valor : arreglo ) {
            System.out.printf("    %d", valor);
        }

        System.out.printf(
                "\n\nEfectos de pasar el valor de un elemento del arreglo:\n"
                + "arreglo[3] antes de modificarElemento: %d\n", arreglo[3]);
        modificarElemento(arreglo[3]);
        System.out.printf("arreglo[3] despues de modificarElemento: %d\n", arreglo[3]);
    }

    public static void modificarArreglo(int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] *= 2;
        }
    }

    public static void modificarElemento(int x){
        x *= 2;
        System.out.printf(
                "Valor del elemento modificado en modificarElemento: %d\n", x);
    }
}

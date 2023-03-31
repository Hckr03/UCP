package Unidad_5;

/**
 * @author hckr
 */
public class SobrecargaMetodos {
    public static void main(String[] args) {
        System.out.printf("El cuadrado del entero 7 es %d\n", cuadrado(6));
        System.out.printf("El cuadrado del double 7.5 es %.2f\n", cuadrado(700.5));
    }

    private static int cuadrado(int valorInt) {
        System.out.printf("\nSe llamo a cuadrado con argumento int: %d\n", valorInt);
        return valorInt * valorInt;
    }
    private static double cuadrado(double valorDouble) {
        System.out.printf("\nSe llamo a cuadrado con argumento double: %.2f\n", valorDouble);
        return valorDouble * valorDouble;
    }
}

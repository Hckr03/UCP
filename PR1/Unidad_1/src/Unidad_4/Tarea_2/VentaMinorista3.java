package Unidad_4.Tarea_2;

import java.util.Scanner;

public class VentaMinorista3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int product = 0;
        int cantidad = 0;
        float[] products = new float[5];

        System.out.print("Escriba numero de producto (1-5) o -99 para finalizar: ");
        product = sc.nextInt();
        while (product != -99){
            System.out.printf("Escriba cantidad vendida del producto %d: ", product);
            cantidad = sc.nextInt();
            switch (product) {
                case 1 -> products[0] += 2.98f * cantidad;
                case 2 -> products[1] += 4.50f * cantidad;
                case 3 -> products[2] += 9.98f * cantidad;
                case 4 -> products[3] += 4.49f * cantidad;
                case 5 -> products[4] += 6.87f * cantidad;
                default -> System.out.println("El producto que ingreso no existe!");
            }
            System.out.print("Escriba numero de producto (1-5) o -99 para finalizar: ");
            product = sc.nextInt();
        }
        System.out.println("\nReporte de Ventas");
        System.out.println("******************");
        for (int i = 0; i < products.length; i++) {
            System.out.printf("El total de ventas del producto %d es: %.2f\n", i+1, products[i]);
        }
    }
}

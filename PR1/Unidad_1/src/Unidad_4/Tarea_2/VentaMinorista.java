package Unidad_4.Tarea_2;

import java.util.Scanner;

public class VentaMinorista {
    public static void main(String[] args) {
        float product1 = 2.98f;
        float product2 = 4.50f;
        float product3 = 9.98f;
        float product4 = 4.49f;
        float product5 = 6.87f;
        Scanner sc = new Scanner(System.in);
        int product = 0;
        int cantidad = 0;
        float[] sold = new float[5];

        while (product != -99){
            System.out.print("Escriba numero de producto (1-5) o -99 para finalizar: ");
            product = sc.nextInt();
            if(product != -99){
                System.out.printf("Escriba cantidad vendida del producto %d: ", product);
                cantidad = sc.nextInt();
                switch (product) {
                    case 1 -> sold[0] += product1 * cantidad;
                    case 2 -> sold[1] += product2 * cantidad;
                    case 3 -> sold[2] += product3 * cantidad;
                    case 4 -> sold[3] += product4 * cantidad;
                    case 5 -> sold[4] += product5 * cantidad;
                    default -> System.out.println("El producto que ingreso no existe!");
                }
            }
        }
        System.out.println("\nReporte de Ventas");
        System.out.println("******************");
        for (int i = 0; i < sold.length; i++) {
            System.out.printf("El total de ventas del producto %d es: %.2f\n", i+1, sold[i]);
        }
    }
}

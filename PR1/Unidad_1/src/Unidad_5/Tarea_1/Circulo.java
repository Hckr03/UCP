package Unidad_5.Tarea_1;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        double radio;
        Scanner sc = new Scanner(System.in);
        int cantidad, cont = 1;

        System.out.print("Ingrese la cantidad de circulos para calcular su area y perimetro: ");
        cantidad = sc.nextInt();

        while(cont <= cantidad){
            System.out.printf("\nEscriba radio del circulo %d: ", cont);
            radio = sc.nextDouble();
            System.out.printf("El area del criculo es: %.2f\n", circuloArea(radio));
            System.out.printf("El perimetro del criculo es: %.2f\n", circuloPerimetro(radio));
            cont++;
        }
    }

    public static double circuloArea(double radio){
        return Math.PI * Math.pow(radio, 2);
    }
    public static double circuloPerimetro(double radio){
        return 2 * Math.PI * radio;
    }
}

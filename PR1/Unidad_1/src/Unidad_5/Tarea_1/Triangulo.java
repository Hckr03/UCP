package Unidad_5.Tarea_1;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        double ladoA, ladoB;
        Scanner sc = new Scanner(System.in);
        int cantidad, cont = 1;

        System.out.print("Ingrese la cantidad de triangulos para calcular su hipotenusa: ");
        cantidad = sc.nextInt();

        while(cont <= cantidad){
            System.out.printf("\nTriangulo %d\n", cont);
            System.out.println("*******************");
            System.out.print("Escriba la longitud lado 1: ");
            ladoA = sc.nextDouble();
            System.out.print("Escriba la longitud lado 2: ");
            ladoB = sc.nextDouble();
            System.out.printf("La hipotenusa del triangulo %d es: %.2f", cont, hipotenusa(ladoA, ladoB));
            cont++;
        }
    }
    public static double hipotenusa(double ladoA, double ladoB){
        return Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));
    }
}

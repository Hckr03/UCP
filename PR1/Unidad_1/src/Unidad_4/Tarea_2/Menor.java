package Unidad_4.Tarea_2;

import java.util.Scanner;

public class Menor {
    public static void main(String[] args) {
        int number;
        int size;
        int cont = 1;
        int minor = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba la cantidad de valores enteros que desea introducir: ");
        size = sc.nextInt();

        while(cont <= size){
            System.out.printf("Introduzca numero de la iteracion %d: ", cont);
            number = sc.nextInt();

            if(number < minor){
                minor = number;
            }
            cont++;
        }
        System.out.printf("El menor numero entre los %d valores introducidos es: %d", size, minor);
    }
}

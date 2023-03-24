package Unidad_1;

import java.util.Scanner;

/**
 * @author hckr
 */
public class Comparacion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declaracion de variables
        int numero1; //1er numero a ser ingresado
        int numero2; //2do numero a ser ingresado
        int suma; //suma de numero1 + numero2

        System.out.print("Introduzca el primer numero: "); // peticion para leer el primer numero
        numero1 = input.nextInt();

        System.out.print("Introduzca el segundo numero: "); // peticion para leer el segundo numero
        numero2 = input.nextInt(); // lee el segundo numero del usuario

        suma = numero1 + numero2; // suma los dos numeros ingresados

        //Impresion del resultado de la suma
        System.out.printf("La suma es %d\n",suma);

        if(numero1 == numero2){
            System.out.printf("%d == %d\n", numero1, numero2);
        }
        if(numero1 != numero2){
            System.out.printf("%d != %d\n", numero1, numero2);
        }
        if(numero1 < numero2){
            System.out.printf("%d < %d\n", numero1, numero2);
        }
        if(numero1 > numero2){
            System.out.printf("%d > %d\n", numero1, numero2);
        }
        if(numero1 <= numero2){
            System.out.printf("%d <= %d\n", numero1, numero2);
        }
        if(numero1 >= numero2) System.out.printf("%d >= %d", numero1, numero2);

    }
}

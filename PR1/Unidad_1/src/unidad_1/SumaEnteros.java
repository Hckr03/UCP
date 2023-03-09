package unidad_1;

import java.util.Scanner;

/**
 * @author hckr
 */
public class SumaEnteros {
    public static void main(String[] args) {
        //Se crea un objeto de la clase Scanner para obtener datos del usuario
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
        System.out.printf("La suma de %d + %d es igual a %d\n", numero1, numero2, suma);
    }
} // fin del metodo main

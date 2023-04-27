package Unidad_6.Tarea_1;

import java.util.Scanner;

/*
EliminarDuplicados. Escriba una aplicación que reciba como entrada cinco números.
A medida que se lea cada número, almacenar en un arreglo unidimensional solamente
si no es un duplicado de un número que ya se haya leído, si lo es, debe solicitar al
usuario que vuelva a ingresar hasta que sea un número distinto a los ya ingresados.
Crear un método estático buscarDuplicado que retorne true si es un número duplicado
o false en caso contrario. Imprimir el arreglo cuando se hayan ingresado 5 números
distintos
*/
public class EliminarDuplicados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int aux = 0;

        for (int i = 0; i < numeros.length; i++) {
            boolean band = true;
            while(band){
                System.out.print("Introduzca un numero: ");
                aux = sc.nextInt();
                if(buscarDuplicado(aux, numeros)){
                    System.out.println("No debe duplicar numeros, favor ingresar otro numero!");
                }
                else{
                    band = false;
                }
            }
            numeros[i] = aux;
        }
        System.out.println("\nNumeros distintos:");
        System.out.println("******************");
        for (int num : numeros) {
            System.out.printf(" %d ", num);
        }
    }
    private static boolean buscarDuplicado(int aux, int[] numeros){
        for (int valor : numeros) {
            if(valor == aux) {
                return true;
            }
        }
     return false;
    }
}

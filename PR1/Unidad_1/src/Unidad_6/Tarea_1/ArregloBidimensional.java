package Unidad_6.Tarea_1;

import java.util.Scanner;

/*
ArregloBidimensional. Escriba una aplicación que declare dos constantes, una que
represente el número de filas y otra el número de columnas de un arreglo bidimensional.
Cargar dicho arreglo solicitando al usuario un número para cada fila y columna. Una vez
que el arreglo esté cargado, calcular los totales por fila, columna y total general. Imprimir
de manera tabular el contenido.
*/
public class ArregloBidimensional {
    public static void main(String[] args) {
        int[][] arreglo = new int[4][5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los datos para el arreglo bidimensional de 3 filas y 4 columnas");
        for (int i = 0; i < arreglo.length-1; i++) {
                System.out.printf("Fila %d\n", i+1);
            for (int j = 0; j < arreglo[i].length-1; j++) {
                System.out.printf("Columna %d => ", j+1);
                arreglo[i][j] = sc.nextInt();
                arreglo[i][4] += arreglo[i][j];
                arreglo[3][j] += arreglo[i][j];
            }
            arreglo[3][4] += arreglo[i][4];
        }
        System.out.println("\nArreglo bidimensional de 4 x 5");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.printf("| %d |", arreglo[i][j]);
            }
            System.out.println();
        }
    }
}

package Unidad_6.Tarea_1;

import java.util.Random;

/*
TirarDados. Escriba una aplicación para simular el tiro de dos dados. La aplicación debe
utilizar un objeto de la clase Random una vez para tirar el primer dado, y de nuevo para
tirar el segundo. Después debe calcularse la suma de los dos valores. Cada dado puede
mostrar un valor entero del 1 al 6, por lo que la suma de los valores variará del 2 al 12,
siendo 7 la suma más frecuente, mientras que 2 y 12 serán las sumas menos frecuentes.
Su aplicación debe tirar los dados 36.000.000 veces. Utilice un arreglo unidimensional
para registrar el número de veces que aparezca cada una de las posibles sumas.
Muestre los resultados en formato tabular.
*/
public class TirarDados {
    public static void main(String[] args) {
        Random numAleatrio = new Random();
        int[] frecuencia = new int[13];

        for(int i = 2; i <= 36000000; i++){
            int dado1 = numAleatrio.nextInt(6) + 1;
            int dado2 = numAleatrio.nextInt(6) + 1;
            int suma = dado1 + dado2;
            frecuencia[suma]++;
        }

        for(int x = 2; x < frecuencia.length; x++){
            System.out.printf("Suma%4d  => %10d\n", x, frecuencia[x]);
        }
    }
}

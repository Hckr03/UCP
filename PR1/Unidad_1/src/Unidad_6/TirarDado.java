package Unidad_6;

import java.util.Random;

/**
 * @author hckr
 */
public class TirarDado {
    public static void main(String[] args) {
        Random numerosAleatorios = new Random();
        int[] frecuencia = new int[7];

        for(int i = 1; i <= 6000000; i++){
            frecuencia[1 + numerosAleatorios.nextInt(6)]++;
        }
        System.out.printf("%s%10s\n", "Cara ", "Frecuencia");
        for(int x = 1; x < frecuencia.length; x++){
            System.out.printf("%4d %10d\n", x, frecuencia[x]);
        }
    }
}

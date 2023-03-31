package Unidad_5;

import java.util.Random;

/**
 * @author hckr
 */
public class TirarDado {
    public static void main(String[] args) {
        Random numerosAleatorios = new Random();

        int frecuencia1 = 0;
        int frecuencia2 = 0;
        int frecuencia3 = 0;
        int frecuencia4 = 0;
        int frecuencia5 = 0;
        int frecuencia6 = 0;

        int cara;

        for(int tiro = 1; tiro <= 6000000; tiro++){
            cara = 1 + numerosAleatorios.nextInt(6);

            switch (cara) {
                case 1 -> ++frecuencia1;
                case 2 -> ++frecuencia2;
                case 3 -> ++frecuencia3;
                case 4 -> ++frecuencia4;
                case 5 -> ++frecuencia5;
                default -> ++frecuencia6;
            }
        }
        System.out.println("Cara\tFrecuencia");
        System.out.printf("1\t%,d\n2\t%,d\n3\t%,d\n4\t%,d\n5\t%,d\n6\t%,d\n",
                frecuencia1, frecuencia2, frecuencia3, frecuencia4,
                frecuencia5, frecuencia6);
    }
}

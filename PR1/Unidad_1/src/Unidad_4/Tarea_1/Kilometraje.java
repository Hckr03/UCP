package Unidad_4.Tarea_1;

import java.util.Scanner;

/**
 * @author hckr
 */
public class Kilometraje {

    public static void main(String[] args) {
        int kilometres, liters;
        int acuKms = 0;
        int acuLts = 0;
        double prom;
        int cont = 1;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Ingrese kilometros en viaje %d o -99 para terminar: ", cont);
        kilometres = sc.nextInt();

        while(kilometres != -99){
            System.out.printf("Ingrese litros en viaje %d: ", cont);
            liters = sc.nextInt();
            prom = (double) kilometres/liters;
            acuKms += kilometres;
            acuLts += liters;
            System.out.printf("Kilometros por litros realizado en el viaje %.2f: ", prom);
            cont += 1;
            System.out.printf("\n\nIngrese kilometros en viaje %d o -99 para terminar: ", cont);
            kilometres = sc.nextInt();
        }
        System.out.printf("\n\nTotal kilometrajes realizados en %d viajes es: %d \n", cont-1, acuKms);
        System.out.printf("Total litros realizados en %d viajes es: %d \n", cont-1, acuLts);
        System.out.printf("Kilometros por litros realizados en %d viajes es: %.2f \n", cont-1, (double)acuKms/acuLts);
    }
}

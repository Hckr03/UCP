package Unidad_5.Tarea_1;

import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {
        Random numRandom = new Random();
        int num;
        Scanner sc = new Scanner(System.in);
        boolean band = false;
        boolean band2 = false;

        while(!band){
            int adivinar = 1 + numRandom.nextInt(20);
            while(!band2){
                System.out.print("Adivine el numero entre 1 y 20: ");
                num = sc.nextInt();
                if(num < adivinar)
                    System.out.println("Demasiado bajo. Intente de nuevo");

                if(num > adivinar)
                    System.out.println("Demasiado alto. Intente de nuevo");

                if(num == adivinar){
                    System.out.println("Felicidades, adivino el numero!");
                    band2 = true;
                }
            }
            band2 = false;
            System.out.println("Desea jugar otra vez? 1 = SI / 2 = NO");
            num = sc.nextInt();
            if(num == 2) {
                band = true;
            }
        }
    }
}

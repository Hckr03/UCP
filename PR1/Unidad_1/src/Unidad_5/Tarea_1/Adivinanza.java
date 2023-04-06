package Unidad_5.Tarea_1;

import java.util.Random;
import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {
        Random numRandom = new Random();
        int num = 1;
        int exit = 0;
        Scanner sc = new Scanner(System.in);
        int adivinar = 1 + numRandom.nextInt(20);

        while(exit != 2){
            System.out.print("Adivine el numero entre 1 y 20: ");
            num = sc.nextInt();
            if(num < adivinar)
                System.out.println("Demasiado bajo. Intente de nuevo");

            if(num > adivinar)
                System.out.println("Demasiado alto. Intente de nuevo");

            if(num == adivinar){
                System.out.println("Felicidades, adivino el numero!");
                System.out.println("Desea jugar otra vez? 1 = SI / 2 = NO");
                exit = sc.nextInt();
                adivinar = 1 + numRandom.nextInt(20);
            }
        }
    }
}

package Tarea_Unidad_3;

import java.util.Scanner;

/**
 * @author hckr
 */
public class Mayor {
    public static void main(String[] args) {
        int mayor = 0;
        int cont = 1;
        int numero = 0;
        int vendedor = 0;
        Scanner sc = new Scanner(System.in);

        while(cont <= 10){
            System.out.printf("Ingrese cantidad vendida por el vendedor %d: ", cont);
            numero = sc.nextInt();

            if(numero > mayor){
                mayor = numero;
                vendedor = cont;
            }
            cont += 1;
        }
        System.out.printf("La mayor cantidad vendida fue %d realizada por el vendedor %d1", mayor, vendedor);
    }
}

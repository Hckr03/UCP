package Unidad_4.Tarea_2;

import java.text.DecimalFormat;

public class Factorial {
    public static void main(String[] args) {
        long factorial=1;
        int cont=1;
        DecimalFormat df = new DecimalFormat("###,###,###");

        do{
            for (int i = 1; i <= cont; i++) {
                factorial *= i;
            }
            System.out.printf("\nEl factorial de %d es: %s", cont, df.format(factorial));
            cont++;
            factorial = 1;
        }while(cont <= 20);
    }
}

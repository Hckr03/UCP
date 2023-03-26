package Unidad_4.Tarea_2;

import java.text.DecimalFormat;

public class Factorial {
    public static void main(String[] args) {
        long factorial=1;
        int cont=1;
        DecimalFormat df = new DecimalFormat("###,###,###");

        do{
            factorial *= cont;
            System.out.printf("\nEl factorial de %d es: %s", cont, df.format(factorial));
            cont++;
        }while(cont <= 20);
    }
}

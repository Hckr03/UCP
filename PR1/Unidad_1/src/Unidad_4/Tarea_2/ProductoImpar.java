package Unidad_4.Tarea_2;

import java.text.DecimalFormat;

public class ProductoImpar {
    public static void main(String[] args) {
        int impar;
        int multi=1;
        DecimalFormat df = new DecimalFormat("###,###,###");

        for (int i = 1; i <= 15; i++) {
            impar = i%2;
            if(impar != 0){
                multi *= i;
            }
        }
        System.out.printf("El producto entre los enteros impares del 1 al 15 es: %s", df.format(multi));
    }
}

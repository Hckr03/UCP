package Unidad_5;

import java.util.Scanner;

/**
 * @author hckr
 */
public class BuscadorMaximo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Escriba tres valores de punto flotante, separados por espacios:");
        double numero1 = input.nextDouble();
        double numero2 = input.nextDouble();
        double numero3 = input.nextDouble();

        double resultado = maximo(numero1, numero2, numero3);

        System.out.println("El maximo es: " + resultado);
    }
    public static double maximo(double x, double y, double z){
        double valorMaximo = x;

        if(y > valorMaximo){
            valorMaximo = y;
        }
        if(z > valorMaximo){
            valorMaximo = z;
        }
        return valorMaximo;
    }
}

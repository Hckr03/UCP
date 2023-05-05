package Tema_4;

import java.util.Scanner;

public class PruebaProducto {
    public static void main(String[] args) {
        Producto producto1 = new Producto(15.83);
        Producto producto2 = new Producto(24.55);
        Producto producto3 = new Producto(12.70);
        Producto producto4 = new Producto(8.39);
        Producto producto5 = new Producto(16.64);
        Scanner sc = new Scanner(System.in);
        double subtotal = 0.0;
        int aux = 0;
        int cont = 1;

        while(cont <= 5){
            System.out.printf("Ingresar la cantidad del producto %d: ", cont);
            aux = sc.nextInt();
            if(aux > 0){
                switch (cont) {
                    case 1 -> {
                        System.out.printf("El total vendido del Producto %d: %.2f\n\n", cont, aux * producto1.getPrecio());
                        subtotal += aux * producto1.getPrecio();
                        cont++;
                    }
                    case 2 -> {
                        System.out.printf("El total vendido del Producto %d: %.2f\n\n", cont, aux * producto2.getPrecio());
                        subtotal += aux * producto2.getPrecio();
                        cont++;
                    }
                    case 3 -> {
                        System.out.printf("El total vendido del Producto %d: %.2f\n\n", cont, aux * producto3.getPrecio());
                        subtotal += aux * producto3.getPrecio();
                        cont++;
                    }
                    case 4 -> {
                        System.out.printf("El total vendido del Producto %d: %.2f\n\n", cont, aux * producto4.getPrecio());
                        subtotal += aux * producto4.getPrecio();
                        cont++;
                    }
                    case 5 -> {
                        System.out.printf("El total vendido del Producto %d: %.2f\n\n", cont, aux * producto5.getPrecio());
                        subtotal += aux * producto5.getPrecio();
                        cont++;
                    }
                    default -> {
                        System.out.println("No posee mas de 5 productos!");
                    }
                }
            }else{
                System.out.println("La cantidad no puede ser negativa!");
            }
        }
        System.out.printf("El total de ventas es %.2f", subtotal);
    }
}

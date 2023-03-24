package Unidad_3;

import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta(150.00);
        Cuenta cuenta2 = new Cuenta(-8.53);

        System.out.printf("Saldo de cuenta1: %.2f\n", cuenta1.getSaldo());
        System.out.printf("Saldo de cuenta2: %.2f\n\n", cuenta2.getSaldo());

        Scanner sc = new Scanner(System.in);
        double montoDeposito;

        System.out.print("Escriba el monto a depositar para cuenta1: ");
        montoDeposito = sc.nextDouble();
        System.out.printf("\nSumando %.2f al saldo de la cuenta 1\n\n", montoDeposito);
        cuenta1.setSaldo(montoDeposito);

        System.out.print("Escriba el monto a depositar cuenta2: ");
        montoDeposito = sc.nextDouble();
        System.out.printf("\nSumando %.2f al saldo de la cuenta 2\n\n", montoDeposito);
        cuenta2.setSaldo(montoDeposito);

        System.out.printf("Saldo de la cuenta1: %.2f\n", cuenta1.getSaldo());
        System.out.printf("Saldo de la cuenta2: %.2f\n", cuenta2.getSaldo());
    }
}

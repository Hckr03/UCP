package Unidad_7.Tarea_1;

public class PruebaCuentaDeAhorros_v2 {
    public static void main(String[] args) {
        CuentaDeAhorros_v2 ahorrador1 = new CuentaDeAhorros_v2();
        CuentaDeAhorros_v2 ahorrador2 = new CuentaDeAhorros_v2();
        ahorrador1.setSaldoAhorros(2000);
        ahorrador2.setSaldoAhorros(3000);
        CuentaDeAhorros_v2.modificarTasaInteres(4);

        System.out.printf("El saldo inicial del ahorrador 1 es %.2f\n", ahorrador1.getSaldoAhorros());
        System.out.printf("El saldo inicial del ahorrador 2 es %.2f\n\n", ahorrador2.getSaldoAhorros());

        System.out.println("Ahorrador 1");
        for (int i = 1; i < 13; i++) {
            ahorrador1.saldoAhorros();
        }

        System.out.println("\nAhorrador 2");
        for (int i = 1; i < 13; i++) {
            ahorrador2.saldoAhorros();
        }
    }
}

package Unidad_7.Tarea_1;

public class PruebaCuentaDeAhorros {
    public static void main(String[] args) {
        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros();
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros();
        ahorrador1.setSaldoAhorros(2000);
        ahorrador2.setSaldoAhorros(3000);
        CuentaDeAhorros.modificarTasaInteres(4);

        System.out.printf("El saldo inicial del ahorrador 1 es %.2f\n", ahorrador1.getSaldoAhorros());
        System.out.printf("El saldo inicial del ahorrador 2 es %.2f\n\n", ahorrador2.getSaldoAhorros());

        System.out.println("Ahorrador 1");
        for (int i = 1; i < 13; i++) {
            System.out.printf("Mes %s -> %.2f + %.2f = %.2f\n",
                    i, ahorrador1.getSaldoAhorros(),
                    ahorrador1.calcularInteresMensual(),
                    ahorrador1.getSaldoAhorros() + ahorrador1.calcularInteresMensual()
            );
            ahorrador1.saldoAhorros();
        }

        System.out.println("\nAhorrador 2");
        for (int i = 1; i < 13; i++) {
            System.out.printf("Mes %s -> %.2f + %.2f = %.2f\n",
                    i, ahorrador2.getSaldoAhorros(),
                    ahorrador2.calcularInteresMensual(),
                    ahorrador2.getSaldoAhorros() + ahorrador2.calcularInteresMensual()
            );
            ahorrador2.saldoAhorros();
        }
    }
}

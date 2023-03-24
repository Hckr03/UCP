package Unidad_4;

/**
 * @author hckr
 */
public class Interes {
    public static void main(String[] args) {
        double monto;
        double principal = 1000;
        double tasa = 0.05;

        System.out.printf("%s%20s\n", "Año", "Monto en deposito");

        for (int anio = 1; anio <= 10; anio++) {
            monto = principal * Math.pow(1.0 + tasa, anio);
            System.out.printf("%3d%, 20.2f\n", anio, monto);
        }
    }
}

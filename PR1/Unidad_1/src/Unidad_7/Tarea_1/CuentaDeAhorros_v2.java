package Unidad_7.Tarea_1;

public class CuentaDeAhorros_v2 {
    private static double tasaInteresAnual;
    private double saldoAhorros;
    int i =1;

    public double calcularInteresMensual(){
        return (saldoAhorros * tasaInteresAnual)/12;
    }

    public static void modificarTasaInteres(double tasa){
        tasaInteresAnual = tasa/100;
    }

    public CuentaDeAhorros_v2() {}

    public void saldoAhorros(){
        System.out.printf("Mes %s -> %.2f + %.2f = %.2f\n",
                i++, saldoAhorros,
                calcularInteresMensual(),
                getSaldoAhorros() + calcularInteresMensual()
        );
        saldoAhorros += calcularInteresMensual();
    }

    public double getSaldoAhorros() {
        return saldoAhorros;
    }

    public void setSaldoAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }


}

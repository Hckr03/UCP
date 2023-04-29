package Unidad_7.Tarea_1;

public class CuentaDeAhorros {
    private static double tasaInteresAnual;
    private double saldoAhorros;

    public double calcularInteresMensual(){
        return (saldoAhorros * tasaInteresAnual)/12;
    }

    public static void modificarTasaInteres(double tasa){
        tasaInteresAnual = tasa/100;
    }

    public CuentaDeAhorros() {}

    public void saldoAhorros(){
        saldoAhorros += calcularInteresMensual();
    }

    public double getSaldoAhorros() {
        return saldoAhorros;
    }

    public void setSaldoAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }


}

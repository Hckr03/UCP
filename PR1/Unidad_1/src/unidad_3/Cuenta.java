package unidad_3;

public class Cuenta {
    private double saldo;

    public Cuenta(double saldoIncial){
        saldo = saldoIncial;
    }

    public Cuenta() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double monto) {
        saldo = saldo + monto;
    }
}

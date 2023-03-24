package Unidad_3;

public class Banco {
    //atributo de clase osea variable
    private double saldo;

    //constructor con parametro
    public Banco(double saldo) {
        this.saldo = saldo;
    }

    //constructor vacio
    public Banco() {
    }

    //metodo obtener
    public double getSaldo() {
        return saldo;
    }

    //metodo establecer
    public void setSaldo(double saldo) {
        this.saldo = this.saldo + saldo;
    }

}

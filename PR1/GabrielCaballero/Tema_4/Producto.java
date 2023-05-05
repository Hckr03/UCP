package Tema_4;

public class Producto {
    private String nombre;
    private double precio;

    public Producto( double precio) {
        this.precio = precio;
    }

    public Producto(String nombre) {
        this.nombre = nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

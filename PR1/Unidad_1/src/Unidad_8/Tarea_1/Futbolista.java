package Unidad_8.Tarea_1;

public class Futbolista extends SeleccionFutbol{
    private int cantidadGoles;
    private String posicion;

    public Futbolista(){
        super();
    }

    public Futbolista(int id,
                      String nombre,
                      String apellido,
                      int edad,
                      int cantidadGoles,
                      String posicion) {
        super(id, nombre, apellido, edad);
        this.cantidadGoles = cantidadGoles;
        this.posicion = posicion;
    }

    public int getCantidadGoles() {
        return cantidadGoles;
    }

    public void setCantidadGoles(int cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void jugarPartido(){
        System.out.println(nombre + " " + apellido + " -> Juega un partido");
    }

    public void entrenar(){
        System.out.println(nombre + " " + apellido + " -> Entrena");
    }
}

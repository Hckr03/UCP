package Unidad_8.Tarea_1;

public class Entrenador extends SeleccionFutbol{
    private String idFederacion;

    public Entrenador() {
        super();
    }

    public Entrenador(int id,
                      String nombre,
                      String apellido,
                      int edad,
                      String idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    public void dirigirPartido(){
        System.out.println(nombre + " " + apellido + " -> Dirige un partido");
    }

    public void dirigirEntrenamiento(){
        System.out.println(nombre + " " + apellido + " -> Dirige un entrenamieto");
    }
}

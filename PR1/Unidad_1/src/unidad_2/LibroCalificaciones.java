package unidad_2;

/**
 * @author hckr
 */
//Decalaracion de una clase con un metodo
public class LibroCalificaciones {
    private String nombreMateria;

    public LibroCalificaciones(String nombreMateria){
        this.nombreMateria = nombreMateria;
    }

    public LibroCalificaciones(){};

    //muestra un mensaje de bienvenida
//    public void mostrarMensaje(){
//        System.out.printf("Bienvenido al Libro de Calificaciones de Programacion 1!",);
//    }// fin del metodo mostrarMensaje
//
//    public void mostrarMensaje(String nombreMateria){
//        System.out.printf("Bienvenido al Libro de Calificaciones de %s!\n", nombreMateria);
//    }

    public void mostrarMensaje(){
        System.out.printf("Bienvenido al Libro de Calificaciones de %s!\n", nombreMateria);
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
} // fin de la clase LibroCalificaciones

package Unidad_2;

import java.util.Scanner;

/**
 * @author hckr
 */
public class PruebaLibroCalificaciones {
    public static void main(String[] args) {
        //Se instancia la clase LibroCalificaciones para crear el objeto libroCalificaciones
        LibroCalificaciones libro = new LibroCalificaciones("Programacion 1");


        //Se crea un objeto de la clase Scanner para obtener datos del usuario
        Scanner input = new Scanner(System.in);

        System.out.print("Escriba el nombre de la materia: "); //petidion
        String nombreMateria = input.nextLine(); //lee una linea de texto
        System.out.println(); // imprime una linea en blanco

        //Se invoca al metodo de mostrarMensaje mediante el obejto
        libro.mostrarMensaje();
    }//fin del metodo main
}//fin de la clase PruebaLibroCalificaciones

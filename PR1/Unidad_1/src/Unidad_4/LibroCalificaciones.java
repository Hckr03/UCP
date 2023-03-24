package Unidad_4;

import java.util.Scanner;

/**
 * @author hckr
 */
public class LibroCalificaciones {
        private String nombreMateria;
        private int total;
        private int contadorCalif;
        private int aCuenta;
        private int bCuenta;
        private int cCuenta;
        private int dCuenta;
        private int fCuenta;

    public LibroCalificaciones(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getContadorCalif() {
        return contadorCalif;
    }

    public void setContadorCalif(int contadorCalif) {
        this.contadorCalif = contadorCalif;
    }

    public int getaCuenta() {
        return aCuenta;
    }

    public void setaCuenta(int aCuenta) {
        this.aCuenta = aCuenta;
    }

    public int getbCuenta() {
        return bCuenta;
    }

    public void setbCuenta(int bCuenta) {
        this.bCuenta = bCuenta;
    }

    public int getcCuenta() {
        return cCuenta;
    }

    public void setcCuenta(int cCuenta) {
        this.cCuenta = cCuenta;
    }

    public int getdCuenta() {
        return dCuenta;
    }

    public void setdCuenta(int dCuenta) {
        this.dCuenta = dCuenta;
    }

    public int getfCuenta() {
        return fCuenta;
    }

    public void setfCuenta(int fCuenta) {
        this.fCuenta = fCuenta;
    }

    public void introducirCalifi(){
        Scanner input = new Scanner(System.in);
        int calificacion;

        System.out.printf("%s\n%s\n%s\n",
                "Escribir las calificaciones enteras en el rando "
                    + "de 0 a 100.",
                "Escriba el indicador de fin de archivo "
                + "para terminar la entrada:",
                "En Windows escriba z y despues oprima Intro"
        );
        while (input.hasNextInt()){
            calificacion = input.nextInt();
            total += calificacion;
            ++contadorCalif;

            incrementarContadorCalifLetra(calificacion);
        }
    }

    private void incrementarContadorCalifLetra(int calificacion){
       switch (calificacion / 10){
           case 9:
           case 10:
               ++aCuenta;
               break;
           case 8:
               ++bCuenta;
               break;
           case 7:
               ++cCuenta;
               break;
           case 6:
               ++dCuenta;
               break;
           default:
               ++fCuenta;
               break;
       }
    }

    public void mostrarReporteCalif(){
        System.out.println("\nReporte de calificaciones");
    }
}

package Unidad_7;

public class PruebaTiempo1 {

    public static void main(String[] args) {
        Tiempo1 tiempo = new Tiempo1();

        System.out.print("La hora universal inicial es: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.print("La hora estandar inciial es: ");
        System.out.println(tiempo);
        System.out.println();

        tiempo.setTiempo(8, 36, 0);
        System.out.print("La hora universal despues de establecerTiempo es: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.print("La hora estandar despues de establecerTiempo es: ");
        System.out.println(tiempo);
        System.out.println();

        try {
            tiempo.setTiempo(99, 25, 99);

        } catch (IllegalArgumentException e) {
            System.out.printf("Excepccion: %s\n\n", e.getMessage());
        }
        System.out.println("Despues de intentar ajustes invalidos: ");
        System.out.println("Hora universal: ");
        System.out.println(tiempo.aStringUniversal());
        System.out.println("Hora estandar: ");
        System.out.println(tiempo);
    }
}

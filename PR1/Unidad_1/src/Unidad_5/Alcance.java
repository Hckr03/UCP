package Unidad_5;

/**
 * @author hckr
 */
public class Alcance{
    private static int x = 1;

    public static void main(String[] args) {
        System.out.println(String.valueOf(x));
        int x = 5;
        System.out.printf("La x local en main es %d\n", x);
        usarVariableLocal();
        usarCampo();
        usarVariableLocal();
        usarCampo();
        System.out.printf("\nLa x local main es %d\n", x);
    }
    private static void usarVariableLocal() {
        int x = 25;
        System.out.printf("\nLa x local al entrar al metodo usarVariableLocal es %d\n", x);
    }
    private static void usarCampo() {
        System.out.printf("\nEl campo x al entrar al metodo usarCampo es %d\n", x);
        x *= 10;
        System.out.printf("El campo x antes de salir del metodo usarCampo es %d\n", x);
    }
}

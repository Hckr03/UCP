package Unidad_7;

public class PruebaTiempo2 {

    public static void main(String[] args) {
        Tiempo2 t1 = new Tiempo2();
        Tiempo2 t2 = new Tiempo2(2);
        Tiempo2 t3 = new Tiempo2(21, 34);
        Tiempo2 t4 = new Tiempo2(12, 25, 42);
        Tiempo2 t5 = new Tiempo2(t4);
        Tiempo2 t = new Tiempo2();

        System.out.println("Se cosntruyo con: ");
        System.out.println("t1: todos los argumentos predeterminados");
        System.out.printf("    %s\n", t1.aStringUniversal());
        System.out.printf("   %s\n", t1);

        System.out.println("t2: se especifico hora; minuto y segundo predeterminados");
        System.out.printf("   %s\n", t2.aStringUniversal());
        System.out.printf("    %s\n", t2);

        System.out.println("t3: se especificaron hora y minuto; segundo predeterminado");
        System.out.printf("   %s\n", t3.aStringUniversal());
        System.out.printf("   %s", t3);

        System.out.println("t4: se especificaron hora, minuto y segundo");
        System.out.printf("   %s\n", t4.aStringUniversal());
        System.out.printf("   %s\n", t4);

        System.out.println("t5: se especifico el objeto Tiempo2 llamado t4");
        System.out.printf("   %s\n", t5.aStringUniversal());
        System.out.printf("   %s\n", t5);

        try {
            Tiempo2 t6 = new Tiempo2(23, 20, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("\nExcepcion al inicializar t6: %s\n", e.getMessage());

        }
    }
}



package Unidad_6;

/**
 * @author hckr
 */
public class GraficoBarras {
    public static void main(String[] args) {
        int[] arreglo = {0, 0, 8, 0, 0, 0, 1, 2, 4, 2, 1};

        System.out.println("Distribucion de calificaciones:");

        for(int i = 0; i < arreglo.length; i++){
            if(i == 10){
                System.out.printf("%5d: ", 100);
            }else{
                System.out.printf("%02d-%02d: ", i*10, i*10+9);
            }
            for(int x = 0; x < arreglo[i]; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

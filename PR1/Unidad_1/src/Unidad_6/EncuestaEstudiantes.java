package Unidad_6;

/**
 * @author hckr
 */
public class EncuestaEstudiantes {
    public static void main(String[] args) {
        int[] respuestas = {1,2,5,4,3,5,2,1,3,3,6,4,3,3,3,2,3,3,2,14};
        int[] frecuencia = new int[6];

        for (int i = 0; i < respuestas.length; i++) {
            try{
                ++frecuencia[respuestas[i]];
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf("     respuestas[%d] = %d\n\n", i, respuestas[i]);
            }
        }
        System.out.printf("%s %10s\n", "Calificacion", "Frecuencia");
        for(int x = 1; x < frecuencia.length; x++){
            System.out.printf("%6d %10d\n", x, frecuencia[x]);
        }
    }
}

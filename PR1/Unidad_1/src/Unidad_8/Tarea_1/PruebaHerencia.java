package Unidad_8.Tarea_1;

public class PruebaHerencia {
    public static void main(String[] args) {
        Entrenador entrenador = new Entrenador(1,
                "Julio",
                "César",
                54,
                "River");
        Futbolista futbolista = new Futbolista(
                2,
                "Derliz",
                "González",
                35,
                40,
                "Defensa lateral");
        Masajista masajista = new Masajista(
                3,
                "Guillermo",
                "Ortigoza",
                37,
                "Masajista profesional",
                12);

        System.out.println("\nTodos los integrantes comienzan una concentracion. (Todos ejecutan el mismo metodo)");
        entrenador.concetrarse();
        futbolista.concetrarse();
        masajista.concetrarse();

        System.out.println("\nTodos los integrantes viajan para un partido. (Todos ejecutan el mismo metodo)");
        entrenador.viajar();
        futbolista.viajar();
        masajista.viajar();

        System.out.println("\nEntrenamiento: Solamente el entrenador y futbolista tienen metodos para entrenar:");
        entrenador.dirigirEntrenamiento();
        futbolista.entrenar();

        System.out.println("\nMasaje: Solamente el masajista tiene el metodo para dar masaje:");
        masajista.darMasaje();

        System.out.println("\nPartido de futbol: Solamente el entrenador y futbolista tienen metodos para el partido de futbol:");
        entrenador.dirigirPartido();
        futbolista.jugarPartido();

    }
}

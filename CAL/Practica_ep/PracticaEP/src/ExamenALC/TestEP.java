package ExamenALC;

/**
 * @author hckr
 */
public class TestEP {
    private Alumno alumno;
    private AlumnosDTO dto;

    public TestEP() {
        //para crear alumno
//        dto = new AlumnosDTO("Gabriel Enrique",
//                            "Caballero Barrios",
//                            3713700,
//                            new MateriasDTO(1)
//        );

        //para modificar alumno
//        dto = new AlumnosDTO(2,
//                            "Derliz Osvaldo",
//                            "Caballero Barrios",
//                            3713700,
//                            new MateriasDTO(2)
//       );

        //para eliminar alumno
//        dto = new AlumnosDTO(3);

        alumno = new Alumno();

        //para agregar alumno
//        if(alumno.agregarAlumno(dto)){
//            System.out.println("Alumno registrado con exito!");
//        }else{
//            System.out.println("Error durante el registro!");
//        }

        //para modificar alumno
//        if(alumno.modificarAlumno(dto)){
//            System.out.println("Se modifico el registro con exito!");
//        }else{
//            System.out.println("Error al modificar el registro!");
//        }

        //para eliminar alumno
//        if(alumno.eliminarAlumno(dto)){
//            System.out.println("Se elimino un registro con exito!");
//        }else{
//            System.out.println("Error al intentar eliminar un registro!");
//        }

        //para recuperar registros
        for (AlumnosDTO alumno : alumno.recuperarAlumnos()) {
            System.out.println("Nombre: "+alumno.getNombres());
        }
    }

    public static void main(String[] args) {
        new TestEP();
    }
}

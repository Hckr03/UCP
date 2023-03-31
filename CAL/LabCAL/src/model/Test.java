
package model;

/**
 *
 * @author hckr
 */
public class Test {
    PersonaDTO dto;
    Personas persona;

    public Test(){
        dto = new PersonaDTO();
        dto.setId(2);
        dto.setCedula(1135461);
        dto.setNombres("Salome");
        dto.setApellidos("Barrios");
        dto.setDireccion("Lambare");
        
        persona = new Personas();
//        if(persona.eliminarPersona(1)){
//            System.out.println("Registro eliminado con exitoso");
//        }else{
//            System.out.println("Registro no eliminado");
//        }
        for (PersonaDTO persona : persona.recuperarRegistros()) {
            System.out.println("Nombre: "+persona.getNombres());
        }
    }
    
    public static void main(String[] args){
        new Test();
    }
}


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
        dto.setCedula(1135461);
        dto.setNombres("Rigoberto");
        dto.setApellidos("Caballero");
        dto.setDireccion("Lambare");
        
        persona = new Personas();
        if(persona.agregarPersonas(dto)){
            System.out.println("Registro Exitoso");
        }else{
            System.out.println("Registro No Exitoso");
        }
    }
    
    public static void main(String[] args){
        new Test();
    }
}

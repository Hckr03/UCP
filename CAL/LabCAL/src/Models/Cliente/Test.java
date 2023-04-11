
package Models.Cliente;

import Models.Ciudad.CiudadDTO;
import Models.Nacionalidad.NacionalidadDTO;

/**
 *
 * @author hckr
 */
public class Test {
    ClienteDTO dto;
    Cliente cliente;
    
    public Test(){
        dto = new ClienteDTO();
        dto.setRazon_social("Osvaldo Caballero");
        dto.setNro_ruc("7654321");
        dto.setDireccion("muy muy lejos");
        dto.setTelefono(982654321);
        dto.setNacionalidad(new NacionalidadDTO(1));
        dto.setCiudad(new CiudadDTO(1));
//        dto.setId(1);
        
        cliente = new Cliente();
        
        //agregar un registro
        if(cliente.agregarCliente(dto)){
            System.out.println("Registro guardado con exito!");
        }else{
            System.out.println("Registro no guardado!");
        }

        //modificar un registro
//        if(cliente.modificarPersonas(dto)){
//            System.out.println("Registro actualizado con exito!");
//        }else{
//            System.out.println("Registro no actualizado");
//        }

        //eliminar un registro
//        if(cliente.eliminarPersona(2)){
//            System.out.println("Registro eliminado con exito!");
//        }else{
//            System.out.println("Registro no eliminado");
//        }
    }
    
    public static void main(String[] args) {
        new Test();
    }
}

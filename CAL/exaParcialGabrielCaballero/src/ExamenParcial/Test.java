package ExamenParcial;

public class Test {
    Proveedor proveedor;
    ProveedorDTO dto;
    public Test() {
    //para crear proveedor
//        dto = new ProveedorDTO("Marisa Caballero",
//                            "Eusebio Ayala",
//                            "021567891",
//                            "0981321456"
//        );

    //para modificar proveedor
//        dto = new ProveedorDTO(1,
//                            "Azael Caballero",
//                            "Avda. España",
//                            "0971123456",
//                            "021902744"
//       );

    //para eliminar proveedor
//        dto = new ProveedorDTO(2);

        proveedor = new Proveedor();

    //para agregar proveedor
//        if(proveedor.agregarProveedor(dto)){
//            System.out.println("Proveedor registrado con exito!");
//        }else{
//            System.out.println("Error durante el registro!");
//        }

    //para modificar proveedor
//        if(proveedor.modificarProveedor(dto)){
//            System.out.println("Se modifico el registro con exito!");
//        }else{
//            System.out.println("Error al modificar el registro!");
//        }

    //para eliminar proveedor
//        if(proveedor.eliminarProveedor(dto)){
//            System.out.println("Se elimino un registro con exito!");
//        }else{
//            System.out.println("Error al intentar eliminar un registro!");
//        }

    //para recuperar proveedores
        for (ProveedorDTO proveedor : proveedor.recuperarProveedor()) {
        System.out.println("Id: "+proveedor.getEp_id());
        System.out.println("Razon social: "+proveedor.getEp_razon_social());
        System.out.println("Direccion: "+proveedor.getEp_direccion());
        System.out.println("Nro de Contacto: "+proveedor.getEp_nro_contacto());
        System.out.println("Nro de Tel.: "+proveedor.getEp_nro_telefono());
        System.out.println();
        }
    }
    public static void main(String[] args) {
        new Test();
    }
}


package Models.Producto;

/**
 *
 * @author hckr
 */
public class TestProduct {
    ProductosGabrielCaballero producto;
    ProductosController controller;
    
    public TestProduct(){
//        crear producto
//        producto = new ProductosGabrielCaballero();
//        producto.setDescripcion_gc("Case");
//        producto.setCantidad_gc(1);
//        producto.setPrecio_gc(120);
//        producto.setIva_gc(5);
        
        
//        modificar producto
//        producto = new ProductosGabrielCaballero();
//        producto.setId_gc(5);
//        producto.setDescripcion_gc("Gabinete Razer");
//        producto.setCantidad_gc(1);
//        producto.setPrecio_gc(140);
//        producto.setIva_gc(5);
        
        
//        //eliminar producto
//        producto = new ProductosGabrielCaballero();
//        producto.setId_gc(5);
        
        
        controller = new ProductosController();
        
//        Validacion para crear nuevo producto
//        if(controller.agregarProducto(producto)){
//            System.out.println("Registro guardado con exito!");
//        }else{
//            System.out.println("Registro no guardado!");
//        }


//        Validacion para modificar un producto
//        if(controller.modificarProducto(producto)){
//            System.out.println("Se modifico con exito!");
//        }else{
//            System.out.println("No se modificaron los datos!");
//        } 
        
//        Validacion para eliminar producto
//        if(controller.eliminarProducto(producto)){
//            System.out.println("Se elimino con exito!");
//        }else{
//            System.out.println("No se elimino el registro!");
//        }

//        Validacion para recuperar registros
        for(ProductosGabrielCaballero producto : controller.recuperarProductos()){
            System.out.println("Id_gc: " + producto.getId_gc());
            System.out.println("Descripcion_gc: " + producto.getDescripcion_gc());
            System.out.println("Precio_gc: " + producto.getPrecio_gc());
            System.out.println("Cantidad_gc: " + producto.getCantidad_gc());
            System.out.println("Iva_gc: " + producto.getIva_gc() + "\n");
        }
        
    }
    public static void main(String[] args){
        new TestProduct();
    }
}

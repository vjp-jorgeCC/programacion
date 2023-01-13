/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pizarra.pkg3;

/**
 *
 * @author jorge
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto producto1=new Producto();
        Producto producto2=new Producto("Pizza",5,false);
        
        System.out.println("----------PRODUCTO 1----------");
        System.out.println("Nombre: "+producto1.getNombre());
        System.out.println("Precio: "+producto1.getPrecio()+"€");
        System.out.println(producto1.esSaludable());
        
        System.out.println("----------PRODUCTO 2----------");
        System.out.println("Nombre: "+producto2.getNombre());
        System.out.println("Precio: "+producto2.getPrecio()+"€");
        System.out.println(producto2.esSaludable());
    }
    
}

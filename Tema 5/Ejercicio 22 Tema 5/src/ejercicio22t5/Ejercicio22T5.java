/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22t5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio22T5 {

    //Método para mostrar el menú de la tienda. Retorna la opción elegida por el usuario
    public static Producto menu(Producto p1, Producto p2, Producto p3){
        Scanner teclado = new Scanner(System.in);
        Producto productoSeleccionado = null;
        int opc;
        System.out.println("  -- Bienvenido a mi Tienda de Mascotas --");
        System.out.println("Pulsa 1 para comprar "+p1.getNombre()+" cuyo precio es de "+p1.getPrecio()+" y el stock es de "+p1.getStock()+" unidades");
        System.out.println("Pulsa 2 para comprar "+p2.getNombre()+" cuyo precio es de "+p2.getPrecio()+" y el stock es de "+p2.getStock()+" unidades");
        System.out.println("Pulsa 3 para comprar "+p3.getNombre()+" cuyo precio es de "+p3.getPrecio()+" y el stock es de "+p3.getStock()+" unidades");
        System.out.print("Opción: ");
        opc = teclado.nextInt();
        switch(opc){
            case 1:
                System.out.println("Ha elegido comprar "+p1.getNombre());
                productoSeleccionado = p1;
                break;
            case 2:
                System.out.println("Ha elegido comprar "+p2.getNombre());
                productoSeleccionado = p2;
                break;
            case 3:
                System.out.println("Ha elegido comprar "+p3.getNombre());
                productoSeleccionado = p3;
                break;
            default:
                System.out.println("El ejercicio supone que el usuario NUNCA se va a confundir");
        }
        return productoSeleccionado;
    }
    
    //Método para pedir Unidades del producto y retornarla
    public static int pedirUnidades(){
        Scanner teclado = new Scanner(System.in);
        int unidades;
        System.out.println("¿Cuántas unidades desea?");
        unidades = teclado.nextInt();
        return unidades;
    }
    
    //Método para pedir Unidades del producto y retornarla
    public static boolean seguirComprando(){
        Scanner teclado = new Scanner(System.in);
        String resp;
        System.out.println("¿Desea comprar otro producto?");
        resp = teclado.nextLine();
        if  (resp.equalsIgnoreCase("SI")){
            return true;
        }
        else{
            return false;
        }
    }
    
    //Comprueba si tenemos stock suficiente para el producto seleccionado
    public static boolean comprobarStock(Producto productoSeleccionado, int unidades){
        boolean stockOk = true;
        if  (productoSeleccionado.getStock() < unidades){
            System.out.println("Lo sentimos, sólo tenemos "+productoSeleccionado.getStock()+" unidades disponibles.");
            stockOk = false;
        }
        return stockOk;
    }
    
    //Actualiza el valor de la compra del producto seleccionado y el stock que quede después de realizar la compra
    public static float formalizarCompra(Producto productoSeleccionado, int unidades){
        float precioCompra;
        precioCompra = productoSeleccionado.getPrecio() * unidades;
        productoSeleccionado.setStock(productoSeleccionado.getStock() - unidades);

        System.out.println("Venta realizada con éxito.");
        return precioCompra;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean seguir, stockOk;
        Producto P1 = new Producto("Peces", 10, 40);
        Producto P2 = new Producto("Tortugas", 4, 8);
        Producto P3 = new Producto("Canarios", 5, 4);
        Producto productoSeleccionado;
        int opc, unid;
        float precioTotal = 0;
        do{
            productoSeleccionado = menu(P1, P2, P3);
            if  (productoSeleccionado != null){  //Si hemos seleccionado alguno de los productos
                unid = pedirUnidades();
                stockOk = comprobarStock(productoSeleccionado, unid);
                if  (stockOk){  //Si hay stock suficiente
                    precioTotal = precioTotal + formalizarCompra(productoSeleccionado, unid);
                }                
            }
            else{
                System.out.println("La opción debe estar comprendida entre 1 y 3.");
            }
            seguir = seguirComprando();
        }while(seguir);
        System.out.println("El total de la compra asciende a "+precioTotal+" euros.");
        System.out.println("Muchas gracias. Vuelva cuando quiera.");
    }
    
}

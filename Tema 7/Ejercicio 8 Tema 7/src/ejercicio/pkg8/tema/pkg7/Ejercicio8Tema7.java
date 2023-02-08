/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg8.tema.pkg7;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio8Tema7 {
    public static int pedirNumero(){
        Scanner entrada=new Scanner (System.in);
        int numero=entrada.nextInt();
        return numero;
    }
    public static String pedirNombre(){
        Scanner entrada=new Scanner (System.in);
        String nombre=entrada.nextLine();
        return nombre;
    }
    public static void crearProductos(Producto tienda[]){
        for (int i = 0; i < tienda.length; i++) {
            tienda[i]=new Producto();
            System.out.println("------ PRODUCTO "+(i+1)+"------");
            System.out.println("Introduzca el nombre del producto: ");
            tienda[i].setNombre(pedirNombre());
            System.out.println("Introduzca el precio");
            tienda[i].setPrecio(pedirNumero());
            System.out.println("Introduzca el stock");
            tienda[i].setStock(pedirNumero());
            System.out.println("-- PRODUCTO "+(i+1)+" ALMACENADO CON EXITO --");
        }
    }
    public static void mostrarCompra(Producto tiendaAux){
        System.out.println("Has elegido: "+tiendaAux.getNombre());
    }
    public static void actualizarStock(Producto tienda[], int opc,int opc2){
            System.out.println("Venta realizada con exito");
            tienda[opc].setStock(tienda[opc].getStock()-opc2);
    }
    public static void menuVentas(Producto tienda[]){
        int opc,opc2;
        String respuesta;
        do {
            for (int i = 0; i < tienda.length; i++) {
            System.out.println("Pulse "+(i+1)+" para comprar "+tienda[i].getNombre()+" cuyo precio es de"+
            tienda[i].getPrecio()+" y el stock es de "+tienda[i].getStock()+" unidades");
            }
            opc=pedirNumero()-1;
            mostrarCompra(tienda[opc]);
            System.out.println("Cuantas unidades desea: ");
            opc2=pedirNumero();
            actualizarStock(tienda,opc,opc2);
            System.out.println("Desea comprar otro producto: ");
            respuesta=pedirNombre();
        } while (respuesta.equalsIgnoreCase("no"));
        System.out.println("Adios....");
    }
    public static void main(String[] args) {
        System.out.println("-- BIENVENIDO A MI TIENDA DE DEPORTES --");
        System.out.println("Acceso al menu de Administracion");
        System.out.println("Cuantos productos desea dar de alta: ");
        Producto[] tienda = new Producto[pedirNumero()];
        crearProductos(tienda);
        System.out.println("-- Acceso al menu de ventas");
        menuVentas(tienda);
        
    }
    
}

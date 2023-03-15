/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg02.tema.pkg11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio02Tema11 {
    public static int pedirNumero(){
        Scanner entrada = new Scanner (System.in);
        int opc=entrada.nextInt();
        return opc;
    }
    public static String pedirNombre(){
        Scanner entrada=new Scanner (System.in);
        String nombre=entrada.nextLine();
        return nombre;
    }
    public static float pedirPrecio(){
        Scanner entrada=new Scanner (System.in);
        float precio = entrada.nextFloat();
        return precio;
    }
    public static void introducirProductos(HashMap<Integer,Producto> mapa){
        int clave;
        String nombreProducto;
        float precio;
        int stock;
        System.out.println("Introduce la clave: ");
        clave = pedirNumero();
        System.out.println("Introduce el nombre del producto: ");
        nombreProducto=pedirNombre();
        System.out.println("Introduce el precio del producto: ");
        precio = pedirPrecio();
        System.out.println("Introduce el stock del producto: ");
        stock = pedirNumero();
        Producto productoAux = new Producto(nombreProducto, precio, stock);
        mapa.put(clave, productoAux);
    }
    public static void mostrarProductos(HashMap<Integer, Producto> mapa){
        Iterator it = mapa.keySet().iterator();
        int clave;
        Producto productoAux;
        while(it.hasNext()){
            clave = (int) it.next();
            System.out.println("Clave : "+clave);
            productoAux = (Producto) mapa.get(clave);
            System.out.println("Nombre del producto: "+productoAux.getNombre());
            System.out.println("Precio del producto: "+productoAux.getPrecio());
            System.out.println("Stock del producto: "+productoAux.getStock());
        }
    }
    public static void eliminarProductos(HashMap<Integer, Producto> mapa){
        System.out.println("Introduce la clave del producto que quieres eliminar");
        int clave = pedirNumero();
        if  (mapa.containsKey(clave)){
            mapa.remove(clave);
            System.out.println("Ha sido eliminado con exito");
        }
        else{
            System.out.println("No existe la clave");
        }
        
    }
    public static void menuAdministracion(HashMap<Integer, Producto> mapa){
        int opc;
        do {
            System.out.println("1. Introducir productos en la lista");
            System.out.println("2. Visualizar todos los productos");
            System.out.println("3. Eliminar productos de la lista");
            System.out.println("4. Volver al menu principal");
            opc=pedirNumero();
            switch(opc){
                case 1:
                    introducirProductos(mapa);
                    break;
                case 2:
                    mostrarProductos(mapa);
                    break;
                case 3:
                    eliminarProductos(mapa);
                    break;
            }
        } while (opc!=4);        
    }
    public static void mostrarLista(HashMap<Integer, Producto> mapa){
        int clave;
        Iterator it = mapa.keySet().iterator();
        Producto productoAux;
        while(it.hasNext()){
                clave = (int) it.next();
                System.out.println("Clave : "+clave);
                productoAux = (Producto) mapa.get(clave);
                System.out.println("Nombre del producto: "+productoAux.getNombre());
                System.out.println("Precio del producto: "+productoAux.getPrecio());
                System.out.println("Stock del producto: "+productoAux.getStock());
            }
    }
    public static int comprar(HashMap<Integer, Producto> mapa, int totalCompra){
        float suma = 0;
        float compraTotal;
        Iterator it = mapa.keySet().iterator();
        int clave;
        Producto productoAux;
        int codigo;
        int unidades;
        String comprarMas;
        do {
                mostrarLista(mapa);
                System.out.println("Introduce el codigo del producto que quieres comprar: ");
                codigo = pedirNumero();
                productoAux = (Producto) mapa.get(codigo);
                if (mapa.containsKey(codigo)) {
                    System.out.println("Cuantas unidades deeseas: ");
                    unidades = pedirNumero();
                    if (productoAux.getStock() > unidades) {
                        compraTotal = productoAux.getPrecio() * unidades;
                        productoAux.setStock(productoAux.getStock()-unidades);
                        totalCompra = (int) (totalCompra+compraTotal);
                    }
                    else{
                        System.out.println("ERROR..... No tenemos tantas unidades disponibles");
                    }                
                }
                else{
                    System.out.println("No tenemos productos con el codigo buscado."); 
                }
                System.out.println("Deeseas comprar mas: ");
                comprarMas = pedirNombre();                
        } while (comprarMas.equalsIgnoreCase("si"));
        return totalCompra;
    }
    public static int menuCompra(HashMap<Integer, Producto> mapa, int totalCompra){
        int opc;
        do {
            System.out.println("1. Comprar productos");
            System.out.println("2. Volver al menu principal");
            opc=pedirNumero();
            switch(opc){
                case 1:
                    totalCompra = comprar(mapa, totalCompra);
                    System.out.println("El total de la compra es : "+totalCompra + "€");
                    break;
            }
        } while (opc!=2);
        return totalCompra;
    }
    public static void menu(HashMap<Integer, Producto> mapa){
        int opc;
        int totalCompra = 0;
        do {
            System.out.println("1. MENU ADMINISTRACION");
            System.out.println("2. MENU COMPRA");
            System.out.println("3. SALIR");
            opc=pedirNumero();
            switch(opc){
                case 1:
                    menuAdministracion(mapa);
                    break;
                case 2:
                    totalCompra = menuCompra(mapa, totalCompra);
                    break;
            }
        } while (opc!=3);
        
    }
    public static void main(String[] args) {
        HashMap<Integer, Producto> mapa = new HashMap<>();        
        menu(mapa);
    }
    
}

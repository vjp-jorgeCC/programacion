/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio11 {
    public static int pedirNumero(){
        Scanner entrada=new Scanner(System.in);
        int numero=entrada.nextInt();
        return numero;
    }
    public static String pedirDescripcion(){
        Scanner entrada=new Scanner(System.in);
        String descripcion=entrada.nextLine();
        return descripcion;
    }
    public static void rellenarMuebles(Mueble almacen[]){
        for (int i = 0; i < almacen.length; i++) {
            almacen[i]=new Mueble();
            System.out.println("---- MUEBLE "+(i+1)+" ----");
            System.out.println("Descripcion del mueble: ");
            almacen[i].setDescripcion(pedirDescripcion());
            System.out.println("Precio del mueble: ");
            almacen[i].setPrecio(pedirNumero());
        }
    }
    public static void mostrarMuebles(Mueble almacen[]){
        System.out.println("Mostrando todos lo muebles");
        for (int i = 0; i < almacen.length; i++) {
            if (almacen[i] != null){
               System.out.println("Mueble "+(i+1));
                System.out.println("Descripcion del mueble: "+almacen[i].getDescripcion());
                System.out.println("Precio del mueble: "+almacen[i].getPrecio()); 
            }            
        }
    }
    public static void mostrarPrecioMuebles(Mueble almacen[]){
        System.out.println("Introduce un numero para mostrar los muebles con ese o menor precio");
        int numero=pedirNumero();
        for (int i = 0; i < almacen.length; i++) {
            if (almacen[i] != null) {
              if (almacen[i].getPrecio()<=numero) {
                    System.out.println("Mueble "+(i+1));
                    System.out.println("Descripcion del mueble: "+almacen[i].getDescripcion());
                    System.out.println("Precio del mueble: "+almacen[i].getPrecio());               
                }                 
            }
            
        }
    }
    public static void menu(Mueble almacen[]){
        int opc;
        do {
            System.out.println("Pulsa 1 para rellenar los muebles");
            System.out.println("Pulsa 2 para mostrar los muebles");
            System.out.println("Pulsa 3 para ordenar los muebles");
            System.out.println("Pulsa 4 para salir");
            opc=pedirNumero();
            switch(opc){
                case 1:
                    rellenarMuebles(almacen);
                    break;
                case 2:
                    mostrarMuebles(almacen);
                    break;
                case 3:
                    mostrarPrecioMuebles(almacen);
                    break;
            }
        } while (opc!=4);
        System.out.println("VUELVE CUANDO QUIERAS...");
    }
    public static void main(String[] args) {
        Mueble[] almacen = new Mueble[4];
        menu(almacen);
    }
    
}

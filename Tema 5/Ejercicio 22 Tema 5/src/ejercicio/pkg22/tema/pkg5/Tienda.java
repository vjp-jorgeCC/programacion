/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg22.tema.pkg5;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Tienda {
    
        public static void menu(Producto producto1,Producto producto2,Producto producto3){
            Scanner entrada=new Scanner (System.in);
            int num=0;
            int menu=0;
            System.out.println("--BIENVENIDO A MI TIENDA DE MASCOTAS--");
            System.out.println("Pulse 1 para comprar "+producto1.getNombre()+" cuyo precio es de "+producto1.getPrecio()+" Euros y el stock es de "
                +producto1.getStock()+" unidades");
            System.out.println("Pulse 2 para comprar "+producto2.getNombre()+" cuyo precio es de "+producto2.getPrecio()+" Euros y el stock es de "
                +producto2.getStock()+" unidades");
            System.out.println("Pulse 3 para comprar "+producto3.getNombre()+" cuyo precio es de "+producto3.getPrecio()+" Euros y el stock es de "
                +producto3.getStock()+" unidades");
            menu=entrada.nextInt();
            venta(menu,producto1,producto2,producto3);
    }
        public static void venta(int menu,Producto producto1,Producto producto2,Producto producto3){
            Scanner entrada=new Scanner (System.in);
            int eleccion;
            int otro;
            int cuenta=0;
            switch(menu){
                case 1:
                    System.out.println("Ha elegido comprar "+producto1.getNombre());
                    System.out.println("¿Cuantas unidades desea?");
                    eleccion=entrada.nextInt();
                    if (eleccion>=producto1.getStock()) {
                        System.out.println("Lo sentimos, solo tenemos disponibles "+producto1.getStock()+" unidades");
                        System.out.println("¿Desea comprar otro producto? 1-SI, 2-NO");                        
                    }
                    else{
                       System.out.println("Venta realizada con exito ");
                       System.out.println("¿Desea comprar otro producto? 1-SI, 2-NO");
                    }
                        otro=entrada.nextInt();
                    if (otro==1) {
                        cuenta=cuenta+(eleccion*producto1.getPrecio());
                        menu(producto1,producto2,producto3);
                    }
                    else{
                        cuenta=cuenta+(eleccion*producto1.getPrecio());
                        System.out.println("El precio total es de "+cuenta+"€");
                    }
                    break;
                case 2:
                    System.out.println("Ha elegido comprar "+producto2.getNombre());
                    System.out.println("¿Cuantas unidades desea?");
                    eleccion=entrada.nextInt();
                    if (eleccion>=producto2.getStock()) {
                        System.out.println("Lo sentimos, solo tenemos disponibles "+producto2.getStock()+" unidades");
                        System.out.println("¿Desea comprar otro producto? 1-SI, 2-NO");
                        
                    }
                    else{
                        System.out.println("Venta realizada con exito ");
                        System.out.println("¿Desea comprar otro producto? 1-SI, 2-NO");   
                    }
                        otro=entrada.nextInt();
                    if (otro==1) {
                        cuenta=cuenta+(eleccion*producto2.getPrecio());
                        menu(producto1,producto2,producto3);
                    }
                    else{
                        cuenta=cuenta+(eleccion*producto2.getPrecio());
                        System.out.println("El precio total es de "+cuenta+"€");
                    }
                    break;
                case 3:
                    System.out.println("Ha elegido comprar "+producto3.getNombre());
                    System.out.println("¿Cuantas unidades desea?");
                    eleccion=entrada.nextInt();
                    if (eleccion>=producto3.getStock()) {
                        System.out.println("Lo sentimos, solo tenemos disponibles "+producto3.getStock()+" unidades");
                        System.out.println("¿Desea comprar otro producto? 1-SI, 2-NO");
                    }
                    else{
                        System.out.println("Venta realizada con exito ");
                        System.out.println("¿Desea comprar otro producto? 1-SI, 2-NO");
                            
                    }
                       otro=entrada.nextInt(); 
                    if (otro==1) {
                        cuenta=cuenta+(eleccion*producto3.getPrecio());
                        menu(producto1,producto2,producto3);
                    }
                    else{
                        cuenta=cuenta+(eleccion*producto1.getPrecio());
                        System.out.println("El precio total es de "+cuenta+"€");
                    }
                    break;                
            }
        }
    public static void main(String[] args) {
        Producto producto1=new Producto("Peces",10,40);
        Producto producto2=new Producto("Tortugas",4,8);
        Producto producto3=new Producto("Canarios",15,4);
        
        menu(producto1,producto2,producto3);
    }   
}

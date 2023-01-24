/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03a5;

import java.util.Scanner;

/**
 *
 * @author Quique Pineda
 */
public class Ejercicio03A5 {
    
    //Pregunta al usuario si desea servir más platos o no
    public static String pedirRespuesta(){
        Scanner teclado = new Scanner(System.in);
        String resp;
        System.out.println("¿Desea servir más platos?");
        resp = teclado.nextLine();
        return resp;
    }
    
    //Pide el número de raciones al usuario
    public static int pedirRaciones(){
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("¿Cuántas raciones?");
        num = teclado.nextInt();
        return num;
    }
    
    //Comprueba si hay stock suficiente para el plato, retornando true o false
    public static boolean comprobarStock(Plato P1, Plato P2, Plato P3, int opc, int numRaciones){
        boolean racionesSuficientes = true;
        switch(opc){
            case 1:
                if  (numRaciones > P1.getRaciones()){
                    racionesSuficientes = false;
                    System.out.println("Lo sentiemos, sólo tenemos disponibles "+P1.getRaciones()+" raciones");
                }
                break;
            case 2:
                if  (numRaciones > P2.getRaciones()){
                    racionesSuficientes = false;
                    System.out.println("Lo sentiemos, sólo tenemos disponibles "+P2.getRaciones()+" raciones");
                }
                break;
            case 3:
                if  (numRaciones > P3.getRaciones()){
                    racionesSuficientes = false;
                    System.out.println("Lo sentiemos, sólo tenemos disponibles "+P3.getRaciones()+" raciones");
                }
                break;
        }
        return racionesSuficientes;
    }
    
    //Calcula el precio de la compra y actualiza las raciones del plato
    public static float formalizarCompra(Plato P1, Plato P2, Plato P3, int opc, int numRaciones){
        float precio = 0;
        int raciones;
        switch(opc){
            case 1:
                precio = P1.getPrecio() * numRaciones;
                raciones = P1.getRaciones() - numRaciones;  //Raciones del producto 1 menos las raciones que voy a servir
                P1.setRaciones(raciones);
                break;
            case 2:
                precio = P2.getPrecio() * numRaciones;
                raciones = P2.getRaciones() - numRaciones;  //Raciones del producto 1 menos las raciones que voy a servir
                P2.setRaciones(raciones);
                break;
            case 3:
                precio = P3.getPrecio() * numRaciones;
                raciones = P3.getRaciones() - numRaciones;  //Raciones del producto 1 menos las raciones que voy a servir
                P3.setRaciones(raciones);
                break;
        }
        return precio;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean stockOk;
        String resp;
        int opc, numRaciones;
        float precioTotal = 0;
        
        //Creamos los objetos de tipo "Plato"
        Plato P1 = new Plato("Nachos", 8, 35);
        Plato P2 = new Plato("Burritos", 12, 10);
        Plato P3 = new Plato("Tacos", 10, 20);
        
        System.out.println("  -- LOS POLLOS HERMANOS --");
        do{
            System.out.println("Pulse 1 para servir "+P1.getNombre()+" (precio: "+P1.getPrecio()+" Euros - Stock: "+P1.getRaciones()+" raciones.");
            System.out.println("Pulse 2 para servir "+P2.getNombre()+" (precio: "+P2.getPrecio()+" Euros - Stock: "+P2.getRaciones()+" raciones.");
            System.out.println("Pulse 3 para servir "+P3.getNombre()+" (precio: "+P3.getPrecio()+" Euros - Stock: "+P3.getRaciones()+" raciones.");
            opc = teclado.nextInt();
            numRaciones = pedirRaciones();
            stockOk = comprobarStock(P1, P2, P3, opc, numRaciones);
            if  (stockOk){
                precioTotal = precioTotal + formalizarCompra(P1, P2, P3, opc, numRaciones);
            }
            resp = pedirRespuesta();
        }while(resp.equalsIgnoreCase("SI"));
        System.out.println("La cuenta asciende a "+precioTotal+" Euros.");
        System.out.println("Muchas gracias. Atentamente, Gus Fring.");
    }
    
}

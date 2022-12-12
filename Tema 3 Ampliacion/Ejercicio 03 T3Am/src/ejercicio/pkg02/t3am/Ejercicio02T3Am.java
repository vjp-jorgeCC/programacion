/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg02.t3am;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio02T3Am {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int contador, numero;
        contador=0;
        do {
            System.out.println("Introduce 0 o 1: ");
            numero=entrada.nextInt();
            if (numero==1) {
                contador=contador+10;
            }            
        } while (numero==1);
        if (numero==0) {
            System.out.println("Total: "+contador);
        }
    }
    
}

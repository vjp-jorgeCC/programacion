/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg04.t3am;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio04T3Am {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int numero=7, contador=0;
        while(numero==7){
            System.out.println("Porfavor introduzca el siete: ");
            numero=entrada.nextInt();
            if (numero==7) {
                contador++;
            }
        }
        System.out.println("Has introducido "+contador+" sietes");
    }
    
}

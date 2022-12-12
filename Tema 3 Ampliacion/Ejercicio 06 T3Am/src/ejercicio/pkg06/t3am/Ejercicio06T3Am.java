/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg06.t3am;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio06T3Am {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int numero,contador;
        contador=0;
        do {
            System.out.println("Pulsa 1 para sumar");
            System.out.println("Pulsa 2 para restar");
            System.out.println("Pulsa 3 para salir");
            numero=entrada.nextInt();
            if (numero==1) {
                contador++;
            }
            if (numero==2){
                contador--;
            }
        } while ((numero>0)&&(numero<3));
        if (numero==3) {
           System.out.println("Total: "+contador); 
        }
        if (numero!=3) {
            System.out.println("Error, el numero entroducido no es ni el 1 ni el 2 ni el 3");
            
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg17.t3;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio17T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int numero;
        do {
            System.out.println("Introduce un numero: ");
            numero=entrada.nextInt();
            if (numero<0) {
                System.out.println("El numero introducido es menor que 0, introduce otro.");                
            }
        } while (numero<0);
        System.out.println("La raiz cuadrado del numero "+numero+" es: "+Math.sqrt(numero));
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg23.t3;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio23T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numero;
        do {
            System.out.println("Porfavor introduzca un numero");
            numero=entrada.nextInt();
            if (numero<1) {
                System.out.println("Error, introduce un numero mayor que 1");
            }
        } while (numero<1);
        for (int i = 1; i <=numero ; i++) {
            System.out.println(i);
            
        }
    }    
}

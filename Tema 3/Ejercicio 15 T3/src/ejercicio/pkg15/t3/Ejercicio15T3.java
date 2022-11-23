/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg15.t3;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio15T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int i,numero;
        System.out.println("Introduce un numero para calcular su tabla de multiplicar: ");
        numero=entrada.nextInt();
        for ( i = 0; i <= 10; i++) {
            System.out.println(numero+" * "+i+" = "+numero*i);
        }
        i++;
    }
    
}

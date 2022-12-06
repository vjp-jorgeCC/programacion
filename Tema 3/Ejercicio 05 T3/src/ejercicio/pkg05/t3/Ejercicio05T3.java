/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg05.t3;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio05T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero;
        System.out.println("Introduce un numero ");
        numero = entrada.nextInt();
        if ((numero%2) == 0){//Si el resto de dividir entre 2 es 0 significa que es par
            System.out.println("El numero "+numero+" es par");
        }
        else{
            System.out.println("El numero "+numero+" es impar");
        }
    }    
}

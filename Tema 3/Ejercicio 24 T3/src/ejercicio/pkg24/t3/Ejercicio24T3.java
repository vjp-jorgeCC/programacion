/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg24.t3;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio24T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero,contador;
        contador=0;
        do {
            System.out.println("Introduzca un numero: ");
            numero=entrada.nextInt();
            if (numero<1) {
                System.out.println("Porfavor introduzca otro numero:");
                
            }
        } while (numero<=1);
        System.out.println("Los numeros multiplos de 3 entre el 1 y el numero introducido son: ");
        for (int i = 1; i <= numero; i++) {
            if ((i%3)==0) {                
                System.out.println(i);
                contador++;                
            }                        
        }
        System.out.println("El total de numeros mostrados es: "+contador);
    }    
}

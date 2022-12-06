/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg27.t2;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio27T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);//Declaro mi scanner
        int numero;
        int doble;
        int cubo;
        System.out.println("Por favor, introduzca un numero: ");
        numero = entrada.nextInt();//Pido el numero al usuario
        doble=numero*numero;//Calculo el doble
        cubo=numero*numero*numero;//Calculo el cubo
        System.out.println("El doble de "+numero+" es: "+ doble);
        System.out.println("El cubo de "+numero+" es: "+cubo);        
    }
    
}

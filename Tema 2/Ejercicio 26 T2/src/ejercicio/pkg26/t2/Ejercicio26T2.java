/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg26.t2;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio26T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);//Declaro mi scanner
        int numero;
        System.out.println("Por favor, introduzca un numero de 4 cifras: ");
        numero = entrada.nextInt();//Le pido el numero
        System.out.println("La primera cifra es: "+(numero/1000));
        numero = numero%1000;//Al dividir entre 1000 y quedarme con un numero entero me quedo solo con la primera cifra
        System.out.println("La segunda cifra es: "+(numero/100));
        numero = numero%100;//Al dividir entre 100 y quedarme con un numero entero me quedo solo con la primera cifra
        System.out.println("La tercera cifra es: "+(numero/10));
        numero = numero%10;//Al dividir entre 10 y quedarme con un numero entero me quedo solo con la primera cifra
        System.out.println("La cuarta cifra es: "+numero);                 
    }
    
}

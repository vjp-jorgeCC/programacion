/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10.t4;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio10T4 {
    public static int numero(){
        int dato;
        Scanner entrada=new Scanner (System.in);
        System.out.println("Introduce un numero: ");
        dato=entrada.nextInt();
        return dato;
    }
    public static void multiplicar (int numero){
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero+" X "+i+" = "+(numero*i));
        }
    }
    public static void main(String[] args) {
        int numero;
        numero=numero();
        multiplicar(numero);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej17t4;

import java.util.Scanner;

/**
 *
 * @author srodriguezf28
 */
public class Ej17T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        char letraUsuario;
        int contador=0;
        double aleatorio=Math.random() * (122 - 97) + 97;
        char letraGenerada=(char)aleatorio;
        do {
            System.out.println("Introduce una letra");
            letraUsuario=entrada.nextLine().charAt(0);
            contador++;
            if (letraUsuario<letraGenerada) {
                System.out.println("La letra esta despues.");
            }
            else{
                System.out.println("La letra esta antes");
            }
        } while (letraUsuario!=letraGenerada);
        System.out.println("Enhorabuena la letra era la "+letraGenerada);
        System.out.println("El numero de intentos ha sido: "+contador);
    }
    
}

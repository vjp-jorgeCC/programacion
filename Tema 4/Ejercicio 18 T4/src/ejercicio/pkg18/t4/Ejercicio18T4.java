/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg18.t4;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio18T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String nombre;
        System.out.println("Introduce un nombre: ");
        nombre=entrada.nextLine();
        for (int i = 0; i < 5; i++) {
            System.out.println(nombre);
        }
    }
    
}

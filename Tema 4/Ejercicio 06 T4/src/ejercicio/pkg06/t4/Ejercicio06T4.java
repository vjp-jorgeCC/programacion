/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg06.t4;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio06T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int nota;
        System.out.println("Introduce la nota: ");
        nota=entrada.nextInt();
        Nota.nota(nota);
    }
    
}

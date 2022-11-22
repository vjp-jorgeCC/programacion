/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg24.t2;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio24T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float programacion, lenguaje, bbdd, entorno, sistemas, fol;
        float media;
        System.out.println("Por favor, introduzca la nota de programacion: ");
        programacion = entrada.nextFloat();
        System.out.println("Introduzca la nota de Lenguaje de Marcas: ");
        lenguaje = entrada.nextFloat();
        System.out.println("Introduzca la nota de Bases de Datos: ");
        bbdd = entrada.nextFloat();
        System.out.println("Introduzca la nota de Entornos de Desarrollo: ");
        entorno = entrada.nextFloat();
        System.out.println("Introduzca la nota de Sistemas Informaticos: ");
        sistemas = entrada.nextFloat();
        System.out.println("Por ultimo, introduzca la nota de Formacion y Orientacion Laboral: ");
        fol = entrada.nextFloat();
        media=(programacion+lenguaje+bbdd+entorno+sistemas+fol)/6;
        System.out.println("Su nota media del curso es de: "+media);
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1.tema.pkg7;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio1Tema7 {
    public static int pedirNota(){
        Scanner entrada = new Scanner(System.in);
        int numero=entrada.nextInt();
        return numero;
    }
    public static void notaMedia(Asignaturas almacen []){
        int suma=0;
        int media;
        for (int i = 0; i < almacen.length; i++) {
            suma=suma+almacen[i].getNota();
        }
        media=suma/almacen.length;
        System.out.println("La nota media del curso es: "+media);
    }
    public static void main(String[] args) {
        Asignaturas[] almacen = new Asignaturas[6];
        
        //CREO LAS ASIGNATURAS
        System.out.println("Introduce la nota de Porgramacion.");
        almacen[0] = new Asignaturas("Programacion", pedirNota());
        System.out.println("Introduce la nota de Lenguaje de Marcas");
        almacen[1] = new Asignaturas("Lenguaje de Marcas", pedirNota());
        System.out.println("Introduce la nota de Base de Datos");
        almacen[2] = new Asignaturas("Base de Datos", pedirNota());
        System.out.println("Introduce la nota de Entornos de Desarrollo");
        almacen[3] = new Asignaturas("Entornos de Desarrollo", pedirNota());
        System.out.println("Introduce la nota de Sistemas Informaticos");
        almacen[4] = new Asignaturas("Sistemas Informaticos", pedirNota());
        System.out.println("Introduce la nota de Formacion y Orientacion Laboral");
        almacen[5] = new Asignaturas("Formacion y Orientacion Laboral", pedirNota());
        
        notaMedia(almacen);
        
    }
    
}

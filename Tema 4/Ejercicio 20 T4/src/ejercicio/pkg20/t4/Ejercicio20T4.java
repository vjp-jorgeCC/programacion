/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg20.t4;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio20T4 {
    public static String respuesta1(){
        String respuesta="Madrid";
        return respuesta;
    }
    public static String respuesta2(){
        String respuesta="Napoleon Bonaparte";
        return respuesta;
    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        String respuesta1,respuesta2, solucion1, solucion2;
        int nota=0;
        System.out.println("EXAMEN DE CULTURA GENERAL");
        System.out.println("1ºPREGUNTA: ¿Cual es la capital de España?");
        respuesta1=entrada.nextLine();
        boolean iguales1=respuesta1.equalsIgnoreCase(respuesta1());
        if (iguales1==true) {
            System.out.println("Muy bien, respuesta correcta.");
            nota=nota+5;
        }
        else{
            System.out.println("No es correcto. La respuesta correcta seria: Madrid.");
        }
        System.out.println("2ºPREGUNTA: ¿Quien descubrio America?");
        respuesta2=entrada.nextLine();
        boolean iguales2=respuesta2.equalsIgnoreCase(respuesta2());
        if (iguales2==true) {
            System.out.println("Muy bien, respuesta correcta");
            nota=nota+5;
        }
        else{
            System.out.println("No es correcto. La respuesta correcta seria: Napoleon Bonaparte.");
        }
        System.out.println("NOTA DEL EXAMEN: "+nota);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg06.t3;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio06T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
      int nota;
        System.out.println("Escribe la nota ");
        nota=entrada.nextInt();
        switch (nota){//Si la nota esta entre el 0 y 4 muestro suspenso
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
                break;
            case 5://Si esta entre 5 y 6 muestro bien
            case 6:
                System.out.println("Bien");
                break;
            case 7://Si esta entre 7 y 8 muestro notable
            case 8:
                System.out.println("Notable");
                break;
            case 9://Si esta entre 9 y 10 muestro sobresaliente
            case 10:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("No has introducido una nota entre 0 y 10");               
        }
    }
    
}

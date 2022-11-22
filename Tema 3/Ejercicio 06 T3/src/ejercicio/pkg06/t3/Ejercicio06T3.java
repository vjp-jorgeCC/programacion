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
        switch (nota){
            case 0:{
                System.out.println("Suspenso");
                break;
            }
            case 1:{
                System.out.println("Suspenso");
                break;
            }
            case 2:{
                System.out.println("Suspenso");
                break;
            }
            case 3:{
                System.out.println("Suspenso");
                break;
            }
            case 4:{
                System.out.println("Suspenso");
                break;
            }
            case 5:{
                System.out.println("Bien");
                break;
            }
            case 6:{
                System.out.println("Bien");
                break;
            }
            case 7:{
                System.out.println("Notable");
                break;
            }
            case 8:{
                System.out.println("Notable");
                break;
            }
            case 9:{
                System.out.println("Sobresaliente");
                break;
            }
            case 10:{
                System.out.println("Sobresaliente");
                break;
            }
            default:{
                System.out.println("La nota que has introducido no esta entre 0 y 10");
            }
        }
    }
    
}

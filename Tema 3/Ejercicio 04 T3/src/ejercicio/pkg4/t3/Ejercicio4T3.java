/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4.t3;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio4T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner entrada = new Scanner (System.in);//Declaro el scanner
        int numero1, numero2, numero3, numeroMenor;
        System.out.println("Por favor, introduzca el primer numero ");
        numero1=entrada.nextInt();
        System.out.println("Por favor, introduzca el segundo numero ");
        numero2=entrada.nextInt();
        System.out.println("Por favor, introduzca el tercer numero ");
        numero3=entrada.nextInt();
        if ((numero1 < numero2)&&(numero1 < numero3)){//Si el numero 1 es menor que el 2 y el 3 lo guardo
            numeroMenor = numero1;
        }
        else{
            if ((numero2 < numero1)&&(numero2 < numero3)){//Si el numero 2 es menor que el 1 y el 3 lo guardo
                numeroMenor = numero2;
            }
            else{
                numeroMenor = numero3;//Si no es menor ni el 1 ni el 2 quiere decir que es el 3, lo guardo                
            }
        }
        System.out.println("El numero mayor de los introducidos es el "+numeroMenor);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg03.t3;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio03T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero1, numero2, numero3, numeromayor;
        System.out.println("Por favor, introduzca el primer numero ");
        numero1=entrada.nextInt();
        System.out.println("Por favor, introduzca el segundo numero ");
        numero2=entrada.nextInt();
        System.out.println("Por favor, introduzca el tercer numero ");
        numero3=entrada.nextInt();
        if ((numero1 > numero2)&&(numero1 > numero3)){
            numeromayor = numero1;
        }
        else{
            if ((numero2 > numero1)&&(numero2 > numero3)){
                numeromayor = numero2;
            }
            else{
                numeromayor = numero3;                
            }
        }
        System.out.println("El numero mayor de los introducidos es el "+numeromayor);
    }
}


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
        Scanner entrada = new Scanner (System.in);//Declaro el scanner
        int numero1, numero2, numero3, numeromayor;
        System.out.println("Por favor, introduzca el primer numero ");
        numero1=entrada.nextInt();//Pido el nunero al usuario
        System.out.println("Por favor, introduzca el segundo numero ");
        numero2=entrada.nextInt();//Pido el numero al usuario
        System.out.println("Por favor, introduzca el tercer numero ");
        numero3=entrada.nextInt();//Pido el numero al usuario
        if ((numero1 > numero2)&&(numero1 > numero3)){//Si el numero 1 es mayor que el 2 y que el 3 lo guardo como el mayor
            numeromayor = numero1;
        }
        else{
            if ((numero2 > numero1)&&(numero2 > numero3)){//Si el numero 2 es mayor que el 2 y el 3 actualizo mi numero mayor
                numeromayor = numero2;
            }
            else{//Si ninguno de los dos anteriores es el mayor, quiere decir que es el tercero, lo actualizo
                numeromayor = numero3;                
            }
        }
        System.out.println("El numero mayor de los introducidos es el "+numeromayor);
    }
}


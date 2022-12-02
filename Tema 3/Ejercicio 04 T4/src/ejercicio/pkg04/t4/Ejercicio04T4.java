/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg04.t4;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio04T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero1,numero2,numero3;
        System.out.println("Introduzca el primer numero: ");
        numero1=entrada.nextInt();//Pido el primer numero
        System.out.println("Introduzca el segundo numero: ");
        numero2=entrada.nextInt();//Pido el segundo numero
        System.out.println("Introduzca el tercer numero: ");
        numero3=entrada.nextInt();//Pido el tercer numero
        NumeroMenor.numeroMenor(numero1,numero2,numero3);//Llamo a la clase que esta en el mismo paquete
    }
    
}

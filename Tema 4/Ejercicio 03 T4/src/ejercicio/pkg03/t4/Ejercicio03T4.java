/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg03.t4;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio03T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int numero1,numero2,numero3;
        System.out.println("Introduce el primer numero: ");
        numero1=entrada.nextInt();//Pido el primer numero
        System.out.println("Introduce el segundo numero: ");
        numero2=entrada.nextInt();//Pido el segundo numero
        System.out.println("Introduce el tercer numero: ");
        numero3=entrada.nextInt();//Pido el tercer numero
        comparar.Comparacion.mayorMenor(numero1, numero2, numero3);//LLamo a la clase que esta en otro paquete
    }
    
}

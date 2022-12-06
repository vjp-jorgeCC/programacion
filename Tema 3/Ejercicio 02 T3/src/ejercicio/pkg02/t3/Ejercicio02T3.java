/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg02.t3;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio02T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);//Declaro el scanner
        int numero1;
        int numero2;
        int suma;
        int producto;
        System.out.println("Por favor, introduzca un numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Ahora, introduzca un segundo numero: ");
        numero2 = entrada.nextInt();
        suma=numero1+numero2;
        producto=numero1*numero2;
        if (numero1>10){//Si el primer numero recogido es menor que diez los multiplico
            System.out.println("La operacion que se realizo es producto y el resultado es "+ producto);            
        }
        else{//Si el primer numero recogido es mayor que diez los sumo
            System.out.println("La operacion que se realizo es suma y el resultado es: "+ suma);
        }
        
        
    }
    
}

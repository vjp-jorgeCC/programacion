
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg22.t3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio22T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaro escaner y variables
        Scanner entrada=new Scanner (System.in);
        int numero1,numero2,suma;
        
        //pido al usuario los dos numeros y hago la excepcion
        try {
            System.out.println("Introduzca el primer numero: ");
            numero1=entrada.nextInt();
            System.out.println("Introduzca el segundo numero: ");
            numero2=entrada.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Error, has introducido una letra.");
            numero1=0;
            numero2=0;
        }
        
        //hago la suma
        suma=numero1+numero2;
        
        //muestro el resultado
        System.out.println("La suma de los numeros "+numero1+" + "+numero2+" es: "+suma);
        
    }
    
}

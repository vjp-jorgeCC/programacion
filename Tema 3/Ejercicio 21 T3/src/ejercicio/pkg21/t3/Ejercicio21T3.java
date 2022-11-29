/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg21.t3;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio21T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaro el escaner y las variables
        Scanner entrada=new Scanner(System.in);
        int numero1,numero2,division;
        
        //pido los numeros que quiere dividir
        System.out.println("Introduzca el primer numero: ");
        numero1=entrada.nextInt();
        System.out.println("Introduzca el segundo numero:");
        numero2=entrada.nextInt();
        
        //hago la division de los dos numeros y excepcion.
        try {
            division=numero1/numero2;
        }
        catch (ArithmeticException e){
            System.out.println("Error, el segundo numero introducido es 0");
            division=0;
        }
        
        //muestro el resultado de la division
        System.out.println("El resultado de dividir "+numero1+"/"+numero2+"es: "+division);
        
    }
    
}

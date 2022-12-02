/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg01.t4;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio01T4 {
    public static void positivoNegativo(int n){//Creo un metodo para ver si el numero es positivo o negativo
        if (n>0) {
            System.out.println("El numero "+n+" es Positivo.");//Si el numero es positivo lo muestro
        }
        else{
            if (n<0) {
                System.out.println("El numero "+n+" es Negativo.");//Si el numero es negativo lo muestro    
            }
            else{
                System.out.println("El numero "+n+" es cero.");//Si el numero es 0 lo muestro
            }    
        }    
    }

    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);//Declaro un scanner
        int num;
        System.out.println("Introduce un numero: ");
        num=entrada.nextInt();
        positivoNegativo(num);//Llamo al metodo y muestro todo lo que contiene el metodo positivoNegativo
    }
    
}

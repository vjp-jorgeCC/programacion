/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg15.t3;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio15T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);//Declaro scanner
        int i,numero;
        System.out.println("Introduce un numero para calcular su tabla de multiplicar: ");
        numero=entrada.nextInt();
        for ( i = 0; i <= 10; i++) {//Se repite del 0 al 10, cuando es 10 para
            System.out.println(numero+" * "+i+" = "+numero*i);//Hago la tabla de multiplicar con la constante numero recogida por el usuario
        }
        i++;//Incremento de uno en uno
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg26.t4;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio26T4 {
    public static boolean esPrimo(int n1){
        boolean primo=true;
        int divisor=2;
        while((primo)&&(n1!=divisor)){
            if  (n1 % divisor == 0){
                primo=false;    
            }
            divisor++;
        }
        return primo;
    }
    public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);
        int numero;
        boolean primo;
        System.out.println("Introduce un numero: ");
        numero=entrada.nextInt();
        primo=esPrimo(numero);
        if (primo==false) {
            System.out.println("No es primo");
        }
        else{
            System.out.println("Es primo");
        }
    }
    
}

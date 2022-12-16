/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg21.t4;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio21T4 {
    public static int pedirNumero(){
        Scanner entrada=new Scanner (System.in);
        int numero;
        System.out.println("Introduce un numero: ");
        numero=entrada.nextInt();
        return numero;
    }
    public static void resultado(int n1, int n2){
        
        int contador=0;
        for (int i =n1+1; i < n2; i++) {
            if ((i%2)==0) {
                contador++;
            }
        }
        System.out.println("La suma total de los numeros pares entre "+n1+" y "+n2+" es: "+contador);
    }
    public static void main(String[] args) {
        int numero1,numero2;        
        do {
            numero1=pedirNumero();
            numero2=pedirNumero();
            if (numero1>numero2) {
                System.out.println("ERROR, el segundo numero debe ser mayor que el primero.");
            }
        } while (numero1>numero2);        
        resultado(numero1,numero2);
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg07.t4;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio07T4 {
    public static void ordenComparacion(int numero1,int numero2,int numero3,int numero4,int numero5){
        for (int i = 0; i < 3; i++) {
            if (numero1>numero2) {
                numero5=numero1;
                numero1=numero2;
                numero2=numero5;
            }
            if (numero2>numero3){
                numero5=numero2;
                numero2=numero3;
                numero3=numero5;
            }
            if (numero3>numero4) {
                numero5=numero3;
                numero3=numero4;
                numero4=numero5;
            }                        
        }
        System.out.println("El orden de los numero es: "+numero1+" - "+numero2+" - "+numero3+" - "+numero4);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int n1,n2,n3,n4,n5;
        n5=0;
        System.out.println("Introduce el primer numero: ");
        n1=entrada.nextInt();
        System.out.println("Introduce el segundo numero: ");
        n2=entrada.nextInt();
        System.out.println("Introduce el tercer numero: ");
        n3=entrada.nextInt();
        System.out.println("Introduce el cuarto numero: ");
        n4=entrada.nextInt();
        ordenComparacion(n1,n2,n3,n4,n5);
    }
    
}

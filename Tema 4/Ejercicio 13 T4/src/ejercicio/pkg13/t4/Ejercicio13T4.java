/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg13.t4;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio13T4 {
    public static int numeroUsuario(){
       int numero;
       Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce un numero: ");
            numero=entrada.nextInt();
        return numero;
    }
    public static boolean comprobador(int n1){
        boolean comprobar=false;
        if (n1>1) {
            comprobar=true;
        }
        if (n1<1) {
            comprobar=false;
        }
        return comprobar;
    }
    public static void resultado(int n1){
        for (int i = 0; i <= n1; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int numero;
        boolean comprobar;
        do {
            numero=numeroUsuario();
            comprobar=comprobador(numero);
        } while (comprobar==false);        
        if (comprobar==true) {
            resultado(numero);            
        }
    }
    
}

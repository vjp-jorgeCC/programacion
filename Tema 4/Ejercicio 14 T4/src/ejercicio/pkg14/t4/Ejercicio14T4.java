/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg14.t4;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio14T4 {
    public static int numeroUsuario(){
        int numero;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce un numero: ");
        numero=entrada.nextInt();
        return numero;
    }
    public static boolean comprobador(int n1){
        boolean mayor=false;
        if (n1>=0) {
            mayor=true;
        }
        else{
            System.out.println("ERROR!! Introduce un numero mayor que 0");
        }
        return mayor;
    }
    public static void resultado (int n1){
        System.out.println("Los numeros multiplos de 3 entre el 1 y el "+n1+" son: ");
        for (int i = 1; i <= n1; i++) {
            if ((i%3)==0) {
                System.out.println(i);
            }
            
        }
    }
    public static void main(String[] args) {
        int numero;
        boolean comprobar;
        do {
            numero=numeroUsuario();
            comprobar=comprobador(numero);
        } while (comprobar==false);
        resultado(numero);
    }
    
}

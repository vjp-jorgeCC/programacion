/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11.t4;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio11T4 {
    public static int numeroUsuario(){
        int numero;
        Scanner entrada=new Scanner (System.in);
        do {
            System.out.println("Introduce un numero: ");
            numero=entrada.nextInt();
            if (numero<0) {
                System.out.println("ERROR, introduzca un numero positivo");
            }
        } while (numero<0);
        return numero;
    }
    public static int raizCuadrada(int n1){
        int raiz;
        raiz=(int)Math.sqrt(n1);
        return raiz;
    }
    public static void resultado(int numero1){
        System.out.println("El resultado de la raiz cuadrada: "+numero1);
    }
    public static void main(String[] args) {
        int numeroUsuario,raiz;
        numeroUsuario=numeroUsuario();
        raiz=raizCuadrada(numeroUsuario);
        resultado(raiz);
    }
    
}

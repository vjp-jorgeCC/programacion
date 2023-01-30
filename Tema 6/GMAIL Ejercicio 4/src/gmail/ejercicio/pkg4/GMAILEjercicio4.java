/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmail.ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class GMAILEjercicio4 {
    public static int pedirNumero(){
        Scanner entrada = new Scanner(System.in);
        int numero;
        numero=entrada.nextInt();
        return numero;
    }
    public static void rellenarArray(int array1[],int array2[]){
        System.out.println("Rellena el primer array: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i]=pedirNumero();
        }
        System.out.println("Rellena el segundo array: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i]=pedirNumero();
        }
    }
    public static boolean comprobarArray(int array1[], int array2[]){
        boolean comprobar=false;
        int i=0;
        while(i<array1.length && !comprobar)
            if (array1[i]!=array2[i]) {
                comprobar=true;
            }
            else{
                i++;
            }
        return comprobar;
    }
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        rellenarArray(array1,array2);
        boolean comprobar=comprobarArray(array1,array2);
        if (comprobar) {
            System.out.println("Los dos array son SIMILARES");
        }
        else{
            System.out.println("Los dos array son DISTINTOS");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmail.ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class GMAILEjercicio3 {
    public static int pedirNumero(){
        Scanner entrada=new Scanner (System.in);
        int numero=entrada.nextInt();
        return numero;
    }
    public static int generarAleatorio(){
        int aleatorio=(int) ((Math.random()*300 +1));
        return aleatorio;
    }
    public static void rellenarArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            array[i]=generarAleatorio();
        }
    }
    public static void mostrarArray(int array[], int numero ){
        for (int i = 0; i < array.length; i++) {
            if ((array[i]%10)==numero) {
                System.out.println("Celda "+i+" Numero: "+array[i]);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Introduce un tamaño de array");
        int[] array=new int[pedirNumero()];
        int numero;
        rellenarArray(array);
        System.out.println("Introduce un numero para ver cuantos numeros del array acaban en ese");
        numero=pedirNumero();
        mostrarArray(array,numero);
    }
    
}

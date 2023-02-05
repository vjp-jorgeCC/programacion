/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2.tema.pkg7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio2Tema7 {
    public static int pedirNumero(){
        int numero;
        Scanner entrada=new Scanner (System.in);
        try{
            numero=entrada.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("ERROR. HAS INTRODUCIDO UNA LETRA");
            numero=0;
        }        
        return numero;        
    }
    public static int numeroAleatorio(){
        int numero= (int) ((Math.random()*6)+1);
        return numero;
    }
    public static void rellenarArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            array[i]=numeroAleatorio();
        }
    }
    public static void mostrarArray(int array[]){
        for (int n  : array) {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        System.out.println("Introduce la longitud del ARRAY");
        int[] array=new int[pedirNumero()];
        rellenarArray(array);
        mostrarArray(array);
    }
    
}
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
    public static int pedirLongitud(){
        Scanner entrada=new Scanner (System.in);
        int numero;
        do {
            numero=entrada.nextInt();
            if (numero<=0) {
                System.out.println("El numero debe ser mayor que 0");
            }
        } while (numero<=0);        
        return numero;
    }
    public static int pedirNumero(){
        Scanner entrada=new Scanner(System.in);
        int numero=entrada.nextInt();
        return numero;
    }
    public static int generarAleatorio(){
        int aleatorio=(int) ((Math.random()*300 )+1);
        return aleatorio;
    }
    public static void rellenarArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            array[i]=generarAleatorio();
        }
    }
    public static int mostrarArray(int array[], int numero ){
        int contador=0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i]%10)==numero) {
                System.out.println("Celda "+i+" Numero: "+array[i]);
                contador++;
            }
        }
        return contador;
    }
    public static void main(String[] args) {
        System.out.println("Introduce un tamaño de array");
        int[] array=new int[pedirLongitud()];
        int numero,suma;
        rellenarArray(array);
        System.out.println("Introduce un numero para ver cuantos numeros del array acaban en ese");
        numero=pedirNumero();
        suma=mostrarArray(array,numero);
        System.out.println("La suma de los numero del array que acaban en "+numero+" es de: "+suma);
    }
    
}

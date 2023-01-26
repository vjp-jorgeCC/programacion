/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8.tema.pkg6;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio8Tema6 {
    public static int pedirNumero(){
        Scanner entrada=new Scanner (System.in);
        int numero;
        System.out.println("Introduce un numero de 5 cifras");
        numero=entrada.nextInt();
        return numero;
    }
    public static void crearArray(int numero, int array[]){
        int aux;
        for (int i = 0; i < array.length; i++) {
            aux=numero%10;
            array[i]=aux;
            numero=numero/10;
        }
    }
    public static void visualizarArray(int array[]){
        System.out.println("El numero introducido escrito al reves es el: "+array[0]+array[1]+array[2]+array[3]+array[4]);
    }
    public static void main(String[] args) {
        int numero;
        int[] array=new int[5];
        numero=pedirNumero();
        crearArray(numero,array);
        visualizarArray(array);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg04.tema.pkg10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio04Tema10 {
    public static void rellenarLista(ArrayList<Integer> numeros){
        Scanner entrada = new Scanner (System.in);
        int n=0;
        while (n>=0){
            System.out.println("Introduce un valor positivo para introducirlo en la lista o negativo para finalizar el proceso");
            n=entrada.nextInt();
            if (n>=0) {
                numeros.add(n);
            }
      
        }
    }
    public static void mostrarLista(ArrayList<Integer> numeros){
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i));
        }
        System.out.println();
    }
    public static void modificarLista(ArrayList<Integer>numeros){
        for (int i = 0; i < numeros.size(); i++) {
            int numero = numeros.get(i);
            for (int j = i+1; j < numeros.size(); j++) {
                if (numeros.get(j) == numero) {
                    numeros.set(j,0);
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        rellenarLista(numeros);
        mostrarLista(numeros);
        modificarLista(numeros);
        mostrarLista(numeros);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg02.tema.pkg10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio02Tema10 {
    public static void introducirValores(ArrayList<Integer> numeros){
        Scanner entrada = new Scanner (System.in);
        int n = 0;
        while (n >= 0){
            System.out.println("Introduce un valor positivo para almacenarlo o negativo para finalizar el proceso.");
            n=entrada.nextInt();
            if (n>=0) {
                numeros.add(n);
            }
        }
    }
    public static void mostrarElementos(ArrayList<Integer> numeros){
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
    public static int calcularMayor(ArrayList<Integer> numeros){
        int mayor = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            int numero=numeros.get(i);
            if (numero>mayor) {
                mayor=numero;
            }
        }
        return mayor;
    }
    public static int calcularMenor(ArrayList<Integer> numeros){
        int menor = numeros.get(0);
        for (int i = 1; i < numeros.size(); i++) {
            int numero=numeros.get(i);
            if (numero<menor) {
                menor=numero;
            }
        }
        return menor;
    }
    public static int suma(ArrayList<Integer> numeros){
        int suma=0;
        for (int i = 0; i < numeros.size(); i++) {
            suma=suma+numeros.get(i);
        }
        return suma;
    }
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        introducirValores(numeros);
        mostrarElementos(numeros);
        System.out.println("El mayor numero es: "+calcularMayor(numeros));
        System.out.println("El menor numero es: "+calcularMenor(numeros));
        System.out.println("La suma de los numeros es: "+suma(numeros));
    }
}

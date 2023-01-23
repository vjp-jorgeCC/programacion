/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5.tema.pkg6;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio5Tema6 {
    public static void rellenarVector(int vNum[][]){
        Scanner entrada = new Scanner (System.in);
        for (int i = 0; i < vNum.length; i++) {
            for (int j = 0; j < vNum[i].length; j++) {
                System.out.println("Introduce un numero para ["+i+j+"]");
                vNum[i][j]=entrada.nextInt();
            }
        }
    }
    public static void mostrarVector(int vNum[][]){
        for (int i = 0; i < vNum.length; i++) {
            for (int j = 0; j < vNum[i].length; j++) {
                System.out.println("Fila: "+i+" Columna: "+j+" --------> Numero: "+vNum[i][j]);
            }
        }
    }
    public static void mayor(int vNum[][]){
        int numero1=vNum[0][0];
        for (int i = 0; i < vNum.length; i++) {
            for (int j = 0; j < vNum[i].length; j++) {
                if (vNum[i][j]>numero1) {
                    numero1=vNum[i][j];
                }
            }
        }
        System.out.println("El numero mayor del vector es: "+numero1);
    }
    public static void menor(int vNum[][]){
        int numero1=vNum[0][0];
        for (int i = 0; i < vNum.length; i++) {
            for (int j = 0; j < vNum[i].length; j++) {
                if (vNum[i][j]<numero1) {
                    numero1=vNum[i][j];
                }
            }
        }
        System.out.println("El numero menor del vector es: "+numero1);
    }
    public static void sumaVector(int vNum[][]){
        int suma=0;
        for (int i = 0; i < vNum.length; i++) {
            for (int j = 0; j < vNum[i].length; j++) {
                suma=suma+vNum[i][j];
            }
        }
        System.out.println("La suma total de los numeros del vector es: "+suma);
    }
    public static void main(String[] args) {
        int vNum[][]=new int[4][2];
        rellenarVector(vNum);
        mostrarVector(vNum);
        mayor(vNum);
        menor(vNum);
        sumaVector(vNum);
    }
    
}

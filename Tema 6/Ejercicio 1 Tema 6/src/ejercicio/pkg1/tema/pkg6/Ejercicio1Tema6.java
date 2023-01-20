/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1.tema.pkg6;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio1Tema6 {
    public static void rellenarVector(int vNum[]){
        Scanner entrada = new Scanner (System.in);
        int i;
        for (i = 0; i < vNum.length; i++) {
            System.out.println("Introduzca un valor para la celda :"+i);
            vNum[i]=entrada.nextInt();
        }
    }
    public static void mostrarVector(int vNum[]){
        int i;
        for (i = 0; i < vNum.length; i++) {
            if ((vNum[i]%   2)==0) {
                System.out.println("Celda: "+i+" Numero: "+vNum[i]);
            }            
        }
    }
    public static void main(String[] args) {
        int[] vNum = new int[10];
        rellenarVector(vNum);
        mostrarVector(vNum);
    }
    
}

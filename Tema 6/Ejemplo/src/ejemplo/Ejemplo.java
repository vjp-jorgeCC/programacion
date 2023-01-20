/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejemplo {
    Scanner entrada=new Scanner(System.in);
    public static void rellenarVector(int vNum[]){
        Scanner entrada=new Scanner(System.in);
        int i; 
        for (i = 0; i < vNum.length; i++) { //CON ESTE METODO SE RELLENA EL VECTOR CON 9
            System.out.println("Introduzca un valor para la celda "+i+" :");
            vNum[i] = entrada.nextInt();
        }
    }
    
    public static void mostrarVector(int vNum[]){
        int i;
        for (i = 0; i < vNum.length; i++) {
            System.out.println( "Celda "+i+" : "+ vNum[i]);
        }
    }
    public static void main(String[] args) {
       int[] vNum = new int[10]; //SE CREA EL VECTOR
       rellenarVector(vNum);
       mostrarVector(vNum);
    }
    
}

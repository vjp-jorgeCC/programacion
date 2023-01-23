/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.tema.pkg6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio3Tema6 {
    public static int pedirLongitud(){
        Scanner entrada=new Scanner (System.in);
        int longitud;
        System.out.println("Introduce un numero entre el 1 y el 10: ");
        do {
            try{
                longitud=entrada.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("ERROR, has introducido una letra");
                longitud=0;
            }
            if (longitud<=0||longitud>10) {
                System.out.println("ERROR, introduce numero valido comprendido entre 1 y 10."); 
            }
        } while (longitud<1||longitud>10);
        
        return longitud;
    }
    public static void rellenarAleatorio(int vNum[]){
        int i;
        for (i = 0; i < vNum.length; i++) {
            vNum[i] = (int) ((Math.random()*6+1));
        }
    }
    
    public static void mostrarVector(int vNum[]){
        int i;
        for (i = 0; i < vNum.length; i++) {
            System.out.println("Celda: "+i+" Numero: "+vNum[i]);
        }
    }
    public static void main(String[] args) {
        int longitud=pedirLongitud();
        
        int[] vNum = new int[longitud];
        
        rellenarAleatorio(vNum);
        
        mostrarVector(vNum);
    }
    
}

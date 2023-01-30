/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmail.ejercicio.pkg1;

/**
 *
 * @author jorge
 */
public class GMAILEjercicio1 {
    public static int generarAleatorio(){
        int aleatorio;
        aleatorio = (int) ((Math.random()*100));
        return aleatorio;
    }
    public static void rellenarArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            array[i]=generarAleatorio();
        }
    }
    public static int sumaArray(int array[]){
        int suma=0;
        for (int i = 0; i < array.length; i++) {
            suma=suma+array[i];
        }
        return suma;
    }
    public static float mediaArray(int array[]){
        float media=(float) sumaArray(array)/100;
        return media;
    }
    public static void main(String[] args) {
        int[] array=new int[100];
        rellenarArray(array);
        System.out.println("La suma del array es de : "+sumaArray(array));
        System.out.println("La media del array es de: "+mediaArray(array));
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmail.ejercicio.pkg5;

/**
 *
 * @author jcidc07
 */
public class GMAILEjercicio5 {
    public static int generarAleatorio(){
        int numero;
        numero=(int) ((Math.random()*50)+1);
        return numero;
    }
    public static void rellenarArray(int array1[], int array2[]){
        for (int i = 0; i < array1.length; i++) {
            array1[i]=generarAleatorio();
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i]=-1;
        }
    }
    public static void comprobarMayor(int array1[],int array2[]){
        for (int i = 0; i < array1.length; i++) {
            if (array1[i]%2==0 && array1[i] > 25) {
                array2[i]=array1[i];
            }
        }
    }
    public static void mostrarArray(int array1[],int array2[]){
        System.out.println("---------ARRAY 1----------");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Celda: "+i+" Numero: "+array1[i]);
        }
        System.out.println("----------ARRAY 2----------");
        for (int i = 0; i < array2.length; i++) {
            if (array2[i]!=-1) {
                System.out.println("Celda: "+i+" Numero: "+array2[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] array1=new int[50];
        int[] array2=new int[array1.length];
        rellenarArray(array1,array2);
        comprobarMayor(array1,array2);
        mostrarArray(array1,array2);
    }
    
}

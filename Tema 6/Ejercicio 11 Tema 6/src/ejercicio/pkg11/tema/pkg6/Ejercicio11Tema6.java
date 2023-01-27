/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11.tema.pkg6;

/**
 *
 * @author jcidc07
 */
public class Ejercicio11Tema6 {
    public static int generarAleatorio(){
        int aleatorio;
        aleatorio = (int) ((Math.random()*10));
        return aleatorio;
    }
    public static boolean esRepetido(int ale, int array[]){
        boolean enc=false;
        int i=0;
        while((i<array.length)&&(!enc)){
            if (array[i]==ale) {
                enc=true;                
            }
            i++;
        }
        return enc;
    }
    public static void rellenarAleatorio(int array[]){
        int ale;
        boolean enc;
        for (int i = 0; i < array.length; i++) {
            do {
                ale=generarAleatorio();
                enc=esRepetido(ale,array);
            } while (enc==true);
            array[i]=ale;
        }
    }
    public static void inicializar(int array[]){
        for (int i = 0; i < array.length; i++) {
            array[i]=-1;
        }
    }
    public static void mostrarArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Celda:  "+i+"numero: "+array[i]);
        }
    }
    public static void main(String[] args) {
        int [] array = new int[10];
        inicializar(array);
        rellenarAleatorio(array);
        mostrarArray(array);
    }
    
}

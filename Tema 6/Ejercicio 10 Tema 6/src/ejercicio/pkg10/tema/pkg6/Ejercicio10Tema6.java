/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10.tema.pkg6;

/**
 *
 * @author jcidc07
 */
public class Ejercicio10Tema6 {
    public static void rellenarArray(int array[]){
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random()*8+1));
        }
    }
    public static void mostrarArray(int array[]){
        System.out.println("El vector generado aleatoriamente es: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("\n");
    }
    public static boolean buscarRepetido(int array[], int num, int pos){
        int i;
        boolean enc=false;
        i=pos;
        
        while((i<array.length)&&(!enc)){
            if (array[i]==num) {
                enc=true;                
            }
            i++;
        }
        return enc;
    }
    public static void cambiarPorCeros(int array[]){
        int i,j,num;
        boolean repetido;
        for (i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                num=array[i];
                repetido=buscarRepetido(array,num,i+1);
                        if (repetido) {
                            for (j = i; j < array.length; j++) {
                                if (array[j] == num) {
                                    array[j]=0;
                                    
                                }
                            }                    
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array=new int[10];
        rellenarArray(array);
        mostrarArray(array);
        cambiarPorCeros(array);
        mostrarArray(array);
    }
    
}

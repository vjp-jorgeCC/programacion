/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.ampliacion.pkg1;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class EjercicioAmpliacion1 {
    public static int pedirNumero(){
        int num;
        Scanner entrada=new Scanner(System.in);
        num=entrada.nextInt();
        return num;
    }
    public static void rellenarArray(int array[]){
        System.out.println("Introduce 10 numeros para el array");
        for (int i = 0; i < array.length; i++) {
            array[i]=pedirNumero();
        }
    }
    public static boolean comprobar(int array[], int num){
        int i = 0;
        boolean enc = false;
        while(i < array.length && !enc){
            if (num==array[i]) {
                enc=true;
            }
            i++;
        }
        return enc;
    }    
    public static void mostrarArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        
    }
    public static void main(String[] args) {
        int[] array=new int[10];
        rellenarArray(array);
        mostrarArray(array);
        System.out.println("Introduce un numero para ver si esta en el array: ");
        int num=pedirNumero();
        boolean opc2=comprobar(array, num);
        if (opc2) {
            System.out.println("El numero  aparece en el array");
        }
        else{
            System.out.println("El numero no aparece en el array");
        }
        
    }
    
}

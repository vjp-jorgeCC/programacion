/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ampliacion.ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class AMPLIACIONEjercicio4 {
    public static int pedirNumero(){
        Scanner entrada=new Scanner(System.in);
        int numero=entrada.nextInt();
        return numero;
    }
    public static void rellenarArray(int array[][]){
        System.out.println("Introduce numeros para el ARRAY.");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=pedirNumero();
            }
        }
    }
    public static int numero(){
        System.out.println("Introduce un numero para comprobar cuantos negativos.");
        int numero=pedirNumero();
        return numero;
    }
    public static boolean comprobarNegativos(int array[][]){
        int numero=numero();
        boolean comprobar=false;
        int contadorNumerosNegativos=0;        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]<0) {
                    contadorNumerosNegativos++;
                }
            }
        }
        if (contadorNumerosNegativos==numero) {
            comprobar=true;
        }
        return comprobar;
    }
    public static void main(String[] args) {
        int[][] array=new int[3][3];
        rellenarArray(array);
        if (comprobarNegativos(array)) {
            System.out.println("Tiene esos numeros negativos");
        }
        else{
            System.out.println("No tiene esos numeros negativos");
        }
    }
    
}

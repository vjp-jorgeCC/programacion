/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg05.t3;

import java.util.Scanner;

/**
 *
 * @author jorge y miguel angel
 */
public class Ejercicio05T3 {
    public static int pedirNumero(){
        Scanner entrada = new Scanner (System.in);
        int numeroUsuario;
        System.out.println("Miguel Angel, Introduce un numero");
        numeroUsuario = entrada.nextInt();
        return numeroUsuario;
    }
    public static boolean comprobar (int numeroUsuario){
        boolean parImpar=true;
        if ((numeroUsuario%2) == 0){
            parImpar=true;
        }
        else{
            parImpar=false;
        }
        return parImpar;
    }
    public static void main(String[] args) {
        int numeroUsuario=pedirNumero();
        if (comprobar(numeroUsuario)) {
            System.out.println("Miguel Angel dice que el numero "+numeroUsuario+" es par");
        }
        else{
            System.out.println("Miguel Angel dice que el numero "+numeroUsuario+" es impar");
        }
    }    
}

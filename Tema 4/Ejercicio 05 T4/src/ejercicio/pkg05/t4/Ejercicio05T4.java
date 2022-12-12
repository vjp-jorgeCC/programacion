/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg05.t4;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio05T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int numero;
        System.out.println("Introduce un numero: ");
        numero=entrada.nextInt();//Pido el numero
        parImpar.ParImpar.operacion(numero);//Llamo al metodo que esta en otro paquete
    }
    
}

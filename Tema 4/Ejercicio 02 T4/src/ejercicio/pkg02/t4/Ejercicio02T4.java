/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg02.t4;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio02T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);//Declaro el scanner.
        int numero1,numero2;
        System.out.println("Introduce el primer numero: ");
        numero1=entrada.nextInt();//Recogo el primer numero.
        System.out.println("Introuce el segundo numero: ");
        numero2=entrada.nextInt();//Recogo el segundo numero.
        if (numero1>10) {//si el numero1 es mayor que 10 llamo al metodo producto.
            Suma_Producto.producto(numero1, numero2);//Llamo al metodo producto.            
        }
        else{//Si el numero1 es menor que 10 llamo al metodo sumar.
            Suma_Producto.sumar(numero1, numero2);//Llamo al metodo sumar.
        }
    }        
}
//Para llamar al metodo en este caso tienes que llamar a la clase (Suma_Producto).
//Y despues tienes que llamar al metodo que esta dentro de esta clase, puede ser producto o suma.

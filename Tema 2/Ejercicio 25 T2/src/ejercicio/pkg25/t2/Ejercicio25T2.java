/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg25.t2;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio25T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);//Declaro mi scanner
        int numero1;
        int numero2;
        int numero3;
        int suma;
        int producto;
        System.out.println("Por favor, introduzca el primer numero: ");
        numero1 = entrada.nextInt();//Pido los numeros atraves del Scanner
        System.out.println("Por favor, introduzca el segundo numero: ");
        numero2 = entrada.nextInt();//Pido los numeros atraves del Scanner
        System.out.println("Por favor, introduzca el tercer numero: ");
        numero3 = entrada.nextInt();//Pido los numeros atraves del Scanner
        suma=numero1+numero2+numero3;//Hago la suma
        System.out.println("La suma de los numeros introducidos es: "+suma);
        producto=numero1*numero2*numero3;//Hago el producto
        System.out.println("El producto de los numeros introducidos es: "+producto);
        
    }
    
}

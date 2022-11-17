/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg20.t2;
import java.util.Scanner;

public class Ejercicio20T2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        
        double numero1;
        double numero2;
        int suma;
        
        System.out.println("Escriba el primer entero: ");
        numero1 = entrada.nextDouble();
        System.out.println("Escriba el sengo entero: ");
        numero2 = entrada.nextDouble();
        
        suma = (int) (numero1+numero2);
        System.out.println("La suma es: "+suma);
        
        
    }
    
}

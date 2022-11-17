/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg13.t2;

/**
 *
 * @author jcidc07
 */
public class Ejercicio13T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1=1;
        int num2=2;
        int aux ;
        System.out.println("La variable num1 contiene el valor "+num1+" y la variable num2 que contiene el valor "+num2);
        aux=num1;
        num1=num2;
        num2=aux;
        System.out.println("La variable num1 ahora contiene el valor "+num1+" y la variable num2 ahora contiene el valor "+num2);
    }
    
}

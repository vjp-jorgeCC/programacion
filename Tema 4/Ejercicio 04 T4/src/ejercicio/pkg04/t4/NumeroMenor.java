/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg04.t4;

/**
 *
 * @author jcidc07
 */
public class NumeroMenor {
    public static void numeroMenor (int n1, int n2, int n3){
        if ((n1<n2)&&(n1<n3)) {//Si el numero 1 es menor que el 2 y el 3, significa que el menor es el 1
            System.out.println("El numero menor es: "+n1);
        }
        else{
            if ((n2<n1)&&(n2<n3)) {//Si el numero 2 es menor que l 1 y el 3, significa que el menor es el 2
                System.out.println("El numero menor es: "+n2);                
            }
            else{//Si ninguno de los dos anteriores es el menor, quiere decir que el menor es el 3
                System.out.println("El numero menor es: "+n3);
            }
        }
    }
}

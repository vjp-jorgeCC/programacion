/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparar;

/**
 *
 * @author jcidc07
 */
public class Comparacion {
    public static void mayorMenor(int n1, int n2, int n3 ){
        if ((n1>n2)&&(n1>n3)) {//Si el numero 1 es mayor que el 2 y el 3, significa que el 1 es el mayor.
            System.out.println("El numero mayor es: "+n1);
        }
        else{
            if ((n2>n3)&&(n2>n1)) {//Si el numero2 es mayor que el 2 y el 3, significa que el 2 es el mayor.
                System.out.println("El numero mayor es: "+n2);
            }
            else{//Si ninguno de los dos anteriores es el mayor, significa que el 3 lo es.
                System.out.println("El numero mayor es: "+n3);
            }
        }
    }
}

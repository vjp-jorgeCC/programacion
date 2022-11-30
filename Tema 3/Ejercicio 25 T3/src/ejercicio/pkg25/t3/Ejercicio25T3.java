/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg25.t3;

/**
 *
 * @author jorge
 */
public class Ejercicio25T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma=0;
        for (int i = 17; i <= 139; i++) {
            if ((i%2)==0) {
                suma=suma+i;
            }
        }
        System.out.println("La suma de los numeros pares entre el 17 y el 139 es: "+suma);
    }    
}

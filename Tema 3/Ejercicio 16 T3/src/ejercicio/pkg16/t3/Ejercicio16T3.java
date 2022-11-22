/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg16.t3;

/**
 *
 * @author jorge
 */
public class Ejercicio16T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,numero;
        numero=0;
        System.out.println("Los numeros impares existentes entre el numero 20 y 160 son: ");
        for (i = 20; i <= 160; i++) {
            if ((i%2)!=0) {
                System.out.println(i);
                numero=numero+1;
            }
        }
        System.out.println("La cantidad de numeros impares impresos han sido: "+numero);
    }    
}

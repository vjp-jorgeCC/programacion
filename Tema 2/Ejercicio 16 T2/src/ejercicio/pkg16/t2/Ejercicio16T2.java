/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg16.t2;

/**
 *
 * @author jorge
 */
public class Ejercicio16T2 {
    public static void main(String[] args) {
        int cartera=130;
        int billetes50;
        int billetes10;
        billetes50=cartera/50;//Hago el la division entre 50 para sacar los billetes de 50 que tengo
        cartera=cartera%50;//Me quedo con el resto para ver cuanto me queda.
        billetes10=cartera/10;//Saco los billetes de 10 que tengo dividiendo entre 10
        System.out.println("130 euros hacen un total de: "+billetes50+" billetes de 50 euros y "+billetes10+" billetes de 10 euros");
        
    }
    
}

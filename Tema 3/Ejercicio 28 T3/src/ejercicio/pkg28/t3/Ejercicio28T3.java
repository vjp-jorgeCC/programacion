/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg28.t3;

/**
 *
 * @author jorge
 */
public class Ejercicio28T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double aleatorio=(Math.random())*100+1;
        aleatorio=Math.floor(aleatorio);
        System.out.println("El numero generado es: "+aleatorio);
        if ((aleatorio%2)==0) {
            System.out.println("El numero generado es Par.");            
        }
        else{
            System.out.println("El numero generado es Impar.");
        }
           
    }
    
}

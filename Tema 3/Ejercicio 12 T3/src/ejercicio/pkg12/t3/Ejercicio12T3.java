/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg12.t3;

/**
 *
 * @author jorge
 */
public class Ejercicio12T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, resto;
        numero=11;
        do {//Repito el bucle siempre que mi constante numero sea menor que 133
            if ((numero%2)==0) {//Si es para lo guardo y lo muestro
                System.out.println(numero);                
            }
            numero++;            
        } while (numero<=133);
        
    }
    
}

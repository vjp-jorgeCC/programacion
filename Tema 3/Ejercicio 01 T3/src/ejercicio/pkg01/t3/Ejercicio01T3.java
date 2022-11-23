/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg01.t3;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio01T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero;
        System.out.println("Por favor, introduzca un numero ");
        numero= entrada.nextInt();
        if (numero<0){
            System.out.println("El numero introducido es Negativo");
        }
        else{
            if (numero>0){
                System.out.println("El numero introducido es Positivo");               
            }
        }
    }
    
}

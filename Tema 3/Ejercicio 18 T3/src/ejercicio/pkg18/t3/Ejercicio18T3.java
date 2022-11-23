/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg18.t3;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio18T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int i=0,contraseña, numero;
        boolean acierto = false;
        contraseña=1234;
        do {
            System.out.println("Por favor introduzca una contraseña: ");
            numero=entrada.nextInt();
            if (contraseña==numero) {
                System.out.println("Enhorabuena");
                acierto = true;
            }
            else{
                i++;
            }
            if ((i==3)&&(contraseña!=numero)) {
                System.out.println("Te has equivocado ");                
            }
        } 
        while ((i<3)&&(acierto == false));        
    }    
}

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
        int i=0,contrasena, numero;
        boolean acierto = false;//Guardo el boolean para cuando acierte la contraseña
        contrasena=1234;
        do {
            System.out.println("Por favor introduzca una contraseña: ");
            numero=entrada.nextInt();
            i++;
            if (contrasena==numero) {//Si acierta la contraseña cambio el boolean
                System.out.println("Enhorabuena");
                acierto = true;
            }
            if ((i==3)&&(contrasena!=numero)) {//Si no es correcta le digo que se equivocay lo repito siempre y cuando sea incorrecta
                System.out.println("Te has equivocado ");                
            }
        } 
        while ((i<3)&&(acierto == false));//Tambien se puede poner como "!acierto"
    }    
}

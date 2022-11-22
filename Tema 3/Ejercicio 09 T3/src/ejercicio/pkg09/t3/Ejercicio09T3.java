/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg09.t3;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio09T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num1, num2, num3, num4, numAux, num;
        System.out.println("Por favor, introduzca el primer numero :");
        num1=entrada.nextInt();
        System.out.println("Por favor, introduzca el segundo numero :");
        num2=entrada.nextInt();
        System.out.println("Por favor, introduzca el tercer numero :");
        num3=entrada.nextInt();
        System.out.println("Por favor, introduzca el cuarto numero :");
        num4=entrada.nextInt();
        for(num=0;num<3;num++){
            if(num1>num2){
                numAux=num1;
                num1=num2;
                num2=numAux;
            }
            if(num2>num3){
                numAux=num2;
                num2=num3;
                num3=numAux;
            }
            if(num3>num4){
                numAux=num3;
                num3=num4;
                num4=numAux;
            }
        }
        System.out.println("El orden de los numero introducidos es: "+num1+" - "+num2+" - "+num3+" - "
        +num4);
    }
}
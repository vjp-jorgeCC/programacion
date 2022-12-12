/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg09.t4;

import java.util.Scanner;

public class Ejercicio09T4 {
    public static int numero(){
        int dato;
        Scanner entrada=new Scanner (System.in);
        System.out.println("Introduce un numero: ");
        dato=entrada.nextInt();
        return dato;
    }
    public static void menor (int numero1, int numero2, int numero3){
        int numeroMenor=0;
        if ((numero1<numero2)&&(numero1<numero3)) {
            numeroMenor=numero1;
        }
        else{
            if ((numero2<numero1)&&(numero2<numero3)) {
                numeroMenor=numero2;
            }
            else{
                numeroMenor=numero3;
            }
        }
        System.out.println("El numero menor de "+numero1+" - "+numero2+" - "+numero3+" es: "+numeroMenor);
    }
    public static void main(String[] args) {
       int numero1;
       int numero2;
       int numero3;
       numero1=numero();
       numero2=numero();
       numero3=numero();
       menor(numero1,numero2,numero3);
    }
    
}

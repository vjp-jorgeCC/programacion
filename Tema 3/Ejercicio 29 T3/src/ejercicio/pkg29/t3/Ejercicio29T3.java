/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg29.t3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio29T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        double aleatorio=(Math.random()*100+1);
        int aleatorioEntero=(int)aleatorio;
        int numero,contador;//Creo las variables
        numero=0;
        contador=0;
        do {
        System.out.println("Introduce un numero: ");
            try{//Hago la excepcion por si introduce una letra            
            numero=entrada.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Error, has introducido una letra, intentalo de nuevo.");
            entrada.nextLine();//Le pido un numero
        }
        finally{                    
            if (aleatorioEntero < numero) {//Le digo si el numero es mayor
                System.out.println("El numero es menor");
                contador++;
            }
            else{
                if (aleatorioEntero > numero) {//Le digo si el numero es menor
                    System.out.println("El numero es mayor");
                    contador++;                    
                }
            }
        }       
        } while (aleatorioEntero != numero);
        if (numero == aleatorioEntero) {//Si acierta el numero le muestro los intentos
            System.out.println("Enhorabuena has adivinado el numero, que es: "+numero);
            System.out.println("El numero de intentos han sido: "+contador);
            
        }
    }
    
}

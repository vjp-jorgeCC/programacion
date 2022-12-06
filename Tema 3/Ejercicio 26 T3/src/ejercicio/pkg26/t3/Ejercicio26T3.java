/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg26.t3;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio26T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int numero1,numero2,menu,suma,resta,multiplicar,dividir;
        System.out.println("Introduzca un primer numero: ");
        numero1=entrada.nextInt();
        System.out.println("Introduzca un segundo numero: ");
        numero2=entrada.nextInt();
        do {//Creo un menu                 
        System.out.println("1.-Sumar los numeros.");
        System.out.println("2.-Restar los numeros.");
        System.out.println("3.-Multiplicar los numeros.");
        System.out.println("4.-Dividir los numeros.");
        System.out.println("5.-Salir del programa.");
        menu=entrada.nextInt();   
        switch(menu){
            case 1://si pulsa el 1 sumo
                suma=numero1+numero2;
                System.out.println("El resultado de la suma es: "+suma);
                break;
            case 2://si pulsa el 2 resto
                resta=numero1-numero2;
                System.out.println("El resultado de la resta es: "+resta);
                break;
            case 3://si pulsa 3 multiplico
                multiplicar=numero1*numero2;
                System.out.println("El resultado de la multiplicacion es: "+multiplicar);
                break;
            case 4://si pulso el 4 divido
                try{
                    dividir=numero1/numero2;
                }
                catch(ArithmeticException e){
                    System.out.println("Error, el divisor no puede ser 0");
                    dividir=0;
                }
                System.out.println("El resultado de la division es: "+dividir);
                break;
            case 5://si pulso el 5 salgo del programa
                System.out.println("¡Hasta luego!");
                break;
            default:
                System.out.println("Opcion incorrecta");
        }
      } while (menu !=5);//se repite siempre y cuando sea distinto a 5         
    }    
}

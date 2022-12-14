/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg15.t4;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio15T4 {
    public static int pedirNumero(){
        int numero;
        Scanner entrada = new Scanner (System.in);
        numero=entrada.nextInt();
        return numero;
    }
    public static void suma(int n1,int n2){
        int suma=n1+n2;
        System.out.println("El resultado de "+n1+" + "+n2+"  es: "+suma);
    }
    public static void resta(int n1,int n2){
        int resta=n1-n2;
        System.out.println("El resultado de "+n1+" - "+n2+"  es: "+resta);
    }
    public static void multiplicar(int n1,int n2){
        int multiplicar=n1*n2;
        System.out.println("El resultado de "+n1+" * "+n2+"  es: "+multiplicar);
    }
    public static void dividir(int n1,int n2){
        int dividir;
        try{
            dividir=n1/n2;
            System.out.println("El resultado de "+n1+" / "+n2+"  es: "+dividir);
        }
        catch(ArithmeticException e){
            dividir=0;
            System.out.println("ERROR!!"+e.getMessage());
        }
        
    }
    public static void main(String[] args) {
        int n1,n2,menu;
        do {
        System.out.println("Introduce el primer numero: ");
        n1=pedirNumero();
        System.out.println("Introduce el segundo numero: ");
        n2=pedirNumero();
        System.out.println("1.-Sumar los numeros.");
        System.out.println("2.-Restar los numeros.");
        System.out.println("3.-Multiplicar los numeros.");
        System.out.println("4.-Dividir los numeros.");
        System.out.println("5.-Salir del programa.");
        System.out.println("Opción: ");
        menu=pedirNumero();
        switch(menu){
                case 1:
                    suma(n1, n2);
                    break;
                case 2:
                    resta(n1, n2);
                    break;
                case 3:
                    multiplicar(n1,n2);
                    break;
                case 4:
                    dividir(n1,n2);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Introduce un numero valido.");
        }
        } while (menu!=5);
        System.out.println("ADIOS!!");
    }
    
}

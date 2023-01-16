/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg20.tema.pkg5;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio20Tema5 {

    public static String pedirTitular(){
        Scanner entrada=new Scanner(System.in);
        String titular;
        System.out.println("Introduce nombre: ");
        titular=entrada.nextLine();
        return titular;
    }
    public static int pedirSaldo(){
        Scanner entrada=new Scanner(System.in);
        int saldo;
        System.out.println("Introduce saldo: ");
        saldo=entrada.nextInt();
        return saldo;
    }
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int opc;
        String titular;
        int saldo;
        int saldoInicial;
        Cuenta C=new Cuenta();
        do {
            System.out.println("1: Cuenta vacia");
            System.out.println("2: Cuenta saldo");
            System.out.println("3: Ingresar");
            System.out.println("4: Extraer");
            System.out.println("5: Ver saldo");
            System.out.println("6: Salir");
            opc=entrada.nextInt();
            
            switch(opc){
                case 2:
                titular=pedirTitular();
                saldoInicial=pedirSaldo();
                C= new Cuenta(titular, saldoInicial);
                break;
                case 3:
                    saldo=pedirSaldo();
                    C.ingresar(saldo);
                    break;
                case 4:
                    saldo=pedirSaldo();
                    C.extraer(saldo);
                    break;
                case 5:
                    System.out.println("El saldo es: "+C.getSaldo());
            }
        } while (opc!=6);
        
    }
    
}

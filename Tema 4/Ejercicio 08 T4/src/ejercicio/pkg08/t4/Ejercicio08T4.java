/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg08.t4;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio08T4 {
    public static void conversor(int cartera){
        int billetes50,billetes20,billetes10,billetes5,monedas2,monedas1;
        System.out.println(cartera+" Euros se descomponen en: ");
        billetes50=cartera/50;
        cartera=cartera%50;
        billetes20=cartera/20;
        cartera=cartera%20;
        billetes10=cartera/10;
        cartera=cartera%10;
        billetes5=cartera/5;
        cartera=cartera%5;
        monedas2=cartera/2;
        cartera=cartera%2;
        monedas1=cartera;
        if (billetes50>0) {
            System.out.println("Billetes de 50: "+billetes50);
        }
        if (billetes20>0) {
            System.out.println("Billetes de 20: "+billetes20);
        }
        if (billetes10>0) {
            System.out.println("Billetes de 10: "+billetes10);
        }
        if (billetes5>0) {
            System.out.println("Billetes de 5: "+billetes5);
        }
        if (monedas2>0) {
            System.out.println("Monedas de 2 euros: "+monedas2);
        }
        if (monedas1>0) {
            System.out.println("Monedas de 1 euros: "+monedas1);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        int dinero;
        System.out.println("Introduzca una cantidad de dinero: ");
        dinero=entrada.nextInt();
        conversor(dinero);        
    }
    
}

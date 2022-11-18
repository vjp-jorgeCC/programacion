/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg32.t2;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio32T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int cartera;
        int carteraAux;
        int billete50, billete20, billete10, billete5, moneda2, moneda1;
        System.out.println("Por favor, indique una cantidad de dinero: ");
        cartera=entrada.nextInt();
        carteraAux=cartera;
        billete50=cartera/50;
        cartera=cartera%50;
        billete20=cartera/20;
        cartera=cartera%20;
        billete10=cartera/10;
        cartera=cartera%10;
        billete5=cartera/5;
        cartera=cartera%5;
        moneda2=cartera/2;
        cartera=cartera%2;
        moneda1=cartera/1;
        
        System.out.println(carteraAux+" Euros se descomponen en "+billete50+" billetes de 50, "+billete20+ " billetes de 20, "+billete10+" billetes de 10, "
        +billete5+" billetes de 5, "+moneda2+" monedas de 2 euros y "+moneda1+" moendas de 1 euro.");
        
        
    }
    
}

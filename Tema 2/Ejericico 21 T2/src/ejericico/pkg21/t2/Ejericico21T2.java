/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejericico.pkg21.t2;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejericico21T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int tiempo;
        int dias;
        int horas;
        int minutos;
        int segundos;
        int tiempoAux;
        System.out.println("Por favor, introduzca un numero de segundos: ");
        tiempo=entrada.nextInt();
        tiempoAux=tiempo;
        segundos=tiempo%60;
        tiempo=tiempo/60;
        minutos=tiempo%60;
        tiempo=tiempo/60;
        horas=tiempo%24;
        dias=tiempo/24;
        System.out.println(tiempoAux+" segundos hacen un total de: "+dias+" dias , "+horas+
                " horas , "+minutos+" minutos y "+segundos+" segundos");
        
    }
    
}

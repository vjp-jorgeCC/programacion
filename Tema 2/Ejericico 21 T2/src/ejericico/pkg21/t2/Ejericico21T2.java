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
        Scanner entrada = new Scanner (System.in);//Declaro mi scanner
        int tiempo;
        int dias;
        int horas;
        int minutos;
        int segundos;
        int tiempoAux;
        System.out.println("Por favor, introduzca un numero de segundos: ");
        tiempo=entrada.nextInt();
        tiempoAux=tiempo;//Guardo mi tiempo total en AUX para mostrar luego
        segundos=tiempo%60;//Hago el resto para sacar los segundos
        tiempo=tiempo/60;//Convierto a minutos
        minutos=tiempo%60;//Hagp el resto para sacar los minutos
        tiempo=tiempo/60;//Convierto a horas
        horas=tiempo%24;//Hago el resto para sacar las horas
        dias=tiempo/24;//Divido entre 24 para sacar los dias
        System.out.println(tiempoAux+" segundos hacen un total de: "+dias+" dias , "+horas+
                " horas , "+minutos+" minutos y "+segundos+" segundos");
        
    }
    
}

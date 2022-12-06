/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg15.t2;

/**
 *
 * @author jorge
 */
public class Ejercicio15T2 {
    public static void main(String[] args) {
        int tiempo=10000;
        int minutos;
        int horas;
        int segundos;
        segundos=tiempo%60;//Saco el resto que me queda de dividir el tiempo entre 60
        tiempo=tiempo/60;//Lo convierto a minutos
        minutos=tiempo%60;//Me quedo con el resto de los minutos
        tiempo=tiempo/60;//Lo convierto a horas
        horas=tiempo%60;//Me quedo con el resto        
        System.out.println("10.000 segundos hacen un total de: "+horas+" horas, "+minutos+" minutos y "+segundos+" segundos.");
                
        
    }
    
}

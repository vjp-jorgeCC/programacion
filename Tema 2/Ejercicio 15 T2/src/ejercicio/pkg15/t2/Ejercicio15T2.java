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
        segundos=tiempo%60;
        tiempo=tiempo/60;
        minutos=tiempo%60;
        tiempo=tiempo/60;
        horas=tiempo%60;        
        System.out.println("10.000 segundos hacen un total de: "+horas+" horas, "+minutos+" minutos y "+segundos+" segundos.");
                
        
    }
    
}

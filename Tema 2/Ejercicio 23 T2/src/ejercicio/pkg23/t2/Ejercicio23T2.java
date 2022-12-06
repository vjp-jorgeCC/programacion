/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg23.t2;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio23T2 {
    
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner (System.in);//Declaro el scanner
        Scanner entrada2 = new Scanner (System.in);//Declaro otro scanner ya que es otro tipo de variable
        float precio ;
        int unidades;
        float total;
        System.out.println("Por favor, introduczca el precio del modelo de ordenador que desa comprar: ");
        precio = entrada1.nextFloat();//Le pido al usuario el precio
        System.out.println("¿Cuántas unidades quiere llevarse? ");
        unidades = entrada2.nextInt();//Le pido al usuario las unidades
        total=(float) (precio*unidades);//Hago un cast para que el numero me de decimales conviertiendolo a float
        System.out.println("El precio total de su compra es de: "+total+" Euros.");
        
    }
    
}

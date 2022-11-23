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
        Scanner entrada1 = new Scanner (System.in);
        Scanner entrada2 = new Scanner (System.in);
        float precio ;
        int unidades;
        float total;
        System.out.println("Por favor, introduczca el precio del modelo de ordenador que desa comprar: ");
        precio = entrada1.nextFloat();
        System.out.println("¿Cuántas unidades quiere llevarse? ");
        unidades = entrada2.nextInt();
        total=(float) (precio*unidades);
        System.out.println("El precio total de su compra es de: "+total+" Euros.");
        
    }
    
}

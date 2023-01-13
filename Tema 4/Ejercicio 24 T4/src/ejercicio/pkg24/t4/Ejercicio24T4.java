/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg24.t4;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio24T4 {
    public static String nombre(){
        Scanner entrada=new Scanner (System.in);
        String nombre;
        System.out.println("Introduce tu nombre: ");
        nombre=entrada.nextLine();
        return nombre;
    }
    public static int edad(){
        Scanner entrada=new Scanner (System.in);
        int edad;
        System.out.println("Introduce tu edad: ");
        edad=entrada.nextInt();
        return edad;
    }
    public static void mayorDeEdad(String nombre, int edad){
        //SI LA EDAD ES MAS DE 18 LE MUESTRO SU NOMBRE Y LE DIGO QUE ES MAYOR DE EDAD
        if (edad>=18) {
            System.out.println(nombre+ " es mayor de edad");
        }
        
        //SI LA EDAD ES MENOS DE 18 LE MUESTRO SU NOMBRE Y LE DIGO QUE NO ES MAYOR DE EDAD
        else{
            System.out.println(nombre+ " no es mayor de edad");
        }
    }
    public static void main(String[] args) {
        String nombre;
        int edad;
        
        //LLAMO AL METODO PARA SABER EL NOMBRE
        nombre=nombre();
        
        //LLAMO AL METODO PARA SABER LA EDAD
        edad=edad();
        
        //LLAMO AL METODO PASANDOLE NOMBRE Y EDAD
        mayorDeEdad(nombre,edad);
    }
    
}

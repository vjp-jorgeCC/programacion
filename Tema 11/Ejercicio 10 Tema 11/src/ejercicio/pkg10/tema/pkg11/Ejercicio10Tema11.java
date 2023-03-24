/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10.tema.pkg11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jcidc07
 */
public class Ejercicio10Tema11 {
    public static void menu(Set <Persona> lPersonas){
        Scanner entrada = new Scanner (System.in);
        int opc;        
        do {
            System.out.println("1. Añadir nombre y edad");
            System.out.println("2. Mostrar Set");
            opc=entrada.nextInt();
            switch(opc){
                case 1:
                    rellenarSet(lPersonas);
                    break;
                case 2:
                    mostrarSet(lPersonas);
                    break;
            }
        } while (opc!=3);        
    }
    public static String pedirNombre(){
        Scanner entrada = new Scanner (System.in);
        String nombre = entrada.nextLine();
        return nombre;
    }
    public static int pedirEdad(){
        Scanner entrada = new Scanner (System.in);
        int edad = entrada.nextInt();
        return edad;
    }
    public static void rellenarSet(Set <Persona> lPersonas){
        String nombre;
        int edad;
        nombre = pedirNombre();
        edad = pedirEdad();
        Persona lPersona = new Persona(nombre, edad);
        lPersonas.add(lPersona);
    }
    public static void mostrarSet(Set <Persona> lPersonas){
        for (Persona aux : lPersonas) {
            System.out.println(aux.getEdad());
        }
    }
    public static void main(String[] args) {
        Set <Persona> lPersonas = new TreeSet<>();
        menu(lPersonas);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg04.tema.pkg12;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio04Tema12 {
    public static String obtenerExtension(){
        Scanner entrada = new Scanner (System.in);
        String extension = entrada.nextLine();
        return extension;
    }
    public static void main(String[] args) {
        File directorio = new File ("diasSemana");
        String [] lista = directorio.list();
        System.out.println("Introduce una extension: ");
        String extension = obtenerExtension();
        int contador=0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].endsWith(extension)) {
               System.out.println(lista[i]);
               contador++;
            }            
        }
        System.out.println("Numero total de ficheros: "+contador);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg03.tema.pkg12;

import java.io.File;

/**
 *
 * @author jcidc07
 */
public class Ejercicio03Tema12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File directorio = new File ("diasSemana");
        String [] lista = directorio.list();
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
        System.out.println("Numero total de ficheros: "+lista.length);
    }
    
}

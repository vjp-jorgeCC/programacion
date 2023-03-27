/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg02.tema.pkg12;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jcidc07
 */
public class Ejercicio02Tema12 {
    public static void crearFichero(File fichero){
        try {
            if (fichero.createNewFile()) {
                System.out.println("fichero  creado con exito.");
            }
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio02Tema12.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void renombrarFichero(File fichero, File directorio){
        if (fichero.exists()) {
            fichero.renameTo(new File(directorio, "renombrado.txt"));
            System.out.println("fichero renombrado");
        }
    }
    public static void borrarFichero(File fichero){
        if (fichero.exists()) {
            fichero.delete();
            System.out.println("fichero borrado con exito");
        }
    }
    public static void main(String[] args){
        File directorio = new File ("ejemplo");
        File fichero1 = new File (directorio, "fichero1.txt");
        File fichero2 = new File (directorio, "fichero2.txt");
        directorio.mkdir();
        System.out.println("directorio creado con exito.");
        crearFichero(fichero1);
        crearFichero(fichero2);
        renombrarFichero(directorio, fichero1);
        borrarFichero(fichero2);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02t12;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class Ejercicio02T12 {

    public static File crearDirectorio(String nomDirectorio){
        File directorio;
        directorio = new File(nomDirectorio);
        directorio.mkdir();
        if  (directorio.exists()){  //Si se ha creado bien el directorio
            System.out.println("Directorio creado correctamente");
        }
        else{
            System.out.println("Error al crear el directorio");
        }
        return directorio;
    }

    public static File crearFichero(File directorio, String nomFichero) throws IOException {
        File nFichero = new File(directorio, nomFichero);
        if  (nFichero.createNewFile()){
            System.out.println("Fichero "+nomFichero+" creado correctamente");
        }
        else{
            System.out.println("Error al crear el fichero "+nomFichero);
        }
        return nFichero;
    }
    
    public static void renombrarFichero(File directorio, File fich, String nuevoNombre){
        String nombreAnt = fich.getName();
        if  (fich.renameTo(new File(directorio, nuevoNombre))){
            System.out.println(nombreAnt+" renombrado a "+nuevoNombre);
        }
        else{
            System.out.println("No se ha podido renombrar el fichero "+nombreAnt);
        }
    }
    
    public static void borrarFichero(File fichero){
        if  (fichero.delete()){
            System.out.println("Fichero "+fichero.getName()+" borrado correctamente");
        }
        else{
            System.out.println("Error al borrar Fichero "+fichero.getName());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de variables
        File directorio;
        File fich1 = null;
        File fich2 = null;
        
        //Creamos directorio Ejemplo
        directorio = crearDirectorio("Ejemplo");

        //Dentro del directorio ejemplo, creamos los ficheros practica1.txt y practica2.txt
        try{
            fich1 = crearFichero(directorio, "practica1.txt");
            fich2 = crearFichero(directorio, "practica2.txt");
        }
        catch(IOException ioe){
            System.out.println("Error al crear ficheros "+ioe.getMessage());
        }

        //Renombramos el fichero practica1.txt
        renombrarFichero(directorio, fich1, "renombrado.txt");
        
        //Eliminamos el fichero practica2.txt
        borrarFichero(fich2);
    }
    
}

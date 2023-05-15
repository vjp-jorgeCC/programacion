/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03t12;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class Ejercicio03T12 {

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

    public static void crearUnFichero(File directorio, String nomFichero){
        File nFichero = new File(directorio, nomFichero);
        try{
            if  (nFichero.createNewFile()){
                System.out.println("Fichero "+nomFichero+" creado correctamente");
            }
            else{
                System.out.println("Error al crear el fichero "+nomFichero);
            }
        }
        catch(IOException ioe){
            System.out.println("Error al crear ficheros "+ioe.getMessage());
        }
    }

    public static void crearFicheros(File directorio){
        String[] vFichDias = {"lunes.txt", "martes.txt", "miercoles.txt", "jueves.txt", "viernes.txt", "sabado.txt", "domingo.txt"};
        File fich;
        for(int i = 0;i < vFichDias.length;i++){
            crearUnFichero(directorio, vFichDias[i]);
        }
    }
    
    public static void mostrarFicherosDelDirectorio(String nomDirectorio){
        //Creamos la ruta
        String ruta = "./";
        ruta = ruta.concat(nomDirectorio);
        //Asignamos el directorio a la ruta
        File directorio = new File(ruta);
        //Mostramos ficheros
        String[] listaFicheros = directorio.list();
        System.out.println("Mostrando ficheros directorio actual: ");
        for(int i = 0;i < listaFicheros.length;i++){
            System.out.println(listaFicheros[i]);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File directorio = crearDirectorio("DiasSemana");
        crearFicheros(directorio);
        mostrarFicherosDelDirectorio(directorio.getName());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04t12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio04T12 {
    public static void crearFicheros(File directorio){
        String[] vFichDias = {"lunes.txt", "martes.dat", "miercoles.bin", "jueves.txt", "viernes.mp3", "sabado.txt", "domingo.dat"};
        File fich;
        for(int i = 0;i < vFichDias.length;i++){
            fich = new File(directorio, vFichDias[i]);
            try{
                if  (fich.createNewFile()){
                    System.out.println("Fichero "+vFichDias[i]+" creado correctamente");
                }
                else{
                    System.out.println("Error al crear Fichero "+vFichDias[i]);
                }
            }
            catch(IOException ioe){
                System.out.println(ioe.getMessage());
            }
        }
    }
    
    public static void mostrarFicherosDelDirectorio(){
        File directorio = new File("./DiasSemana");
        String[] listaFicheros = directorio.list();
        System.out.println("Mostrando ficheros directorio actual: ");
        for(int i = 0;i < listaFicheros.length;i++){
            System.out.println(listaFicheros[i]);
        }
    }
    
    public static String pedirExtension(){
        Scanner teclado = new Scanner(System.in);
        String ext;
        System.out.print("Extensión: ");
        ext = teclado.nextLine();
        return ext;
    }
    
    public static void mostrarPorExtension(String ext){
        File directorio = new File("./DiasSemana");
        String[] listaFicheros = directorio.list();
        System.out.println("Mostrando ficheros con extensión "+ext+": ");
        for(int i = 0;i < listaFicheros.length;i++){
            //Si la cadena almacenada en listaFicheros[i] termina con el texto almacenado en ext
            if  (listaFicheros[i].endsWith(ext)){  
                System.out.println("    "+listaFicheros[i]);
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ext;
        File directorio = new File("DiasSemana");
        directorio.mkdir();
        if  (directorio.exists()){  //Si existe el directorio
            System.out.println("Directorio DiasSemana creado corretamente");
        }
        else{
            System.out.println("Error al crear Directorio DiasSemana");
        }
        
        crearFicheros(directorio);
        mostrarFicherosDelDirectorio();
        ext = pedirExtension();
        mostrarPorExtension(ext);
    }
}

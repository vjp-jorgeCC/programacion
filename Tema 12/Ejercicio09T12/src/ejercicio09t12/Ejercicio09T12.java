/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio09t12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author admin
 */
public class Ejercicio09T12 {

    /* Lee, caracter a caracter, el fichero para ir insertando cada uno al 
       principio del ArrayList */
    public static void leerFichero(FileReader fr, ArrayList<Character> lista) throws IOException {
        int aux = fr.read();  //Obtenemos el primer caracter del fichero en formato int
        char c;
        while(aux != -1){   //Mientras no lleguemos al final del fichero
            c = (char) aux;    //Convertimos el caracter int a char mediante conversión explícita
            lista.add(0, c);   //Añadimos el carácter en la primera posición de la lista
            System.out.println("Añadiendo letra "+c+"...");
            aux = fr.read();   //Obtenemos el siguiente caracter del fichero en formato int
        }
    }
    
    /* Rellena el ArrayList con los caracteres leídos del fichero de texto */
    public static void rellenarLista(ArrayList<Character> lista){
        FileReader fr = null;
        try{
            fr = new FileReader("frase.txt");
            leerFichero(fr, lista);
        }
        catch(FileNotFoundException e){
            System.out.println("Fichero no encontrado");
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println("Error de E/S");
            System.out.println(e.getMessage());
        }
        finally{
            if  (fr != null){
                try{
                    fr.close();
                }
                catch(IOException e){
                    System.out.println("Error de E/S");
                    System.
                            out.println(e.getMessage());
                }
            }
        }
    }
    
    /* Escribe en el fichero, caracter a caracter, el contenido del ArrayList */
    public static void escribirFichero(PrintWriter pw, ArrayList<Character> lista){
        Iterator<Character> it = lista.iterator();
        char c;
        while(it.hasNext()){
            c = it.next();  //Obtenemos el carácter de la lista
            pw.print(c);    //Escribimos el carácter en el fichero     
        }
        System.out.println("Fichero escrito correctamente");
    }

    /* Escribe en "fraseinvertida.txt" el contenido del ArrayList */
    public static void volcarListaAFichero(ArrayList<Character> lista){
        FileWriter fw = null;
        PrintWriter pw = null;
        try{
            fw = new FileWriter("fraseinvertida.txt");
            pw = new PrintWriter(fw);
            escribirFichero(pw, lista);
        }
        catch(IOException e){
           System.out.println("Error de E/S");
           System.out.println(e.getMessage());
        }
        finally{
            if  (pw != null){
                pw.close();
            }
            if  (fw != null){
                try{
                    fw.close();
                }
                catch(IOException e){
                    System.out.println("Error al cerrar fichero");
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración de ArrayList
        ArrayList<Character> lista = new ArrayList<>();
        rellenarLista(lista);
        volcarListaAFichero(lista);
    }    
}


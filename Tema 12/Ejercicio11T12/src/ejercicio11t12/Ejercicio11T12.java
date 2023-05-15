/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11t12;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *
 * @author admin
 */
public class Ejercicio11T12 {

    public static int leerFichero(BufferedReader br) throws IOException{
        String linea = br.readLine();
        int suma = 0;
        while(linea != null){
            suma = suma + Integer.parseInt(linea);  //Convierto el número de la línea a entero
            linea = br.readLine();
        }
        return suma;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader("numeros.txt");
            br = new BufferedReader(fr);
            suma = leerFichero(br);
        }
        catch(FileNotFoundException e){
            System.out.println("Fichero no encontrado");
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println("Error de lectura");
            System.out.println(e.getMessage());
        }
        finally{
            if  (fr != null){
                try{
                    fr.close();
                }
                catch(IOException e){
                    System.out.println("Error de cierre de fichero");
                    System.out.println(e.getMessage());
                }
            }
            if  (br != null){
                try{
                    br.close();
                }
                catch(IOException e){
                    System.out.println("Error de cierre de fichero");
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("La suma de los números contenidos en el fichero es: "+suma);
    }
    
}

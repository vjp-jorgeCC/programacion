/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12bist12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class Ejercicio12bisT12 {

    /* Retorna la suma de los números almacenados en el vector (de los números de una misma línea) */
    public static int sumarNumVector(String[] vNum){
        int suma = 0;
        for(int i = 0;i < vNum.length;i++){
            suma = suma + Integer.parseInt(vNum[i]);  //Convierte el String a entero
        }
        return suma;
    }
    
    /* Lee las líneas del fichero y va realizando las sumas */
    public static void leerFichero(BufferedReader br) throws IOException {
        String linea = br.readLine();
        String[] vNum;
        int suma = 0;
        while(linea != null){  //Mientras no llegue al final del fichero
            vNum = linea.split(";");  //Separamos los números y los almacenamos en el vector
            suma = suma + sumarNumVector(vNum);
            linea = br.readLine();
        }
        System.out.println("La suma de todos los números del fichero es "+suma);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader("masnumeros.txt");
            br = new BufferedReader(fr);
            leerFichero(br);
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
            if  (br != null){
                try{
                    br.close();
                }
                catch(IOException e){
                    System.out.println("Error de E/S");
                    System.out.println(e.getMessage());
                }
            }
            if  (fr != null){
                try{
                    fr.close();
                }
                catch(IOException e){
                    System.out.println("Error de E/S");
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    
}

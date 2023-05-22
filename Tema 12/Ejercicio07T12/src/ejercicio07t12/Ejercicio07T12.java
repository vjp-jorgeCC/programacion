/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07t12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author admin
 */
public class Ejercicio07T12 {

    public static String pedirNombreFichero(){
        Scanner teclado = new Scanner(System.in);
        String nomFich;
        System.out.print("Nombre Fichero: ");
        nomFich = teclado.nextLine();
        return nomFich;
    }
    
    public static String pedirLinea(){
        Scanner teclado = new Scanner(System.in);
        String linea;
        System.out.print("Texto a escribir en fichero: ");
        linea = teclado.nextLine();
        return linea;
    }
    
    public static void escribirFichero(String nomFich, String linea) throws IOException{
        FileWriter fw = null;
        PrintWriter pw = null;
            fw = new FileWriter(nomFich, true);
            pw = new PrintWriter(fw);
            pw.println(linea);
            fw.close();
            pw.close();
    }
    
    private static void intercambiarMayMin(String linea) {
        char letra;
        int asciLetra;
        for(int i = 0;i < linea.length();i++){
            letra = linea.charAt(i);
            asciLetra = (int) letra;
            //Si es mayúscula
            if  ((asciLetra <= 90)&&(asciLetra > 64)){
                //La convertimos a minúscula
                asciLetra = asciLetra + 32;
            }
            else{
                //Si es minúscula
                if  ((asciLetra >= 97)&&(asciLetra < 123)){
                    //La convertimos a mayúscula
                    asciLetra = asciLetra - 32;
                }
            }
            letra = (char) asciLetra;
            System.out.print(letra);
        }
        System.out.println("");
    }
    
    private static void leerFichero(BufferedReader br) throws IOException{
        String linea = br.readLine();
        System.out.println("Procedemos a leer el fichero y a intercambiar mayúsculas-minúsculas");
        System.out.println("Resultado: ");
        while(linea != null){
            intercambiarMayMin(linea);
            linea = br.readLine();
        }
    }
    
    public static void convertirMausculasMinusculas(String nomFich) throws FileNotFoundException, IOException{
        FileReader fr = null;
        BufferedReader br = null;
            fr = new FileReader(nomFich);
            br = new BufferedReader(fr);
            leerFichero(br);
            fr.close();
                    br.close();
           
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        String linea, resp;
        String nomFich;
        
        do{
            nomFich = pedirNombreFichero();
        }while(!nomFich.endsWith(".txt"));
        
        do{
            linea= pedirLinea();
            escribirFichero(nomFich, linea);
            System.out.println("¿Otra línea? (si/no)");
            resp = teclado.nextLine();
        }while(resp.equalsIgnoreCase("si"));
        System.out.println("Fichero creado y relleno con éxito");
        convertirMausculasMinusculas(nomFich);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06t12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio06T12 {

    //Definición constante
    static final int MAX = 100;
    
    public static String pedirNombreFichero(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca nombre de fichero: ");
        String nom = teclado.nextLine();
        if  (!nom.endsWith(".txt")){  //Si el usuario no ha añadido la extensión, lo hacemos nosotros
            nom = nom.concat(".txt");
        }
        return nom;
    }

    public static void rellenarVector(int[] vNum){
        int numPares = 0;      //Contador que reutilizaremos como índice del vector
        int num = 1;    //Número por el que vamos
        while(numPares < MAX){
            if  (num % 2 == 0){  //Si num es par
                vNum[numPares] = num;
                numPares++;
            }
            num++;
        }
    }
    
    public static void escribirFichero(int[] vNum, PrintWriter pw){
        for(int i = 0;i < vNum.length;i++){
            pw.println(vNum[i]);
        }
        System.out.println("Array volcado correctamente");
    }
    
    public static void volcarArray(String nomFichero, int[] vNum){
        FileWriter fw = null;;
        PrintWriter pw = null;
        try{
            fw = new FileWriter(nomFichero);
            pw = new PrintWriter(fw);
            escribirFichero(vNum, pw);
        }
        catch(FileNotFoundException e){
            System.out.println("No se pudo crear el fichero "+nomFichero);
        }
        catch(IOException e){
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
                    System.out.println("Error al cerrar fichero "+e.getMessage());
                }
            }
        }
    }
    
    public static void leerFichero(BufferedReader br) throws IOException {
        String linea;
        linea = br.readLine();
        while(linea != null){
            System.out.println(linea);
            linea = br.readLine();
        }
    }
    
    public static void mostrarFichero(String nomFichero){
        FileReader fr = null;;
        BufferedReader br = null;
        try{
            fr = new FileReader(nomFichero);
            br = new BufferedReader(fr);
            leerFichero(br);
        }
        catch(FileNotFoundException e){
            System.out.println("No se ha encontrado el archivo " + nomFichero);
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            if  (br != null){
                try{
                    br.close();
                }
                catch(IOException e){
                    System.out.println("Error al cerrar fichero "+e.getMessage());
                }
            }
            if  (fr != null){
                try{
                    fr.close();
                }
                catch(IOException e){
                    System.out.println("Error al cerrar fichero "+e.getMessage());
                }
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vNum = new int[100];
        int opc;
        String nomFichero = pedirNombreFichero();
        do{
            System.out.println("      -- OPCIONES -- ");
            System.out.println("1. Volcar array a fichero");
            System.out.println("2. Mostrar fichero");
            System.out.println("3. Salir");
            System.out.print("   Opción: ");
            opc = teclado.nextInt();
            switch(opc){
                case 1:
                    rellenarVector(vNum);
                    volcarArray(nomFichero, vNum);
                    break;
                case 2:
                    mostrarFichero(nomFichero);
                    break;
                case 3:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }while(opc != 3);
        
    }
    
}

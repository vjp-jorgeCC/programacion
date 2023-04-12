/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg07.tema.pkg12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio07Tema12 {

    public static String cambiarLetras(String frase) {
        char c;
        int ascii = 0;
        String fraseCambiada = "";
        char letraCambiada;
        for (int i = 0; i < frase.length(); i++) {
            c = frase.charAt(i);
            ascii = (int) c;
            if (ascii > 64 && ascii < 91) {  //sI ES MAYUSCULA
                ascii = ascii + 32;
            } else if (ascii > 96 && ascii < 123) {
                ascii = ascii - 32;
            }
            letraCambiada = (char) ascii;
            fraseCambiada = fraseCambiada + letraCambiada;
        }
        return fraseCambiada;
    }
    public static void leerFichero(BufferedReader br) throws IOException{
        String linea;
        linea = br.readLine();
        while(linea != null){
            System.out.println(linea);
            linea = br.readLine();
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String frase;
        String fraseCambiada;
        System.out.println("Introduce el nombre del fichero");
        nombre = entrada.nextLine();
        System.out.println("Introduce la frase que quieres guardar");
        frase = entrada.nextLine();
        fraseCambiada = cambiarLetras(frase);
        escribirFichero(nombre, fraseCambiada);
        mostrarFichero(nombre);
    }

    public static void mostrarFichero(String nombre) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(nombre);
            br = new BufferedReader(fr);
            System.out.println("¡ MOSTRANDO FICHERO !");
            leerFichero(br);
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo.");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void escribirFichero(String nombre, String fraseCambiada) {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(nombre, true);
            pw = new PrintWriter(fw);
            pw.println(fraseCambiada);
            System.out.println("¡ FICHERO CREADO CON EXITO !");
            
        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
            System.out.println(e.getMessage());
        } finally {
            if (pw != null) {
                pw.close();
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println("Error de entrada / salida");
                    System.out.println(e.getMessage());
                }
            }
        }
    }

}

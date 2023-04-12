/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg09.tema.pkg12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author jcidc07
 */
public class Ejercicio09Tema12 {

    public static void leerFichero() throws FileNotFoundException {
        FileReader fr = null;
        BufferedReader br = null;
        String fraseCambiada;
        try {
            fr = new FileReader("frase.txt");
            br = new BufferedReader(fr);
            fraseCambiada = cambiarFrase(br);
            escribirFichero(fraseCambiada);
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

    public static void escribirFichero(String fraseCambiada) {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter("frase cambiada.txt", true);
            pw = new PrintWriter(fw);
            pw.println(fraseCambiada);
            System.out.println("Frase cambiada con exito.");

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

    public static String cambiarFrase(BufferedReader br) throws IOException {
        String frase = br.readLine();
        ArrayList<Character> letras = new ArrayList<>();
        String fraseCambiada = "";
        char c;
        for (int i = 0; i < frase.length(); i++) {
            c = frase.charAt(i);
            letras.add(c);
        }
        for (int j = letras.size()-1; j >= 0; j--) {
            fraseCambiada = fraseCambiada + letras.get(j);
        }
        return fraseCambiada;
    }

    public static void main(String[] args) throws FileNotFoundException {
        leerFichero();
    }

}

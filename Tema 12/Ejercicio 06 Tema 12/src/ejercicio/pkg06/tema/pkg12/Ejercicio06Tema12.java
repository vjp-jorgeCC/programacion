/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg06.tema.pkg12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio06Tema12 {

    public static void menu(String nombre) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int opc;
        do {
            System.out.println("1. Añadir numeros pares a un fichero");
            System.out.println("2. Mostrar fichero");
            System.out.println("3. Salir");
            opc = entrada.nextInt();
            switch (opc) {
                case 1:
                    ArrayList numerosPares = crearArray();
                    FileWriter fw = null;
                    PrintWriter pw = null;
                    fw = new FileWriter(nombre, true);
                    pw = new PrintWriter(fw);
                    anadirPares(pw, numerosPares);
                    pw.close();
                    fw.close();
                    break;
                case 2:
                    FileReader fr = null;
                    BufferedReader br = null;
                    try {
                        fr = new FileReader(nombre);
                        br = new BufferedReader(fr);
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
                    break;
                case 3:
                    System.out.println("Adios....");

            }
            while (opc != 3);
        }
    }
     
        

    public static void leerFichero(BufferedReader br) throws IOException {
        String linea;
        linea = br.readLine();
        while (linea != null) {
            System.out.println(linea);
            linea = br.readLine();
        }
    }

    public static void anadirPares(PrintWriter pw, ArrayList<Integer> pares) {
        for (int i = 0; i < pares.size(); i++) {
            pw.println(pares.get(i));
        }
        System.out.println("Numeros añadidos correctamente al fichero");
    }

    public static String pedirNombre() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        nombre = entrada.nextLine();
        return nombre;
    }

    public static ArrayList crearArray() {
        ArrayList<Integer> pares = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                pares.add(i);
            }
        }
        return pares;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Introduce el nombre del fichero");
        String nombre = pedirNombre();
        menu(nombre);
    }
}

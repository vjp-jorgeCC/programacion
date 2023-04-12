/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg05.tema.pkg12;

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
public class Ejercicio05Tema12 {
    public static int pedirNumero(){
        Scanner entrada = new Scanner (System.in);
        int numero = entrada.nextInt();
        return numero;
    }
    public static String pedirNombre(){
        Scanner entrada = new Scanner (System.in);
        String nombre = entrada.nextLine();
        return nombre;
    }
    public static void menu(){
        Scanner entrada = new Scanner (System.in);
        int opc;
        do {
            System.out.println("1. Añadir contacto al fichero");
            System.out.println("2. Mostrar por pantalla el contenido");
            System.out.println("3. Salir");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                    FileWriter fw = null;
                    PrintWriter pw = null;
                    try {
                        fw = new FileWriter("ejemplo.txt", true);
                        pw = new PrintWriter(fw);
                        anadirContacto(pw);
                    } catch (IOException e) {
                        System.out.println("Error de entrada/salida");
                        System.out.println(e.getMessage());
                    } finally{
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
                    break;
                case 2:
                    FileReader fr = null;
                    BufferedReader br = null;
                    try {
                        fr = new FileReader("ejemplo.txt");
                        br = new BufferedReader(fr);
                        leerFichero(br);
                    } catch (FileNotFoundException e) {
                        System.out.println("No se ha encontrado el archivo.");
                    } catch(IOException e){
                        System.out.println("Error de lectura");
                    } finally{
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
                    System.out.println("ADIOS.....");
                    break;
            }
        } while (opc != 3);        
    }
    public static void leerFichero(BufferedReader br) throws IOException{
        String linea;
        linea = br.readLine();
        while(linea != null){
            System.out.println(linea);
            linea = br.readLine();
        }
    }
    public static void anadirContacto(PrintWriter pw){
        System.out.println("Introduce nombre: ");
        String nombre = pedirNombre();
        System.out.println("Introduce edad: ");
        int edad = pedirNumero();
        System.out.println("Introduce numero de telefono: ");
        int numero = pedirNumero();
        pw.println("Nombre: "+nombre);
        pw.println("Edad: "+edad);
        pw.println("Numero de telefono: "+numero);
    }
    public static void main(String[] args) {
        menu();
    }
    
}

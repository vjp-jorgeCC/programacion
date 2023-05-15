/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05t12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio05T12 {

    /* Pide el nombre del contacto */
    public static String pedirNombreContacto(){
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.print("    Nombre: ");
        nombre = teclado.nextLine();
        return nombre;
    }
    
    /* Pide la edad del contacto */
    public static int pedirEdadContacto(){
        Scanner teclado = new Scanner(System.in);
        int edad;
        do{
            System.out.print("    Edad: ");
            try{
                edad = teclado.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Error. Debe introducir números");
                teclado.next();  //Limpiamos buffer
                edad = -1;
            }
        }while(edad < 0);
        return edad;
    }
    
    /* Pide el teléfono del contacto */
    public static String pedirTelefonoContacto(){
        Scanner teclado = new Scanner(System.in);
        String telef;
        System.out.print("    Teléfono: ");
        telef = teclado.nextLine();
        return telef;
    }

    /* Crea el Contacto C a partir de los datos introducidos por el usuario */
    public static Contacto pedirContacto(){
        Contacto C;
        String nombre, telefono;
        int edad;
        System.out.println("NUEVO CONTACTO: ");
        nombre = pedirNombreContacto();
        edad = pedirEdadContacto();
        telefono = pedirTelefonoContacto();
        C = new Contacto(nombre, edad, telefono);
        return C;
    }
    
    /* Escribe una nueva línea en el fichero */
    public static void escribirFichero(PrintWriter pw, Contacto C) throws IOException {
        pw.println(C.getNombre()+" - "+C.getEdad()+" - "+C.getTelefono());
        System.out.println("Contacto guardado con éxito");
    }
    
    /* Añade el contacto recibido por parámetros en el fichero agenda.txt */
    public static void escribirContacto(Contacto C){
        /* Declaramos flujos de escritura en ficheros de texto */
        FileWriter fw = null;
        PrintWriter pw = null;
        try{
            /* Abrimos los flujos y escribimos en el fichero */
            fw = new FileWriter("agenda.txt", true);
            pw = new PrintWriter(fw);
            escribirFichero(pw, C);
        }
        catch(FileNotFoundException e){
            System.out.println("No existe el fichero agenda.txt");
        }
        catch(IOException e){  //Recogemos la excepción
            System.out.println("Error de E/S "+e.getMessage());
        }
        finally{
            /* Cerramos flujos */
            if  (pw != null){
                pw.close();
            }
            if  (fw != null){
                try{
                    fw.close();
                }
                catch(IOException e){
                    System.out.println("Error de E/S "+e.getMessage());
                }
            }
        }
    }
    
    /* Lee el fichero de texto línea a línea, mostrando cada una de ellas. */
    public static void leerFichero(BufferedReader br) throws IOException {
        String linea;
        System.out.println("\nMostrando agenda...");
        linea = br.readLine();
        while(linea != null){  //Mientras no llegue al final del fichero
            System.out.println(linea);
            linea = br.readLine();
        }
        System.out.println("");
    }

    /* Recorre el fichero agenda.txt mostrando cada una de sus líneas (Contactos) */
    public static void mostrarContactos(){
        /* Declaramos flujos de lectura de ficheros de texto */
        FileReader fr = null;
        BufferedReader br = null;
        try{
            /* Abrimos los flujos y leemos del fichero */
            fr = new FileReader("agenda.txt");
            br = new BufferedReader(fr);
            leerFichero(br);
        }
        catch(FileNotFoundException e){  //Recogemos la excepción
            System.out.println("No existe el fichero "+e.getMessage());
        }
        catch(IOException e){  //Recogemos la excepción
            System.out.println("Error de E/S "+e.getMessage());
        }
        finally{
            /* Cerramos flujos */
            if  (br != null){
                try{
                    br.close();
                }
                catch(IOException e){
                    System.out.println("Error de E/S "+e.getMessage());
                }
            }
            if  (fr != null){
                try{
                    fr.close();
                }
                catch(IOException e){
                    System.out.println("Error de E/S "+e.getMessage());
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Contacto C;
        int opc;
        do{
            System.out.println("    AGENDA");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Salir");
            System.out.print("   Opción: ");
            opc = teclado.nextInt();
            switch(opc){
                case 1:
                    C = pedirContacto();
                    escribirContacto(C);  //Escribe el contacto en el fichero
                    break;
                case 2:
                    mostrarContactos();
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

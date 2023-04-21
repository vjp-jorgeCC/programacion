/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg15.tema.pkg12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio15Tema12 {
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
    public static int pedirTlf(){
        Scanner entrada = new Scanner (System.in);
        int numero = entrada.nextInt();
        return numero;
    }
    public static void menu(){
        int opc;
        do {
            System.out.println("1. Añadir un contacto");
            System.out.println("2. Mostrar el fichero");
            System.out.println("3. Salir");
            opc = pedirNumero();
            switch(opc){
                case 1:
                    fileWriter();
                    break;
                case 2:
                    fileReader();
                    break;
                case 3:
                    System.out.println("adios....");
                    break;
                    
            }
        } while (opc != 3);
        
    }
    public static void escribirFichero(DataOutputStream dos) throws IOException{
        String nombre;
        int edad;
        int numTlf;
        System.out.println("Introduce un nombre: ");
        nombre = pedirNombre();
        dos.writeUTF(nombre);
        System.out.println("Introduce edad");
        edad = pedirNumero();
        dos.writeInt(edad);
        System.out.println("Introdce numTlf");
        numTlf = pedirTlf();
        dos.writeInt(numTlf);
    }
    public static void leerFichero(DataInputStream dis) throws IOException{
        while(true){
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());
            System.out.println(dis.readInt());
        }
    }
    public static void main(String[] args) {
        menu();
    }
    public static void fileReader(){
        FileInputStream fis = null;
        DataInputStream dis = null;
        try {
            fis = new FileInputStream("agenda.bin");
            dis = new DataInputStream(fis);
            leerFichero(dis);
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        } catch (IOException E){
            System.out.println("No tiene mas lineas el fichero");
        } finally{
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                
            }
        }
    }
    public static void fileWriter() {
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try {
            fos = new FileOutputStream("agenda.bin",true);
            dos = new DataOutputStream(fos);
            escribirFichero(dos);
        } catch (FileNotFoundException e) {
            System.out.println("Error al acceso del fichero");
        } catch (IOException e){
            System.out.println("Error al escribir el fichero");  
        } finally{
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
                
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                
            }
        }
    }
    
}

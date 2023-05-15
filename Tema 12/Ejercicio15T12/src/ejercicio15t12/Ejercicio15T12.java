/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15t12;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio15T12 {

    /* Pide y retorna la opción del menú */
    public static int pedirOpcionMenu(){
        Scanner teclado = new Scanner(System.in);
        int opc;
        try{
            opc = teclado.nextInt();
        }
        catch(InputMismatchException e){
            opc = 0;
            teclado.next();  //Limpiamos el buffer
        }
        return opc;
    }

    /* Retorna el contacto introducido por el usuario */
    public static Contacto pedirContacto(){
        Scanner tecladoI = new Scanner(System.in);
        Scanner tecladoS = new Scanner(System.in);
        Contacto C;
        String nombre, telefono;
        int edad;
        System.out.println("NUEVO CONTACTO");
        System.out.print("    Nombre: ");
        nombre = tecladoS.nextLine();
        System.out.print("    Edad: ");
        edad = tecladoI.nextInt();
        System.out.print("    Teléfono: ");
        telefono = tecladoS.nextLine();
        C = new Contacto(nombre, edad, telefono);
        return C;
    }
    
    /* Escribe el contacto en el fichero */
    private static void escribirFichero(DataOutputStream dos, Contacto C) throws IOException {
        dos.writeUTF(C.getNombre());
        dos.writeInt(C.getEdad());
        dos.writeUTF(C.getTelefono());
    }
    
    /* Prepara el fichero binario para la posterior inserción del contacto */
    public static void insertarContacto(Contacto C){
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try{
            /* Asociamos los flujos del fichero y escribimos en él */
            fos = new FileOutputStream("agenda.bin", true);
            dos = new DataOutputStream(fos);
            escribirFichero(dos, C);
        }
        catch(FileNotFoundException e){
            System.out.println("No se pudo crear la agenda");
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println("Error de E/S");
            System.out.println(e.getMessage());
        }
        finally{
            /* Cerramos flujos de ficheros */
            if  (dos != null){
                try{
                    dos.close();
                }
                catch(IOException e){
                    System.out.println("Error de E/S");
                    System.out.println(e.getMessage());
                }
            }
            if  (fos != null){
                try{
                    fos.close();
                }
                catch(IOException e){
                    System.out.println("Error de E/S");
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    
    /* Lee los contactos y los va mostrando por pantalla */
    private static void leerFichero(DataInputStream dis) throws IOException{
        while(true){
            System.out.println("Nombre: "+dis.readUTF()+" - Edad: "+dis.readInt()+" - Teléfono: "+dis.readUTF());
        }
    }
    
    /* Prepara los flujos para la lectura del fichero binario */
    public static void mostrarAgenda(){
        FileInputStream fis = null;
        DataInputStream dis = null;
        try{
            /* Asociamos los flujos del fichero y escribimos en él */
            fis = new FileInputStream("agenda.bin");
            dis = new DataInputStream(fis);
            leerFichero(dis);
        }
        catch(EOFException e){
            System.out.println("");   //Fin de fichero
        }
        catch(FileNotFoundException e){
            System.out.println("Error de apertura: El fichero no existe");
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println("Error de E/S");
            System.out.println(e.getMessage());
        }
        finally{
            /* Cerramos flujos de ficheros */
            if  (dis != null){
                try{
                    dis.close();
                }
                catch(IOException e){
                    System.out.println("Error de E/S");
                    System.out.println(e.getMessage());
                }
            }
            if  (fis != null){
                try{
                    fis.close();
                }
                catch(IOException e){
                    System.out.println("Error de E/S");
                    System.out.println(e.getMessage());
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
            System.out.println("   -- AGENDA --");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Mostrar agenda");
            System.out.println("3. Salir");
            System.out.print("   Opción: ");
            opc = pedirOpcionMenu();
            switch(opc){
                case 1:
                    C = pedirContacto();
                    insertarContacto(C);  //Escribe el Contacto en fichero
                    break;
                case 2:
                    mostrarAgenda();  //Leer fichero y mostrarlo por pantalla
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

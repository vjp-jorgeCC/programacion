/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16t12;

import java.io.DataInputStream;
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
public class Ejercicio16T12 {

    //Declaración constante MAX
    final static int MAX = 100;
    
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

    /* Pide el nombre del fichero al usuario y lo retorna */
    public static String pedirNombreFichero(){
        Scanner teclado = new Scanner(System.in);
        String nombre;
        System.out.print("Nombre fichero: ");
        nombre = teclado.nextLine();
        return nombre;
    }
    
    /* Busca los primeros 100 impares. 
       Cada impar que encuentre lo inserta en el vector.   
    */
    public static void rellenarArray(int[] vImpares){
        int i = 1;
        int cont = 0; 
        while(cont < MAX){
            if  (i % 2 != 0){  //Si i es impar
                vImpares[cont] = i;
                cont++;
            }
            i++;
        }
    }
    
    /* Escribe el contenido de cada celda del vector en el fichero binario */
    public static void escribirFichero(DataOutputStream dos, int[] vImpares) throws IOException{
        for(int i = 0;i < vImpares.length;i++){
            dos.writeInt(vImpares[i]);
        }
    }
    
    /* Vuelca la información del vector en el fichero binario */
    public static void volcarArrayAFichero(String nombre, int[] vImpares){
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try{
            fos = new FileOutputStream(nombre);
            dos = new DataOutputStream(fos);
            escribirFichero(dos, vImpares);  //Le pasamos el flujo y el array donde está la información a escribir
        }
        catch(FileNotFoundException e){
            System.out.println("Error al crear fichero");
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println("Error de E/S");
            System.out.println(e.getMessage());
        }
        finally{
            if  (dos != null){
                try{
                    dos.close();
                }
                catch(IOException e){
                    System.out.println("Error al cerrar fichero");
                    System.out.println(e.getMessage());
                }
            }
            if  (fos != null){
                try{
                    fos.close();
                }
                catch(IOException e){
                    System.out.println("Error al cerrar fichero");
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    
    //Va leyendo todos los enteros y mostrándolos por pantalla
    public static void mostrarLineasDeFichero(DataInputStream dis) throws IOException{
        while(true){
            System.out.println(dis.readInt());
        }
    }
    
    /* Esqueleto para leer el fichero binario */
    public static void leerFichero(String nombre){
        FileInputStream fis = null;
        DataInputStream dis = null;
        try{
            fis = new FileInputStream(nombre);
            dis = new DataInputStream(fis);
            mostrarLineasDeFichero(dis);
        }
        catch(EOFException e){
            //Fin de fichero
        }
        catch(FileNotFoundException e){
            System.out.println("Error al crear fichero");
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println("Error de E/S");
            System.out.println(e.getMessage());
        }
        finally{
            if  (dis != null){
                try{
                    dis.close();
                }
                catch(IOException e){
                    System.out.println("Error al cerrar fichero");
                    System.out.println(e.getMessage());
                }
            }
            if  (fis != null){
                try{
                    fis.close();
                }
                catch(IOException e){
                    System.out.println("Error al cerrar fichero");
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vImpares = new int[MAX];
        String nombre;
        Scanner teclado = new Scanner(System.in);
        int opc;
        nombre = pedirNombreFichero();
        do{
            System.out.println("   -- IMPARES --");
            System.out.println("1. Volcar array a fichero.");
            System.out.println("2. Mostrar contenido de fichero.");
            System.out.println("3. Salir");
            System.out.print("   Opción: ");
            opc = pedirOpcionMenu();
            switch(opc){
                case 1:        
                    rellenarArray(vImpares);
                    volcarArrayAFichero(nombre, vImpares);
                    break;
                case 2:
                    leerFichero(nombre);
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

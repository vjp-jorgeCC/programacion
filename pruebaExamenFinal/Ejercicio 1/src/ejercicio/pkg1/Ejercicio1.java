/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio1 {
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
    public static void leerFichero(ArrayList<Nave> listaNaves) throws FileNotFoundException, IOException, ClassNotFoundException, EOFException{
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        // Abrir flujos
        fis = new FileInputStream("logistica.obj");
        ois = new ObjectInputStream(fis);
        try{
           volcarFichero(ois , listaNaves); 
        }
        catch(EOFException e){
            System.out.println("");
        }
        catch(IOException e){
            System.out.println("");
        }
        catch(ClassNotFoundException e){
            System.out.println("");
        }
        
        // Cerrar flujos
        ois.close();
        fis.close();
    }
    public static void volcarFichero(ObjectInputStream ois, ArrayList<Nave> listaNaves) throws IOException, ClassNotFoundException, EOFException{
        Nave naveAux;
        while (true) {            
            naveAux = (Nave) ois.readObject();
            listaNaves.add(naveAux);
        }
    }
    public static void menu(ArrayList<Nave> listaNaves) throws FileNotFoundException, IOException{
        int opc;
        do {
            System.out.println("1. Insertar naves");
            System.out.println("2. Mostrar naves");
            System.out.println("3. Insertar empresa en nave");
            System.out.println("4. Salir");
            opc = pedirNumero();
            switch (opc){
                case 1:
                    insertarNaves(listaNaves);
                    break;
                case 2:
                    mostrarNaves(listaNaves);
                    break;
                case 3:
                    insertarEmpresas(listaNaves);
                    break;
                case 4:
                    escribirFichero(listaNaves);
            }
        } while (opc != 4);
        
    }
    public static void escribirFichero(ArrayList<Nave> listaNaves) throws FileNotFoundException, IOException{
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        // Abrir Flujos
        fos = new FileOutputStream("logistica.obj");
        oos = new ObjectOutputStream(fos);
        rellenarArrayFichero(oos,listaNaves);
        
        // Cerrar Flujos
        oos.close();
        fos.close();
    }
    public static void rellenarArrayFichero(ObjectOutputStream oos, ArrayList<Nave> listaNaves) throws IOException{
        for (int i = 0; i < listaNaves.size(); i++) {
            Nave naveAux = listaNaves.get(i);
            oos.writeObject(naveAux);
        }
    }
    public static void insertarEmpresas(ArrayList<Nave> listaNaves){
        System.out.println("Introduce el nombre de una empresa");
        String nombre = pedirNombre();
        boolean encontrado = false;
        String nombreEmpresa;
        int beneficios;
        for (int i = 0; i < listaNaves.size(); i++) {
            if (nombre.equalsIgnoreCase(listaNaves.get(i).getNombre())) {
                Nave naveAux = listaNaves.get(i);
                System.out.println("Introduce nombre de la empresa: ");
                nombreEmpresa = pedirNombre();
                System.out.println("Introduce beneficios: ");
                beneficios = pedirNumero();
                Empresa empresaAux = new Empresa(nombre, beneficios);
                naveAux.getListaEmpresas().add(empresaAux);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No existe nave con ese nombre");
        }
    }
    public static void mostrarNaves(ArrayList<Nave> listaNaves){
        for (int i = 0; i < listaNaves.size(); i++) {
            Nave naveAux = listaNaves.get(i);
            System.out.println("----- NAVE "+(i+1)+" -----");
            System.out.println("Nombre: "+ naveAux.getNombre());
            System.out.println("Metros Cuadrados"+ naveAux.getMetrosCuadrados());
            for (int j = 0; j < naveAux.getListaEmpresas().size(); j++) {
                if (naveAux.getListaEmpresas() != null) {
                    Empresa empresaAux = naveAux.getListaEmpresas().get(j);
                    System.out.println("----- EMPRESA "+(j+1)+" -----");
                    System.out.println("Nombre empresa: "+empresaAux.getNombre());
                    System.out.println("Beneficios empresa: "+empresaAux.getBeneficios());
                }                
            }            
        }
    }
    public static void insertarNaves(ArrayList<Nave> listaNaves){
        String nombre;
        int metrosCuadrados;
        ArrayList<Empresa> listaEmpresa;
        System.out.println("Introduce el nombre de la nave: ");
        nombre = pedirNombre();
        System.out.println("Introduce los metros cuadrados: ");
        metrosCuadrados = pedirNumero();
        listaEmpresa = new ArrayList<Empresa>();
        Nave naveAux = new Nave(nombre, metrosCuadrados, listaEmpresa);
        listaNaves.add(naveAux);
    }
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ArrayList<Nave> listaNaves = new ArrayList<>();
        File fichero = new File("logistica.obj");
        try{
            leerFichero(listaNaves);
        }
        catch(FileNotFoundException e){
            System.out.println("");
        }
        menu(listaNaves);
        
    }
    
}

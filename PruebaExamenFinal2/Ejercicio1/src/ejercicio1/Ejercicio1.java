/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author jcidc07
 */
public class Ejercicio1 {
    public static String pedirNombre(){
        Scanner entrada = new Scanner (System.in);
        String nombre = entrada.nextLine();
        return nombre;
    }
    public static int pedirNumero(){
        Scanner entrada = new Scanner (System.in);
        int numero = entrada.nextInt();
        return numero;
    }
    public static void leerFichero(Set<Coche> setCoches) throws FileNotFoundException, IOException{
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        
        // Abrir flujos
        fis = new FileInputStream("carrun.obj");
        ois = new ObjectInputStream(fis);
        try{
           volcarFichero(ois , setCoches); 
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
    public static void volcarFichero(ObjectInputStream ois, Set<Coche> setCoches) throws IOException, ClassNotFoundException{
        Coche cocheAux;
        while(true){
            cocheAux = (Coche) ois.readObject();
            setCoches.add(cocheAux);
        }
    }
    public static void menu(Set<Coche> setCoches) throws IOException{
        int opc;
        do {
            System.out.println("1. Añadir coche");
            System.out.println("2. Mostrar coches");
            System.out.println("3. Poner los kms a 0");
            System.out.println("4. Buscar por matricula");
            System.out.println("5. Salir");
            opc = pedirNumero();
            switch (opc){
                case 1:
                    anadirCoches(setCoches);
                    break;
                case 2:
                    mostrarCoches(setCoches);
                    break;
                case 3:
                    ponerKms(setCoches);
                    break;
                case 4:
                    buscarPorMatricula(setCoches);
                    break;
                case 5:
                    escribirFichero(setCoches);
                    break;
            }
        } while (opc != 5);
        
    }
    public static void escribirFichero(Set<Coche> setCoches) throws FileNotFoundException, IOException{
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        
        // Abrir Flujos
        fos = new FileOutputStream("carrun.obj");
        oos = new ObjectOutputStream(fos);
        rellenarFichero(oos, setCoches);
        
        // Cerrar Flujos
        oos.close();
        fos.close();
    }
    
    public static void rellenarFichero(ObjectOutputStream oos , Set<Coche> setCoches){
        for (Coche cocheAux : setCoches) {
            try {
                oos.writeObject(cocheAux);
            } catch (IOException ex) {
                System.out.println("");
            }
        }
    }
    public static void buscarPorMatricula(Set<Coche> setCoches){
        String matricula;
        System.out.println("Introduce una matricula: ");
        matricula = pedirNombre();
        boolean bandera = false;
        for (Coche cocheAux : setCoches) {
            if (cocheAux.getMatricula().equalsIgnoreCase(matricula)) {
                System.out.println("Matricula: "+ cocheAux.getMatricula());
                System.out.println("Kms: "+ cocheAux.getKms());
                System.out.println("Fecha: "+ cocheAux.getFecha());
            }
        }
        if (!bandera) {
            System.out.println("Ningun coche encontrado con esa matricula");
        }
    }
    public static void ponerKms(Set<Coche> setCoches){
        String fecha;
        System.out.println("Introduce una fecha en formato (dia/mes/año)");
        fecha = pedirNombre();
        boolean bandera = false;
        for (Coche cocheAux : setCoches) {
            if (cocheAux.getFecha().equalsIgnoreCase(fecha)) {
                bandera = true;
                cocheAux.setKms(0);
            }
        }
        if (!bandera) {
            System.out.println("Ningun coche encontrado con esa fecha");
        }
        else{
            System.out.println("Kilometros puestos a 0");
        }
    }
    public static void anadirCoches(Set<Coche> setCoches){
        String matricula;
        int kms;
        String fecha;
        System.out.println("Introduce la matricula");
        matricula = pedirNombre();
        System.out.println("Introduce los kms");
        kms = pedirNumero();
        System.out.println("Introduce la fecha en formato (dia/mes/año)");
        fecha = pedirNombre();
        Coche cocheAux = new Coche(matricula, kms, fecha);
        setCoches.add(cocheAux);
        System.out.println("Coche añadido con exito");
    }
    public static void mostrarCoches(Set<Coche> setCoches){
        int contador = 1;
        if (setCoches != null) {
            for (Coche cocheAux : setCoches) {
            System.out.println("Coche : "+contador);
            System.out.println("Matricula : "+ cocheAux.getMatricula());
            System.out.println("Kms: "+ cocheAux.getKms());
            System.out.println("Fecha: "+ cocheAux.getFecha());
        }
        }
        
    }
    public static void main(String[] args) throws IOException {
        Set<Coche> setCoches = new HashSet<>();
        File fichero = new File("carrun.obj");
        try {
            leerFichero(setCoches);
        } catch (IOException ex) {
            System.out.println("");
        }
        menu(setCoches);
    }
    
}

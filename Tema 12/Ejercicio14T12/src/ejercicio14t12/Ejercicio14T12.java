/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14t12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Usuario
 */
public class Ejercicio14T12 {

    public static Becario crearBecario(String linea){
        Becario nBecario;
        String[] vAtributosBecario = linea.split("#");
        nBecario = new Becario();
        return nBecario;
    }
    
    public static int calcularBeca(Becario nBecario){
        
    }
    
    public static void leerBecario(BufferedReader br) throws IOException {
        Becario nBecario;
        int beca;
        String linea = br.readLine();
        while(linea != null){
            nBecario = crearBecario(linea);
            beca = calcularBeca(nBecario);
            linea = br.readLine();
        }
    }
    
    public static void leerFichero(Becario nBecario){
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader("DatosBeca.txt");
            br = new BufferedReader(fr);
            leerBecarios(br);
        }
        catch(FileNotFoundException e){
            System.out.println("Fichero no encontrado");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            if  (br != null){
                try{
                    br.close();
                }
                catch(IOException e){
                    System.out.println("");
                }
            }
            if  (fr != null){
                try{
                    fr.close();
                }
                catch(IOException e){
                    System.out.println("");
                }
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

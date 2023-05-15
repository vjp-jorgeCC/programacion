/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12t12;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author admin
 */
public class Ejercicio12T12 {

    public static void escribirResultado(BufferedReader brP, BufferedReader brI, PrintWriter pw) throws IOException{
        String lineaP = brP.readLine();
        String lineaI = brI.readLine();
        int par, impar, resultado;
        while((lineaP != null)&&(lineaI != null)){
            par = Integer.parseInt(lineaP);    //Convierto a entero líneaP
            impar = Integer.parseInt(lineaI);  //Convierto a entero líneaI
            resultado = par + impar;
            pw.println(resultado);
            lineaP = brP.readLine();
            lineaI = brI.readLine();
        }
        System.out.println("Fichero resultados.txt escrito correctamente");
    }
            
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileReader frP = null;  //Pares
        FileReader frI = null;  //Impares
        FileWriter fw = null;   //Resultado
        
        BufferedReader brP = null;  //Pares
        BufferedReader brI = null;  //Impares
        PrintWriter pw = null;      //Resultado
        
        try{
            frP = new FileReader("pares.txt");
            frI = new FileReader("impares.txt");
            fw = new FileWriter("resultados.txt");
            
            brP = new BufferedReader(frP);
            brI = new BufferedReader(frI);
            pw = new PrintWriter(fw);
            
            escribirResultado(brP, brI, pw);
        }
        catch(FileNotFoundException e){
            System.out.println("Fichero no encontrado");
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println("Error de lectura");
            System.out.println(e.getMessage());
        }
        finally{
            //Cierro los flujos del fichero de pares
            if  (brP != null){
                try{
                    brP.close();
                }
                catch(IOException e){
                    System.out.println("Error al cerrar fichero");
                    System.out.println(e.getMessage());
                }
            }
            if  (frP != null){
                try{
                    frP.close();
                }
                catch(IOException e){
                    System.out.println("Error al cerrar fichero");
                    System.out.println(e.getMessage());
                }
            }
            //Cierro los flujos del fichero de impares
            if  (brI != null){
                try{
                    brI.close();
                }
                catch(IOException e){
                    System.out.println("Error al cerrar fichero");
                    System.out.println(e.getMessage());
                }
            }
            if  (frI != null){
                try{
                    frI.close();
                }
                catch(IOException e){
                    System.out.println("Error al cerrar fichero");
                    System.out.println(e.getMessage());
                }
            }
            //Cierro el flujo del fichero de resultados
            if  (pw != null){
                pw.close();
            }
            if  (fw != null){
                try{
                    fw.close();
                }
                catch(IOException e){
                    System.out.println("Error al cerrar fichero");
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    
}

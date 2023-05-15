/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13t12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio13T12 {

    public static String pedirNombre(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        return nombre;
    }
    
    public static char pedirSexo(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Sexo: (H/M)");
        char s = teclado.nextLine().charAt(0);
        return s;
    }
    
    public static int pedirEdad(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Edad: ");
        int edad = teclado.nextInt();
        return edad;
    }
    
    public static int pedirSuspensos(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Suspensos: ");
        int susp = teclado.nextInt();
        return susp;
    }
    
    public static boolean pedirResidenciaFamiliar(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Residencia Familiar (S/N): ");
        char s = teclado.nextLine().charAt(0);
        return s == 'S';
    }
    
    public static int pedirIngresosAnuales(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresos Anuales: ");
        int ingresos = teclado.nextInt();
        return ingresos;
    }
    
    public static void escribirBecarioEnFichero(Becario nBecario){
        FileWriter fw = null;
        PrintWriter pw = null;
        String residFamiliar;
        try{
            fw = new FileWriter("DatosBeca.txt", true);
            pw = new PrintWriter(fw);
            if  (nBecario.isResidenciaFamiliar()){
                residFamiliar = "SI";
            }
            else{
                residFamiliar = "NO";
            }
            pw.println(nBecario.getNombre()+"#"+nBecario.getSexo()+"#"+nBecario.getEdad()+"#"+nBecario.getNumSuspensos()+"#"+residFamiliar+"#"+nBecario.getIngresosAnuales()+"#");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            if  (pw != null){
                pw.close();
            }
            if  (fw != null){
                try{
                    fw.close();
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
        String nombre = pedirNombre();
        char sexo = pedirSexo();
        int edad = pedirEdad();
        int numSuspensos = pedirSuspensos();
        boolean residenciaFamiliar = pedirResidenciaFamiliar();
        int ingresosAnuales = pedirIngresosAnuales();
        Becario nBecario = new Becario(nombre, sexo, edad, numSuspensos, residenciaFamiliar, ingresosAnuales);
        escribirBecarioEnFichero(nBecario);
    }
    
}

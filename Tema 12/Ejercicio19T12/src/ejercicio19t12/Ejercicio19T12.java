/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19t12;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio19T12 {

    public static Becado pedirBecado(){
        Scanner tecladoS = new Scanner(System.in);  //Para String
        Scanner tecladoI = new Scanner(System.in);  //Para enteros
        Scanner tecladoF = new Scanner(System.in);  //Para float
        String nombre, apellidos;
        char sexo, resi;
        int edad, numSuspensos;
        float ingresos;
        boolean residenciaFamiliar;
        Becado B;
        System.out.print("Nombre: ");
        nombre = tecladoS.nextLine();
        System.out.print("Apellidos: ");
        apellidos = tecladoS.nextLine();
        System.out.print("Sexo(H/M): ");
        sexo = tecladoS.nextLine().charAt(0);
        System.out.print("Edad: ");
        edad = tecladoI.nextInt();
        System.out.print("Residencia (F: Familiar/I:Independizado): ");
        resi = tecladoS.nextLine().charAt(0);
        if  (resi == 'F'){
            residenciaFamiliar = true;
        }
        else{
            residenciaFamiliar = false;
        }
        System.out.print("Suspensos: ");
        numSuspensos = tecladoI.nextInt();
        System.out.print("Ingresos: ");
        ingresos = tecladoF.nextFloat();
        B = new Becado(nombre, apellidos, sexo, edad, numSuspensos, residenciaFamiliar, ingresos);
        return B;
    }
    
    public static void escribirBecado(DataOutputStream dos, Becado B) throws IOException {
        dos.writeUTF(B.getNombre());
        dos.writeUTF(B.getApellidos());
        dos.writeChar(B.getSexo());
        dos.writeInt(B.getEdad());
        dos.writeInt(B.getNumSuspensos());
        dos.writeBoolean(B.getResidenciaFamiliar());
        dos.writeFloat(B.getIngresos());
        System.out.println("Becado añadido correctamente");
    }
    
    public static void escribirFichero(Becado B){
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try{
            fos = new FileOutputStream("datosbeca.bin", true);
            dos = new DataOutputStream(fos);
            escribirBecado(dos, B);
        }
        catch(FileNotFoundException e){
            System.out.println("Error al crear fichero");
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println("Error al crear fichero");
            System.out.println(e.getMessage());
        }
        finally{
            if  (dos != null){
                try{
                    dos.close();
                }
                catch(IOException e){
                    System.out.println("Error al cerrar fichero");
                }
            }
            if  (fos != null){
                try{
                    fos.close();
                }
                catch(IOException e){
                    System.out.println("Error al cerrar fichero");
                }
            }
        }
    }
            
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Becado B = null;
        String resp;
        System.out.println(" AÑADIMOS ALUMNOS BECADOS ");
        do{
            B = pedirBecado();
            escribirFichero(B);
            System.out.print("¿Desea añadir otro alumno?(si/no) ");
            resp = teclado.nextLine();
        }while(resp.equalsIgnoreCase("si"));
    }
    
}

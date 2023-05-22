/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio3 {
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
    public static void menu(Plantacion[] vPlantacion){
        int opc;
        do {
            System.out.println("1. Añadir plantacion");
            System.out.println("2. Mostrar plantaciones superiores a 1000 kg");
            System.out.println("3. Mostrar kg por cultivo");
            System.out.println("4. Mostrar posicion del ultimo cultivo");
            System.out.println("5. Mostrar plantacion");
            System.out.println("6. Salir");
            opc = pedirNumero();
            switch(opc){
                case 1:
                    anadirPlantacion(vPlantacion);
                    break;
            }
        } while (opc != 6);
        
    }
    public static void anadirPlantacion(Plantacion[] vPlantacion){
        int posicion;
        int numeroPlantas;
        int kilos;
        String cultivo;
        String opc;
        ArrayList<Sector> lSectores = new ArrayList<>();
        System.out.println("Introduce una posicion: ");
        posicion = pedirNumero();
        if (vPlantacion[posicion] == null) {
            System.out.println("Introduce el tipo de cultivo");
            cultivo = pedirNombre();
            do {
                System.out.println("Introduce el numero de plantas del sector");
                numeroPlantas = pedirNumero();
                System.out.println("Introdice los kilos del sector");
                kilos = pedirNumero();
                Sector auxSector = new Sector(numeroPlantas, kilos);
                lSectores.add(auxSector);
                System.out.println("¿Quieres introducir otro sector?");
                opc = pedirNombre();                
            } while (opc.equalsIgnoreCase("si"));
        vPlantacion[posicion] = new Plantacion(cultivo, lSectores);    
        }
    }
    public static void main(String[] args) {
        Plantacion[] vPlantacion = new Plantacion[5];
        menu(vPlantacion);
    }
    
}

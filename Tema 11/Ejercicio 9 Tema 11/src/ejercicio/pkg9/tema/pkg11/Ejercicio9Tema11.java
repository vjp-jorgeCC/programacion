/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9.tema.pkg11;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author jorge
 */
public class Ejercicio9Tema11 {
    public static void menu(Map<LocalDate, Sorteo> sorteo){
        Scanner entrada = new Scanner (System.in);
        int opc;
        do {
            System.out.println("1. Realizar sorteo");
            System.out.println("2. Repetir sorteo");
            System.out.println("3. Mostrar sorteos del mes actual");
            System.out.println("4. Mostrar sorteo por fecha");
            System.out.println("5. Realizar sorteo por fecha");
            System.out.println("6. Mostrar todos los sorteos");
            opc = entrada.nextInt();
            switch(opc){
                case 1:
                    realizarSorteo(sorteo);
                    break;
                case 2:
                    repetirSorteo(sorteo);
                    break;
                case 3:
                    mostrarSorteos(sorteo);
                    break;
            }
        } while (opc!=7);
        
    }
    public static void realizarSorteo(Map<LocalDate, Sorteo> sorteo){
        LocalDate fecha = LocalDate.now();
        int[] numerosGanadores = new int[4];
        Sorteo sorteoAux = new Sorteo(fecha,numerosGanadores);
        sorteoAux.rellenarGanadores();
        sorteo.put(fecha, sorteoAux);
        System.out.println("Los numeros ganadores del sorteo son: ");
        sorteo.get(fecha).mostrarGanadores();
    }
    public static void repetirSorteo(Map<LocalDate, Sorteo> sorteo){
        LocalDate fecha = LocalDate.now();
        sorteo.remove(fecha);
        System.out.println("Sorteo borrado con exito, realizando otro sorteo.....");
        realizarSorteo(sorteo);
    }
    public static void mostrarSorteos(Map<LocalDate, Sorteo> sorteo){
        for (LocalDate i : sorteo.keySet()) {
            System.out.println("Fecha: "+i);
            System.out.println("Numeros ganadores: ");
            sorteo.get(i).mostrarGanadores();
        }
    }
    public static void mostrarSorteoPorFecha(Map<LocalDate, Sorteo> sorteo){
        
    }
    public static void main(String[] args) {
        Map<LocalDate, Sorteo> sorteo = new TreeMap<>();
        menu(sorteo);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9.tema.pkg11;

import java.time.LocalDate;
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
            System.out.println("3. Mostrar sorteo del mes actual");
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
                    mostrarSorteoFechaActual(sorteo);
                    break;
                case 4:
                    mostrarSorteoPorFecha(sorteo);
                    break;
                case 5:
                    realizarSorteoPorFecha(sorteo);
                    break;
                case 6:
                    mostrarTodosLosSorteos(sorteo);
                    break;
                case 7:
                    System.out.println("ADIOS....");
                    break;
                default:
                    System.out.println("Debe de ser una opcion entre 1 y 7");
            }
        } while (opc!=7);
        
    }
    public static void realizarSorteo(Map<LocalDate, Sorteo> sorteo){
        LocalDate fecha = LocalDate.now();
        int[] numerosGanadores = new int[4];
        Sorteo sorteoAux = new Sorteo(fecha,numerosGanadores);
        sorteoAux.rellenarGanadores();
        // Si el sorteo con la fecha actual es null se inserta y si no no
        if (sorteo.get(fecha)== null) {
            sorteo.put(fecha, sorteoAux);
            System.out.println("Fecha del sorteo: "+fecha);
            System.out.println("Los numeros ganadores del sorteo son: ");
            sorteo.get(fecha).mostrarGanadores();
        }
        else{
            System.out.println("Ya existe un sorteo con la fecha actual");
        }
        
    }
    public static void repetirSorteo(Map<LocalDate, Sorteo> sorteo){ 
        LocalDate fecha = LocalDate.now();
        // Borro el sorteo con la fecha actual
        sorteo.remove(fecha);
        System.out.println("Sorteo borrado con exito, realizando otro sorteo.....");
        // Realizo nuevamente el sorteo
        realizarSorteo(sorteo);
    }
    public static void mostrarSorteoFechaActual(Map<LocalDate, Sorteo> sorteo){
        LocalDate fecha = LocalDate.now();
        if (sorteo.get(fecha) != null) {
            System.out.println("Fecha: "+fecha);
            System.out.println("Numeros ganadores: ");
            sorteo.get(fecha).mostrarGanadores();
        }
        else{
            System.out.println("No existe ningun sorteo con la fecha actual");
        }
    }
    public static int pedirNumero(){
        Scanner entrada = new Scanner (System.in);
        int numero = entrada.nextInt();
        return numero;
    }
    public static LocalDate rellenarFecha(){
        int anno,mes,dia;
        // Pido el año
        System.out.println("Introduce el año (yyyy)");
        anno = pedirNumero();
        //Pido el mes
        System.out.println("Introduce el mes en numero");
        mes = pedirNumero();
        // Pido el dia
        System.out.println("Introduce el dia");
        dia = pedirNumero();
        LocalDate fecha = LocalDate.of(anno, mes, dia);
        return fecha;
    }
    public static void mostrarSorteoPorFecha(Map<LocalDate, Sorteo> sorteo){
        LocalDate fecha = rellenarFecha();
        // Si la fecha no no esta a null significa que esta rellena luego lo muestro
        if (sorteo.get(fecha)!= null){
            System.out.println("Fecha: "+fecha);
            System.out.println("Numeros ganadores: ");
            sorteo.get(fecha).mostrarGanadores();
        }
        else{
            System.out.println("No existe un sorteo en esa fecha");
        }
        
    }
    public static void realizarSorteoPorFecha(Map<LocalDate, Sorteo> sorteo){
        // Pido la fecha
        LocalDate fecha = rellenarFecha();
        int[] numerosGanadores = new int[4];
        Sorteo sorteoAux = new Sorteo(fecha,numerosGanadores);
        sorteoAux.rellenarGanadores();
        // Si en esa fecha no existe ningun sorteo lo realizo
        if (sorteo.get(fecha)== null){
            sorteo.put(fecha, sorteoAux);
            System.out.println("Fecha del sorteo: "+fecha);
            System.out.println("Los numeros ganadores del sorteo son: ");
            sorteo.get(fecha).mostrarGanadores();
        }
        else{
            System.out.println("Ya existe un sorteo en la fecha indicada");
        }
    }
    public static void mostrarTodosLosSorteos(Map<LocalDate, Sorteo> sorteo){
        // En un For Each para mapas siempre lo primero la clave y despues el keyset
        for (LocalDate i : sorteo.keySet()) {
            System.out.println("Fecha: "+i);
            System.out.println("Numeros ganadores: ");
            sorteo.get(i).mostrarGanadores();
        }
    }
    public static void main(String[] args) {
        // Creo un TreeMap para que me guarde los sorteos de forma ordenada por fechas ya que los 
        // TreeMap me guarda ordenado automaticamente por la clave
        Map<LocalDate, Sorteo> sorteo = new TreeMap<>();
        menu(sorteo);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg15;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio15 {
    public static int pedirNumero(){
        Scanner entrada=new Scanner (System.in);
        int numero=entrada.nextInt();
        return numero;
    }
    public static String pedirNombre(){
        Scanner entrada = new Scanner (System.in);
        String nombre=entrada.nextLine();
        return nombre;
    }
    public static void rellenarPeliculas(Peliculas vPeliculas[]){
        for (int i = 0; i < vPeliculas.length; i++) {
            if (vPeliculas [i] != null){
                System.out.println("----- PELICULA "+(i+1)+" -----");
                vPeliculas[i] = new Peliculas();
                System.out.println("Introduce el titulo: ");
                vPeliculas[i].setTitulo(pedirNombre());
                System.out.println("Introduce el coste de la licencia: ");
                vPeliculas[i].setCosteLicencia(pedirNumero());
                System.out.println("---RELLENAR A LOS SOCIOS---");
                vPeliculas[i].rellenarSocios();
            }
            
        }
    }
    public static void mostrarPeliculas(Peliculas vPeliculas[]){
        for (int i = 0; i < vPeliculas.length; i++) {
            if (vPeliculas [i] != null){
              System.out.println("----- PELICULA "+(i+1)+" -----");
                System.out.println("Titulo: "+vPeliculas[i].getTitulo());
                System.out.println("Coste de la licencia: "+vPeliculas[i].getCosteLicencia());
                System.out.println("------ SOCIOS -----");
                vPeliculas[i].mostrarSocios();  
            }            
        }
    }
    public static void masRentable(Peliculas vPeliculas[]){
        int masRentable=0;
        if  (vPeliculas[0] != null){
            masRentable=vPeliculas[0].beneficio()-vPeliculas[0].getCosteLicencia();
        }        
        int pelicula = 0;
        for (int i = 1; i < vPeliculas.length; i++) {
            if  (vPeliculas[i] != null){
                if (vPeliculas[i].beneficio()-vPeliculas[i].getCosteLicencia() > masRentable) {
                    masRentable=vPeliculas[i].beneficio()-vPeliculas[i].getCosteLicencia();
                    pelicula = i;
                }
            }
        }
        if (vPeliculas[0] != null) {
            System.out.println("La peliculas mas rentable es : "+ vPeliculas[pelicula].getTitulo());
            System.out.println("Con una rentabilidad de: "+masRentable);
        }
        
    }
    public static void menosRentable(Peliculas vPeliculas[]){
        int masRentable=0;
        if  (vPeliculas[0] != null){
            masRentable=vPeliculas[0].beneficio()-vPeliculas[0].getCosteLicencia();
        }        
        int pelicula = 0;
        for (int i = 1; i < vPeliculas.length; i++) {
            if  (vPeliculas[i] != null){
                if (vPeliculas[i].beneficio()-vPeliculas[i].getCosteLicencia() < masRentable) {
                    masRentable=vPeliculas[i].beneficio()-vPeliculas[i].getCosteLicencia();
                    pelicula = i;
                }
            }
        }
        if (vPeliculas[0] != null) {
            System.out.println("La peliculas menos rentable es : "+ vPeliculas[pelicula].getTitulo());
            System.out.println("Con una rentabilidad de: "+masRentable);
        }
    }
    public static void buscarPelicula(Peliculas vPeliculas[]){
        System.out.println("Introduce el nombre de una pelicuas: ");
        String pelicula = pedirNombre();
        for (int i = 0; i < vPeliculas.length; i++) {
            if (vPeliculas[i] != null) {
                if (pelicula.equalsIgnoreCase(vPeliculas[i].getTitulo())) {
                System.out.println("Beneficio neto: "+(vPeliculas[i].beneficio()-vPeliculas[i].getCosteLicencia()));
                System.out.println("Socios que han asistido a verla: ");
                vPeliculas[i].mostrarSocios();
                }
            }
        }
    }
    public static void contarSocios(Peliculas vPeliculas[]){
        System.out.println("Introduce un numero :");
        int numero = pedirNumero();
        int contador=0;
        for (int i = 0; i < vPeliculas.length; i++) {
            if (vPeliculas[i] != null) {
                for (int j = 0; j < vPeliculas[i].getvSocios().length; j++) {
                    if (vPeliculas[i].aportacion(j) > numero) {
                        contador++;
                    }
                }
            }            
        }
        System.out.println("Han aportado mas del dinero introducido : "+contador+" socios");
    }
    public static void menu(Peliculas vPeliculas[]){
        int opc;
        do {
            System.out.println("1. Rellenar peliculas y socios");
            System.out.println("2. Mostrar pelis y socios");
            System.out.println("3. Mostrar peli mas rentable");
            System.out.println("4. Mostrar peli menos rentable");
            System.out.println("5. Buscador de pelicula");
            System.out.println("6. Buscar cuantos socios han abonado mas de la cantidad intoducida");
            System.out.println("7. Salir");
            opc = pedirNumero();
            switch (opc){
                case 1:
                    rellenarPeliculas(vPeliculas);
                    break;
                case 2:
                    mostrarPeliculas(vPeliculas);
                    break;
                case 3:
                    masRentable(vPeliculas);
                    break;
                case 4:
                    menosRentable(vPeliculas);
                    break;
                case 5:
                    buscarPelicula(vPeliculas);
                    break;
                case 6:
                    contarSocios(vPeliculas);
                    break;
                    
            }
        } while (opc != 7);
        System.out.println("ADIOS...........");
    }
    public static void main(String[] args) {
        System.out.println("Cuantas peliculas quieres almacenar");
        Peliculas[] vPeliculas = new Peliculas [pedirNumero()];
        menu(vPeliculas);
    }
    
}

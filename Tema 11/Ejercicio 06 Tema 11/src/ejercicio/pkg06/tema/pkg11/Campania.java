/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg06.tema.pkg11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author jcidc07
 */
public class Campania {
    private String nombre;
    private Set <Donacion> donaciones;

    public Campania() {
        nombre="";
        donaciones=new HashSet<>();
    }

    public Campania(String nombre) {
        this.nombre = nombre;
        this.donaciones = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(Set<Donacion> donaciones) {
        this.donaciones = donaciones;
    }
    public static String pedirNombre(){
        Scanner entrada = new Scanner (System.in);
        String nombre=entrada.nextLine();
        return nombre;
    }
    public static int pedirImporte(){
        Scanner entrada = new Scanner (System.in);
        int importe=entrada.nextInt();
        return importe;
    }
    public void anadirDonaciones(){
        String nombre;
        int importe;
        System.out.println("Introduce el nombre de la donacion");
        nombre = pedirNombre();
        System.out.println("Introduce el importe de la donacion");
        importe=pedirImporte();
        Donacion donacionAux=new Donacion(nombre, importe);
        this.donaciones.add(donacionAux);
    }
    public void mostrarDonaciones(){
        Iterator<Donacion> it = donaciones.iterator();
        Donacion objetoDonacion;
        int contador=1;
        
        while(it.hasNext()){
            objetoDonacion = it.next();
            System.out.println("------ DONACION "+contador+" ------");
            System.out.println("Nombre : "+ objetoDonacion.getNombre());
            System.out.println("Importe : "+ objetoDonacion.getCantidad());
            contador++;
        }
    }
    public void mostrarDonacionPorNombre(){
        String nombre;
        System.out.println("Escribe el nombre del donante");
        nombre=pedirNombre();
        Iterator<Donacion> it = donaciones.iterator();
        Donacion objetoDonacion;
        boolean enc=false;
        while(it.hasNext()){
            objetoDonacion = it.next();
            if (nombre.equalsIgnoreCase(objetoDonacion.getNombre())) {
                System.out.println("Nombre : "+ objetoDonacion.getNombre());
                System.out.println("Importe : "+ objetoDonacion.getCantidad());
                enc=true;
            }
        }
        if (enc==false) {
            System.out.println("--- NO SE HA ENCONTRADO NINGUNA DONACION CON ESE NOMBRE ---");
        }
    }
    public int numeroDonaciones(){
        int contador=0;
        Iterator<Donacion> it = donaciones.iterator();
        Donacion objetoDonacion;
        
        while(it.hasNext()){
            objetoDonacion = it.next();
            contador++;
        }
        return contador;
    }
    public int totalDineroRecaudado(){
        int dineroRecaudado=0;
        Iterator<Donacion> it = donaciones.iterator();
        Donacion objetoDonacion;
        
        while(it.hasNext()){
            objetoDonacion = it.next();
            dineroRecaudado=dineroRecaudado+objetoDonacion.getCantidad();
        }
        return dineroRecaudado;
    }
    public void buscarPosicion(Donacion[] donaciones, Donacion objetoDonacion){
        
    }
    public void ordenarDonaciones( ){
        
       Donacion[] donaciones = new Donacion[this.donaciones.size()];
       int indice = 0;
       Iterator<Donacion> it = this.donaciones.iterator();
       Donacion objetoDonacion;
        
        while(it.hasNext()){
            objetoDonacion = it.next();
            buscarPosicion(donaciones, objetoDonacion);
        }
    }
}

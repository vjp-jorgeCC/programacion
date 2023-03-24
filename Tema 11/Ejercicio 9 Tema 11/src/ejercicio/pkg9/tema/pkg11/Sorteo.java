/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9.tema.pkg11;

import java.time.LocalDate;

/**
 *
 * @author jorge
 */
public class Sorteo {
    LocalDate fecha;
    int [] ganadores;

    public Sorteo() {
        this.fecha=fecha;
        this.ganadores=ganadores;
    }

    public Sorteo(LocalDate fecha, int[] ganadores) {
        this.fecha = fecha;
        this.ganadores = ganadores;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int[] getGanadores() {
        return ganadores;
    }

    public void setGanadores(int[] ganadores) {
        this.ganadores = ganadores;
    }
    
    public void rellenarGanadores(){
        for (int i = 0; i < ganadores.length; i++) {
            ganadores[i]=generarAleatorio();
        }
    }
    public void mostrarGanadores(){
        for (int i = 0; i < ganadores.length; i++) {
            System.out.println("Numero "+(i+1)+": "+ganadores[i]);
        }
    }
    public int generarAleatorio(){
        int aleatorio = (int) ((Math.random()*100)+1);
        return aleatorio;
    }
    
}

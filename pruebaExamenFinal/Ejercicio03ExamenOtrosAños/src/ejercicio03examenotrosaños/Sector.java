/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03examenotrosaños;

import java.util.Scanner;

/**
 *
 * @author Nacho
 */
public class Sector {
    
    private int numeroPlantas; 
    private int numeroKilos;

    public Sector(int numeroPlantas, int numeroKilos) {
        this.numeroPlantas = numeroPlantas;
        this.numeroKilos = numeroKilos;
    }

    public Sector() {
        this.numeroPlantas = 0;
        this.numeroKilos = 0;
    }
    
    

    public int getNumeroPlantas() {
        return numeroPlantas;
    }

    public void setNumeroPlantas(int numeroPlantas) {
        this.numeroPlantas = numeroPlantas;
    }

    public int getNumeroKilos() {
        return numeroKilos;
    }

    public void setNumeroKilos(int numeroKilos) {
        this.numeroKilos = numeroKilos;
    }
    
    public void rellenarSector() {
        Scanner entrada = new Scanner (System.in);
        do {
            this.numeroKilos = pedirKilos();
            this.numeroPlantas = pedirNumeroPlantas();
        } while (seguir());

    }
    
    public int pedirKilos() {
        Scanner entrada = new Scanner (System.in);
        int kilos;
        System.out.println("Introduzca los kilos del cultivo");
        return kilos = entrada.nextInt();
    }
    
    public int pedirNumeroPlantas() {
        Scanner entrada = new Scanner (System.in);
        int numPlantas;
        System.out.println("Introduzca el número de plantas");
        return numPlantas = entrada.nextInt();
    }
    
     public boolean seguir() {
        Scanner entrada = new Scanner (System.in);
        boolean respuesta;
        System.out.println("¿Desea seguir introduciendo?");
        return respuesta = entrada.nextLine().equalsIgnoreCase("Si");
    }

    @Override
    public String toString() {
        return "Sector{" + "numeroPlantas=" + numeroPlantas + ", numeroKilos=" + numeroKilos + '}';
    }
    
    
    
}

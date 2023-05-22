/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

/**
 *
 * @author jcidc07
 */
public class Sector {
    private int numeroPlantas;
    private int kilos;

    public Sector() {
        numeroPlantas = 0;
        kilos = 0;
    }

    public Sector(int numeroPlantas, int kilos) {
        this.numeroPlantas = numeroPlantas;
        this.kilos = kilos;
    }

    public int getNumeroPlantas() {
        return numeroPlantas;
    }

    public void setNumeroPlantas(int numeroPlantas) {
        this.numeroPlantas = numeroPlantas;
    }

    public int getKilos() {
        return kilos;
    }

    public void setKilos(int kilos) {
        this.kilos = kilos;
    }
    
    
    
    
}

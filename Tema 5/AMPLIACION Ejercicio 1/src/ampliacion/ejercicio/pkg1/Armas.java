/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ampliacion.ejercicio.pkg1;

/**
 *
 * @author jcidc07
 */
public class Armas {
    private boolean disponible;
    private static int numArmas=0;
    
    public static void sumarArma(){
        numArmas++;
    }
    public static int verArma(){
        return numArmas;
    }
    
    //CONSTRUCTORES
    public Armas() {
        disponible=true;
        sumarArma();
    }

    public Armas(boolean disponible) {
        this.disponible = disponible;
        sumarArma();
    }
    
    //GET AND SET
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void quitarSeguro(){
        System.out.println("");
    }
    public void usarArma(){
        System.out.println("");
    }
    
}

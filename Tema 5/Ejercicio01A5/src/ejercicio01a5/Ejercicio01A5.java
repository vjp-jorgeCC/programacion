/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01a5;

/**
 *
 * @author Usuario
 */
public class Ejercicio01A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pistola P = new Pistola(50);
        Bomba B = new Bomba(300, true);
        Cloroformo C = new Cloroformo(120);
        
        P.quitarSeguro();
        P.usarArma();
        P.setDisponible(false);
        P.usarArma();
        
        B.usarArma();
        
        C.usarArma();
    }
    
}

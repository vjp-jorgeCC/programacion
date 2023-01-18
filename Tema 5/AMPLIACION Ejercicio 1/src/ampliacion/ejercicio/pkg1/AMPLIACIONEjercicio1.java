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
public class AMPLIACIONEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bombas bomba1=new Bombas(20, true, true);
        
        Cloroformo cloroformo1=new Cloroformo(30, true);
        
        Pistola pistola1=new Pistola(8, true);
        
        bomba1.quitarSeguro();
        
        pistola1.quitarSeguro();
    }
    
}

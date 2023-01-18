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
public class Pistola extends Armas {
    private int numBalas;

    public Pistola() {
        super();
        this.numBalas = 0;
    }

    public Pistola(int numBalas, boolean disponible) {
        super(disponible);
        this.numBalas = numBalas;
    }

    public int getNumBalas() {
        return numBalas;
    }

    public void setNumBalas(int numBalas) {
        this.numBalas = numBalas;
    }

    @Override
    public void quitarSeguro() {
        super.quitarSeguro();
        System.out.println("Quitando seguro de la pistola");
    }
    
    
}

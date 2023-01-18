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
public class Bombas extends Armas {
    private int alcance;
    private boolean accionar;
    
    //CONSTRUCTOR
    public Bombas() {
        super();
        this.alcance = 0;
        this.accionar = true;
    }
    public Bombas(int alcance, boolean accionar, boolean disponible) {
        super(disponible);
        this.alcance = alcance;
        this.accionar = accionar;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public boolean isAccionar() {
        return accionar;
    }

    public void setAccionar(boolean accionar) {
        this.accionar = accionar;
    }

    @Override
    public void quitarSeguro() {
        super.quitarSeguro();
        System.out.println("Quitando seguro de la bomba");
    }
    
    
}

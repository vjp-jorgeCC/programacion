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
public class Cloroformo extends Armas {
    private int tiempo_efectivo;
    
    //CONSTRUCTORES
    public Cloroformo() {
        super();
        this.tiempo_efectivo =0;
    }

    public Cloroformo(int tiempo_efectivo, boolean disponible) {
        super(disponible);
        this.tiempo_efectivo = tiempo_efectivo;
    }
    
    //GET AND SET
    public int getTiempo_efectivo() {
        return tiempo_efectivo;
    }

    public void setTiempo_efectivo(int tiempo_efectivo) {
        this.tiempo_efectivo = tiempo_efectivo;
    }

    @Override
    public void quitarSeguro() {
        super.quitarSeguro();
        System.out.println("Quitando seguro del bote de cloroformo");
    }
    @Override
    public void usarArma() {
        super.usarArma();
        quitarSeguro();
        System.out.println("Usando el Cloroformo");
    }
    
    
}

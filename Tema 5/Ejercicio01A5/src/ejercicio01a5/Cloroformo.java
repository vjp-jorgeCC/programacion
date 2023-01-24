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
public class Cloroformo extends Arma {
    private int tiempoEfectivo;
    
    //Constructor por defecto
    public Cloroformo(){
        super();  //Llamamos al constructor por defecto de la clase padre
        this.tiempoEfectivo = 0;
    }
    
    //Constructor por defecto
    public Cloroformo(int tiempoEfectivo){
        super();  //Llamamos al constructor por defecto de la clase padre (No tiene parametrizado)
        this.tiempoEfectivo = tiempoEfectivo;
    }

    //Getter
    public int getTiempoEfectivo() {
        return tiempoEfectivo;
    }

    //Setter
    public void setTiempoEfectivo(int tiempoEfectivo) {
        this.tiempoEfectivo = tiempoEfectivo;
    }
    
    @Override
    public void quitarSeguro(){
        System.out.println("Quitando seguro del cloroformo");
    }
    
}

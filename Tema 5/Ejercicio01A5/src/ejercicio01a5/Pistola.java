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
public class Pistola extends Arma {
    private int numBalas;
    
    //Constructor por defecto
    public Pistola(){
        super();  //Llamamos al constructor por defecto de la clase padre
        this.numBalas = 12;
    }
    
    //Constructor parametrizado
    public Pistola(int numBalas){
        super();  //Llamamos al constructor por defecto de la clase padre (No tiene parametrizado)
        this.numBalas = numBalas;
    }

    //Getter
    public int getNumBalas() {
        return numBalas;
    }

    //Setter
    public void setNumBalas(int numBalas) {
        this.numBalas = numBalas;
    }
    
    @Override
    public void quitarSeguro(){
        System.out.println("Quitando seguro de la pistola");
    }
    
}

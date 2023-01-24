/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02a5;

/**
 *
 * @author Usuario
 */
public class Bomba extends Arma {
    private int alcance;
    private boolean aDistancia;
    
    //Constructor por defecto
    public Bomba(){
        super();  //Llamamos al constructor por defecto de la clase padre
        this.alcance = 0;
        this.aDistancia = true;
    }
    
    //Constructor parametrizado
    public Bomba(int alcance, boolean aDistancia){
        super();  //Llamamos al constructor por defecto de la clase padre (No tiene parametrizado)
        this.alcance = alcance;
        this.aDistancia = aDistancia;
    }

    //Getter
    public int getAlcance() {
        return alcance;
    }

    //Setter
    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    //Getter
    public boolean isaDistancia() {
        return aDistancia;
    }

    //Setter
    public void setaDistancia(boolean aDistancia) {
        this.aDistancia = aDistancia;
    }

    @Override
    public void quitarSeguro(){
        System.out.println("Quitando seguro de la bomba");
    }
    
    @Override
    public void mostrarArma(){
        super.mostrarArma();
        System.out.println("Alcance: "+this.alcance);
        if  (this.aDistancia){
            System.out.println("Accionada a distancia: SI");
        }
        else{
            System.out.println("Accionada a distancia: NO");
        }
    }
}

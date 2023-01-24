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
public abstract class Arma {
    private static int numArmas = 0;  //Atributo estático. Por eso lo inicializamos en la declaración.
    private boolean disponible;

    //Constructor por defecto
    public Arma() {
        this.disponible = true;
        numArmas++;
    }
    
    //Constructor parametrizado
    /* No implementaremos constructor parametrizado porque el enunciado dice que 
       todas las armas estarán disponibles */

    /*Getter --> Los "getters" de los atributos booleanos reciben el nombre de
                 isAtributos en lugar de getAtributo.*/
    public boolean isDisponible() {
        return disponible;
    }

    //Setter
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public void usarArma(){
        if  (isDisponible()){  //Si el arma está disponible
            quitarSeguro();
            System.out.println("Utilizando arma");
        }
        else{
            System.out.println("Arma no disponible");  //El enunciado no lo pide, pero en la ejecución queda más claro
        }
    }
    
    public abstract void quitarSeguro();
    
    public static int getNumArmas(){
        return numArmas;
    }
            
}

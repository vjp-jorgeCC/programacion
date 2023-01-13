/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pizarra.pkg2;

/**
 *
 * @author jcidc07
 */
public class Equipo {
    private String nombre;
    private Futbolista futbolistas;
    
    public Equipo(){
        nombre="";
        futbolistas=null;
    }
    
    public Equipo (String nombre, Futbolista futbolista){
        this.nombre=nombre;
        this.futbolistas=futbolista;
    }
    
    public void setNombre(String nom){
       nombre=nom;
    }
    public void setFutbolista(Futbolista fut){
        futbolistas=fut;
    }
    
    public String getNombre(){
        return nombre;
    }
    public Futbolista getFutbolista(){
        return futbolistas;
    }
}

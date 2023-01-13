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
public class Futbolista {
    private String nombre;
    private String posicion;
    
    public Futbolista(){
        nombre="Jorge";
        posicion="Defensa";
    }
    public Futbolista(String nom, String pos){
        nombre=nom;
        posicion=pos;
    }
    
    public void setNombre(String nom){
        nombre=nom;
    }
    public void setPosicion(String pos){
        posicion=pos;
    }
    public String getNombre(){
        return nombre;
    }
    public String getPosicion(){
        return posicion;
    }
}

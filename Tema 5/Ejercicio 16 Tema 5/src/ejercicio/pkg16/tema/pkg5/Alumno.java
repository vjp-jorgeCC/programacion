/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg16.tema.pkg5;

/**
 *
 * @author jorge
 */
public class Alumno {
    private String nombre;
    private int nota;
    
    public void setNombre(String nom){
        nombre=nom;
    }
    public void setNota(int no){
        nota=no;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getNota(){
        return nota;
    }
    
}

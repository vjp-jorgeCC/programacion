/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pizarra.pkg3;

/**
 *
 * @author jorge
 */
public class Producto {
    private String nombre;
    private int precio;
    private boolean saludable;
    String esSaludable;
    
    Producto(){
        nombre="manzana";
        precio=1;
        saludable=true;
    }
    Producto(String nom, int pre, boolean sal){
        nombre=nom;
        precio=pre;
        saludable=sal;  
    }
    
    public void setNombre(String nom){
        nombre=nom;
    }
    public void setPrecio(int pre){
        precio=pre;
    }
    public void setSaludable(boolean sal){
        saludable=sal;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public boolean isSaludable(){
        return saludable;
    }
    
    public String esSaludable(){
        if (saludable==true) {
            nombre="Saludable";
        }
        else{
            nombre="No Saludable";
        }
        return nombre;
   
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg22.tema.pkg5;

/**
 *
 * @author jorge
 */
public class Producto {
    private String nombre;
    private int precio;
    private int stock;
    
    public Producto(){
        nombre="";
        precio=0;
        stock=0;
    }
    
    public Producto(String nombre,int precio,int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setPrecio(int precio){
        this.precio=precio;
    }
    public void setStock(int stock){
        this.stock=stock;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
    public int getStock(){
        return stock;
    }
}

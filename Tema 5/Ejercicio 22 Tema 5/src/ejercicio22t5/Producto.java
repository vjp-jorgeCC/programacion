/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio22t5;

/**
 *
 * @author Quique Pineda
 */
public class Producto {
    private String nombre;
    private float precio;
    private int stock;
    
    //Constructor por defecto
    public Producto(){
        this.nombre = "";
        this.precio = 0F;
        this.stock = 0;
    }

    //Constructor parametrizado
    public Producto(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}

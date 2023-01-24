/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03a5;

/**
 *
 * @author Quique Pineda
 */
public class Plato {
    private String nombre;
    private float precio;
    private int raciones;
    
    //Constructor por defecto
    public Plato(){
        this.nombre = "";
        this.precio = 0;
        this.raciones = 0;
    }

    //Constructor parametrizado
    public Plato(String nombre, float precio, int raciones) {
        this.nombre = nombre;
        this.precio = precio;
        this.raciones = raciones;
    }

    //getter
    public String getNombre() {
        return nombre;
    }

    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //getter
    public float getPrecio() {
        return precio;
    }

    //Setter
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    //getter
    public int getRaciones() {
        return raciones;
    }

    //Setter
    public void setRaciones(int raciones) {
        this.raciones = raciones;
    }
}

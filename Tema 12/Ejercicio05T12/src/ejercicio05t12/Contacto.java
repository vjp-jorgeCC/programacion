/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05t12;

/**
 *
 * @author admin
 */
public class Contacto {
    /* Atributos */
    private String nombre;
    private int edad;
    private String telefono;
    
    /* Constructor por defecto */
    public Contacto(){
        this.nombre = "";
        this.edad = 0;
        this.telefono = "";
    }
    
    /* Constructor parametrizado */
    public Contacto(String nombre, int edad, String telefono){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

     /* Getters y Setters */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}

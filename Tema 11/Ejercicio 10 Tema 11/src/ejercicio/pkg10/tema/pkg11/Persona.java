/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10.tema.pkg11;

/**
 *
 * @author jcidc07
 */
public class Persona implements Comparable<Persona>{
    String nombre;
    int edad;

    public Persona() {
        nombre = "";
        edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

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

    @Override
    public int compareTo(Persona o) {
        if  (this.edad < o.getEdad()){
            return -1;
        }
        else{
            if (this.edad > o.getEdad()) {
               return 1;
            }
            else{
                return 0;
            }
        }
    }
}

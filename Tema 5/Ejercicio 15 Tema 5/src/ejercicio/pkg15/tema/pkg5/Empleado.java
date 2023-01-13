/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg15.tema.pkg5;

/**
 *
 * @author jorge
 */
public class Empleado {
    private String nombre;
    private int salario;
    private Direccion direccio;
    
    Empleado(String nom,int sal){
        nombre=nom;
        salario=sal;
    }
    
    public void setNombre(String nom){
        nombre=nom;
    }
    public void setSalario(int sal){
        salario=sal;
    }
    public void setEmpleado(Direccion dir){
        direccio=dir;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getSalario(){
        return salario;
    }
    public Direccion getEmepleado(){
        return direccio;
    }
}

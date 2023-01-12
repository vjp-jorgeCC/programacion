/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pizarra.pkg1;

/**
 *
 * @author jcidc07
 */
public class Paciente {
    private String nombre;
    private String sintomas;    
    private static int nuevopaciente=0;
    
    public static void sumarPaciente(){
        nuevopaciente++;
    }
    
    public static int verPaciente(){
        return nuevopaciente;
    }
    
    Paciente(){ //constructor por defecto
        nombre="Jorge";
        sintomas="dolor de cabeza";
    }
    Paciente(String nom, String sin){
        nombre=nom;
        sintomas=sin;
    }
    Paciente (String nom){
        nombre=nom;
    }
    public void setNombre (String nom){
        nombre=nom;
    }
    public void setSintomas (String sin){
        sintomas=sin;
    }
    public String getNombre() {
        return nombre;
    }
    public String getSintomas() {
        return sintomas;
    }    
}

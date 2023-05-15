/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19t12;

/**
 *
 * @author admin
 */
public class Becado {
    private String nombre;
    private String apellidos;
    private char sexo;
    private int edad;
    private int numSuspensos;
    private boolean residenciaFamiliar;
    private float ingresos;  //Ingresos anuales de la familia
    
    public Becado(){
        this.nombre = "";
        this.apellidos = "";
        this.sexo = 'H';
        this.edad = 0;
        this.numSuspensos = 0;
        this.residenciaFamiliar = true;
        this.ingresos = 0;
    }
    
    public Becado(String nombre, String apellidos, char sexo, int edad, int numSuspensos, boolean residenciaFamiliar, float ingresos){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.edad = edad;
        this.numSuspensos = numSuspensos;
        this.residenciaFamiliar = residenciaFamiliar;
        this.ingresos = ingresos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumSuspensos() {
        return numSuspensos;
    }

    public void setNumSuspensos(int numSuspensos) {
        this.numSuspensos = numSuspensos;
    }

    public boolean getResidenciaFamiliar() {
        return residenciaFamiliar;
    }

    public void setResidenciaFamiliar(boolean residenciaFamiliar) {
        this.residenciaFamiliar = residenciaFamiliar;
    }

    public float getIngresos() {
        return ingresos;
    }

    public void setIngresos(float ingresos) {
        this.ingresos = ingresos;
    }
    
    public void mostrarBecado(){
        System.out.println(this.apellidos+", "+this.nombre);
        System.out.println("  Sexo: "+this.sexo);
        System.out.println("  Edad: "+this.edad);
        System.out.println("  Suspensos: "+this.numSuspensos);
        if (this.residenciaFamiliar){
            System.out.println("  Residencia: Familiar");
        }
        else{
            System.out.println("  Residencia: Independizado");
        }
        System.out.println("  Ingresos familiares: "+this.ingresos);
    }
}

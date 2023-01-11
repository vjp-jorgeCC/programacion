/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2.tema.pkg5;

/**
 *
 * @author jcidc07
 */
public class Curso {
    private static int numeroDeCursos=0;
    
    private String nombre;
    private int numeroHoras;
    
    public String getNombre(){
        return nombre;
    }
    
    public int getNumeroHoras(){
        return numeroHoras;
    }
    
    public void setNombre(String nom){
        nombre=nom;
    }
    
    public void setNumeroHoras(int num){
        numeroHoras=num;
    }
    
    public static void sumarCursos(){
        numeroDeCursos++;
    }
    
    public static void verNumeroCursos(){
        System.out.println("Numero de cursos: "+numeroDeCursos);
    }
    
}

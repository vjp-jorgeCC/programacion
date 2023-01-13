/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.ejemplo.libros;

/**
 *
 * @author jcidc07
 */
public class Libros {
    private static int numlibros=0;
    private String titulo;
    private String autor;
    
    public Libros(){
        titulo="";
        autor="";
        incLibros();
    }
    
    public Libros(String titulo, String autor){
        this.titulo=titulo;
        this.autor=autor;
        incLibros();
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    
    public void setAutor(String autor){
        this.autor=autor;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    
    public static void incLibros(){
        numlibros++;
    }
    
    public static int getNumLibros(){
        return numlibros;
    }
    
    
    
}

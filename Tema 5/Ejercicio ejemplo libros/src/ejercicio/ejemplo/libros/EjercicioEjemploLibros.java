/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.ejemplo.libros;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class EjercicioEjemploLibros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        String titulo;
        Libros l1=new Libros();
        Libros l2=new Libros("El guardian entre el centeno","J.D.Salinger");
        titulo=entrada.nextLine();
        l1.setTitulo(titulo);
        System.out.println("Titulo: "+l2.getTitulo());
        System.out.println("Autor: "+l2.getAutor());
        
        Libros l3=new Libros();
                
        System.out.println("Titulo: "+l1.getTitulo());
        
        System.out.println("Numero de libros: "+Libros.getNumLibros());
        
        
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg08.tema.pkg10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio08Tema10 {
    public static void pedirDatosAlumno(ArrayList<Alumno> listaAlumnos) {
    Scanner scanner = new Scanner(System.in);
    String res;
        do {
           System.out.print("Introduce el nombre del alumno: ");
           String nombre = scanner.nextLine();
           System.out.print("Introduce el curso al que pertenece: ");
           String curso = scanner.nextLine();
           Alumno alumno = new Alumno(nombre, curso);
           listaAlumnos.add(alumno); 
            System.out.println("Desea introducir otro alumno");
           res=scanner.nextLine();
        } while (res.equalsIgnoreCase("si"));
        
    
    }
    public static void mostrarListaAlumnos(ArrayList<Alumno> listaAlumnos) {
    System.out.println("Lista de alumnos:");
    for (Alumno alumno : listaAlumnos) {
        System.out.println(alumno.getNombre() + " - " + alumno.getCurso());
    }
}
    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
        pedirDatosAlumno(listaAlumnos);
        mostrarListaAlumnos(listaAlumnos);
    }
    
}

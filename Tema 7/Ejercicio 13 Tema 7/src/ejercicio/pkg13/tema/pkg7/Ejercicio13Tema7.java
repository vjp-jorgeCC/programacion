/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg13.tema.pkg7;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio13Tema7 {
    public static int pedirNumero(){
        Scanner entrada=new Scanner (System.in);
        int numero=entrada.nextInt();
        return numero;
    }
    public static String pedirNombre(){
        Scanner entrada=new Scanner (System.in);
        String nombre= entrada.nextLine();
        return nombre;
    }
    public static void rellenarAlumno(Alumno vAlumno[]){
        int numero;
        System.out.println("Introduce un numero para rellenar un alumno en esa posicion");
        numero=pedirNumero();        
            if (vAlumno[numero] == null) {
                vAlumno[numero]= new Alumno();
                System.out.println("Introduce un nombre: ");
                vAlumno[numero].setNombre(pedirNombre());
                System.out.println("Introduce la edad: ");
                vAlumno[numero].setEdad(pedirNumero());
                System.out.println("Introduce nota media: ");
                vAlumno[numero].setNotaMedia(pedirNumero());
            }
            else if (vAlumno[numero] != null) {
            System.out.println("El alumno ya esta relleno.");
            }
    }
    public static void mostrarAlumnos(Alumno vAlumno[]){
        for (int i = 0; i < vAlumno.length; i++) {
            if (vAlumno [i] != null) {
                System.out.println("------ ALUMNO "+(i+1)+" ------");
                System.out.println("Alumno : "+vAlumno[i].getNombre());
                System.out.println("Edad: "+vAlumno[i].getEdad());
                System.out.println("Nota media: "+vAlumno[i].getNotaMedia());
            }
        }
    }
    public static void notaMediaDada(Alumno vAlumno[]){
        System.out.println("Introduce una nota media para ver cuantos alumnos tienen mas");
        int notaMediaDada=pedirNumero();
        for (int i = 0; i < vAlumno.length; i++) {
            if (vAlumno[i] != null) {
                if (notaMediaDada<vAlumno[i].getNotaMedia()) {
                    System.out.println("------ ALUMNO "+(i+1)+" ------");
                    System.out.println("Alumno : "+vAlumno[i].getNombre());
                    System.out.println("Edad: "+vAlumno[i].getEdad());
                 System.out.println("Nota media: "+vAlumno[i].getNotaMedia());
                }                
            }
        }
    }
    public static void notaMediaSuspensa(Alumno vAlumno[]){
        int contador=0;
        for (int i = 0; i < vAlumno.length; i++) {
            if (vAlumno[i] != null) {
                if (vAlumno[i].getNotaMedia() < 5 ) {
                    contador++;
                }
            }            
        }
        System.out.println("Alumnos con nota media suspensa: "+contador);
    }
    public static void buscarAlumno(Alumno vAlumno[]){
        System.out.println("Introduce un nombre para buscar al alumno");
        String nombre= pedirNombre();
        boolean matricula=false;
        for (int i = 0; i < vAlumno.length; i++) {
            if (vAlumno[i] != null) {
                if (vAlumno[i].getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("El alumno esta matriculado.");
                    matricula=true;
                }
            }            
        }
        if (matricula == false) {
            System.out.println("El alumno no esta matriculado.");
        }
    }
    public static void menu(Alumno vAlumno[]){
        int opc;
        do {
            System.out.println("1. Rellenar un alumno");
            System.out.println("2. Mostrar alumnos");
            System.out.println("3. Mostrar alumnos con nota media superior a la dada");
            System.out.println("4. Cuantos alumnos con nota media suspensa");
            System.out.println("5. Buscar alumnos");
            System.out.println("6. Salir");
            opc=pedirNumero();
            switch (opc){
            case 1:
                rellenarAlumno(vAlumno);
                break;
            case 2:
                mostrarAlumnos(vAlumno);
                break;
            case 3:
                notaMediaDada(vAlumno);
                break;
            case 4:
                notaMediaSuspensa(vAlumno);
                break;
            case 5:
                buscarAlumno(vAlumno);
                break;
        }
        } while (opc != 6);
        System.out.println("Adios....");
    }
    public static void main(String[] args) {
        Alumno[] vAlumno = new Alumno [5];
        menu(vAlumno);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg16.tema.pkg5;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Test {
    public static String pedirNombre(){
        Scanner entrada=new Scanner(System.in);
        String nombre;
        System.out.println("Introduce un nombre: ");
        nombre=entrada.nextLine();
        return nombre;
    }
    
    public static int pedirNota(){
        Scanner entrada=new Scanner(System.in);
        int nota;
        do {
            System.out.println("Introduce una nota: ");
            nota=entrada.nextInt();
            if (nota<0||nota>10) {
                System.out.println("Introduce una nota entre 0 y 10");
            }
        } while (nota<0||nota>10);
        return nota;
    }
    
    public static void main(String[] args) {
        Alumno alumno1=new Alumno();
        Alumno alumno2=new Alumno();
        Alumno alumno3=new Alumno();
        
        System.out.println("Introduce nombre y nota del alumno 1");
        alumno1.setNombre(pedirNombre());
        alumno1.setNota(pedirNota());
        
        System.out.println("Introduce nombre y nota del alumno 2");
        alumno2.setNombre(pedirNombre());
        alumno2.setNota(pedirNota());
        
        System.out.println("Introduce nombre y nota del alumno 3");
        alumno3.setNombre(pedirNombre());
        alumno3.setNota(pedirNota());
                
        System.out.println("ALUMNO 1");
        System.out.println("Nombre: "+alumno1.getNombre());
        switch(alumno1.getNota()){
            case 0:
                System.out.println(alumno1.getNota()+"= Suspenso");
                break;
            case 1:
                System.out.println(alumno1.getNota()+"= Suspenso");
                break;
            case 2:
                System.out.println(alumno1.getNota()+"= Suspenso");
                break;
            case 3:
                System.out.println(alumno1.getNota()+"= Suspenso");
                break;
            case 4:
                System.out.println(alumno1.getNota()+"= Suspenso");
                break;
            case 5:
                System.out.println(alumno1.getNota()+" =Bien");
                break;
            case 6:
                System.out.println(alumno1.getNota()+"= Bien");
                break;
            case 7:
                System.out.println(alumno1.getNota()+"= Notable");
                break;
            case 8:
                System.out.println(alumno1.getNota()+"= Notable");
                break;
            case 9:
                System.out.println(alumno1.getNota()+"= Sobresaliente");
                break;    
            case 10:
                System.out.println(alumno1.getNota()+"= Sobresaliente");
                break;
        }
        
        System.out.println("ALUMNO 2");
        System.out.println("Nombre: "+alumno2.getNombre());
        switch(alumno2.getNota()){
            case 0:
                System.out.println(alumno2.getNota()+"= Suspenso");
                break;
            case 1:
                System.out.println(alumno2.getNota()+"= Suspenso");
                break;
            case 2:
                System.out.println(alumno2.getNota()+"= Suspenso");
                break;
            case 3:
                System.out.println(alumno2.getNota()+"= Suspenso");
                break;
            case 4:
                System.out.println(alumno2.getNota()+"= Suspenso");
                break;
            case 5:
                System.out.println(alumno2.getNota()+"= Bien");
                break;
            case 6:
                System.out.println(alumno2.getNota()+"= Bien");
                break;
            case 7:
                System.out.println(alumno2.getNota()+"= Notable");
                break;
            case 8:
                System.out.println(alumno2.getNota()+"= Notable");
                break;
            case 9:
                System.out.println(alumno2.getNota()+"= Sobresaliente");
                break;    
            case 10:
                System.out.println(alumno2.getNota()+"= Sobresaliente");
                break;
        }
        
        System.out.println("ALUMNO 3");
        System.out.println("Nombre: "+alumno3.getNombre());
        switch(alumno3.getNota()){
            case 0:
                System.out.println(alumno3.getNota()+"= Suspenso");
                break;
            case 1:
                System.out.println(alumno3.getNota()+"= Suspenso");
                break;
            case 2:
                System.out.println(alumno3.getNota()+"= Suspenso");
                break;
            case 3:
                System.out.println(alumno3.getNota()+"= Suspenso");
                break;
            case 4:
                System.out.println(alumno3.getNota()+"= Suspenso");
                break;
            case 5:
                System.out.println(alumno3.getNota()+"= Bien");
                break;
            case 6:
                System.out.println(alumno3.getNota()+"= Bien");
                break;
            case 7:
                System.out.println(alumno3.getNota()+"= Notable");
                break;
            case 8:
                System.out.println(alumno3.getNota()+"= Notable");
                break;
            case 9:
                System.out.println(alumno3.getNota()+"= Sobresaliente");
                break;    
            case 10:
                System.out.println(alumno3.getNota()+"= Sobresaliente");
                break;
        }
    }
    
}

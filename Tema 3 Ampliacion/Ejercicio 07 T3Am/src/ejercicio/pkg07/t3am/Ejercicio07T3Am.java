<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg07.t3am;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio07T3Am {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int nota1,nota2,nota3,nota4,nota5,nota6,contador;
        contador=0;
        System.out.println("Introduce la primera nota ");
        nota1=entrada.nextInt();
        System.out.println("Introduce la segunda nota ");
        nota2=entrada.nextInt();
        System.out.println("Introduce la tercera nota ");
        nota3=entrada.nextInt();
        System.out.println("Introduce la cuarta nota ");
        nota4=entrada.nextInt();
        System.out.println("Introduce la quinta nota ");
        nota5=entrada.nextInt();
        System.out.println("Introduce la sexta nota ");
        nota6=entrada.nextInt();                    
        if (((nota1<0))||(nota1>10)) {
            System.out.println("La nota 1 introducida no esta en entre el 0 y el 10");
        }
        else{
            if (nota1>=5) {
                contador++; 
            }
        }
        if (((nota2<0))||(nota2>10)) {
            System.out.println("La nota 2 introducida no esta en entre el 0 y el 10");
        }
        else{
            if (nota2>=5) {
                contador++; 
            }
        }
        if (((nota3<0))||(nota3>10)) {
            System.out.println("La nota 3 introducida no esta en entre el 0 y el 10");
        }
        else{
            if (nota3>=5) {
                contador++; 
            }
        }
        if (((nota4<0))||(nota4>10)) {
            System.out.println("La nota 4 introducida no esta en entre el 0 y el 10");
        }
        else{
            if (nota4>=5) {
                contador++; 
            }
        }
        if (((nota5<0))||(nota5>10)) {
            System.out.println("La nota 5 introducida no esta en entre el 0 y el 10");
        }
        else{
            if (nota5>=5) {
                contador++; 
            }                     
        }
        if (((nota6<0))||(nota6>10)) {
            System.out.println("La nota 1 introducida no esta en entre el 0 y el 10");
        }
        else{
            if (nota6>=5) {
                contador++; 
            }                
        }
        System.out.println("Las asignaturas aprobadas son: "+contador);
    }
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg07.t3am;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio07T3Am {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int nota1,nota2,nota3,nota4,nota5,nota6,contador;
        contador=0;
        System.out.println("Introduce la primera nota ");
        nota1=entrada.nextInt();
        System.out.println("Introduce la segunda nota ");
        nota2=entrada.nextInt();
        System.out.println("Introduce la tercera nota ");
        nota3=entrada.nextInt();
        System.out.println("Introduce la cuarta nota ");
        nota4=entrada.nextInt();
        System.out.println("Introduce la quinta nota ");
        nota5=entrada.nextInt();
        System.out.println("Introduce la sexta nota ");
        nota6=entrada.nextInt();                    
        if (((nota1<0))||(nota1>10)) {
            System.out.println("La nota 1 introducida no esta en entre el 0 y el 10");
        }
        else{
            if (nota1>=5) {
                contador++; 
            }
        }
        if (((nota2<0))||(nota2>10)) {
            System.out.println("La nota 2 introducida no esta en entre el 0 y el 10");
        }
        else{
            if (nota2>=5) {
                contador++; 
            }
        }
        if (((nota3<0))||(nota3>10)) {
            System.out.println("La nota 3 introducida no esta en entre el 0 y el 10");
        }
        else{
            if (nota3>=5) {
                contador++; 
            }
        }
        if (((nota4<0))||(nota4>10)) {
            System.out.println("La nota 4 introducida no esta en entre el 0 y el 10");
        }
        else{
            if (nota4>=5) {
                contador++; 
            }
        }
        if (((nota5<0))||(nota5>10)) {
            System.out.println("La nota 5 introducida no esta en entre el 0 y el 10");
        }
        else{
            if (nota5>=5) {
                contador++; 
            }                     
        }
        if (((nota6<0))||(nota6>10)) {
            System.out.println("La nota 1 introducida no esta en entre el 0 y el 10");
        }
        else{
            if (nota6>=5) {
                contador++; 
            }                
        }
        System.out.println("Las asignaturas aprobadas son: "+contador);
    }
    
}
>>>>>>> 44d1433f306e6dd8813279ec07ec2e01be366315

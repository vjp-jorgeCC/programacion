/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg14.tema.pkg6;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class Ejercicio14Tema6 {
    public static int pedirNumero(){
        Scanner entrada=new Scanner (System.in);
        int numero=entrada.nextInt();
        return numero;
    }
    public static int generarAleatorio(){
        int alt;
        alt=(int) ((Math.random()*40)+1);
        return alt;
    }
    public static void rellenarTemperaturas(int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]=generarAleatorio();
            }
        }
    }
    public static void mostrarTemperaturas(int array[][], String dias[]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Semana: "+i+" Dia: "+dias[j]+" "+array[i][j]+" Grados");
            }
        }
    }
    public static int temperaturaMediaDelMes(int array[][]){
        int suma=0;
        int media;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                suma=suma+array[i][j];
            }
        }
        media=suma/28;
        return media;
    }
    public static int diaMasCaluroso(int array[][], String dias[]){
        int caluroso=array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]>caluroso) {
                    caluroso=array[i][j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]==caluroso) {
                    System.out.println("El dias mas caluroso es el: "+dias[j]+" De la semana "+i+" Con una temepratuta de : "+array[i][j]);
                }
            }
        }
        return caluroso;
    }
    public static void menu(int array[][], String dias[]){
        int opc;
        do {
            System.out.println("1. Rellenar las temperaturas");
            System.out.println("2. Mostrar las temperaturas");
            System.out.println("3. Visualizar la temperatura media del mes");
            System.out.println("4. Dia mas caluroso del mes");
            System.out.println("5. Salir del programa");
            opc=pedirNumero();
            switch(opc){
                case 1:
                    rellenarTemperaturas(array);
                    break;
                case 2:
                    mostrarTemperaturas(array, dias);
                    break;
                case 3:
                    System.out.println("La temperatura media del mes es: "+temperaturaMediaDelMes(array));
                    break;
                case 4:
                    diaMasCaluroso(array, dias);
                    break;
                case 5:
                    System.out.println("Adios...");
                    break;
            }
        } while (opc!=5);
        
    }
    public static void main(String[] args) {
        int [][] array = new int[4][7];
        String [] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        menu(array,dias);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg15.tema.pkg6;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio15Tema6 {
    public static int pedirNumero(){
        Scanner entrada = new Scanner (System.in);
        int opc=entrada.nextInt();
        
        return opc;
    }
    public static int generarlAleatorio(){
        int alt=(int) ((Math.random()*91)+10);
        return alt;
    }
    public static void rellenarVentas(int array[]){
        for (int i = 0; i < array.length; i++) {
            array[i]=generarlAleatorio();
        }
    }
    public static void mostrarVentas(int array[], String meses[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println(meses[i]+" Ventas: "+array[i]);
        }
    }
    public static void mostrarVentasReves(int array [], String meses[]){
        int inicio=array.length-1;
        for (int i = inicio; i >= 0; i--) {
            System.out.println(meses[i]+" Ventas: "+array[i]);
        }
    }
    public static void sumaVentas(int array[]){
       int suma=0;
        for (int i = 0; i < array.length; i++) {
            suma=suma+array[i];
        }
        System.out.println("La suma total de las ventas del año es de : "+suma);
    }
    public static void ventasDeLosMesesPares(int array[], String meses[]){
        int suma=0;
        for (int i = 0; i < array.length; i++) {
            if (i%2!=0) {
                suma=suma+array[i];
            }
        }
        System.out.println("La suma total de los meses pares es: "+suma);
    }
    public static void mesConMasVentas(int array[], String meses[]){
        int masVentas=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>masVentas) {
                masVentas=array[i];
            }
            
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]==masVentas) {
                System.out.println("El mes con mas ventas ha sido: "+meses[i]+" Las ventas han sido de: "+array[i]);
            }
        }
    }
     public static void menu(int array[], String meses[]){
        int opc;
        do {
            System.out.println("1. Rellenar meses");
            System.out.println("2. Mostrar ventas");
            System.out.println("3. Mostrar ventas al reves");
            System.out.println("4. Suma de las ventas");
            System.out.println("5. Ventas de los meses pares");
            System.out.println("6. Mes con mas ventas");
            System.out.println("7. Salir");
            opc=pedirNumero();
            switch(opc){
                case 1:
                    rellenarVentas(array);
                    break;
                case 2:
                    mostrarVentas(array, meses);
                    break;
                case 3:
                    mostrarVentasReves(array, meses);
                    break;
                case 4:
                    sumaVentas(array);
                    break;
                case 5:
                    ventasDeLosMesesPares(array, meses);
                    break;
                case 6:
                    mesConMasVentas(array, meses);
                    break;
                case 7:
                    System.out.println("Adios.....");
                    break;
            }
        } while (opc!=7);
     }    
    public static void main(String[] args) {
        int[] array = new int[12];
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        menu(array,meses);
    }
    
}

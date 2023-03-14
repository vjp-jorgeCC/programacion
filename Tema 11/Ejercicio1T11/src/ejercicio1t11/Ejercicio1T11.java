/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1t11;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author iormaechec01
 */
public class Ejercicio1T11 {

    //Retorna un aleatorio entre 0 y 49.
    public static int generarAleatorio() {
        int aleatorio;
        aleatorio = (int) (Math.random() * 50);  //Generamos una temperatura aleatorio entre 0º y 49º
        return aleatorio;
    }

    //Rellenar el mapa con los días
    public static void rellenarMapa(HashMap<Integer, Dia> mapa) {
        String[] vNombres = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int j = (int) Math.floor(Math.random() * 6);
        for (int i = 1; i <= 31; i++) {
            mapa.put(i, pedirDia(vNombres[j]));
            j++;
            if (j == 7) {
                j = 0;
            }
        }
    }

    //Rellena un día 
    public static Dia pedirDia(String nombreDia) {
        Dia dia = new Dia();
        int temperatura;
        int j = (int) (Math.random() * 7);  //Generamos aleatorio entre 0 y 6       
        temperatura = generarAleatorio();//Generamos una temperatura aleatorio entre 0º y 49º
        dia = new Dia(nombreDia, temperatura);

        return dia;
    }

    //Muestra todos los días de la semana y sus temperaturas
    public static void mostrarMapa(HashMap<Integer, Dia> mapa) {
        for (Integer i : mapa.keySet()) {
            System.out.println("Clave: " + i + "Valor: " + mapa.get(i).toString());
        }
    }

    //Calcula y muestra la temperatura media del mes
    public static void mostrarTemperaturaMedia(HashMap<Integer, Dia> mapa) {
        float suma = 0;
        //Utilizamos un bucle for each para recorrer el vector vDias
        for (Integer i : mapa.keySet()) {
            suma = suma + mapa.get(i).getTemperatura();
        }
        System.out.println("La temperatura media del mes es de " + suma / mapa.size());
    }

    //Calcula el/los dia/s mas caluroso/s
    public static void calcularDiasMasCalurosos(HashMap<Integer, Dia> mapa) {
        //Buscamos la temperatura más alta del mes
        int i, tempMax = mapa.get(1).getTemperatura();

        for (Integer m : mapa.keySet()) {
            //Si encontramos una temperatura mayor en la celda "i", actualizamos tempMax
            if (mapa.get(m).getTemperatura() > tempMax) {
                tempMax = mapa.get(m).getTemperatura();
            }
        }

        //Mostramos todos aquellos días cuya temperatura coincide con tempMax
        for (Integer n : mapa.keySet()) {
            //Si la temperatura del día coincide con la máxima encontrada, mostramos el día
            if (mapa.get(n).getTemperatura() == tempMax) {
                System.out.println("    El " + mapa.get(n).getNombreDia() + " dia " + (n + 1) + " con " + tempMax + " grados");
            }

        }
    }
    
    //Mostramos el menú por pantalla para elegir opción
    public static void mostrarMenu(HashMap<Integer, Dia> mapa) {
        Scanner teclado = new Scanner(System.in);
        int opc;
        do {
            System.out.println("1. Rellenar temperaturas");
            System.out.println("2. Mostrar temperaturas");
            System.out.println("3. Mostrar temperatura media");
            System.out.println("4. Día o días más calurosos");
            System.out.println("5. Salir");
            System.out.print("   Opcion: ");
            opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    rellenarMapa(mapa);
                    break;
                case 2:
                    mostrarMapa(mapa);
                    break;
                case 3:
                    mostrarTemperaturaMedia(mapa);
                    break;
                case 4:
                    calcularDiasMasCalurosos(mapa);
                    break;
                case 5:
                    System.out.println("¡Hasta la próxima!");
                    break;
            }
        } while (opc != 5);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<Integer, Dia> mapa = new HashMap<>(); //Declaramos mapa de Dias
        mostrarMenu(mapa);
    }

}

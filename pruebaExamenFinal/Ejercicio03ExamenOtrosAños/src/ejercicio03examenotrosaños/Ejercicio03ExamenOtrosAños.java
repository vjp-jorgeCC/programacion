/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03examenotrosaños;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Nacho
 */
public class Ejercicio03ExamenOtrosAños {

    /**
     * @param args the command line arguments
     */
    public static void mostrarMenu(Plantacion[] plantacion) {
        Scanner entrada = new Scanner(System.in);
        int opc;
        do {
            System.out.println("Elija una opción en el menú: ");
            System.out.println("1.- Añadir plantación");
            System.out.println("2.- Mostrar plantaciones mayores a 1000 kilos");
            System.out.println("3.- Mostrar total kilos por cultivo");
            System.out.println("4.- Mostrar posición del último cultivo");
            System.out.println("5.- Mostrar plantación según su posición");
            System.out.println("6.- Salir");
            System.out.println("Introduzca una opción, por favor");
            
            
            try {
            opc = entrada.nextInt();
        } catch (InputMismatchException e){
            System.out.println("No existe esta posicion");
            opc = 6;
        }

            switch (opc) {
                case 1:
                    if (vectorLleno(plantacion)) {
                        System.out.println("No puedes añadir más plantaciones.");
                    } else {
                        addPlantacion(plantacion);
                    }
                    break;
                case 2:
                    mostrarPlantacionesMilKilos(plantacion);
                    break;
                case 3:
                    mostrarTotalKilosPorCultivo(plantacion);
                    break;
                case 4:
                    mostrarPosicionUltimoCultivo(plantacion);
                    break;
                case 5:
                    mostrarPlantacionSegunPosicion(plantacion);
                    break;
                case 6:
                    System.out.println("¡Hasta otra!");
                    break;
                default:
                    System.out.println("Error, introduzca un número entre 1 y 6");

            }

        } while (opc != 6);
    }

    public static int pedirPosicionPlantacion(Plantacion[] plantacion) {
        Scanner entrada = new Scanner(System.in);
        int pos;
        boolean vacia = false;
        System.out.println("Por favor, introduzca la posicion donde desea introducir la plantación");

        do {
            try {
                pos = entrada.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Introduzca un número entre 0 y 5");
                pos = -1;
            }
            
            if (pos >= 0 && pos < 5) {

                if (plantacion[pos] == null) {
                   
                        vacia = true;
                    
                } else {
                    System.out.println("Posición ocupada, introduzca otra posición");
                    vacia = false;
                }
            } else {
                System.out.println("La posición debe estar entre 0 y 4");
                System.out.println("Vuelva a introducir una posición válida.");
            }
        } while (!vacia);

        return pos;

    }
    
     public static int pedirPosicion() {
        Scanner entrada = new Scanner (System.in);
        int pos;
        System.out.println("Por favor, introduzca la posicion donde desea introducir la plantación");

        try {
            pos = entrada.nextInt();
        } catch (InputMismatchException e){
            System.out.println("No existe esta posicion");
            pos = -1;
        }
        return pos;
    }

    public static String pedirCultivo() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el tipo de cultivo ");
        String cultivo = entrada.nextLine();
        return cultivo;
    }

    public static boolean vectorLleno(Plantacion[] plantacion) {
        boolean lleno = true;
        int i = 0;
        while (i < plantacion.length && lleno) {
            if (plantacion[i] == null) {
                lleno = false;
            } else {
                i++;
            }
        }

        return lleno;
    }

    public static void addPlantacion(Plantacion[] plantacion) {
        Plantacion plant = new Plantacion();
        int pos = pedirPosicionPlantacion(plantacion);
        plant.rellenarPlantacion();
        plantacion[pos] = plant;
    }

    public static void mostrarPlantacionesMilKilos(Plantacion[] plantacion) {

        for (int i = 0; i < plantacion.length; i++) {
            if (plantacion[i] != null) {
                if (plantacion[i].sumarKilos() > 1000) {
                    plantacion[i].mostrarPlantacion();
                }
            }
        }
    }

    public static void mostrarTotalKilosPorCultivo(Plantacion[] plantacion) {
        int suma = 0;
        String cultivo = pedirCultivo();

        for (int i = 0; i < plantacion.length; i++) {
            if (plantacion[i] != null) {
                if (cultivo.equalsIgnoreCase(plantacion[i].getTipoCultivo())) {

                    suma = plantacion[i].sumarKilos();
                    System.out.println("La cantidad de kilos de " + cultivo + " es de " + suma);
                } else {
                    System.out.println("El cultivo no existe");
                }
            }
        }
    }

    public static void mostrarPosicionUltimoCultivo(Plantacion[] plantacion) {
        String cultivo = pedirCultivo();
        for (int i = 0; i < plantacion.length; i++) {
            if (plantacion[i] != null) {
                if (cultivo.equalsIgnoreCase(plantacion[i].getTipoCultivo())) {
                    System.out.println("La posición del último cultivo es: " + i);
                } else {
                    System.out.println("No hay cultivo en esta posición");
                }
            }
        }
    }

    public static void mostrarPlantacionSegunPosicion(Plantacion[] plantacion) {
        int pos = pedirPosicion();
        boolean enc = false;
        int i = 0;

        while (i < plantacion.length && !enc) {
            if (plantacion[i] != null) {
                if (pos == i) {
                    plantacion[i].mostrarPlantacion();
                    enc = true;
                }
            }
            i++;
        }

    }

   

    public static void main(String[] args) {
        // TODO code application logic here
        Plantacion[] plantaciones = new Plantacion[5];
        mostrarMenu(plantaciones);
    }

}

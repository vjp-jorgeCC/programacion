/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ampliacion.ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class AMPLIACIONEjercicio2 {
    public static void menu(Platos plato1, Platos plato2, Platos plato3){
        Scanner entrada=new Scanner (System.in);
        Scanner entrada2=new Scanner (System.in);
        Platos platoSeleccionado=null;
        int opc;
        int cuenta=0;
        String opc2;
        System.out.println("--LOS POLLOS HERMANOS--");
        System.out.println("Pulse 1 para servir Nachos (Precio: "+plato1.getPrecio()+"€ - Stock: "+plato1.getRacionesDisponibles()+" raciones");
        System.out.println("Pulse 2 para servir Burritos (Precio: "+plato2.getPrecio()+"€ - Stock: "+plato2.getRacionesDisponibles()+" raciones");
        System.out.println("Pulse 3 para servir Tacos (Precio: "+plato3.getPrecio()+"€ - Stock: "+plato3.getRacionesDisponibles()+" raciones");
        opc=entrada.nextInt();
        switch(opc){
            case 1:
                System.out.println("Va a servir Nachos ");
                System.out.println("¿Cuantas raciones?");
                opc=entrada.nextInt();
                System.out.println("Comanda servida correctamente");
                System.out.println("¿Desea servir mas platos?");
                opc2=entrada2.nextLine();
                if (opc2.equalsIgnoreCase("SI")) {
                    menu(plato1,plato2,plato3);
                }
                plato1.setRacionesDisponibles(plato1.getRacionesDisponibles()-opc);
                cuenta=cuenta+plato1.getPrecio()*opc;
                break;
                case 2:
                System.out.println("Va a servir Burritos ");
                System.out.println("¿Cuantas raciones?");
                opc=entrada.nextInt();
                System.out.println("Comanda servida correctamente");
                System.out.println("¿Desea servir mas platos?");
                opc2=entrada.nextLine();
                if (opc2.equalsIgnoreCase("SI")) {
                    menu(plato1,plato2,plato3);
                }
                plato2.setRacionesDisponibles(plato2.getRacionesDisponibles()-opc);
                cuenta=cuenta+plato2.getPrecio()*opc;
                break;
                case 3:
                System.out.println("Va a servir Tacos ");
                System.out.println("¿Cuantas raciones?");
                opc=entrada.nextInt();
                System.out.println("Comanda servida correctamente");
                System.out.println("¿Desea servir mas platos?");
                opc2=entrada.nextLine();
                if (opc2.equalsIgnoreCase("SI")) {
                    menu(plato1,plato2,plato3);
                }
                plato1.setRacionesDisponibles(plato3.getRacionesDisponibles()-opc);
                cuenta=cuenta+plato3.getPrecio()*opc;
                break;
        }
        System.out.println("La cuenta total es de "+cuenta);
    }
    public static void main(String[] args) {
    Platos plato1=new Platos("Nachos", 8, 35);
    Platos plato2=new Platos("Burritos", 12, 10);
    Platos plato3=new Platos("Tacos", 10, 20);
    menu(plato1,plato2,plato3);
    }
    
}

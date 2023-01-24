/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02a5;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio02A5 {

    //Pide y retorna si desea crear más armas
    public static String pedirRespuesta(){
        Scanner teclado = new Scanner(System.in);
        String resp;
        System.out.println(" ¿Desea crear una nueva arma? ");
        resp = teclado.nextLine();
        return resp;
    }
    
    //Muestra el menú y recoge la opción
    public static int menu(){
        Scanner teclado = new Scanner(System.in);
        int opc;
        System.out.println("Pulse 1 para crear una bomba.");
        System.out.println("Pulse 2 para crear cloroformo.");
        System.out.println("Pulse 3 para crear una pistola.");
        opc = teclado.nextInt();
        return opc;
    }
    
    //Muestra el mensaje recibido porp arámetros y recoge el entero
    public static int pedirEntero(String sms){
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print(sms);
        num = teclado.nextInt();
        return num;
    }
    
    //Pide al usuario su es posible su accionado a distancia o no
    public static boolean pedirADistancia(){
        Scanner teclado = new Scanner(System.in);
        String dist;
        System.out.print("Accionado a distancia: ");
        dist = teclado.nextLine();
        if  (dist.equalsIgnoreCase("SI")){
            return true;
        }
        else{
            return false;
        }
    }
    
    //Muestra un arma u otra en función de la opción elegida por el usuario
    public static void mostrarArma(Bomba B, Cloroformo C, Pistola P, int opc){
        switch(opc){
            case 1:
                B.mostrarArma();
                break;
            case 2:
                C.mostrarArma();
                break;
            case 3:
                P.mostrarArma();
                break;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bomba B = null;
        Cloroformo C = null;
        Pistola P = null;
        String resp;
        int opc;
        resp = pedirRespuesta();
        while(resp.equalsIgnoreCase("SI")){
            opc = menu();
            //Creamos el arma elegida
            switch(opc){
                case 1:
                    B = new Bomba(pedirEntero("Alcance: "), pedirADistancia());
                    break;
                case 2:
                    C = new Cloroformo(pedirEntero("Tiempo efectivo: "));
                    break;
                case 3:
                    P = new Pistola(pedirEntero("Número de balas: "));
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
            mostrarArma(B, C, P, opc);
            resp = pedirRespuesta();
        }
        System.out.println("Armas creadas: "+Arma.getNumArmas());
    }
    
}

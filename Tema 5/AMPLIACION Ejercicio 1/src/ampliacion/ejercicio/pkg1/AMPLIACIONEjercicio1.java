/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ampliacion.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class AMPLIACIONEjercicio1 {
    public static void pregunta(){
        Scanner entrada=new Scanner (System.in);
        int contador=0;
        String respuesta;
        System.out.println("Desea crear un nuevo arma: ");
        respuesta=entrada.nextLine();
        if (respuesta.equalsIgnoreCase("si")) {
            contador++;
            menu();
            
        }
        else{
            System.out.println("Numero de armas creadas: "+contador);
        }
    }
    public static void menu(){
        Scanner teclado = new Scanner(System.in);
        int contador=0;
        int opc;
        System.out.println("Pulsa 1 para crear una bomba");
        System.out.println("Pulsa 2 para crear cloroformo ");
        System.out.println("Pulsa 3 para crear una pistola ");
        System.out.print("Opción: ");
        opc = teclado.nextInt();
        switch(opc){
            case 1:
                Bombas bomba1=new Bombas(30, true, true);
                System.out.println("Has creado una bomba");
                System.out.println("Con un alcance de: "+bomba1.getAlcance());
                break;
            case 2:
                Cloroformo cloroformo1=new Cloroformo(30, true);
                System.out.println("Has creado cloroformo ");
                System.out.println("Con un tiempo de efecto de: "+cloroformo1.getTiempo_efectivo());
                break;
            case 3:
                Pistola pistola1=new Pistola(8, true);
                System.out.println("Has creado una pistola");
                System.out.println("Numero de balas: "+pistola1.getNumBalas());
                break;
            default:
                System.out.println("No has creado nada");
        }
        pregunta();
    }
    public static void main(String[] args) {
        int contador=0;
        pregunta();
    }
    
}

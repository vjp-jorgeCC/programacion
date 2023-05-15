/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01t12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Ejercicio01T12 {

    /* Añade un nuevo contacto a la agenda */
    public static void insertarContacto(ArrayList<Contacto> agenda){
        Scanner tecladoS = new Scanner(System.in);
        Scanner tecladoI = new Scanner(System.in);
        String nombre, telef;
        int edad;
        System.out.println("\nAÑADIR CONTACTO:");
        System.out.print("    Nombre: ");
        nombre = tecladoS.nextLine();
        System.out.print("    Edad: ");
        edad = tecladoI.nextInt();
        System.out.print("    Teléfono: ");
        telef = tecladoS.nextLine();
        agenda.add(new Contacto(nombre, edad, telef));
    }
    
    /* Muestra los contactos de la agenda*/
    public static void mostrarContactos(ArrayList<Contacto> agenda) throws ArrayIndexOutOfBoundsException, NullPointerException {
        Contacto C;
        int i;
        System.out.println("\nLISTANDO CONTACTOS...");
        for(i = 0; i < agenda.size();i++){
            C = agenda.get(i);
            System.out.println("    Nombre: "+C.getNombre());
            System.out.println("    Edad: "+C.getEdad());
            System.out.println("    Teléfono: "+C.getTelefono());
            System.out.print("\n");
        }    
    }
    
    /* Retorna la posición del contacto a buscar */
    public static int buscarPosicionContacto(ArrayList<Contacto> agenda, String telef) throws ArrayIndexOutOfBoundsException, NullPointerException {
        int i = 0;
        boolean enc = false;
        while((i < agenda.size())&&(!enc)){
            //Si telel es igual que el teléfono del contacto almacenado en la posición i
            if  (agenda.get(i).getTelefono().equals(telef)){  
                enc = true;
            }
            else{
                i++;
            }
        }
        return i;
    }
    
    /* Elimina un contacto de la agenda */
    public static void eliminarContacto(ArrayList<Contacto> agenda) throws ArrayIndexOutOfBoundsException{
        Scanner teclado = new Scanner(System.in);
        String telef;
        int pos = 0;
        System.out.println("\nELIMINAR CONTACTO:");
        System.out.println("    Teléfono: ");
        telef = teclado.nextLine();
        /* Control de errores - Buscamos lap posición del contacto que estamos buscando */
        try{
            pos = buscarPosicionContacto(agenda, telef);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error de índice "+e.getMessage());
        }
        catch(NullPointerException npe){
            System.out.println("Acceso a un objeto nulo "+npe.getMessage());
        }
        /* Eliminamos el contacto almacenado en la posición "pos" */
        try{
            agenda.remove(pos);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error de índice "+e.getMessage());
        }
    }
    
    /**/
    public static void insOrden(ArrayList<Contacto> listaOrdenada, Contacto C){
        int i;
        boolean enc;
        //Si la lista está vacía, insertamos el Contacto sin buscar posición
        if  (listaOrdenada.isEmpty()){
            listaOrdenada.add(C);
        }
        else{
            //Si ya hay elementos en la lista, buscamos la posición que le corresponde
            i = 0;
            enc = false;
            while((i < listaOrdenada.size())&&(!enc)){
                //Si encontramos su posición
                if  (C.getEdad() < listaOrdenada.get(i).getEdad()){  
                    enc = true;
                }
                else{
                    i++;
                }
            }
            if  (enc){
                listaOrdenada.add(i, C);
            }
            else{
                listaOrdenada.add(C);
            }
        }
    }
    
    /* Ordena los contactos de la agenda según su edad */
    public static void ordenarContactos(ArrayList<Contacto> agenda){
        ArrayList<Contacto> listaOrdenada = new ArrayList<Contacto>();
        Scanner teclado = new Scanner(System.in);
        Contacto C;
        int edad, pos;
        //Recorremos la agenda
        for(int i = 0;i < agenda.size();i++){
            //Obtenemos el contacto almacenado en la celda i
            C = agenda.get(i);
            //Insertamos el Contacto C en orden dentro de la lista listaOrdenada
            insOrden(listaOrdenada, C);
        }
        //Mostramos la lista ordenada
        try{
            mostrarContactos(listaOrdenada);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error de índice "+e.getMessage());
        }
        catch(NullPointerException npe){
            System.out.println("Acceso a un objeto nulo "+npe.getMessage());
        }

    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Agenda
        ArrayList<Contacto> agenda = new ArrayList<Contacto>();
        int opc;
        do{
            System.out.println("       AGENDA");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Ordenar contactos");
            System.out.println("5. Salir");
            System.out.print("   Opción: ");
            opc = teclado.nextInt();
            switch(opc){
                case 1:
                    insertarContacto(agenda);
                    break;
                case 2:
                    try{
                        mostrarContactos(agenda);
                    }
                    catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("Error de índice "+e.getMessage());
                    }
                    catch(NullPointerException npe){
                        System.out.println("Acceso a un objeto nulo "+npe.getMessage());
                    }
                    break;
                case 3:
                    try{
                        eliminarContacto(agenda);
                    }
                    catch(ArrayIndexOutOfBoundsException e){
                        System.out.println("Error de índice "+e.getMessage());
                    }
                    break;
                case 4:
                    ordenarContactos(agenda);
                    break;
                case 5:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }while(opc != 5);
    }
    
}

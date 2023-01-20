/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2.tema.pkg6;

/**
 *
 * @author jcidc07
 */
public class Ejercicio2Tema6 {
    public static void introducirDatos(int vNum[]){
        int i;
        for (i = 0; i < vNum.length; i++) {
            vNum[i]=i;
        }
    }
    public static void mostrarDatos(int vNum[]){
        int i;
        for (i = 0; i < vNum.length; i++) {
            System.out.println("Celda: "+i+" Numero: "+vNum[i]);
        }
    }
    public static void intercambiarDatos(int vNum[]){
        int aux;
        aux=vNum[2];
        vNum[2]=vNum[4];
        vNum[4]=aux;
    }
    public static void main(String[] args) {
        int[] vNum=new int[7];
        introducirDatos(vNum);
        mostrarDatos(vNum);
        intercambiarDatos(vNum);
        System.out.println("------ INTERCAMBIO DE LA SEGUNDA POSICION POR LA CUARTA POSICION ------");
        mostrarDatos(vNum);
    }
    
}

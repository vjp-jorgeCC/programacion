/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4.tema.pkg6;

/**
 *
 * @author jorge
 */
public class Ejercicio4Tema6 {
    public static void crearVector(int vNum[][]){
        for (int i = 0; i < vNum.length; i++) {
            for (int j = 0; j < vNum[i].length; j++) {
                vNum[i][j] = (int) ((Math.random()*200+100));
            }
            
        }
    }
    public static void mostrarPar(int vNum[][]){
        for (int i = 0; i < vNum.length; i++) {
            for (int j = 0; j < vNum[i].length; j++) {
                if ((vNum[i][j]%2)==0) {
                    System.out.println("Fila: "+i+" Columna: "+j+" Numero: "+vNum[i][j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] vNum=new int[4][3];
        crearVector(vNum);
        mostrarPar(vNum);        
    }
    
}

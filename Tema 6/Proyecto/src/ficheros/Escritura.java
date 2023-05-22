/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import generico.CentralNuclear;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import personajes.Minero;
import personajes.Robot;

public class Escritura {

    public static String generarNombreFichero(String prefijo, LocalDate fechaEjecucion, String extension) {
        int nombreMes = LocalDate.now().getDayOfMonth();
        String nombreFichero = String.format("%s_%02d%s%s", prefijo, fechaEjecucion.getDayOfMonth(), nombreMes, extension);
        return nombreFichero;
    }

    public static FileWriter abrirFlujoFW(String nombreFicheroLog) throws IOException {
        return new FileWriter(nombreFicheroLog, true);
    }

    public static PrintWriter abrirFlujoPW(String nombreFicheroLog, FileWriter fw) throws IOException {
        return new PrintWriter(new BufferedWriter(new FileWriter(nombreFicheroLog, true)));
    }

    public static void cerrarFlujos(FileWriter fw, PrintWriter pw) throws IOException {
        if (fw != null) {
            fw.close();
        }
        if (pw != null) {
            pw.close();
        }
    }

    public static void escribirInformesEnFicheroLog() throws IOException {
        String prefijo = "informes";
        String extension = ".log";
        String nombreFichero = generarNombreFichero(prefijo, LocalDate.MIN, extension);
        FileWriter fw = abrirFlujoFW(nombreFichero);
        PrintWriter pw = abrirFlujoPW(nombreFichero,fw);
        CentralNuclear central = CentralNuclear.getInstancia();
        //CELDAS REFRIGERADAS
        central.mostrarCeldasRefrigeradas(pw);
        cerrarFlujos(fw, pw);
        //KILOS MINEROS
        FileWriter fwm = abrirFlujoFW(nombreFichero);
        PrintWriter pwm = abrirFlujoPW(nombreFichero,fw);
        for (int i = 0; i < central.getlPersonajes().size(); i++) {
            if (central.getlPersonajes().get(i) instanceof Minero) {
                Minero mineroaux = (Minero) central.getlPersonajes().get(i);
                mineroaux.mostrarEscombrosRecogidos(pwm);
                cerrarFlujos(fwm,pwm);
            }
        }
        //VISITADAS POR ROBOTS
        FileWriter fwe = abrirFlujoFW(nombreFichero);
        PrintWriter pwe = abrirFlujoPW(nombreFichero,fw);
        pwe.println(generico.Constantes.INFORMEROBOTS);
        cerrarFlujos(fwe,pwe);
        for (int i = 0; i < central.getlPersonajes().size(); i++) {
            if (central.getlPersonajes().get(i) instanceof Robot) {
                FileWriter fwr = abrirFlujoFW(nombreFichero);
                PrintWriter pwr = abrirFlujoPW(nombreFichero,fw);
                Robot robotaux = (Robot) central.getlPersonajes().get(i);
                robotaux.mostrarCeldasVisitadas(pwr);
                cerrarFlujos(fwr,pwr);
            }
        }
    }

}

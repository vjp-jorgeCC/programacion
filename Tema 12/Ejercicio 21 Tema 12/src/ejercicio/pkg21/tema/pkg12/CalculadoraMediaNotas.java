/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg21.tema.pkg12;

/**
 *
 * @author jcidc07
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CalculadoraMediaNotas {
    public static void main(String[] args) throws FileNotFoundException {
        // Solicitar al usuario las notas y guardarlas en un archivo
        guardarNotasEnArchivo();

        // Leer el archivo y calcular la nota media del curso
        double media = calcularNotaMedia();
        System.out.println("La nota media del curso es: " + media);
    }

    private static void guardarNotasEnArchivo() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("notas.txt"));

            Scanner scanner = new Scanner(System.in);

            for (int i = 1; i <= 6; i++) {
                System.out.print("Introduce la nota de la asignatura " + i + ": ");
                String nombreAsignatura = "Asignatura " + i;
                double nota = obtenerNotaValida(scanner);

                // Escribir en el archivo
                bw.write(nombreAsignatura + "," + nota);
                bw.newLine();
            }

            bw.close();
            System.out.println("Las notas se han guardado en el archivo 'notas.txt'.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
        }
    }

    private static double obtenerNotaValida(Scanner scanner) {
        double nota = -1;

        while (nota < 0 || nota > 10) {
            System.out.print("Introduce una nota válida (entre 0 y 10): ");
            String input = scanner.nextLine();

            try {
                nota = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                nota = -1;
            }
        }

        return nota;
    }

    private static double calcularNotaMedia() throws FileNotFoundException {
    double sumaNotas = 0;
    int contadorNotas = 0;

    Scanner scanner = new Scanner(new File("notas.txt"));
    while (scanner.hasNextLine()) {
        String linea = scanner.nextLine();
        String[] partes = linea.split(",");
        
        if (partes.length == 2) {
            double nota = Double.parseDouble(partes[1]);
            sumaNotas += nota;
            contadorNotas++;
        }
    }
    scanner.close();

    if (contadorNotas > 0) {
        return sumaNotas / contadorNotas;
    } else {
        return 0;
    }
}

}


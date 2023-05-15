/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg24.tema.pkg12;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jcidc07
 */
public class SueldoEmpleados {
    private static final String FILE_NAME = "empleados.txt";

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        List<Empleado> empleados = leerEmpleadosDesdeArchivo();
        String opc;
        do {
            agregarEmpleado(empleados);
            System.out.println("¿Quieres introducir otro empleado?");
            opc = entrada.nextLine();
        } while (opc.equalsIgnoreCase("si"));
        
        guardarEmpleadosEnArchivo(empleados);
        calcularSueldoBruto(empleados);
    }

    private static List<Empleado> leerEmpleadosDesdeArchivo() {
        List<Empleado> empleados = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] empleadoData = line.split(",");
                Empleado empleado = new Empleado();
                empleado.setNombre(empleadoData[0]);
                empleado.setHorasTrabajadas(Integer.parseInt(empleadoData[1]));
                empleado.setTarifa(Double.parseDouble(empleadoData[2]));
                empleados.add(empleado);
            }
        } catch (IOException e) {
            // Si el archivo no existe, se crea uno vacío
        }
        return empleados;
    }

    private static void agregarEmpleado(List<Empleado> empleados) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Tarifa por hora: ");
        double tarifa = scanner.nextDouble();

        Empleado empleado = new Empleado();
        empleado.setNombre(nombre);
        empleado.setHorasTrabajadas(horasTrabajadas);
        empleado.setTarifa(tarifa);

        empleados.add(empleado);
    }

    private static void guardarEmpleadosEnArchivo(List<Empleado> empleados) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            for (Empleado empleado : empleados) {
                bw.write(empleado.getNombre() + "," + empleado.getHorasTrabajadas() + "," + empleado.getTarifa());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void calcularSueldoBruto(List<Empleado> empleados) {
    for (Empleado empleado : empleados) {
        int horasTrabajadas = empleado.getHorasTrabajadas();
        double tarifa = empleado.getTarifa();

        double sueldoBruto;
        if (horasTrabajadas <= 40) {
            sueldoBruto = horasTrabajadas * tarifa;
        } else {
            int horasNormales = 40;
            int horasExtras = horasTrabajadas - horasNormales;
            sueldoBruto = (horasNormales * tarifa) + (horasExtras * tarifa * 1.5);
        }

        System.out.println(empleado.getNombre() + " trabajó " + empleado.getHorasTrabajadas() +
                " horas, cobra " + empleado.getTarifa() + " euros la hora, por lo que le corresponde un sueldo de " +
                sueldoBruto + " euros.");
    }
}
}

package net.salesianos.actividades;

import java.io.*;
import java.util.ArrayList; //Lo necesitamos para la lista de mesas
import java.util.List; // Interface de listas
import java.util.Scanner;
import net.salesianos.modelos.*;

public class Actividad4 {
    private static final String FICHERO_MESAS = "mesas.txt"; // Cambia el archivo a formato .txt

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Mesas ---");
            System.out.println("1. Nueva mesa");
            System.out.println("2. Mostrar todas las mesas"); // Opción para ver todas las mesas guardadas
            System.out.println("3. Salir"); // Salir del programa
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1 -> {

                    System.out.print("Introduce el color de la mesa: ");
                    String color = scanner.nextLine();
                    System.out.print("Introduce el número de patas: ");
                    int patas = scanner.nextInt();
                    scanner.nextLine(); // Limpia el bufferrrrrrr
                    Mesa nuevaMesa = new Mesa(color, patas);
                    guardarMesa(nuevaMesa); // Guardamos la mesa en el archivo
                }
                case 2 -> {
                    List<Mesa> mesas = obtenerMesas(); // Recuperamos todas las mesas desde el archivo
                    if (mesas.isEmpty()) {
                        System.out.println("No hay mesas guardadas.");
                    } else {
                        mesas.forEach(System.out::println);
                    }
                }
                case 3 -> System.out.println("Adiós, que tus mesas sean estables. Guapo"); // Goodbye
                default -> System.out.println("Opción inválida, inténtalo de nuevo. Feo"); // Bad way
            }
        } while (opcion != 3);

        scanner.close(); // Cerramos el scanner para evitar fugas de memoria
    }

    private static void guardarMesa(Mesa mesa) {
        try (FileWriter fw = new FileWriter(FICHERO_MESAS, true); // Se usa `FileWriter` para escribir en el archivo
                                                                  // .txt
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw)) {

            pw.println(mesa.getColor() + "," + mesa.getNumPatas());
            System.out.println("Mesa guardada correctamente.");

        } catch (IOException e) {
            System.out.println("Error al guardar la mesa: " + e.getMessage());
        }
    }

    private static List<Mesa> obtenerMesas() {
        List<Mesa> mesas = new ArrayList<>();
        File fichero = new File(FICHERO_MESAS);

        if (!fichero.exists()) {
            return mesas;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(FICHERO_MESAS))) { //
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(","); // Separamos con comillas los colores
                String color = datos[0];
                int numPatas = Integer.parseInt(datos[1]);
                mesas.add(new Mesa(color, numPatas));
            }
        } catch (IOException e) {
            System.out.println("Error al leer las mesas: " + e.getMessage());
        }

        return mesas; // Retorna la lista de mesas recuperadas
    }
}
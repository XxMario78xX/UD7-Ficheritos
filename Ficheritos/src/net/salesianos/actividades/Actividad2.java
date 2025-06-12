package net.salesianos.actividades;

import java.io.BufferedReader; // Permite leer textos de una fuente de entrada (Como un archivo)
import java.io.FileReader; // Lo mismo que BufferedReader, pero sin optimización (Menos eficiente)
import java.io.FileWriter; // Nos permite escribir en un archivo
import java.io.IOException; // Maneja errores cuando trabajamos con archivos

public class Actividad2 {
    public static void main(String[] args) {
        String ficheroOrigen = "ficheroActividad1.txt"; // Archivo que vamos a leer
        String ficheroDestino = "ficheroActividad2.txt"; // Archivo nuevo que vamos a crear

        try (BufferedReader br = new BufferedReader(new FileReader(ficheroOrigen));
                FileWriter fw = new FileWriter(ficheroDestino)) {

            // Hola, soy BufferedReader y mejoro lo que el FileReader no puede hacer, de
            // forma optimizada
            int c; // <------- Almacena el código ASCII de cada carácter del fichero
            StringBuilder salida = new StringBuilder(); // StringBuilder para construir la salida final

            while ((c = br.read()) != -1) {
                // Lee carácter por carácter hasta llegar al final (-1 indica fin de archivo)
                char ch = (char) c; // Convierte el número ASCII a su carácter correspondiente
                salida.append(ch).append("_").append((int) ch).append(", ");
            }

            // Si lo último fue coma y espacio, lo eliminamos uwu
            if (salida.length() >= 2) {
                salida.setLength(salida.length() - 2);
            }

            System.out.println("Vale, vamoh a crear el archivo\n" + salida.toString());

            // Escribir la salida en `ficheroActividad2.txt`
            fw.write(salida.toString());
            System.out.println("Archivo " + ficheroDestino + " creado con exito mister " + ficheroOrigen);

        } catch (IOException e) {
            System.out.println("Brother, y si primero pruebas a crear un fichero que se llame " + ficheroOrigen + "? "
                    + e.getMessage());
        }
    }
}
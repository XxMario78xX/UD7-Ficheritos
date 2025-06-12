package net.salesianos.actividades;

import java.io.BufferedReader; // Permite leer textos de una funete de entrada (Como por ejemplo un archivo)
import java.io.FileReader; // Lo mismo que el Buffered, pero sin optimización. Es decir, es menos eficiente
import java.io.IOException;

public class Actividad2 {
    public static void main(String[] args) {
        String nombreFichero = "ficheroActividad2.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(nombreFichero))) {

            // Abre el fichero en modo lectura con el File Reader, peeeero, como funciona
            // medio medio, se usa también este de abajo
            // Hola, soy BufferedReader y mejoro lo que el de arriba no puede hacer, de
            // forma optimizada

            int c; // <------- Esta cosita almacena el código ASCII de cada carácter del ficehero
                   // creado con anterioridad
            StringBuilder salida = new StringBuilder(); // Stringbuilder es para que lea el espacio y las comas, por lo
                                                        // que tengo entendido

            while ((c = br.read()) != -1) {
                // Lee todo el fichero hasta el final, que es el -1 ese. Porque el 0 es el
                // primer carácter

                char ch = (char) c; // Volvemos a usar la "C", pero esta vez, sirve para convertir el caracter en su
                                    // ASCII correspondiente
                salida.append(ch).append("_").append((int) ch).append(", ");
            }

            // Y si eres tan listo de que lo último fue coma o espacio, esto lo elimina uwu
            if (salida.length() >= 2) {
                salida.setLength(salida.length() - 2);
            }
            System.out.println(salida.toString());
        } catch (IOException e) {
            System.out.println("Brother, y si primero pruebas a crear un fichero que se llame " + nombreFichero + "? " + e.getMessage());
        }
    }
}

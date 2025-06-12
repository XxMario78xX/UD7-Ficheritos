package net.salesianos.actividades;

import java.io.IOException;
import java.nio.file.Files; // Permite leer/escribir archivos
import java.nio.file.Paths; // Facilita el manejo de rutas de archivos

public class Actividad3 {
    public static void main(String[] args) {
        String fichero1 = "ficheroActividad1.txt";
        String fichero2 = "ficheroActividad2.txt";
        String ficheroFusion = "ficheroFusion.txt"; // Archivo donde se guardará la fusión papá

        try {
            // Lee los contenios
            String contenido1 = new String(Files.readAllBytes(Paths.get(fichero1)));
            String contenido2 = new String(Files.readAllBytes(Paths.get(fichero2)));

            // Generar el contenio
            StringBuilder sb = new StringBuilder();
            sb.append("- Contenido del Fichero Uno: ").append(contenido1).append("\n");
            sb.append("- Contenido del Fichero Dos: ").append(contenido2).append("\n");
            sb.append("\nQue?, flipando, no?"); // NUEVO: Agrega el mensaje de firma

            // Guardar el contenio
            Files.write(Paths.get(ficheroFusion), sb.toString().getBytes());

            System.out.println("\n🔥🔥🔥 Fusión completada diablaso, paresemos el madafocking gogeta 🔥🔥🔥");
            System.out.println("Archivo " + ficheroFusion
                    + " creado Exitosamente, la fusión más poderosa del mundo mundial papa.");
            System.out.println("Contenido del archivo fusionado:\n" + sb.toString());

        } catch (IOException e) {
            System.out.println("ALGO HICISTE MAL. Revisa que " + fichero1 + " y " + fichero2
                    + " existan, no me seas tolete: " + e.getMessage());
        }
    }
}

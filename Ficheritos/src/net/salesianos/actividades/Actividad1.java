package net.salesianos.actividades;

import java.io.FileWriter; //Bibliotec que permite escribir unos caracteriños en un archivo de textiño
import java.io.IOException; //Como su propio nombre indica, por si ocurre algún error en le codigo
import java.util.Scanner; // <------ el escaner de toda la vida, lo que ponga el usuario

public class Actividad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;
        int minCaracteres = 30;

        // Te pide que escribas con la condición de los caracteres, y si no, sallta
        // error
        do {
            System.out.println("Introduce un texto (mínimo 30 caracteres(Cara antorcha)):");
            texto = scanner.nextLine();
            if (texto.length() < minCaracteres) {
                System.out.println("Te faltaron " + (minCaracteres - texto.length()) + " caracteres. Cenutrio");
            }
        } while (texto.length() < minCaracteres);

        // Pasar las mayus y reemplazar espacios por '_' (Lo busqué en los apuntes)
        texto = texto.toUpperCase().replace(' ', '_');

        // Escribir el texto formateado en un fichero ------> FileWriter
        try (FileWriter fw = new FileWriter("ficheroActividad1.txt")) { // Para cocinar el siguiente ejercicio
            fw.write(texto);
            System.out.println("Texto guardado correctamente en el fichero mi hermanito, felicidades.");
        } catch (IOException e) {
            e.printStackTrace();
            // Esto permite lanzar imprimir detalles sobre una excepción cuando ocurra un
            // error en el programa (Las cosas como son, nunca dijiste
            // Que no podríamos usar esto para darnos pistitas del código, Adri te quiero.)
        }

        scanner.close();
    }
}

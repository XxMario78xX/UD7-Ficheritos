package net.salesianos.modelos;

import java.io.Serializable; // Permite que los objetos sean guardados en archivos

public class Mesa implements Serializable {
    private static final long serialVersionUID = 1L; // Identificador para evitar errores al recuperar datos

    private final String color;
    private final int numPatas;

    public Mesa(String color, int numPatas) {
        this.color = color;
        this.numPatas = numPatas;
    }

    @Override
    public String toString() {
        return "Mesa de color " + color.toUpperCase() + " con " + numPatas + " patas";
    }

    public String getColor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getColor'");
    }

    public String getNumPatas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNumPatas'");
    }
}
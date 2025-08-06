/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Daniel
 */
public class Documento {
    private String titulo;
    private String contenido;
    private String fuenteOrigen;

    public Documento(String titulo, String contenido, String fuenteOrigen) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fuenteOrigen = fuenteOrigen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public String getFuenteOrigen() {
        return fuenteOrigen;
    }

    @Override
    public String toString() {
        return "[" + fuenteOrigen + "] " + titulo + ": " + contenido;
    }
}
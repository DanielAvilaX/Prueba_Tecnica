/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Daniel
 */
import java.util.*;

public class FuenteArchivo implements FuenteDatos {
    @Override
    public List<Documento> obtenerDocumentos() {
        System.out.println("Obteniendo documentos desde archivo...");
        List<Documento> documentos = new ArrayList<>();
        documentos.add(new Documento("Archivo1", "Contenido archivo 1", "Archivo"));
        documentos.add(new Documento("Archivo2", "Contenido archivo 2", "Archivo"));
        return documentos;
    }
}
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

public class FuenteBaseDatos implements FuenteDatos {
    @Override
    public List<Documento> obtenerDocumentos() {
        System.out.println("Obteniendo documentos desde base de datos...");
        List<Documento> documentos = new ArrayList<>();
        documentos.add(new Documento("DB1", "Contenido base datos 1", "BaseDatos"));
        documentos.add(new Documento("DB2", "Contenido base datos 2", "BaseDatos"));
        return documentos;
    }
}
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

public class FuenteWeb implements FuenteDatos {
    @Override
    public List<Documento> obtenerDocumentos() {
        System.out.println("Obteniendo documentos desde web...");
        List<Documento> documentos = new ArrayList<>();
        documentos.add(new Documento("Web1", "Contenido web 1", "Web"));
        return documentos;
    }
}
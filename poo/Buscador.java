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

public class Buscador {
    public List<Documento> buscar(List<Documento> documentos, String Termino) {
        System.out.println("Buscando termino: " + Termino + " en " + documentos.size() + " documentos");
        return documentos.subList(0, Math.min(2, documentos.size()));
    }
}
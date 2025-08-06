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

public class SalidaDashboard implements Salida {
    @Override
    public void mostrar(List<Documento> documentos) {
        System.out.println("Mostrando resultados en el dashboard:");
        for (Documento doc : documentos) {
            System.out.println(doc);
        }
    }
}

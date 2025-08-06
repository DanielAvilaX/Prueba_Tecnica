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

public class App {
    public static void main(String[] args) {

        List<FuenteDatos> fuentes = new ArrayList<>();
        fuentes.add(new FuenteArchivo());
        fuentes.add(new FuenteWeb());
        fuentes.add(new FuenteBaseDatos());

        List<Documento> todosLosDocumentos = new ArrayList<>();
        for (FuenteDatos fuente : fuentes) {
            todosLosDocumentos.addAll(fuente.obtenerDocumentos());
        }


        Buscador buscador = new Buscador();
        List<Documento> resultados = buscador.buscar(todosLosDocumentos, "ejemplo");


        Salida salida1 = new SalidaSearchUI();
        Salida salida2 = new SalidaDashboard();

        salida1.mostrar(resultados);
        salida2.mostrar(resultados);
    }
}

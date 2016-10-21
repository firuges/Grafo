/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrafoEjemplo;

import Lista.ListaSimpleGeneric;
import Lista.NodoListaSimple;
import GrafoEjemplo.Vertice;

/**
 *
 * @author Maxi
 */
public class GrafoEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        nuevoGrafo();
        
        
    }
    /*public static void nuevoGrafo(){
        Grafo elGrafo = new Grafo();
        elGrafo.aeropuertos = new ListaSimpleGeneric[5];
        Vertice puerto = new Vertice("Miami");
        
        elGrafo.agregarVertice(elGrafo, puerto);
    }*/
    public static void nuevoGrafo(){
        Grafo elGrafo = new Grafo(4);
        Vertice puerto = new Vertice("Miami");
        Vertice puerto2 = new Vertice("Miami");
        elGrafo.agregarVertice(elGrafo, puerto);
        elGrafo.agregarVertice(elGrafo, puerto2);
    }
}

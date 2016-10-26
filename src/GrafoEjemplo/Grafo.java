/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrafoEjemplo;

import Lista.ListaSimpleGeneric;
import Lista.NodoListaSimple;

/**
 *
 * @author Maxi
 */
public class Grafo {
    public NodoListaSimple[] ListaAdyacencia;
    public NodoListaSimple[] ListaAristas;
    private int nroAristas;
    public Grafo(int cant){
        ListaAdyacencia = new NodoListaSimple [cant];
        for(int i = 0; i < ListaAdyacencia.length;i++){
			for (int j = 0; j < ListaAdyacencia.length; j++){
                                Vertice unAeropuerto = new Vertice();
				ListaAdyacencia[i] = new NodoListaSimple(unAeropuerto);
			}
		}
    }
    public void agregarVertice(Grafo g, Vertice v){
        if(!existeVertice(v)){
            for (int i = 0; i < ListaAdyacencia.length; i++) {
                Vertice elVertice = (Vertice)ListaAdyacencia[i].getDato();
                if (elVertice.getNombAeropuerto() == null) { // si el vertice esta vacio
                    elVertice.setNombAeropuerto(v.getNombAeropuerto());
                    ListaAdyacencia[i].setDato(elVertice);
                    System.out.println("Se agrego Correctamente tu Aeropuerto: " + String.valueOf(ListaAdyacencia[i].getDato())  );
                    break;
                }
            }
        }else{
            System.out.println("El Vertice que has intentado agregar ya Existe!");
                
         }
        
        
    }
    
    public  void agregarArista(Grafo g, Arista a){
        
    }
    public void borrarVertice(Grafo g, Vertice v){
        
    }
    
    public  boolean borrarArista(Grafo g, Arista a){
        return true;
    }
    public  Boolean esVacio(Grafo g){
        return true;
    }
    public  NodoListaSimple[] VerticesAdyacentes(Grafo g, Vertice v){
        return ListaAdyacencia;
       
    }
    public static Boolean sonAdyacentes(Vertice a, Vertice b){
        return true;
    }
    public  Boolean existeVertice (Vertice v){
        for(int i = 0; i < ListaAdyacencia.length; i++){
            Vertice aux = (Vertice)ListaAdyacencia[i].getDato();
            if(aux.getNombAeropuerto()!= null)
                if(aux.getNombAeropuerto().equals(v.getNombAeropuerto()))
                    return true;
            else
                    return false;
        }
        return false;
    }
}
/**/
/*
private final int MAX_VERTICES;
    private final int MAX_ARISTAS;
    private int nroAristas;
    private int grafo[][];
	
	//Crea un grafo vacío, con un máximo numero de vertices y aristas
public Grafo(int nroVertices, int  nroAristas){
		MAX_VERTICES = nroVertices;
		MAX_ARISTAS = nroAristas;
		
		this.nroAristas = 0;
		
		grafo = new int[MAX_VERTICES][MAX_VERTICES];
		
		for(int i = 0; i < getMAX_VERTICES();i++){
			for (int j = 0; j < getMAX_VERTICES(); j++){
                                ListaSimpleGeneric lista = new ListaSimpleGeneric();
				grafo[i][j] = 0;
			}
		}
	}
	
	//Crea un grafo vacío, con un máximo número de vertices, y 
	//vertices al cuadrado como número máximo de aristas.
	public Grafo(int nroVertices){
		//Llamada al constructor con dos argumentos
		this(nroVertices, nroVertices);
	}
	
	//Crea un grafo vacío con un máximo número de vertices = 5
	//y máximo numero de aristas = 25.
	public Grafo(){
		//Llamada al constructor con dos argumentos
		this(5,25);
	}

	public int getMAX_VERTICES()
	{
		return MAX_VERTICES;
	}

	public int getMAX_ARISTAS()
	{
		return MAX_ARISTAS;
	}
	
	//Inserta una arista entre dirigida del vertice v1 al vertice v2
	public void insertaArista(int v1, int v2)
				throws ArrayIndexOutOfBoundsException, UnsupportedOperationException
	{
		if(v1 >= MAX_VERTICES || v2 >= MAX_VERTICES){ 
			throw new ArrayIndexOutOfBoundsException("Vertices inválidos, fuera de rango"+
					"\nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
		}
		else if(nroAristas == MAX_ARISTAS){
			throw new UnsupportedOperationException("No se puede añadir más aristas");
		}		
		else{
			grafo[v1][v2] = 1;
		}
	}
	
	//Retorna verdadero si existe una arista dirigida entre los vertices v1 y v2
	public boolean existeArista(int v1, int v2){
		if(v1 >= MAX_VERTICES || v2 >= MAX_VERTICES){ 
			throw new ArrayIndexOutOfBoundsException("Vertices inválidos, fuera de rango"+
					"\nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
		}
		else if(grafo[v1][v2] == 1){
			return true;
		}		
		return false;
	}
	
	//Elimina la arista entre los vertices v1 y v2
	public void eliminaArista(int v1, int v2){
		if(v1 >= MAX_VERTICES || v2 >= MAX_VERTICES){ 
			throw new ArrayIndexOutOfBoundsException("Vertices inválidos, fuera de rango"+
					"\nRango de vertices: 0 - " + (getMAX_VERTICES() - 1));
		}
		else if(grafo[v1][v2] == 0){
			System.err.println("La arista NO existe");
		}
		else{
			grafo[v1][v2] = 0;
		}
	}
	
	//Elimina todas las aristas. Se llena toda la matriz de ceros
	public void liberaGrafo(){
		for(int i = 0; i < grafo.length; i++){
			for(int j = 0; j < grafo[i].length; j++){
				grafo[i][j] = 0;
			}
		}
	}
	
	public void mostrarGrafo(){
		System.out.print(" ");
		for(int i = 0; i < MAX_VERTICES; i++)
		{
			System.out.printf("  %3d", i);
		}
		System.out.println();
		for( int i = 0; i < MAX_VERTICES; i++){
			System.out.printf(" %3d", i);
			for(int j = 0; j < MAX_VERTICES; j++){
				System.out.printf(" %3d" ,grafo[i][j]);
			}
			System.out.println();
		}
	}
	
//   ----- Operaciones para obtener Lista de Adyacencia -----   //
	
	//Verifica si un grafo tiene vertices adyacentes o no
	public boolean ListaAdyVacia(int v)
	{
		int aux  = 0;
		boolean listaVacia = true;
		
		while(aux < MAX_VERTICES && listaVacia){
			if(grafo[v][aux] == 1){
				listaVacia = false;
			}
			else{
				aux = aux + 1;
			}
		}
		
		return listaVacia;
	}
	
	//Devuelve el primer vertice adyacente al vertice v
	public int primeroListaAdy(int v)
			   throws RuntimeException
	{
		int aux = 0;
		boolean listaVacia = true;
		
		while(aux < MAX_VERTICES && listaVacia){
			if(grafo[v][aux] == 1)
			{
				listaVacia = false;
			}
			else
			{
				aux = aux + 1;
			}
		}
		
		if(aux == MAX_VERTICES) throw new RuntimeException("La lista de Adyacencia esta vacía");
		return aux;
	}
	//Retorna el siguiente adyacente, retorna -1 si no hay más adyacentes
	public int proxAdy(int v, int ady){
		int prox = ady + 1;
		while(prox < MAX_VERTICES && grafo[v][prox] == 0){
			prox = prox + 1;
		}
		if(prox == MAX_VERTICES)return -1;
		return prox;
	}	
//   ----- Fin de Operaciones para obtener Lista de Adyacencia -----   //
	*/

package GrafoEjemplo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxi
 */
public class Vertice {
    private String nombAeropuerto;
    public Vertice(String pAeropuerto){
        this.nombAeropuerto = pAeropuerto;
    }

    public Vertice() {
        this.nombAeropuerto = null;
    }

    /**
     * @return the nombAeropuerto
     */
    public String getNombAeropuerto() {
        return nombAeropuerto;
    }

    /**
     * @param nombAeropuerto the nombAeropuerto to set
     */
    public void setNombAeropuerto(String nombAeropuerto) {
        this.nombAeropuerto = nombAeropuerto;
    }
    @Override
    public String toString(){
        return this.nombAeropuerto;
    }
}

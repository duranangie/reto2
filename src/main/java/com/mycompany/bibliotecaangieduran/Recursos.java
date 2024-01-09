/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecaangieduran;

/**
 *
 * @author user
 */
public class Recursos {

    private int id;
    private String tituloRecurso;
    private boolean disponible;

    public Recursos(int id, String tituloRecurso, boolean disponible) {
        this.id = id;
        this.tituloRecurso = tituloRecurso;
        this.disponible = disponible;
    }
    
    
    
     public void marcarPrestado(){
        this.disponible = false;
    }

    public void marcarDevuelto(){
        this.disponible = true; 
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTituloRecurso() {
        return tituloRecurso;
    }

    public void setTituloRecurso(String tituloRecurso) {
        this.tituloRecurso = tituloRecurso;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
}

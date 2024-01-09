/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.bibliotecaangieduran;

import java.util.ArrayList;

/**
 *
 * @author user
 */
interface interBiblioteca {
    
    
public class Biblioteca implements interBiblioteca {

    private ArrayList<Recursos> recursosDisponible;
    private ArrayList<Recursos> recursosNoDisponible;
    

    public Biblioteca() {
        this.recursosDisponible = new ArrayList<>();
        this.recursosNoDisponible = new ArrayList<>();
    }

    void agregarRecursos(Recursos recursos) {
        recursosDisponible.add(recursos);
       
    }

    public void prestarRecursos(int id) {

    }

    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles en biblioteca: ");
        for (Recursos recursos : recursosDisponible) {
            System.out.println(recursos.getTituloRecurso());
                    
        }

    }

    public Recursos buscarRecursosTitulo(String titulo) {
        for (Recursos recursos : recursosDisponible) {
            if (recursos.getTituloRecurso().equals(titulo)) {
                System.out.println("el libro " +titulo+ " se encuentra en la biblioteca " );
                
                return recursos;
            }
        }
        return null;
    }
    
    
    public void solicitarPrestamo(Recursos recursos){
        if(recursos.isDisponible()){
            recursos.marcarPrestado();
            recursosNoDisponible.add(recursos);
            System.out.println("Se ha tomado el prestado el libro " + recursos.getTituloRecurso()+".");
        }else{
            System.out.println("Lo lamento este libro / revista no esta disponible");
        }
    }

}
}

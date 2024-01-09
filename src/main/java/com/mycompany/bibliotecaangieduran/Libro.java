/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecaangieduran;

/**
 *
 * @author user
 */
public class Libro extends Recursos{
    private String autor;

    public Libro(String autor, int id, String tituloRecurso, boolean disponible) {
        super(id, tituloRecurso, disponible);
        this.autor = autor;
    }

    }
    


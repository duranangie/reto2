/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecaangieduran;

/**
 *
 * @author user
 */
public class Revista extends Recursos{
    private int numero;
    private tiposRevistas tipo;

    public Revista(int numero, tiposRevistas tipo, int id, String tituloRecurso, boolean disponible) {
        super(id, tituloRecurso, disponible);
        this.numero = numero;
        this.tipo = tipo;
    }

        
        
    }


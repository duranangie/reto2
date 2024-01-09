/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bibliotecaangieduran;

import com.mycompany.bibliotecaangieduran.interBiblioteca.Biblioteca;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {

        //guardarRecursos
        Libro libr1 = new Libro("Oscar Wilde", 1, "El retrato de Dorian gray", true);
        Libro libr2 = new Libro("Jane Austen", 2, "Sentido y sensibilidad", true);

        Revista rev1 = new Revista(3, tiposRevistas.RevMedica, 4, "el cuerpo humano", true);
        Revista rev2 = new Revista(4, tiposRevistas.revBabys, 5, "Baby's don't cry", true);

        
        //agregar 
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarRecursos(libr1);
        biblioteca.agregarRecursos(libr2);
        biblioteca.agregarRecursos(rev1);
        biblioteca.agregarRecursos(rev2);
        
        
        
        
        //mostrar libros por titulo disponibles
      
       biblioteca.buscarRecursosTitulo("El retrato de Dorian gray");
 
       biblioteca.buscarRecursosTitulo("Baby's don't cry");
    
       
       //libro no diponible en biblioteca
    
       biblioteca.buscarRecursosTitulo("Babys don't cry");
       
       
       
       //solicitar prestamo
       
        Libro libroPrestamo = (Libro) biblioteca.buscarRecursosTitulo("Sentido y sensibilidad");
        biblioteca.solicitarPrestamo(libroPrestamo);
    
      //solicitar prestamoRevista
        Revista RevistaPrestamo = (Revista) biblioteca.buscarRecursosTitulo("el cuerpo humano");
        biblioteca.solicitarPrestamo(RevistaPrestamo);
      
    }
}

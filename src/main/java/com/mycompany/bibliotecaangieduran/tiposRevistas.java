/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecaangieduran;

/**
 *
 * @author user
 */
public enum tiposRevistas {
    
 RevMedica("medicina") , revConvenciona("Convencional"), revBabys("maternidad"), revInformaticas("Informatica"), revFarandula("famosos"),revCientifica("ciencia e inovacion");

    
private String Descripcion;

    private tiposRevistas(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getDescripcion() {
        return Descripcion;
    }
    
}
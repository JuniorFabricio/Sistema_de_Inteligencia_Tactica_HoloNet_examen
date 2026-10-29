/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistema_de_inteligencia_tactica_holonet_examen.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 *
 * @author jfabr
 */
@Entity
@DiscriminatorValue("DESTRUCTOR")
public class DestructorEstelar extends Nave 
{
    
@Column(name = "capacidad_escudos")
    private Integer capacidadEscudos;

    public DestructorEstelar() 
    {
    }

    public DestructorEstelar(String nombre, String modelo, String estadoSistema, Integer capacidadEscudos) {
        super(nombre, modelo, estadoSistema);
        this.capacidadEscudos = capacidadEscudos;
    }

    public Integer getCapacidadEscudos() 
    {
        return capacidadEscudos; 
    }
    public void setCapacidadEscudos(Integer capacidadEscudos) 
    {
        this.capacidadEscudos = capacidadEscudos; 
    }




}

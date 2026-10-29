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
@DiscriminatorValue("CAZA")
public class CazaLigero extends Nave
{
    @Column(name = "potencia_fuego")
    private Integer potenciaFuego;

    public CazaLigero() {}

    public CazaLigero(String nombre, String modelo, String estadoSistema, Integer potenciaFuego) {
        super(nombre, modelo, estadoSistema);
        this.potenciaFuego = potenciaFuego;
    }

    public Integer getPotenciaFuego() 
    { 
        return potenciaFuego; 
    }
    public void setPotenciaFuego(Integer potenciaFuego) 
    { 
        this.potenciaFuego = potenciaFuego; 
    }
}

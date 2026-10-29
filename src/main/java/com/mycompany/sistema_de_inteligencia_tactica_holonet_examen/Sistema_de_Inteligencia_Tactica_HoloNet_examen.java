/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema_de_inteligencia_tactica_holonet_examen;

import com.mycompany.sistema_de_inteligencia_tactica_holonet_examen.Controller.HoloNetControl;
import com.mycompany.sistema_de_inteligencia_tactica_holonet_examen.modelos.CazaLigero;
import com.mycompany.sistema_de_inteligencia_tactica_holonet_examen.modelos.Nave;
import java.util.List;

/**
 *
 * @author jfabr
 */
public class Sistema_de_Inteligencia_Tactica_HoloNet_examen {

    public static void main(String[] args) {
        HoloNetControl con = new HoloNetControl();
        
        System.out.println("=== Cazas Operativos por Bando (Imperio) ===");
        List<CazaLigero> cazas = con.obtenerCazasOperativosPorBando("Imperio");
        
        for (CazaLigero c : cazas) 
        {
            
            System.out.println("-> Caza: "+c.getNombre()+"| Modelo: "+c.getNombre()+"| Potencia de Fuego "+ c.getPotenciaFuego());
        
        }
        
        System.out.println("===Flota en Estado Crítico (FETCH JOIN) ===");
        
        List<Nave> flotaCritica=con.obtenerFlotaCriticaPolimorfica();
        
        
        for (Nave nave : flotaCritica) 
        {
           
        System.out.println("-> Nave Crítica: " + nave.getNombre() + " | Estado: " + nave.getEstadoSistema() + " | Planeta Origen: " + nave.getPlanetaOrigen());
        
        }
        
        System.out.println("-> Reporte General Filtrado (LEFT JOIN + TYPE) ===");
        List<Object[]> reporte = con.obtenerReporteGeneralFiltrado();
        for (Object[] fila : reporte) {
            String nombreNave = (String) fila[0];
            Object tipoNave = fila[1];
            String nombrePlaneta = (String) fila[2];
            System.out.println("-> Nave: " + nombreNave + " | Tipo (Clase): " + tipoNave + " | Planeta: " + nombrePlaneta);
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.matheusaantunesf.matheusantunesapp1;

/**
 *
 * @author Matheus Antunes <maf6@aluno.ifnmg.edu.br>
 */
public class Quadrado {

    private Double lado;

    public Quadrado() {

    }

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
    //</editor-fold>
    
    public Double calcularArea(){
        return lado * lado;
    }
}

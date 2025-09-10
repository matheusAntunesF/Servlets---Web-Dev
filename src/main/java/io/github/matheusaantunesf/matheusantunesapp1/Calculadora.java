/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.matheusaantunesf.matheusantunesapp1;

/**
 *
 * @author Matheus Antunes <maf6@aluno.ifnmg.edu.br>
 */
public class Calculadora {
    double valorA;
    double valorB;

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public double getValorA() {
        return valorA;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }
    //</editor-fold>
    
    public double somar(){
        return valorA + valorB;
    }
    
    public double subtrair(){
        return valorA - valorB;
    }
    
    public double multiplicar(){
        return valorA * valorB;
    }
    
    public double dividir(){
        return valorA/valorB;
    }
}

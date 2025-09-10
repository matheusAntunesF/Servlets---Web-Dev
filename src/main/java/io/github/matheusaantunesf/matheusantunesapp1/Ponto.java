/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.matheusaantunesf.matheusantunesapp1;

/**
 *
 * @author Matheus Antunes <maf6@aluno.ifnmg.edu.br>
 */
public class Ponto {

    private Double x;
    private Double y;

    public Ponto() {

    }

    public Ponto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }
    //<editor-fold defaultstate="collapsed" desc="gettersAndSetters">

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

//</editor-fold>
    public static Double calcularDistancia(Ponto ponto1, Ponto ponto2) {
        Double tmp1 = ponto2.x - ponto1.x;
        Double tmp2 = ponto2.y - ponto1.y;

        tmp1 = Math.pow(tmp1, 2);
        tmp2 = Math.pow(tmp2, 2);

        return Math.sqrt((tmp1 + tmp2));
    }
}

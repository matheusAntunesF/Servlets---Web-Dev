/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package io.github.matheusaantunesf.matheusantunesapp1;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Matheus Antunes <maf6@aluno.ifnmg.edu.br>
 */
@WebServlet(name = "PlanoCartesiano", urlPatterns = {"/PlanoCartesiano"})
public class PlanoCartesiano extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PlanoCartesiano</title>");
            out.println("</head>");
            out.println("<body>");
            try {
                double ponto1X = Double.parseDouble(request.getParameter("ponto1X")),
                        ponto1Y = Double.parseDouble(request.getParameter("ponto1Y")),
                        ponto2X = Double.parseDouble(request.getParameter("ponto2X")),
                        ponto2Y = Double.parseDouble(request.getParameter("ponto2Y"));
                Ponto ponto1 = new Ponto(ponto1X, ponto1Y),
                        ponto2 = new Ponto(ponto2X, ponto2Y);
                Double resultado = Ponto.calcularDistancia(ponto1, ponto2);
                out.print("<ul>");
                out.println("<li>Ponto 1: (" + ponto1.getX() + ", " + ponto1.getY() + ")</li>");
                out.println("<li>Ponto 2: (" + ponto2.getX() + ", " + ponto2.getY() + ")</li>");
                out.println("</ul>");
                out.print("<p>Distancia entre os dois: " + resultado + "</p>");
            } catch (NumberFormatException e) {
                out.println("<p>Valor invalido</p>");
            }

            out.println("<a href=\"Aplicacao2.html\">Voltar</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

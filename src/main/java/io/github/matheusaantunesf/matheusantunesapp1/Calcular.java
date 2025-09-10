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
@WebServlet(name = "Calcular", urlPatterns = {"/Calcular"})
public class Calcular extends HttpServlet {

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

            Calculadora calc1 = new Calculadora();

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<title>Servlet Calcular</title>");
            out.println("</head>");
            out.println("<body>");
            String a = request.getParameter("valorA");
            String b = request.getParameter("valorB");
            String operacao = request.getParameter("operacao");
            if (a != null && b != null && !a.isEmpty() && !b.isEmpty()) {
                try {
                    calc1.setValorA(Double.parseDouble(a));
                    calc1.setValorB(Double.parseDouble(b));

                    Double resultado;
                    switch (operacao) {
                        case "Somar":
                            resultado = calc1.somar();
                            break;
                        case "Subtrair":
                            resultado = calc1.subtrair();
                            break;
                        case "Multiplicar":
                            resultado = calc1.multiplicar();
                            break;
                        case "Dividir":
                            resultado = calc1.dividir();
                            break;
                        default:
                            resultado = null;
                    }

                    out.println("<p>Resultado: " + resultado + ";</p>");
                } catch (NumberFormatException e) {
                    out.println("<p>Valor invalido</p>");
                }
            }

            out.println("<a href=\"Aplicacao1.html\">Voltar</a>");
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

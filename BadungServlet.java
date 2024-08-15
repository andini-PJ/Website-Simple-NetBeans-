/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "BadungServlet", urlPatterns = {"/badung"})
public class BadungServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Badung</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; background-color: #f0f0f0; margin: 0; padding: 0; }");
            out.println(".menu { background-color: #333; overflow: hidden; }");
            out.println(".menu a { float: left; display: block; color: white; text-align: center; padding: 14px 20px; text-decoration: none; }");
            out.println(".menu a:hover { background-color: #ddd; color: black; }");
            out.println(".menu .dropdown { float: left; overflow: hidden; }");
            out.println(".menu .dropdown .dropbtn { font-size: 16px; border: none; outline: none; color: white; padding: 14px 20px; background-color: inherit; font-family: inherit; margin: 0; }");
            out.println(".menu .dropdown-content { display: none; position: absolute; background-color: #f9f9f9; min-width: 160px; box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2); z-index: 1; }");
            out.println(".menu .dropdown-content a { float: none; color: black; padding: 12px 16px; text-decoration: none; display: block; text-align: left; }");
            out.println(".menu .dropdown-content a:hover { background-color: #ddd; }");
            out.println(".menu .dropdown:hover .dropdown-content { display: block; }");
            out.println(".content { padding: 20px; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class='menu'>");
            out.println("<a href='home'>Home</a>");
            out.println("<div class='dropdown'>");
            out.println("<button class='dropbtn'>Kota dan Kabupaten</button>");
            out.println("<div class='dropdown-content'>");
            out.println("<a href='denpasar'>Denpasar</a>");
            out.println("<a href='badung'>Badung</a>");
            out.println("<a href='gianyar'>Gianyar</a>");
            out.println("<a href='karangasem'>Karangasem</a>");
            out.println("<a href='klungkung'>Klungkung</a>");
            out.println("<a href='tabanan'>Tabanan</a>");
            out.println("<a href='bangli'>Bangli</a>");
            out.println("<a href='buleleng'>Buleleng</a>");
            out.println("<a href='jembrana'>Jembrana</a>");
            out.println("</div>");
            out.println("</div>");
            out.println("</div>");
            out.println("<div class='content'>");
            out.println("<h1>Wisata di Badung</h1>");
            out.println("<ul>");
            out.println("<li>Pantai Kuta</li>");
            out.println("<li>Pura Uluwatu</li>");
            out.println("<li>Garuda Wisnu Kencana (GWK)</li>");
            out.println("<li>Pantai Nusa Dua</li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "BadungServlet";
    }
}

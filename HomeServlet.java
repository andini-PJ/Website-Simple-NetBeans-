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

@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Home - Bali</title>");
            out.println("<style>");
            out.println("body { font-family: 'Verdana', sans-serif; background-color: #f0f0f0; margin: 0; padding: 0; }");
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
            out.println("h1 { text-align: center; font-size: 48px; font-family: 'Georgia', serif; margin-bottom: 20px; }");
            out.println("p { font-size: 18px; line-height: 1.6; font-family: 'Arial', sans-serif; text-align: justify; }");
            out.println("b { font-size:50px }");
            out.println("img { width: 1440px; height: 500px; }");
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
            out.println("<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Pura_Ulun_Danu_Bratan%2C_2022.jpg/1280px-Pura_Ulun_Danu_Bratan%2C_2022.jpg' alt='Pura Ulun Danu Bratan'>");
            out.println("<p><b>Bali</b> adalah sebuah provinsi di Indonesia yang terletak pada bagian barat Kepulauan Nusa Tenggara dan beribu kota di Kota Denpasar. Pulau Bali, yang merupakan pulau terbesar di Provinsi Bali, memiliki beberapa julukan, di antaranya Pulau Dewata dan Pulau Seribu Pura.</p>");
            out.println("<p>Pada tahun 2020, penduduk provinsi Bali berjumlah 4.317.404 jiwa, dengan kepadatan 747 jiwa/km2, dan pada pertengahan 2024 berjumlah 4.361.106 jiwa.</p>");
            out.println("<p>Di awal kemerdekaan Indonesia, pulau ini termasuk dalam Provinsi Sunda Kecil yang beribu kota di Singaraja, dan kini terbagi menjadi 3 provinsi, yakni Bali, Nusa Tenggara Barat, dan Nusa Tenggara Timur.</p>");
            out.println("<p>Bali terkenal sebagai tujuan pariwisata dengan keunikan berbagai hasil seni-budayanya dan juga mitosnya, khususnya bagi para wisatawan Jepang dan Australia. Bali juga dikenal dengan julukan Pulau Dewata dan Pulau Seribu Pura.</p>");
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
        return "HomeServlet";
    }
}

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

@WebServlet(name = "DenpasarServlet", urlPatterns = {"/denpasar"})
public class DenpasarServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Tempat Wisata di Denpasar</title>");
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
            out.println(".content img { width: 100%; max-width: 600px; height: auto; border-radius: 8px; }");
             out.println(".content .special-img { width: 100%; max-width: 1600px; height: 500px; border-radius: 8px; }"); 
            out.println(".content h1 { text-align: center; font-size: 2.5em; font-family: 'Georgia', serif; }");
            out.println(".content p { font-size: 1.1em; line-height: 1.6; margin-bottom: 20px; }");
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
            out.println("<h1>Tempat Wisata di Denpasar</h1>");
            out.println("<img src='https://cove-blog-id.sgp1.cdn.digitaloceanspaces.com/cove-blog-id/2023/05/tempat-wisata-di-denpasar.png' alt='Tempat Wisata di Denpasar' class='special-img'>");
            out.println("<p>Tempat wisata di Denpasar Bali memiliki daya tarik tersendiri. Beragam potensi wisata ini menjadi pendorong kemajuan kota Denpasar. Ribuan turis baik domestik maupun mancanegara selalu tumpah ruah memenuhi tempat wisata di Denpasar Bali ini.</p>");
            out.println("<p>Jika Anda menjadikan Denpasar sebagai titik tujuan berlibur, mengetahui tempat wisata di Denpasar Bali sangatlah penting. Terdapat beragam pilihan tempat wisata di Denpasar Bali. Mulai dari pantai, pura, hingga ruang publik, tempat wisata di Denpasar Bali ini tak boleh terlewat begitu saja.</p>");
            
            out.println("<h2>1. Hutan Mangrove Bali</h2>");
            out.println("<img src='https://cove-blog-id.sgp1.cdn.digitaloceanspaces.com/cove-blog-id/2023/05/data-src-image-f2580d58-0dce-4be3-b42d-fbebe53e60bc.png' alt='Hutan Mangrove Bali'>");
            out.println("<p>Bali terkenal dengan keindahan pantainya yang beragam, mulai dari pantai tempat berwisata hingga pantai yang jarang terjamah wisatawan. Namun, bukan pantai yang akan direkomendasikan sebagai tempat wisata di Denpasar pertama kali, kamu bisa mengunjungi Hutan Mangrove Bali yang terletak di Jalan Bypass Ngurah Rai.</p>");
            out.println("<p>Tempat wisata di Denpasar yang satu ini juga berdekatan dengan dua pantai sekaligus, yakni Pantai Kelan dan Pantai Jerman. Luas dari wisata Hutan Mangrove Bali sekitar 1.300 hektare dengan daya tarik utama berupa hutan bakau yang asri.</p>");
            out.println("<p>Di Hutan Mangrove Bali, kamu dapat menyusuri jembatan sepanjang 2 km dengan pemandangan bakau di kanan dan kiri. Supaya makin asyik, kamu disarankan datang ke Hutan Mangrove Bali saat sore hari karena tidak terlalu terik sekaligus bisa berwisata sambil menunggu sunset.</p>");
            
            out.println("<h2>2. Pantai Sanur</h2>");
            out.println("<img src='https://cove-blog-id.sgp1.cdn.digitaloceanspaces.com/cove-blog-id/2023/05/data-src-image-88cf902b-44d6-4198-bcd9-0441d74168bb.png' alt='Pantai Sanur'>");
            out.println("<p>Kebanyakan orang mengincar wisata ke pantai Bali untuk menikmati pemandangan matahari terbenam (sunset). Berbeda dengan Pantai Sanur, tempat wisata di Denpasar ini justru menyajikan pemandangan matahari terbit (sunrise) yang cantik. Maka dari itu, kamu disarankan pergi ke Pantai Sanur di pagi hari sebelum matahari terbit.</p>");
            out.println("<p>Pantai Sanur memiliki garis pantai sepanjang 8 km yang bisa disusuri. Selain menyusuri pantai dan berenang, kamu bisa menyewa kano untuk menikmati keseruan berwisata di Pantai Sanur. Terdapat juga aktivitas wisata air lain di Pantai Sanur, seperti snorkling dan diving.</p>");
            
            out.println("<h2>3. Pasar Badung</h2>");
            out.println("<img src='https://cove-blog-id.sgp1.cdn.digitaloceanspaces.com/cove-blog-id/2023/05/data-src-image-81a181cb-3115-4540-8ad5-82a4b39ecd92.png' alt='Pasar Badung'>");
            out.println("<p>Kata siapa kita tidak bisa berwisata ke tempat umum seperti pasar? Di Bali ada Pasar Badung yang kerap menjadi objek wisata. Kenapa demikian? Pasar Badung jauh dari stereotip pasar tradisional lain yang becek. Sebaliknya, justru Pasar Badung menjadi ikon heritage di Kota Denpasar karena kebersihannya. Tak jarang malah banyak wisatawan memanfaatkan Pasar Badung sebagai tempat foto. Tentu saja selain foto kamu juga bisa berkeliling ke toko-toko di Pasar Badung dan berbelanja.</p>");
            
            out.println("<h2>4. Museum Bali</h2>");
            out.println("<img src='https://cove-blog-id.sgp1.cdn.digitaloceanspaces.com/cove-blog-id/2023/05/data-src-image-04f56e7a-3645-4f2d-85d8-14a894c74718.png' alt='Museum Bali'>");
            out.println("<p>Tempat wisata di Denpasar selanjutnya adalah Museum Bali sebagai wisata edukasi ternama di Kota Denpasar. Di Museum Bali, kamu bisa menemukan beberapa kesenian, naskah kuno, lukisan, wayang kulit, dan sebagainya. Di Museum Bali kamu sekaligus bisa langsung memahami bagaimana budaya Bali itu sendiri.</p>");
            out.println("<p>Tempatnya terbagi atas 3 bagian atau halaman. Pertama, halaman luar atau dikenal juga dengan Jaba. Kedua, halaman tengah atau Jaba Tengah. Ketiga, halaman dalam atau Jeroan. Didirikan pada tahun 1910, arsitektur Museum Bali sangatlah unik karena berbentuk mirip Pura sebagai tempat ibadah masyarakat Hindu di Bali dan Puri atau istana. Untuk masuk ke Museum Bali, kamu akan dikenakan tiket sebesar Rp25.000 per orang. Sementara untuk pelajar kamu cukup membayar seharga Rp5.000 saja.</p>");
            
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
        return "DenpasarServlet";
    }
}

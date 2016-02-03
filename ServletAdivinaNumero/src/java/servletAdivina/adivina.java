package servletAdivina;

import classes.SecretNumber;
import java.io.IOException;
import java.io.PrintWriter;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "adivina", urlPatterns = {"/adivina"})
public class adivina extends HttpServlet {
            @Inject SecretNumber secret = new SecretNumber((int) (Math.random() * 10 + 1));

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
            int userNumber = Integer.parseInt(request.getParameter("number"));

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet adivina</title>");
            out.println("</head>");
            out.println("<body>");
            if(secret.getSecret() == userNumber) {
                out.println("<h2>Ha acertado! " + secret.getSecret() + "</h2>");
            } else {
                if (secret.getSecret() < userNumber) {
                    out.println("<h3>El número es menor</h3>");
                    out.println("<form action=\"adivina\">");
                    out.println("<input type=\"text\" name=\"number\" style=\"width:50px;\">");
                    out.println("<input type=\"SUBMIT\" value=\"Enviar\">");
                    out.println("</form>");
                } else {
                    out.println("<h3>El número es mayor</h3>");
                    out.println("<form action=\"adivina\">");
                    out.println("<input type=\"text\" name=\"number\" style=\"width:50px;\">");
                    out.println("<input type=\"SUBMIT\" value=\"Enviar\">");
                    out.println("</form>");
                }
            }
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

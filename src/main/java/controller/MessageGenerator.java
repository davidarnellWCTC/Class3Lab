/*
 * 
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.WelcomeService;

/**
 *
 * @author David Arnell
 */
@WebServlet(name = "MessageGenerator", urlPatterns = {"/time"})
public class MessageGenerator extends HttpServlet {

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
        
        // get instance of the WelcomeService
        WelcomeService welcomeService = new WelcomeService();
        
        // request → HttpServletRequest Object
        // getParameter → method to get a String parameter from a named thing in the request
        // name is the name of the String object that's being requested
        // check to see if a name has been entered        
        if (request.getParameter("name") != null){
            String name = request.getParameter("name");
            String namedMessage = welcomeService.getPersonalizedMessage(name);
            
            // sending an Object (responseMessage) with the key "namedMessage"
            request.setAttribute("namedMessage", namedMessage);
        }
        
        // Get the String value for the generic welcome message
        String welcomeMessage = welcomeService.getMessage();
        request.setAttribute("welcomeMessage", welcomeMessage);
        
        
        // Sets the view for this HttpServletRequest request to the welcome.jsp page
        RequestDispatcher view = request.getRequestDispatcher("/welcome.jsp");
        
        // forwards the HttpServletRequest Object to the page with the ContentType set
        view.forward(request, response);
        
        
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

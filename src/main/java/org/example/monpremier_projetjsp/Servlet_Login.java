package org.example.monpremier_projetjsp;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import java.io.IOException;

@WebServlet(name="Servlet_Login", urlPatterns ="/Servlet_Login" )
public class Servlet_Login extends HttpServlet {
    private static final String USERNAME = "CYTechJ2EE";
    private static final String PASSWORD = "CYTechJ2EE";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if(USERNAME.equals(login) && PASSWORD.equals(password)){
            request.setAttribute("messageResult","Welcome to your First JSP page");
        }else{
            request.setAttribute("messageResult","Identification Failure");
        }

        request.getRequestDispatcher("WEB-INF/resultat.jsp").forward(request,response);
    }

}

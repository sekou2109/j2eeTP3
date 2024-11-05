package org.example.monpremier_projetjsp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/equation-servlet")
public class EquationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        double a = Double.parseDouble(request.getParameter("a"));
        double b = Double.parseDouble(request.getParameter("b"));
        double c = Double.parseDouble(request.getParameter("c"));

        String messageDiscriminant;
        double racineDouble;
        double racine1;
        double racine2;
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            messageDiscriminant = "<span style='color: red;'>Le discriminant est négatif, pas de solutions réelles.</span>";
        } else if (discriminant == 0) {
            racineDouble = -b / (2 * a);
            messageDiscriminant = "<span style='color: blue;'>Racine double: " + racineDouble + "</span>";
        } else {
            racine1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            racine2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            messageDiscriminant = "<span style='color: green;'>Les solutions sont réelles: " + racine1 + " et " + racine2 + "</span>";
        }

        request.setAttribute("message", messageDiscriminant);
        request.getRequestDispatcher("/resultat/index.jsp").forward(request, response);
    }
}


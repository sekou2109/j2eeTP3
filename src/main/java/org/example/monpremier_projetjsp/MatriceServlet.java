package org.example.monpremier_projetjsp;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="MatriceServlet",urlPatterns ="/matriceServlet")
public class MatriceServlet extends HttpServlet {

    public int[][] matrice = new int[10][10];
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Matrice (méthode GET)</h1>");

        //Récupérons les paramètres x et y
        String ligne = request.getParameter("x");
        String colonne = request.getParameter("y");

        if (ligne != null && colonne != null) {
            try {
                //Convertir l'entrée de l'utilisateur en entier
                int x = Integer.parseInt(ligne);
                int y = Integer.parseInt(colonne);
                if ((x <= 10 && y <= 10) && (x >= 1 && y >= 1)) {
                    out.println("<h1>");
                    out.println("matrice[" + x + "][" + y +"] = " + matrice[x - 1][y - 1]);
                    out.println("</h1>");
                } else {
                    out.println("<h1>Vos valeurs de x ou de y sont hors de l'intervalle [1,10]</h1>");
                }
            }catch (NumberFormatException e){
                out.println("<h1> x et y doivent être des entiers dans [1,10]. Réessayez !");
            }
        }else{
            out.println("<table border='1'>");
            for(int i=0; i<10;i++){
            out.println("<tr>");
            for(int j=0; j<10; j++){
                out.println("<td>" + matrice[i][j] + "</td>");
            }
            out.println("</tr>");

        }
        out.println("</table>");
        out.println("</body></html>");
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Matrice (méthode POST)</h1>");

        //Récupérons les paramètres x, y et valeur
        String ligne = request.getParameter("x");
        String colonne = request.getParameter("y");
        String valeur = request.getParameter("val");

        if(ligne!=null && colonne!=null && valeur!=null){
            try{
                int x = Integer.parseInt(ligne);
                int y = Integer.parseInt(colonne);
                int val = Integer.parseInt(valeur);

                if((x<=10 && y<=10) && (1<=x && y>=1)){
                    matrice[x-1][y-1] = val;
                    out.println("<h1> Votre valeur a été mise à jour : matrice["+x+"]["+y+"] = "+ matrice[x-1][y-1]+"</h1>");
                }else{
                    out.println("<h1> Attention, x et y doivent appartenir à l'intervalle [1,10] !</h1>");
                }
            }catch (NumberFormatException e){
                out.println("<h1> Attention, vos valeurs doivent être des entiers dans l'intervalle [1,10].</h1>");
            }
        }else{
            for(int i=0; i<10; i++){
                for(int j=0; j<10; j++){
                    matrice[i][j] = 0;
                }
            }
            out.println("<h1>La matrice a été réinitialisée.</h1>");
        }

        out.println("</body></html>");

    }
}

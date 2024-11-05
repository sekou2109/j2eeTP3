<%--
  Created by IntelliJ IDEA.
  User: CYTech Student
  Date: 11/5/2024
  Time: 9:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Opérations matrice</title>
</head>
<body>
    <h2>Affichage de la matrice</h2>
    <form action="matriceServlet" method="get">
        <button type="submit">Afficher la matrice</button>
    </form>

    <h2>Afficher une valeur</h2>
    <form action="matriceServlet" method="get">
        <label for="x">x:</label>
        <input type="number" id="x" name="x" required min="1" max="10">
        <label for="y">y:</label>
        <input type="number" id="y" name="y" required min="1" max="10">
        <button type="submit">Afficher la valeur</button>
    </form>

    <h2>Réinitialiser la matrice</h2>
    <form action="matriceServlet" method="post">
        <button type="submit">Réinitialiser la matrice</button>
    </form>

    <h2>Modifier une valeur de la matrice</h2>
    <form method="post" action="matriceServlet">
        <label for="x">x:</label>
        <input name="x" id="x1" required min="1" max="10">
        <label for="y">y:</label>
        <input name="y" id="y1" required min="1" max="10">
        <label for="val">valeur:</label>
        <input name="val" id="val" required>
        <button type="submit">Changer la valeur</button>

    </form>

</body>
</html>

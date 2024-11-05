<%--
  Created by IntelliJ IDEA.
  User: CYTech Student
  Date: 11/5/2024
  Time: 8:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Équation du second degré - Formulaire</title>
</head>
<body>
<form action="../equation-servlet" method="post">
    <label for="a">Coefficient a:</label>
    <input type="number" id="a" name="a" required/><br/>

    <label for="b">Coefficient b:</label>
    <input type="number" id="b" name="b" required/><br/>

    <label for="c">Coefficient c:</label>
    <input type="number" id="c" name="c" required/><br/>

    <input type="submit" value="Résoudre"/>
</form>
</body>
</html>


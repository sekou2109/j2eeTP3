<%--
  Created by IntelliJ IDEA.
  User: CYTech Student
  Date: 11/5/2024
  Time: 8:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page de Login</title>
</head>
<body>
    <h2>Page de connexion</h2>
    <form action="Servlet_Login" method="post">
        <label for="login">Login:</label>
        <input type="text" id="login" name="login" required><br><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>
        <button type="submit">Envoyer</button>
    </form>

</body>
</html>

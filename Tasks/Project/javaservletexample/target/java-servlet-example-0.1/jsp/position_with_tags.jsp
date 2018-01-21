<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Пользователи</title>
    <link href="/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<h1>${hello}</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Имя</th>

    </tr>
    <c:forEach items="${positions}" var="position">
        <tr>
            <td>${position.id}</td>
            <td>${position.name}</td>
            <

        </tr>
    </c:forEach>
</table>
<form action="/position_as_jsp" method="post">
    <input type="text" name="name" placeholder="Имя">
    <input type="text" name="surname" placeholder="Фамилия">


    <input type="submit">
</form>
</body>
</html>

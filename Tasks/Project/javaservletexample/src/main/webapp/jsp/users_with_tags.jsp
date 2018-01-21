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
        <th>Фамилия</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.surname}</td>
            <td>${user.passport}</td>
            <td>${user.position}</td>

        </tr>
    </c:forEach>
</table>
<form action="/users_as_jsp" method="post">
    <input type="text" name="name" placeholder="Имя">
    <input type="text" name="surname" placeholder="Фамилия">
    <input type="text" name="passport" placeholder="Паспорт">
    <input type="text" name="position" placeholder="Должность">

    <input type="submit">
</form>
</body>
</html>

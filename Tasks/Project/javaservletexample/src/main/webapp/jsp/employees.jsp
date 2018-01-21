<%@ page import="ru.itpark.models.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%--
  Created by IntelliJ IDEA.
  User: Marse
  Date: 18.01.2018
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <title>Title</title>
</head>

<body>
<h1>${hello}</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Имя</th>
        <th>Возраст</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.surname}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

<%--<table>--%>
    <%--<tr>--%>
        <%--<th>Id</th>--%>
        <%--<th>Имя</th>--%>
        <%--<th>Фамилия</th>--%>
        <%--<th>Возраст</th>--%>

    <%--</tr>--%>
    <%--<c:forEach items="${employees}" var="employee">--%>
        <%--<tr>--%>
            <%--<td>${employee.name}</td>--%>
              <%--<td>${employees.surname}</td>--%>


        <%--</tr>--%>
    <%--</c:forEach>--%>
<%--</table>--%>
<%--<form action="/employees" method="post">--%>
    <%--<input type="text" name="name" placeholder="Имя">--%>
    <%--<input type="text" name="surname" placeholder="Фамилия" required>--%>

    <%--<input type="submit" value="Сохранить">--%>
<%--</form>--%>
<%--<h2><a href="/java-servlet-example-0.1/index.jsp">Вернуться на главную страницу</a></h2>--%>
<%--</body>--%>
<%--</html>--%>

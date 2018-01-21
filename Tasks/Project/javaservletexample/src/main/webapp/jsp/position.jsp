<%--
  Created by IntelliJ IDEA.
  User: Marse
  Date: 21.01.2018
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>Id</th>
        <th>Имя</th>

    </tr>
    <c:forEach items="${positions}" var="position">
        <tr>
          <td>${position.id}</td>
            <td>${position.name}</td>


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
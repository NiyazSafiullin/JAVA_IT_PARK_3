<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>БД групп</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Имя</th>
        <th>Фамилия</th>

    </tr>
    <#list model.clients as client>
    <tr>
        <td>${client.id}</td>
        <td>${client.name}</td>
       <td>${client.surname}</td>
    </tr>
    </#list>
</table>
</body>
</html>
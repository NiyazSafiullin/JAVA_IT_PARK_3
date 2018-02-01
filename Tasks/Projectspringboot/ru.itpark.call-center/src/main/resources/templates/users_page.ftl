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
        <th>Дата регистрации</th>
    </tr>
    <#list model.users as user>
    <tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.email}</td>
    </tr>
    </#list>
</table>
</body>
</html>
<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>News- Регистрация</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Имя</th>
        <th>Дата регистрации</th>
    </tr>
    <#list model.calls as call>
    <tr>
        <td>${call.time}</td>
        <td>${call.line}</td>
        <td>${call.responce_time}</td>
    </tr>
    </#list>
</table>
</body>
</html>
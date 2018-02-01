<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>БД звонков</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>Имя</th>

    </tr>
    <#list model.calls as call>
    <tr>
        <td>${call.time}</td>
        <td>${call.line}</td>

    </tr>
    </#list>
</table>
</body>
</html>
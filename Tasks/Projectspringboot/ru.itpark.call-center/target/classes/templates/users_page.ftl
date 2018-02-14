<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style_page.css">
    <title>Пользлователи системы</title>
</head>
<body>
<div class="container">
    <section id="content">
<table>
    <tr>
        <#--<th>ID</th>-->
        <th>Имя</th>
        <th>электронный адрес</th>
    </tr>
    <#list model.users as user>
    <tr>
        <#--<td>${user.id}</td>-->
        <td>${user.name}</td>
        <td>${user.email}</td>

    </tr>
    </#list>
</table>
        <p style="text-align: center"><a href="/">Вернуться в главное меню</a></p>
    </section>
</div>
</body>
</html>
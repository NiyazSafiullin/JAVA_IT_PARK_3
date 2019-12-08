<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style_page.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="ionicons/css/ionicons.min.css" rel="stylesheet">
    <title>Все электронные услуги</title>
</head>
<body>
<div class="container">
    <section id="content">

<table>
    <tr>
        <th>ID</th>
        <th>Статус</th>
        <th>Название услуги</th>
    </tr>
    <#list model.services as service>
    <tr>
        <td>${service.id}</td>
        <td>${service.category}</td>
        <td>${service.name}</td>
    </tr>
    </#list>
</table>
        <p style="text-align: center"><a href="/">Вернуться в главное меню</a></p>
    </section>
</div>
</body>
</html>
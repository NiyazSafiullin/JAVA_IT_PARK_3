<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style_page.css">
    <title>!Все электронные услуги!</title>
</head>
<body>
<div class="container">
    <section id="content">

        <table>
            <tr>
                <th>ID</th>
                <th>Название услуги</th>
                <th>Телефон для связи</th>
            </tr>
    <#list model.eservice as eservice>
    <tr>
        <td>${eservice.id}</td>
            <td>${eservice.name}</td>
    <td>${eservice.number}</td>
    </tr>
    </#list>
        </table>
        <p style="text-align: center"><a href="/">Вернуться в главное меню</a></p>
    </section>
</div>
</body>
</html>
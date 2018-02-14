<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style_page.css">
    <title>Все электронные услуги</title>
</head>
<body>
<#--<script>-->

    <#--&lt;#&ndash;Функция принимает на вход два параметра - имя и фамилию &ndash;&gt;-->
    <#--function sendNewNameOrSurName(category, name) {-->
        <#--// Оотправляем ajax-запорс на сервер-->
        <#--$.ajax({-->
            <#--type: "POST",-->
            <#--url: "/services/${model.orderby}",-->
            <#--data: {-->
                <#--"name": category,-->
                <#--"surname": name-->
            <#--},-->
            <#--error: function (data) {-->
                <#--alert(data.status)-->
            <#--},-->
            <#--success: function (data) {-->
                <#--alert("Wow!" + data.status)-->
            <#--}-->
        <#--});-->
    <#--}-->
<#--</script>-->
<div class="container">
    <section id="content">

        <table>
            <tr>
                <th>ID</th>
                <th>Категория</th>
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
<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style_page.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="ionicons/css/ionicons.min.css" rel="stylesheet">
    <title>Пользлователи системы</title>
</head>
<body>
<#--<script>-->

    <#--&lt;#&ndash;Функция принимает на вход два параметра - имя и фамилию &ndash;&gt;-->
    <#--function sendNewNameOrSurName(name, surname) {-->
        <#--// Оотправляем ajax-запорс на сервер-->
        <#--$.ajax({-->
            <#--type: "POST",-->
            <#--url: "/users${model.orderBy}",-->
            <#--data: {-->
                <#--"name": name,-->
                <#--"surname": surname-->
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
    <#--<section id="content">-->
        <table class="table table-striped">
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
        <p style="text-align: center"><a style="color:#000000" href="/users/1">Изменить данные Администратора</a></p>
        <p style="text-align: center"><a style="color:#000000" href="/profile">Вернуться в личный кабинет</a></p>
        <p style="text-align: center"><a style="color:#000000" href="/">Вернуться в главное меню</a></p>
        <#--</section>-->
</div>
</body>
</html>
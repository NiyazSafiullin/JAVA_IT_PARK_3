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
    <link rel="icon" href="img/fav.ico" type="image/x-icon">
</head>
<body>
<#--<script>-->

    <#--&lt;#&ndash;Функция принимает на вход два параметра - имя и фамилию &ndash;&gt;-->
    <#--function sendNewNameOrSurName(name, surname) {-->
        <#--// Отправляем ajax-запорс на сервер-->
        <#--$.ajax({-->
            <#--type: "POST",-->
            <#--url: "/users/${model.user.id}",-->
            <#--data: {-->
                <#--"name": name,-->
                <#--"surname": surname-->
            <#--},-->
            <#--error: function (data) {-->
                <#--alert(data.status)-->
            <#--},-->
            <#--success: function (data) {-->
                <#--alert("Данные изменены!" + data.status)-->
            <#--}-->
        <#--});-->
    <#--}-->
<#--</script>-->
<#--<div>-->

    <#--<input type="text" id="name" name="name" value="${model.user.name}"/>-->
    <#--<input type="text" id="surname" name="surname" value="${model.user.surname}"/>-->
<#--&lt;#&ndash;<input type="text" id="surname" name="registration_time" value="${model.user.registration_time}"/>&ndash;&gt;-->
    <#--<button onclick="sendNewNameOrSurName(-->
        <#--document.getElementById('name').value,-->
        <#--document.getElementById('surname').value)">Отправить</button>-->
    <#--<p style="text-align: center"><a href="/profile">Вернуться в личный кабинет</a></p>-->
<#--</div>-->


<div class="container">
    <#--<section id="content">-->
        <table class="table table-striped">
            <tr>
                <th>Номер</th>
                <th>Имя</th>
                <th>Фамилия</th>
                    <th>Должность</th>
            </tr>
    <#list model.employees as employee>
    <tr>
        <td>${employee.id}</td>
        <td>${employee.name}</td>
        <td>${employee.surname}</td>
            <td>${employee.position}</td>


    </tr>
    </#list>
        </table>
        <p style="text-align: center"><a style="color:#000000" href="/profile">Вернуться в личный кабинет</a></p>
        <p style="text-align: center"><a style="color:#000000"  href="/">Вернуться в главное меню</a></p>
    <#--</section>-->
</div>
</body>
</html>
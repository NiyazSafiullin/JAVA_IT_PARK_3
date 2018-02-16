<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style_page.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="ionicons/css/ionicons.min.css" rel="stylesheet">
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <title>Просмотр пользователя</title>
</head>
<body>

<#--<#include 'common/header.ftl'/>-->
<script>

    <#--Функция принимает на вход два параметра - имя и фамилию -->
    function sendNewNameOrSurName(name, surname) {
        // Отправляем ajax-запорс на сервер
        $.ajax({
            type: "POST",
            url: "/users/${model.user.id}",
            data: {
                "name": name,
                "surname": surname
            },
            error: function (data) {
                alert(data.status)
            },
            success: function (data) {
                alert("Данные изменены!" + data.status)
            }
        });
    }
</script>
<div>

    <input type="text" id="name" name="name" value="${model.user.name}"/>
    <input type="text" id="surname" name="surname" value="${model.user.surname}"/>
    <#--<input type="text" id="surname" name="registration_time" value="${model.user.registration_time}"/>-->
    <button  onclick="sendNewNameOrSurName(
        document.getElementById('name').value,
        document.getElementById('surname').value)">Отправить</button>
    <p style="text-align: center"><a style="color:#000000" href="/profile">Вернуться в личный кабинет</a></p>
</div>
</body>
</html>
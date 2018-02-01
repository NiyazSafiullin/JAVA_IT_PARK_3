<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <title>Просмотр пользователей системы</title>
</head>
<body>
<#--<#include 'common/header.ftl'/>-->
<script>

    <#--Функция принимает на вход два параметра - имя и фамилию -->
    function sendNewNameOrSurName(name, surname) {
        // Оотправляем ajax-запорс на сервер
        $.ajax({
            type: "POST",
            url: "/clients/${model.clients.id}",
            data: {

                "name": name,
                "surname": surname
            },
            error: function (data) {
                alert(data.status)
            },
            success: function (data) {
                alert("Wow!" + data.status)
            }
        });
    }
</script>
<div>

    <input type="text" id="name" name="name" value="${model.clients.name}"/>
    <input type="text" id="surname" name="surname" value="${model.clients.surname}"/>
<#--<input type="text" id="email" name="email" value="${model.client.email}"/>-->
    <button onclick="sendNewNameOrSurName(
        document.getElementById('name').value,
        document.getElementById('surname').value)">Отправить</button>

</div>

</body>

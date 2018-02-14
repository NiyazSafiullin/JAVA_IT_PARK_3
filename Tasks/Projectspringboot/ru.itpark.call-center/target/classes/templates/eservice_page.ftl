<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style_page.css">
    <title>11Все электронные услуги</title>
</head>
<body>
<script>

    <#--Функция принимает на вход два параметра - имя и фамилию -->
    function sendNewNameOrSurName(name) {
        // Оотправляем ajax-запорс на сервер
        $.ajax({
            type: "POST",
            url: "/eservices/${model.eservice.id}",
            data: {
                "name": name

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

    <input type="text" id="name" name="name" value="${model.eservice.name}"/>
    <#--<input type="text" id="surname" name="surname" value="${model.user.surname}"/>-->
<#--<input type="text" id="surname" name="registration_time" value="${model.user.registration_time}"/>-->
    <button onclick="sendNewNameOrSurName(
        document.getElementById('name').value,
        document.getElementById('surname').value)">Отправить</button>
</div>

</body>
</html>
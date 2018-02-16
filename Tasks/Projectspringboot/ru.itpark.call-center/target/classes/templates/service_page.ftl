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
    <#--<section id="content">-->

        <table class="table table-striped">
            <tr>
                <th>Номер заявки</th>

                <th>Название услуги</th>
                <th>Статус</th>
            </tr>
    <#list model.services as service>
    <tr>
        <td>${service.result}</td>

        <td>${service.name}</td>
        <td>${service.category}</td>
    </tr>
    </#list>
        </table>
        <p style="text-align: center"><a style="color:#000000" href="/"></a></p>
        <p style="text-align: center"><a style="color:#000000" href="/profile">Вернуться в личный кабинет</a></p>
        <p style="text-align: center"><a style="color:#000000" href="/">Вернуться в главное меню</a></p>
    <#--</section>-->
</div>
</body>
</html>
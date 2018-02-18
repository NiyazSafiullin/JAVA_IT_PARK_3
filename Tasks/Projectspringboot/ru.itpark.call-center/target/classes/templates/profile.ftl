<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>

    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style_page.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="ionicons/css/ionicons.min.css" rel="stylesheet">
    <title>Система регистрации на сайте электронных услуг</title>
    <link rel="icon" href="img/fav.png" type="image/x-icon">
</head>
<body>
<h1 align="center">Привет, ${model.user.name}</h1>
<h3 align="center"> Добро пожаловать в систему регистрации заявок</h3>
<#if model.user.role == "ADMIN">
<div class="container">
    <#--<section id="content">-->


        <button type="button" class="btn btn-primary btn-lg"><a href="/addServices">Обработать заявку</a></button>
        <button type="button" class="btn btn-primary btn-lg"><a href="/addEmployeeszayavka">Назначить сотрудника на заявку</a></button>
        <button type="button" class="btn btn-primary btn-lg"><a href="/addEmployees">Добавить сотрудника</a></button>
        
        <button type="button" class="btn btn-primary btn-lg"><a href="/Employees?order_by">Посмотреть всех сотрудников</a></button>
        <button type="button" class="btn btn-primary btn-lg"><a href="/eservices?order_by">Посмотреть новые заявки</a></button>
            <button type="button" class="btn btn-primary btn-lg"><a href="/users?order_by">Посмотреть всеx пользователей системы</a></button>
        <button type="button" class="btn btn-primary btn-lg"><a href="/authorization">Администрирование</a></button>
        <button type="button" class="btn btn-primary btn-lg"><a href="/">Вернуться в главное меню</a></button>
    <#--</section>-->
</div>
<#else>
<div class="container">
    <#--<section id="content">-->
    <button type="button" class="btn btn-primary btn-lg"><a href="/addEService">Оставить электронную заявку </a></button>
    <button type="button" class="btn btn-primary btn-lg"><a href="/eservices?order_by">Список заявок</a></button>
    <button type="button" class="btn btn-primary btn-lg"><a href="/services?order_by">Список Обработанных заявок</a></button>
<button type="button" class="btn btn-primary btn-lg"><a href="/authorization">Учетная запись</a></button>
       <button type="button" class="btn btn-primary btn-lg"><a href="/">Вернуться в главное меню</a></button>

</#if>
<#--</section>-->
</div>
</body>
</html>
<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>

    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style_page.css">
    <title>Система регистрации на сайте электронных услуг</title>
</head>
<body>
<h1 align="center">Привет, ${model.user.name}</h1>
<h5 align="center"> Добро пожаловать в систему регистрация заявок</h5>
<#if model.user.role == "ADMIN">
<div class="container">
    <section id="content">


 <p align="center"><a href="/addServices">Добавить услугу(Режим администратора)</p>
        <p align="center"><a href="/usersearch">Поиск</p>
    <p align="center"><a href="/addEmployees">Добавить сотрудника(Режим администратора)</p>
    <p align="center"><a href="/services?order_by">Посмотреть все услуги(Режим администратора)</p>
        <p align="center"><a href="/eservices?order_by">Посмотреть новые заявки(Режим администратора)</p>
        <p align="center"><a href="/users?order_by">Посмотреть всеx зарегистрированных пользователей системы(Режим администратора)</p>
    <p style="text-align: center"><a href="/">Вернуться в главное меню</a></p>
    </section>
</div>
<#else>
<div class="container">
    <section id="content">
    <p style="text-align: center"><a href="/">Вернуться в главное меню</a></p>

     <p align="center"><a href="/eservices?order_by">Список моих заявок</p>
     <p align="center"><a href="/addEService">Оставить электронную заявку </p>
</#if>
</section>
</div>
</body>
</html>
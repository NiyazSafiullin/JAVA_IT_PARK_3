<#ftl encoding='UTF-8'>
<html>
<head>
    <title>News- Регистрация</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style_page.css">
</head>
<body>
<div class="container">
    <section id="content">
<#include '../templates/common/header.ftl'/>
<form class="form-style-4" title="Регистрация в системе получения услуг"
      name="registrationForm"
      method="post"
      action="/registrationClients">
    <input type="text" name="name" placeholder="Имя"/>
    <br>
    <input type="text" name="surname" placeholder="Фамилия"/>
    <br>
    <input type="text" name="email" placeholder="Почта"/>
    <br>
    <input type="password" name="password" placeholder="Пароль"/>
    <input type="text" name="categoriya_zayavki" placeholder="Категория заявки"/>
    <br><br>
   <p><input type="submit" value="Оставить заявку"/> </p>
    <p style="text-align: center"><a href="/">Вернуться в главное меню</a></p>


</form>
</section>
</div>
</body>
</html>
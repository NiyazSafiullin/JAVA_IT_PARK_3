<#ftl encoding='UTF-8'>
<html>
<head>
    <title>Регистрация</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style_page.css">
</head>
<body>
<div class="container">
    <section id="content">

<#include 'common/header.ftl'/>
<form  title="Регистрация в системе получения услуг"
      name="registrationForm"
      method="post"
      action="/registration">
    <input type="text" name="name" placeholder="Имя"/>
    <br>
    <input type="text" name="surname" placeholder="Фамилия"/>
    <br>
    <input type="text" name="email" placeholder="Почта"/>
    <br>
    <input type="password" name="password" placeholder="Пароль"/>
    <br><br>
    <p><input type="submit" value="Зарегистрироваться"/> </p>
    <p><a href="login.ftl">Вход, для зарегистрированных пользователей</p>
    <p style="text-align: center"><a href="/">Вернуться в главное меню</a></p>

</form>
</section>
    </div>
</body>
</html>
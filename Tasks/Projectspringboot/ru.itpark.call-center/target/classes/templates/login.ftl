<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Система регистрации на сайте электронных услуг</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style_page.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="ionicons/css/ionicons.min.css" rel="stylesheet">
</head>
<body>

<div class="container">
    <section id="content">
<#if model.error == true>
    <h1>Неверно введен имя пользователяи пароль</h1>
</#if>
<form  title="Регистрация"
      name="registrationForm"
      method="post"
      action="/login">
    <br>
    <input type="text" name="email" placeholder="Почта" required/>
    <br>
    <input type="password" name="password" placeholder="Пароль" required/><br><br>
    <input type="checkbox" name="remember-me">Запомнить<br><br>
    <input type="submit" value="Войти">
    <p><a style="color:#000000" href="/registration">Вход для регистрации</a></p>
    <p style="text-align: center"><a style="color:#000000" href="/">Вернуться в главное меню</a></p>

</form>
    </section>
</div>

</body>
</html>
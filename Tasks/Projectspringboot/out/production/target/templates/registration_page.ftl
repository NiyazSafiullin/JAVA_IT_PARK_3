<#ftl encoding='UTF-8'>
<html>
<head>
    <title>Регистрация</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style_page.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="ionicons/css/ionicons.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <section id="content">

<#include 'common/header.ftl'/>
<form  title="Регистрация в системе получения услуг"
      name="registrationForm"
      method="post"
      action="/registration">
    <input type="text" name="name" placeholder="Имя" required/>
    <br>
    <input type="text" name="surname" placeholder="Фамилия" required/>
    <br>
    <input type="text" name="email" placeholder="Почта" required/>
    <br>
    <input type="password" name="password" placeholder="Пароль" required/>
    <br><br>
    <p><input type="submit" value="Зарегистрироваться"/> </p>
    <p><a style="color:#000000" href="login.ftl">Вход, для зарегистрированных пользователей</p>


</form>
    <p style="text-align: center"><a style="color:#000000" href="/">Вернуться в главное меню</a></p>
</section>
    </div>
</body>
</html>
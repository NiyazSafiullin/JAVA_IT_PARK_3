<#ftl encoding='UTF-8'>
<html>
<head>
    <title>Добавить услугу</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style_page.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="ionicons/css/ionicons.min.css" rel="stylesheet">
    <link rel="icon" href="img/fav.ico" type="image/x-icon">
</head>
<body>
<div class="container">
    <section id="content">
<#include 'common/header.ftl'/>
<form  title="Регистрация в системе получения услуг"
      name="registrationForm"
      method="post"
      action="/addServices">
    <input type="text" name="result" placeholder="Номер заявки" required/>
    <br>
    <input type="text" name="name" placeholder="Вид Сервиса" required/>
    <br>
    <input type="text" name="category" placeholder="Категория" required/>
    <br>
    <#--<textarea name="description" onkeyup="adjust_textarea(this)"></textarea> <br><br>-->
    <p><input type="submit" value="Добавить"/> </p>
    <p style="text-align: center"><a style="color:#000000" href="/profile">Вернуться в личный кабинет</a></p>
    <p style="text-align: center"><a style="color:#000000" href="/">Вернуться в главное меню</a></p>

</form>
    </section>
</div>
</body>
</html>
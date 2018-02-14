<#ftl encoding='UTF-8'>
<html>
<head>
    <title>News- Регистрация!</title>
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
      action="/addServices">
    <input type="text" name="number" placeholder="Номер заявки" required/>
    <br>
    <input type="text" name="name" placeholder="Вид Сервиса" required/>
    <br>
    <input type="text" name="category" placeholder="Категория" required/>
    <br>
    <#--<textarea name="description" onkeyup="adjust_textarea(this)"></textarea> <br><br>-->
    <p><input type="submit" value="Добавить"/> </p>
    <p style="text-align: center"><a href="/">Вернуться в главное меню</a></p>

</form>
    </section>
</div>
</body>
</html>
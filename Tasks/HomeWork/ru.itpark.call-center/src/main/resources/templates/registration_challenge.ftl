<#ftl encoding='UTF-8'>
<html>
<head>
    <title>News- Регистрация</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<#include 'common/header.ftl'/>
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
    <input type="text" name="categoriya_zayavki" placeholder="Категория заявки"/>
    <br><br>
    <textarea name="description" onkeyup="adjust_textarea(this)"></textarea> <br><br>
    <p><input type="submit" value="Оставить заявку"/> </p>


</form>

</body>
</html>
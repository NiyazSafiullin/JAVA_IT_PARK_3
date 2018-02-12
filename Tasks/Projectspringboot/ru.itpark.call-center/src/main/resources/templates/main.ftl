<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>

<html>
<head>
    <title>Система регистрации на сайте электронных услуг</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style_page.css">



</head>
<body>
<div class="container">
    <section id="content">
<#if model.user??>
<div>

    <h3>Добро пожаловать, ${model.user.name}</h3>

    </div>
<#else>
<div>
    <div>

       </div>
</div>
</#if>
<form class="form-style-4" title=""
      name="MainForm"
      method="get"
      action="/profile">
    <div style="float: right; line-height: 20px"><p><a href="/profile">Личный кабинет</a>  <a href="/logout">Выход</a></p></div>
    <div style="float: right; line-height: 20px"><p><a href="/login">Вход</a><a href="/registration">Регистрация</a> </p></div>


    <input type="text" name="type" placeholder="Категория услуги"/>
    <br>
    <input type="text" name="result" placeholder="результат"/>
    <br>



    <input type="submit" value="Запрос"/>
</form>
    </section>
    </div>
</body>
</html>
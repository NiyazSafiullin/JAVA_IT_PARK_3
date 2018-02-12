<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>


<!doctype html>
<html lang="en">
<head>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style_page.css">
    <title>Система регистрации на сайте электронных услуг</title>
</head>
<body>
<div class="container">
    <section id="content">
<#if model.user??>
<div>
    id${model.user.id}
    <br>
    ${model.user.name} ${model.user.surname}
    <br>

    <div style="float: right; line-height: 20px"><p><a href="/logout">Выйти</a></p></div>
</div>
<#else>
<div>
    <div>

        <div> <p><a href="/login">Вход</a>/ <a href="/registration">Регистрация</a></p></div>
    </div>
</div>
</#if>
    </section>
</div>
</body>
</html>
<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>

    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style.css">
    <title>Вход в систему</title>
</head>
<body>
<h1 class="form-style-4">Привет, ${model.user.name}, Добро пожаловать в систему регистрация заявок</h1>

 <p align="center"><a href="/registrationClients">Добавить новую заявку</p>
 <p align="center"><a href="/clients/1">Посмотреть заявку по номеру</p>
</body>
</html>
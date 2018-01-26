<#ftl encoding='UTF-8'>
<html>
<head>
    <title>News- Регистрация</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<h1>Добавить в группу звонка</h1>
<form class="form-style-4" title="Регистрация"
      name="registrationCallsForm"
      method="post"
      action="/registrationcalls">
    <input type="text" name="time" placeholder="Время"/>
    <br>
    <input type="text" name="line" placeholder="Линия"/>
    <br>
    <input type="text" name="response_time" placeholder="Время разговора на линии"/>
    <br>

    <textarea name="description" onkeyup="adjust_textarea(this)"></textarea> <br><br>
    <input type="submit"/ value="Добавить">
</form>
</body>
</html>
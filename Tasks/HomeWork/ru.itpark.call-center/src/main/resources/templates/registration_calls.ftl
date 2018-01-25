<#ftl encoding='UTF-8'>
<html>
<head>
    <title>News- Регистрация</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<form class="form-style-4" title="Регистрация"
      name="registrationCallsForm"
      method="post"
      action="/registration_calls">
    <input type="text" name="time" placeholder="Имя"/>
    <br>
    <input type="text" name="line" placeholder="Фамилия"/>
    <br>
    <input type="text" name="response_time" placeholder="Супервайзер"/>
    <br>

    <textarea name="description" onkeyup="adjust_textarea(this)"></textarea> <br><br>
    <input type="submit"/ value="Добавить">
</form>
</body>
</html>
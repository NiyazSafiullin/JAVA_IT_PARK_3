<#ftl encoding='UTF-8'>
<html>
<head>
    <title>Регистрация звонок</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<h1 align="center">Добавить звонок</h1>
<form class="form-style-4" title="Регистрация"
      name="registrationCallsForm"
      method="post"
      action="/registrationcalls">
    <input type="text" name="time" placeholder="Время"/>
    <br>
    <input type="text" name="line" placeholder="Линия"/>
    <br>
    <input type="text" name="employee" placeholder="Номер сотрудника звонка"/>
    <br>
    <#--<input type="text" name="talk_time" placeholder="Время разговора (в минутах)"/>-->
    <#--<br>-->
    <#--<input type="text" name="hold_time" placeholder="Время ожидания (в минутах)"/>-->
    <#--<br>-->

    <textarea name="description" onkeyup="adjust_textarea(this)"></textarea> <br><br>
    <input type="submit"/ value="Отправить">
</form>

</body>
</html>
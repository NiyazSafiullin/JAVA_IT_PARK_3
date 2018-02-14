<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Заявка</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>
<#--<table>-->
    <#--<tr>-->
        <#--<th>ID</th>-->
        <#--<th>Имя</th>-->
        <#--<th>Фамилия</th>-->

    <#--</tr>-->
    <#--<#list model.clients as client>-->
    <#--<tr>-->
        <#--<td>${client.id}</td>-->
        <#--<td>${client.name}</td>-->
       <#--<td>${client.surname}</td>-->
    <#--</tr>-->
    <#--</#list>-->
<#--</table>-->

<#include 'common/header.ftl'/>
<form class="form-style-4" title="Регистрация в системе получения услуг"
      name="registrationClients"
      method="post"
      action="/registration">
    <input type="text" name="name" placeholder="Имя"/>
    <br>
    <input type="text" name="surname" placeholder="Фамилия"/>
    <br>
    <input type="text" name="email" placeholder="Почта"/>
    <br>
    <input type="text" name="categoriya_zayavki" placeholder="Заявка"/>
    <br><br>
    <textarea name="description" onkeyup="adjust_textarea(this)"></textarea> <br><br>
    <p><input type="submit" value="Оставить заявку"/> </p>


</form>
</body>
</html>
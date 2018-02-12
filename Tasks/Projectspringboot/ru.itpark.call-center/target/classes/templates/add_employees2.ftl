<#ftl encoding='UTF-8'>
<html>
<head>
    <title>Добавить сотрудника</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style_page.css">
</head>
<body>
<div class="container">
    <section id="content">
<#include 'common/header.ftl'/>
<form class="form-style-4" title="Регистрация в системе получения услуг"
      name="EmployeesForm"
      method="post"
      action="/addEmployees">

    <input type="text" name="name" placeholder="Имя"/>
    <br>
    <input type="text" name="surname" placeholder="Фамилия"/>
    <br>
    <input type="text" name="position" placeholder="Должность"/>

    <p><input type="submit" value="Добавить"/> </p>

    <p style="text-align: center"><a href="/">Вернуться в главное меню</a></p>
</form>
    </section>

</div>
</body>
</html>
<#ftl encoding='UTF-8'>
<html>
<head>
    <title>Удалить сотрудника</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style_page.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="ionicons/css/ionicons.min.css" rel="stylesheet">
    <link rel="icon" href="img/fav.png" type="image/x-icon">
</head>
<body>
<div class="container">
    <section id="content">
    <#include 'common/header.ftl'/>
        <form class="form-style-4" title="Регистрация в системе получения услуг"
              name="EmployeesForm"
              method="get"
              action="/deleteEmployees">

            <input type="text" name="id" placeholder="Номер сотрудника" required/ >
            <br>


            <p><input type="submit" value="Удалить"/> </p>
            <p style="text-align: center"><a style="color:#000000" href="/profile">Вернуться в личный кабинет</a></p>
            <p style="text-align: center"><a style="color:#000000" href="/">Вернуться в главное меню</a></p>
        </form>
    </section>

</div>
</body>
</html>
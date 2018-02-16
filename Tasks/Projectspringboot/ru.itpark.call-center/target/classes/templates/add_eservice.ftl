<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Электронная услуга</title>
    <script type="text/javascript" src="/js/form_script.js"></script>
    <link rel="stylesheet" href="/css/style_page.css">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="ionicons/css/ionicons.min.css" rel="stylesheet">
</head>
<body>
<#include 'common/header.ftl'/>

<h1>Ваша заявка принята </h1>
<p style="text-align: center"><a href="/profile">Вернуться в категорию</a></p>
</body>
</html>
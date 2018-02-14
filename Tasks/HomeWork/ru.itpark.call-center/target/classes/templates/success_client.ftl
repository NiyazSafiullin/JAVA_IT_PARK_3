<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Новая заявка</title>
</head>
<body>
<#include 'common/header.ftl'/>
<h1>Письмо для подтверждения вашей заявки отправлено на
    - ${model.email}</h1>
<h1>Администратор свяжется с вами </h1>
</body>
</html>
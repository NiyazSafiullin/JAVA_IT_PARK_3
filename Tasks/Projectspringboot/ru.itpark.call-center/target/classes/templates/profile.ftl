<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<h1>Привет, ${model.user.name}</h1>
<h1>Добро пожаловать в систему регистрация заявок</h1>
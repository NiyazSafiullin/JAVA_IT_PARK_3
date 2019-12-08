<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<html>
<head>
    <title>Поиск</title>
    <link rel="stylesheet" href="/css/style_page.css">
</head>
<body>

    <div id="content">
        <#if model.eservice??>
            <h3>По Вашему запросу "${model.search}" было найдено:</h3>
            <a href="/eservice?id=${model.eservice.id}">
                <div>

                    <p>${model.eservice.name}</p>
                </div>
            </a>
        <#else>
            <h3>По Вашему запросу "${model.search}" ничего не найдено.</h3>
        </#if>
        <div><a href="/profile">Вернуться на главную страницу сайта</a></div>
    </div>
</div>

</body>
</html>
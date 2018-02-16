<#ftl encoding='UTF-8'>
<#import 'spring.ftl' as spring>
<@spring.bind "model"/>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <title>Контакты</title>

    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="ionicons/css/ionicons.min.css" rel="stylesheet">
    <link rel="icon" href="img/fav.png" type="image/x-icon">

    <!-- main css -->
    <link href="css/style.css" rel="stylesheet">


    <!-- modernizr -->
    <script src="js/modernizr.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<!-- Preloader -->
<div id="preloader">
    <div class="pre-container">
        <div class="spinner">
            <div class="double-bounce1"></div>
            <div class="double-bounce2"></div>
        </div>
    </div>
</div>
<!-- end Preloader -->

<div class="container-fluid">
    <!-- box-header -->
    <header class="box-header">
        <div class="box-logo">
            <a href="/"><img src="img/logo.png" width="80" alt="Logo"></a>
        </div>
        <!-- box-nav -->
        <a class="box-primary-nav-trigger" href="#0">
            <span class="box-menu-text">Меню</span><span class="box-menu-icon"></span>
        </a>
        <!-- box-primary-nav-trigger -->
    </header>
    <!-- end box-header -->

    <!-- nav -->
    <nav>
        <ul class="box-primary-nav">
            <li class="box-label">About me</li>

            <li><a href="/">Главная</a> <i class="ion-ios-circle-filled color"></i></li>
            <li><a href="/authorization">Личный кабинет</a></li>
            <li><a href="/Employees?order_by">Сотрудники организации</a></li>

            <li><a href="contact.html">Контакты</a></li>

            <li class="box-label"></li>

            <li class="box-social"><a href="#0"><i class="ion-social-facebook"></i></a></li>
            <li class="box-social"><a href="#0"><i class="ion-social-instagram-outline"></i></a></li>
            <li class="box-social"><a href="#0"><i class="ion-social-twitter"></i></a></li>
            <li class="box-social"><a href="#0"><i class="ion-social-dribbble"></i></a></li>
        </ul>
    </nav>
    <!-- end nav -->

</div>

<!-- top bar -->
<div class="top-bar">
    <h1></h1>
    <p><a href="#"></a> </p>
</div>
<!-- end top bar -->

<!-- main-container -->
<div class="container main-container">
    <div class="col-md-6">
        <form action="#" method="post">
            <div class="row">
                <div class="col-md-6">
                    <div class="input-contact">
                        <input type="text" name="name">
                        <span>your name</span>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="input-contact">
                        <input type="text" name="email">
                        <span>your email</span>
                    </div>
                </div>
                <div class="col-md-12">
                    <div class="input-contact">
                        <input type="text" name="object">
                        <span>object</span>
                    </div>
                </div>
                <div class="col-md-12">
                    <div class="textarea-contact">
                        <textarea name="message"></textarea>
                        <span>message</span>
                    </div>
                </div>
                <div class="col-md-12">
                    <a href="#" class="btn btn-box">Send</a>
                </div>
            </div>
        </form>
    </div>

    <#--<div class="col-md-6">-->
        <#--<h3 class="text-uppercase">contact me</h3>-->
        <#--<h5>Creative & Lorem ipsum dolor sit amet</h5>-->
        <#--<div class="h-30"></div>-->
        <#--<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliter enim nosmet ipsos nosse non possumus. Inscite autem medicinae et gubernationis ultimum cum ultimo sapientiae comparatur. Tecum optime, deinde etiam cum mediocri amico. Et nemo nimium beatus est; Ac ne plura complectar-sunt enim innumerabilia-, bene laudata virtus voluptatis aditus </p>-->
        <#--<div class="contact-info">-->
            <#--<p><i class="ion-android-call"></i> 0100 787 3456</p>-->
            <#--<p><i class="ion-ios-email"></i> box@info.com</p>-->
        <#--</div>-->
    <#--</div>-->


</div>
<!-- end main-container -->

<!-- footer -->
<footer>
    <div class="container-fluid">
        <p class="copyright">2018</p>
    </div>
</footer>
<!-- end footer -->

<!-- back to top -->
<a href="#0" class="cd-top"><i class="ion-android-arrow-up"></i></a>
<!-- end back to top -->



<!-- jQuery -->
<script src="js/jquery-2.1.1.js"></script>
<!--  plugins -->
<script src="js/bootstrap.min.js"></script>
<script src="js/menu.js"></script>
<script src="js/animated-headline.js"></script>
<script src="js/isotope.pkgd.min.js"></script>


<!--  custom script -->
<script src="js/custom.js"></script>

</body>

</html>
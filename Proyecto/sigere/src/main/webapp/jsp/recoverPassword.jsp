<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="utf-8">
<title>Recuperar contraseña</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<style>
#highlighted {
    position: relative;
    background-color: #990000;
}
@media (min-width: 992px)
#highlighted .container-fluid {
    margin-bottom: 2.5rem;
}
#highlighted .container-fluid h1, #highlighted .container-fluid p {
    color: #FFF;
}
.h1, h1 {
    font-size: 54.93px;
}
.h1, h1, h2, h3, h4, h5, h6 {
    font-family: Verlag,museo-sans,'Helvetica Neue',Helvetica,Arial,sans-serif;
    color: #414141;
}
.h1, body, h1, h2, h3, h4, h5, h6, html {
    font-weight: 300;
}
#content {
    background-position: right bottom;
    background-repeat: no-repeat;
}
.interior-page {
    background-color: #FFF;
    padding-bottom: 30px;
}
#highlighted+#content.interior-page .interior-page-nav {
    margin-top: -4em;
}
#highlighted+#content.interior-page .interior-page-nav, .interior-page .interior-page-nav {
    padding-left: 0;
}
.sidebar {
    margin-top: 2em;
}
@media (min-width: 1200px)
.col-lg-2 {
    width: 16.66666667%;
}
.forgot-form{
	float:
}
.content-area-right {
    max-width: 1200px;
    padding-right: 15px;
    padding-left: 15px;
}
.container-fluid{
	text-align:center;
}
.container-fluid>.row h2.crumb-title {
    margin-bottom: 0;
}
.page-title {
    min-height: 50px;
}
.page-title, ul {
    margin: 0;
    list-style: none;
}
.content-crumb-div {
    margin: 5px 0 20px;
}
a {
    text-decoration: none;
}

.container-fluid .row .modal, .page .modal {
    position: fixed;
    top: 35%;
}
#highlighted+#content.interior-page .interior-page-nav, .interior-page .interior-page-nav {
    padding-left: 0;
}
#highlighted+#content.interior-page .interior-page-nav {
    margin-top: -4em;
}
.dynamicDiv.panel-group {
    border: 1px solid #E7E9E9;
    margin-left: 30px;
}
.panel-group {
    margin-bottom: 0;
    background-color: #fff;
}
.panel-group .panel {
    -webkit-border-radius: 0;
    -moz-border-radius: 0;
    border-radius: 0;
    border: none;
    box-shadow: none;
}
.panel-group .panel-heading {
    padding: 0;
    border: none;
}
.panel-default>.panel-heading {
    color: #333;
    background-color: #f5f5f5;
    border-color: #ddd;
}
.panel-group .panel-heading .panel-title {
    font-size: 1.1em;
    font-family: Verlag,museo-sans,'Helvetica Neue',Helvetica,Arial,sans-serif;
}
.interior-page-nav .panel-group .panel-heading .panel-title a {
    background: 0 0;
}
.panel-group .panel-heading .panel-title a {
    display: block;
    padding: 15px 45px 15px 15px;
    background: url(/resources/images/misc/icon_accordion-open.png) 95% center no-repeat #f6f6f6;
}
span.subMenuHighlight, ul.panel-heading li.panel-title a:hover {
    color: #ED3C95;
}
.panel-group .panel-heading .panel-title {
    font-size: 1.1em;
    font-family: Verlag,museo-sans,'Helvetica Neue',Helvetica,Arial,sans-serif;
}
ul.panel-heading {
    margin-bottom: 1px;
}
.panel-group .panel-heading .panel-title a {
    display: block;
    padding: 15px 45px 15px 15px;
    background: url(/resources/images/misc/icon_accordion-open.png) 95% center no-repeat #f6f6f6;
}
.panel-group {
    margin-bottom: 0;
    background-color: #fff;
}
.label-default {
    background-color: #FFF;
    margin-top: 10px;
}
label {
    display: inline-block;
    margin-bottom: 5px;
    font-weight: 700;
}
.form-control {
    border-radius: 0;
}
.btn-primary {
    color: #fff;
    background-color: #DC143C;
    border-color: #ea3e10;
    width: 100%;
}
.btn-block {
    display: block;
}
.btn {
    padding: 8px 28px;
    font-weight: 400;
    -webkit-transition: background .3s ease-in;
    transition: background .3s ease-in;
    white-space: normal;
    border-width: 0 0 1px;
}
.content-area-right {
   margin-top: 10px;
}
</style>
</head>
<body><div id="highlighted" class="hl-basic hidden-xs">
   <div class="container-fluid">
      <div class="row">
         <div class="col-sm-9 col-sm-offset-3 col-md-9 col-md-offset-3 col-lg-10 col-lg-offset-2">
            <h1>
               Recuperación de contraseña
            </h1>
         </div>
      </div>
   </div>
</div>
<div id="content" class="interior-page">
<div class="container-fluid">
<div class="row">

<!--Content-->
         <div class="col-md-5 forgot-form">
            <p>
               Por favor ingresa tu email y nosotros te enviaremos la información para cambiar tu contraseña
            </p>
            <label class="label-default" for="un">Email Address</label> <input id="email_addy" name="email_addy" class="form-control" type="text"><br>
            <a id="mybad" class="btn btn-primary" role="button">RESET</a>
         </div>
         <div class="col-md-5 forgot-return" style="display:none;">
            <h3>
               Reset Password Sent
            </h3>
            <p>
               An email has been sent to your address with a reset password you can use to access your account.
            </p>
         </div>
         <div class="col-md-2"></div>
         <div class="col-md-5"></div>
      </div>
   </div>
</div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>
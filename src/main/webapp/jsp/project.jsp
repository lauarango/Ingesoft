<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 
  Project:Sigere
  Developer:Tania Obando, Verónica Tofiño
  Contact email:taniaobando1998@gmail.com,veronicatofino@gmail.com
  Creation date: 29/04/2019
  Last modification: 15/05/2019
  -->
 <!doctype html>
<html>
	<head>
	    <title>Proyecto: ${name}</title>
	    <meta charset="utf-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	    <!-- Bootstrap CSS -->
	    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
	    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
		<style>
		.lupa{
			color:white;
		}
		
/* --------------------------------------- Calendar --------------------------------------------------------------------------*/
		 .cld-main{
		   width: 660px;
		  }
		  .cld-main a{
			color: #7B00FF;
		  }
		  
		  .cld-datetime{
		    position: relative;
		    width: 66%;
		    min-width: 100px;
		    max-width: 300px;
		    margin: auto;
		    overflow: hidden;
		  }
		  .cld-datetime .today{
			    position: relative;
			    float: left;
			    width: calc(100% - 40px);
			    margin: auto;
			    text-align: center;
		  }
		  .cld-nav{
			    position: relative;
			    width: 20px;
			    height: 20px;
			    margin-top: 2px;
		  }
		  .cld-nav:hover{
			    cursor: pointer;
		  }
		  .cld-nav:hover svg{
			      fill: #666;
		  }
		  .cld-rwd{
			    float: left;
		  }
		  .cld-fwd{
			    float: right;
		  }
		  .cld-nav svg:hover{
		   }
		  .cld-labels, .cld-days{
			  padding-left: 0;
		  }
		  .cld-label, .cld-day{
		    box-sizing: border-box;
		    display: inline-block;
		    width: 14.28%;
		    text-align: center;
		 }
		 .cld-day{
		    display: block;
		    float: left;
		    position: relative;
		    margin: 0;
		    padding: 5px;
		    height: 66px;
		    border: 1px solid #ddd;
		    overflow-y: auto;
		 }
		 .cld-day.clickable:hover{
		    cursor: pointer;
		 }
		 .cld-day.today{
		    border: 1px solid #7B00FF;
		 }
		 .cld-day.disableDay{
		    opacity: 0.5;
		 }
		 .cld-day.nextMonth, .cld-day.prevMonth{
		    opacity: 0.33;
		 }
		 .cld-number{
		    margin: 0;
		    text-align: left;
		 }
		 .cld-title{
		    font-size: 10px;
		    display: block;
		    margin: 0;
		    font-weight: normal;
		 }
		 .cld-day:hover{
		    background: #eee;
		 }
		 .cld-number.eventday{
		    font-weight: bold;
		 }
		 .cld-number.eventday:hover{
		   background: #eee;
		 }
		  .today .cld-number.eventday:hover{
		 }
/* ------------------------------------------------------------------------------------------------------------------------- */
		body {
	      font-family: Arial, sans-serif;
	      font-family: Calibri, sans-serif;
		  font-family: 'Roboto Condensed', sans-serif;
	      background-color:#f1f1f1;
	    }
	      
		html,body,header,h1,a,p {
			padding:0;
			margin:0;
		}
		#navbar {
		  overflow: hidden;
		  background-color: #333;
		  height:150%;
		}		
		#navbar a {
		  float: left;
		  display: block;
		  color: #333;
		  text-align: center;
		  padding: 8px 15px;
		  text-decoration: none;
		  font-size: 17px;
		}
		.my-header h1 { 
		    display: inline;
		    text-align:left; 
		    font-size:280%; 
		    color:rgb(171,0,15); 
		    font-family:Arial
		}
		.my-header span { 
	    	float: right;
			padding: 0px 10px;
		 }
		 .membersForm{
	        	float: right;
	          	overflow: hidden;
	          	color:white;
	      }
		* {
			box-sizing: border-box;
		}
			
			.search-container {
			  float: right;
			}
			
			.log-out {
			  float: right;
			}
			
			input[type=text] {
			  padding: 6px;
			  margin-top: 8px;
			  font-size: 17px;
			  border: none;
			}
			
			.search-container button {
			  float: right;
			  padding: 6px 10px;
			  margin-top: 8px;
			  margin-right: 16px;
			  background:#990000;
			  font-size: 17px;
			  border: none;
			  cursor: pointer;
			}
			
			.search-container button:hover {
			  background: #800000;
			}
			
			.content {
	          background-color: white;
	          padding: 10px;
	          margin:auto;
	        }
	        
			.main {
			  max-width: 960px;
			  margin:0px 100px;
			}
			
	        
	        .CreateRequeriment{
	        	float: right;
	          	overflow: hidden;
	          	color:white;
	        }
	
			
			.dropbtn {
			  background-color: #333;
			  color: white;
			  padding: 16px;
			  font-size: 16px;
			  border: none;
			  cursor: pointer;
			  float:right;
			}
			
			.dropdown {
			  float:right;
			  
			  
			}
			
			.dropdown-content {
			  display: none;
			  position:relative;
			  background-color: #595959;
			  min-width: 160px;
			  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
			  z-index: 1;
			}
			
			.dropdown-content a {
			  color: white;
			  padding: 12px 16px;
			  text-decoration: none;
			  display: block;
			  background-color: #595959;
			}
			
			.dropdown-content a:hover 
			{background-color: #595959;}
			
			.dropdown:hover .dropdown-content {
			  display: block;
			}
			
			.dropdown:hover .dropbtn {
			  background-color: #333;
			}
	
			.button {
			   
				background-color:#333;
			  	border: none;
			  	color: white;
			  	padding: 15px 32px;
			  	text-align: center;
			  	text-decoration: none;
			  	display: inline-block;
			  	font-size: 16px;
			  	cursor: pointer;
			  	float: right;
			}
			
			.btn, .btn:hover {
	          background-color:#333;
	          border: none;
	          color: white;
	          font-size: 20px;
	          cursor: pointer;
	          float:bottom;
	        }
	        
	        
	        :focus {
	  			outline: none;
			}
			.row {
			  margin-right: 0;
			  margin-left: 0;
			}
			
			
/*--------------------------------------------------------- List of Options -------------------------------------------------------------------*/	
			.absolute-wrapper{
			    position: fixed;
			    width: 300px;
			    height: 100%;
			    background-color: #f8f8f8;
			    border-right: 1px solid #e7e7e7;
			}
			
			.side-menu {
			  position: absolute;
			  width: 300px;
			  height: 100%;
			  background-color: #f8f8f8;
			  border-right: 1px solid #e7e7e7;
			}
			.side-menu .navbar {
			  border: none;
			}
			.side-menu .navbar-header {
			  width: 100%;
			  border-bottom: 1px solid #e7e7e7;
			}
			.side-menu .navbar-nav .active a {
			  background-color: transparent;
			  margin-right: -1px;
			  border-right: 5px solid #e7e7e7;
			}
			
			.side-menu .navbar-nav li {
			  display: block;
			  width: 100%;
			  border-bottom: 1px solid #e7e7e7;
			  color:red;
			}
			.side-menu .navbar-nav li a {
			  padding: 15px;
			}
			.side-menu .navbar-nav li a .glyphicon {
			  padding-right: 10px;
			}
			.side-menu #dropdown {
			  border: 0;
			  margin-bottom: 0;
			  border-radius: 0;
			  background-color: transparent;
			  box-shadow: none;
			}
			.side-menu #dropdown .caret {
			  float: right;
			  margin: 9px 5px 0;
			}
			.side-menu #dropdown .indicator {
			  float: right;
			}
			.side-menu #dropdown > a {
			  border-bottom: 1px solid #e7e7e7;
			}
			.side-menu #dropdown .panel-body {
			  padding: 0;
			  background-color: #f3f3f3;
			}
			.side-menu #dropdown .panel-body .navbar-nav {
			  width: 100%;
			}
			.side-menu #dropdown .panel-body .navbar-nav li {
			  padding-left: 15px;
			  border-bottom: 1px solid #e7e7e7;
			}
			.side-menu #dropdown .panel-body .navbar-nav li:last-child {
			  border-bottom: none;
			}
			.side-menu #dropdown .panel-body .panel > a {
			  margin-left: -20px;
			  padding-left: 35px;
			}
			.side-menu #dropdown .panel-body .panel-body {
			  margin-left: -15px;
			}
			.side-menu #dropdown .panel-body .panel-body li {
			  padding-left: 30px;
			}
			.side-menu #dropdown .panel-body .panel-body li:last-child {
			  border-bottom: 1px solid #e7e7e7;
			}
			.side-menu #search-trigger {
			  background-color: #f3f3f3;
			  border: 0;
			  border-radius: 0;
			  position: absolute;
			  top: 0;
			  right: 0;
			  padding: 15px 18px;
			}
			.side-menu .brand-name-wrapper {
			  min-height: 50px;
			}
			.side-menu .brand-name-wrapper .navbar-brand {
			  display: block;
			}
			.side-menu #search {
			  position: relative;
			  z-index: 1000;
			}
			.side-menu #search .panel-body {
			  padding: 0;
			}
			.side-menu #search .panel-body .navbar-form {
			  padding: 0;
			  padding-right: 50px;
			  width: 100%;
			  margin: 0;
			  position: relative;
			  border-top: 1px solid #e7e7e7;
			}
			.side-menu #search .panel-body .navbar-form .form-group {
			  width: 100%;
			  position: relative;
			}
			.side-menu #search .panel-body .navbar-form input {
			  border: 0;
			  border-radius: 0;
			  box-shadow: none;
			  width: 100%;
			  height: 50px;
			}
			.side-menu #search .panel-body .navbar-form .btn {
			  position: absolute;
			  right: 0;
			  top: 0;
			  border: 0;
			  border-radius: 0;
			  background-color: #f3f3f3;
			  padding: 15px 18px;
			}
			/* Main body section */
			.side-body {
			  margin-left: 310px;
			}
			/* small screen */
			@media (max-width: 768px) {
			  .side-menu {
			    position: relative;
			    width: 100%;
			    height: 0;
			    border-right: 0;
			    border-bottom: 1px solid #e7e7e7;
			  }
			  .side-menu .brand-name-wrapper .navbar-brand {
			    display: inline-block;
			  }
			  /* Slide in animation */
			  @-moz-keyframes slidein {
			    0% {
			      left: -300px;
			    }
			    100% {
			      left: 10px;
			    }
			  }
			  @-webkit-keyframes slidein {
			    0% {
			      left: -300px;
			    }
			    100% {
			      left: 10px;
			    }
			  }
			  @keyframes slidein {
			    0% {
			      left: -300px;
			    }
			    100% {
			      left: 10px;
			    }
			  }
			  @-moz-keyframes slideout {
			    0% {
			      left: 0;
			    }
			    100% {
			      left: -300px;
			    }
			  }
			  @-webkit-keyframes slideout {
			    0% {
			      left: 0;
			    }
			    100% {
			      left: -300px;
			    }
			  }
			  @keyframes slideout {
			    0% {
			      left: 0;
			    }
			    100% {
			      left: -300px;
			    }
			  }
			  /* Slide side menu*/
			  /* Add .absolute-wrapper.slide-in for scrollable menu -> see top comment */
			  .side-menu-container > .navbar-nav.slide-in {
			    -moz-animation: slidein 300ms forwards;
			    -o-animation: slidein 300ms forwards;
			    -webkit-animation: slidein 300ms forwards;
			    animation: slidein 300ms forwards;
			    -webkit-transform-style: preserve-3d;
			    transform-style: preserve-3d;
			  }
			  .side-menu-container > .navbar-nav {
			    /* Add position:absolute for scrollable menu -> see top comment */
			    position: fixed;
			    left: -300px;
			    width: 300px;
			    top: 43px;
			    height: 100%;
			    border-right: 1px solid #e7e7e7;
			    background-color: #f8f8f8;
			    -moz-animation: slideout 300ms forwards;
			    -o-animation: slideout 300ms forwards;
			    -webkit-animation: slideout 300ms forwards;
			    animation: slideout 300ms forwards;
			    -webkit-transform-style: preserve-3d;
			    transform-style: preserve-3d;
			  }
			  /* Uncomment for scrollable menu -> see top comment */
			  /*.absolute-wrapper{
			        width:285px;
			        -moz-animation: slideout 300ms forwards;
			        -o-animation: slideout 300ms forwards;
			        -webkit-animation: slideout 300ms forwards;
			        animation: slideout 300ms forwards;
			        -webkit-transform-style: preserve-3d;
			        transform-style: preserve-3d;
			    }*/
			  @-moz-keyframes bodyslidein {
			    0% {
			      left: 0;
			    }
			    100% {
			      left: 300px;
			    }
			  }
			  @-webkit-keyframes bodyslidein {
			    0% {
			      left: 0;
			    }
			    100% {
			      left: 300px;
			    }
			  }
			  @keyframes bodyslidein {
			    0% {
			      left: 0;
			    }
			    100% {
			      left: 300px;
			    }
			  }
			  @-moz-keyframes bodyslideout {
			    0% {
			      left: 300px;
			    }
			    100% {
			      left: 0;
			    }
			  }
			  @-webkit-keyframes bodyslideout {
			    0% {
			      left: 300px;
			    }
			    100% {
			      left: 0;
			    }
			  }
			  @keyframes bodyslideout {
			    0% {
			      left: 300px;
			    }
			    100% {
			      left: 0;
			    }
			  }
			  /* Slide side body*/
			  .side-body {
			    margin-left: 5px;
			    margin-top: 70px;
			    position: relative;
			    -moz-animation: bodyslideout 300ms forwards;
			    -o-animation: bodyslideout 300ms forwards;
			    -webkit-animation: bodyslideout 300ms forwards;
			    animation: bodyslideout 300ms forwards;
			    -webkit-transform-style: preserve-3d;
			    transform-style: preserve-3d;
			  }
			  .body-slide-in {
			    -moz-animation: bodyslidein 300ms forwards;
			    -o-animation: bodyslidein 300ms forwards;
			    -webkit-animation: bodyslidein 300ms forwards;
			    animation: bodyslidein 300ms forwards;
			    -webkit-transform-style: preserve-3d;
			    transform-style: preserve-3d;
			  }
			  /* Hamburger */
			  .navbar-toggle {
			    border: 0;
			    float: left;
			    padding: 18px;
			    margin: 0;
			    border-radius: 0;
			    background-color: #f3f3f3;
			  }
			  /* Search */
			  #search .panel-body .navbar-form {
			    border-bottom: 0;
			  }
			  #search .panel-body .navbar-form .form-group {
			    margin: 0;
			  }
			  .navbar-header {
			    /* this is probably redundant */
			    position: fixed;
			    z-index: 3;
			    background-color: #f8f8f8;
			  }
			  /* Dropdown tweek */
			  #dropdown .panel-body .navbar-nav {
			    margin: 0;
			  }
			}
/*------------------------------------------------------------------------------------------------------------------------------------*/		
			a:link,
        	a:visited{
	        	color:Black;
	        	font:Arial,bold;
	        	text-decoration:none;
	        	
	        }

		</style>
	</head>
	
	<body>
	  	<div id="navbar" class="my-header">
	  	 	<img src="https://i.ibb.co/YZsKKwR/gato-Blanco.png"" width="170" height="60">
	  	 	<div class="dropdown">
	  			<button class="dropbtn">Bienvenido,${firstname}  <i class="fa fa-caret-down"></i></button>
	  			<div class="dropdown-content">
	    			<div class="Profile">
	                   <button class="button">Perfil del Usuario</button>
	               </div>
	                <div class="Log-out">
	                      <form action="salir" method="get">
	                          <button class="button">Cerrar Sesión</button>
	                      </form>
	               </div>
	    		</div>
			</div>
	
	  	 	<div class="search-container">
			    <form action="/action_page.php">
			      <input type="text" placeholder="Buscar" name="search">
			      <button type="submit"><i class="fa fa-search lupa"></i></button>
			    </form>
		    </div>
			<button class="button">Notas</button>
			<!--<button class="button">Miembros</button>-->
			<div class="membersForm">
				<a href="miembros?id=${id}"><button class="btn"><i class="fa fa-users"></i></button></a>
				<!--<form id="MembersForm" action="members">
	      			<input type="submit" value="Miembros" />
	    		</form>-->
	    	</div>
	    	<div class="CreateRequeriment">
	            <a href="crearrequerimiento?id=${id}"><button class="btn"><i class="fa fa-plus-circle"></i></button></a>
			</div>
		</div>
		<div class="main">
			<div class="Zone">
				<br></br>
				<h3 style="font:Arial,bold; color:rgb(0,0,0); padding:0px 0px"> ${name}</h3>
				
				
			</div>
		 </div>
		
		<div class= "row"  style="padding-left: 100px"> 
		    <div class="absolute-wrapper"> </div>
		    <!-- Menu -->
			    <div class="side-menu">
					<nav class="navbar navbar-default" role="navigation">
					    <!-- Main Menu -->
					    <div class="side-menu-container">
					        <ul class="nav navbar-nav">
					            <li id="Reqs"><a><span class="glyphicon glyphicon-list-alt"></span> Requerimientos</a></li>
					            <li id="Diags"><a><span class="glyphicon glyphicon-camera"></span> Diagramas</a></li>
					            <li id="Cal"><a><span class="glyphicon glyphicon-calendar"></span> Calendario</a></li>
					            <li id="Intr"><a><span class="glyphicon glyphicon-pencil"></span> Introducción</a></li>
					            <li id="Descr"><a><span class="glyphicon glyphicon glyphicon-globe"></span> Descr. Global</a></li>
							</ul>
					    </div><!-- /.navbar-collapse -->
					</nav>
			    </div>
		
		    <!-- Main Content -->
		    <div class="container-fluid">
		        <div class="side-body">
		           <div class="tab-content" id="nav-tabContent">
					    <div class="Requeriments" id="Requirements">
						 	<table class="table" style="width:100%">
  								<thead align="center">
    								<tr>
		                        		<th scope="col">ID</th>
		                        		<th scope="col">Nombre</th>
		                        		<th scope="col">Tipo</th>
		                        		<th scope="col"><em class="fa fa-cog"></em></th>
	                    			</tr> 
	                  			</thead>
		                    	<tbody>
		                    		${requirements}
		                 		</tbody>
             		 		</table>	
 						</div>
					    <div class="Diagrams" id="Diagrams" style="display:none">
						    <h3>Diagramas</h3>
						    <p>AQUI VAN LOS DIAGRAMAS</p>
						</div>
						<div class="Calendar" id="Calendar" style="display:none">
						    <div id="caleandar">
   							</div>
					    </div>
					    <div class="Introduction" id="Intro" style="display:none">
					    	<h3 >Introducción</h3>
					    	<p>AQUI VA LA INTRODUCCIÓN </p>
					   	</div>
					   	<div class="GlobalDescr" id="GlobalDescr" style="display:none">
							<h3>Descripción Global</h3>
							<p>AQUI VA LA DESCRIPCIÓN GLOBAL </p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
	  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
		<script>
			$(function () {
			    $('.navbar-toggle').click(function () {
			        $('.navbar-nav').toggleClass('slide-in');
			        $('.side-body').toggleClass('body-slide-in');
			        $('#search').removeClass('in').addClass('collapse').slideUp(200);
		
			        /// uncomment code for absolute positioning tweek see top comment in css
			        //$('.absolute-wrapper').toggleClass('slide-in');
			        
			    });
			   
			   // Remove menu for searching
			   $('#search-trigger').click(function () {
			        $('.navbar-nav').removeClass('slide-in');
			        $('.side-body').removeClass('body-slide-in');
		
			        /// uncomment code for absolute positioning tweek see top comment in css
			        //$('.absolute-wrapper').removeClass('slide-in');
		
			    });
			});	
		</script>
		<script>
			$("#Reqs").on('click',function(){
				$("#Requirements").show();
				$("#Diagrams,#Calendar,#Intro,#GlobalDescr").hide();
				$("#Reqs").active();
			});
		</script>
		
		<script>
			$("#Diags").on('click',function(){
				$("#Diagrams").show();
				$("#Requirements,#Calendar,#Intro,#GlobalDescr").hide();
				$("#Diags").active();
			});
		</script>
		
		<script>
			$("#Cal").on('click',function(){
				$("#Calendar").show();
				$("#Diagrams,#Intro,#Requirements,#GlobalDescr").hide();
				$("#Cal").active();
			});
		</script>
		
		<script>
			$("#Intr").on('click',function(){
				$("#Intro").show();
				$("#Diagrams,#Calendar,#GlobalDescr,#Requirements").hide();
				$("#Intr").active();
			});
		</script>
		
		<script>
			$("#Descr").on('click',function(){
				$("#GlobalDescr").show();
				$("#Diagrams,#Calendar,#Intro,#Requirements").hide();
				$("#Descr").active();
			});
		</script>
		<script>
			var Calendar = function(model, options, date){
			  // Default Values
			  this.Options = {
			    Color: '',
			    LinkColor: '',
			    NavShow: true,
			    NavVertical: false,
			    NavLocation: '',
			    DateTimeShow: true,
			    DateTimeFormat: 'mmm, yyyy',
			    DatetimeLocation: '',
			    EventClick: '',
			    EventTargetWholeDay: false,
			    DisabledDays: [],
			    ModelChange: model
			  };
			  // Overwriting default values
			  for(var key in options){
			    this.Options[key] = typeof options[key]=='string'?options[key].toLowerCase():options[key];
			  }
			
			  model?this.Model=model:this.Model={};
			  this.Today = new Date();
			
			  this.Selected = this.Today
			  this.Today.Month = this.Today.getMonth();
			  this.Today.Year = this.Today.getFullYear();
			  if(date){this.Selected = date}
			  this.Selected.Month = this.Selected.getMonth();
			  this.Selected.Year = this.Selected.getFullYear();
			
			  this.Selected.Days = new Date(this.Selected.Year, (this.Selected.Month + 1), 0).getDate();
			  this.Selected.FirstDay = new Date(this.Selected.Year, (this.Selected.Month), 1).getDay();
			  this.Selected.LastDay = new Date(this.Selected.Year, (this.Selected.Month + 1), 0).getDay();
			
			  this.Prev = new Date(this.Selected.Year, (this.Selected.Month - 1), 1);
			  if(this.Selected.Month==0){this.Prev = new Date(this.Selected.Year-1, 11, 1);}
			  this.Prev.Days = new Date(this.Prev.getFullYear(), (this.Prev.getMonth() + 1), 0).getDate();
			};
			
			function createCalendar(calendar, element, adjuster){
			  if(typeof adjuster !== 'undefined'){
			    var newDate = new Date(calendar.Selected.Year, calendar.Selected.Month + adjuster, 1);
			    calendar = new Calendar(calendar.Model, calendar.Options, newDate);
			    element.innerHTML = '';
			  }else{
			    for(var key in calendar.Options){
			      typeof calendar.Options[key] != 'function' && typeof calendar.Options[key] != 'object' && calendar.Options[key]?element.className += " " + key + "-" + calendar.Options[key]:0;
			    }
			  }
			  var months = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];
			
			  function AddSidebar(){
			    var sidebar = document.createElement('div');
			    sidebar.className += 'cld-sidebar';
			
			    var monthList = document.createElement('ul');
			    monthList.className += 'cld-monthList';
			
			    for(var i = 0; i < months.length - 3; i++){
			      var x = document.createElement('li');
			      x.className += 'cld-month';
			      var n = i - (4 - calendar.Selected.Month);
			      // Account for overflowing month values
			      if(n<0){n+=12;}
			      else if(n>11){n-=12;}
			      // Add Appropriate Class
			      if(i==0){
			        x.className += ' cld-rwd cld-nav';
			        x.addEventListener('click', function(){
			          typeof calendar.Options.ModelChange == 'function'?calendar.Model = calendar.Options.ModelChange():calendar.Model = calendar.Options.ModelChange;
			          createCalendar(calendar, element, -1);});
			        x.innerHTML += '<svg height="15" width="15" viewBox="0 0 100 75" fill="rgba(255,255,255,0.5)"><polyline points="0,75 100,75 50,0"></polyline></svg>';
			      }
			      else if(i==months.length - 4){
			        x.className += ' cld-fwd cld-nav';
			        x.addEventListener('click', function(){
			          typeof calendar.Options.ModelChange == 'function'?calendar.Model = calendar.Options.ModelChange():calendar.Model = calendar.Options.ModelChange;
			          createCalendar(calendar, element, 1);} );
			        x.innerHTML += '<svg height="15" width="15" viewBox="0 0 100 75" fill="rgba(255,255,255,0.5)"><polyline points="0,0 100,0 50,75"></polyline></svg>';
			      }
			      else{
			        if(i < 4){x.className += ' cld-pre';}
			        else if(i > 4){x.className += ' cld-post';}
			        else{x.className += ' cld-curr';}
			
			        //prevent losing var adj value (for whatever reason that is happening)
			        (function () {
			          var adj = (i-4);
			          //x.addEventListener('click', function(){createCalendar(calendar, element, adj);console.log('kk', adj);} );
			          x.addEventListener('click', function(){
			            typeof calendar.Options.ModelChange == 'function'?calendar.Model = calendar.Options.ModelChange():calendar.Model = calendar.Options.ModelChange;
			            createCalendar(calendar, element, adj);} );
			          x.setAttribute('style', 'opacity:' + (1 - Math.abs(adj)/4));
			          x.innerHTML += months[n].substr(0,3);
			        }()); // immediate invocation
			
			        if(n==0){
			          var y = document.createElement('li');
			          y.className += 'cld-year';
			          if(i<5){
			            y.innerHTML += calendar.Selected.Year;
			          }else{
			            y.innerHTML += calendar.Selected.Year + 1;
			          }
			          monthList.appendChild(y);
			        }
			      }
			      monthList.appendChild(x);
			    }
			    sidebar.appendChild(monthList);
			    if(calendar.Options.NavLocation){
			      document.getElementById(calendar.Options.NavLocation).innerHTML = "";
			      document.getElementById(calendar.Options.NavLocation).appendChild(sidebar);
			    }
			    else{element.appendChild(sidebar);}
			  }
			
			  var mainSection = document.createElement('div');
			  mainSection.className += "cld-main";
			
			  function AddDateTime(){
			      var datetime = document.createElement('div');
			      datetime.className += "cld-datetime";
			      if(calendar.Options.NavShow && !calendar.Options.NavVertical){
			        var rwd = document.createElement('div');
			        rwd.className += " cld-rwd cld-nav";
			        rwd.addEventListener('click', function(){createCalendar(calendar, element, -1);} );
			        rwd.innerHTML = '<svg height="15" width="15" viewBox="0 0 75 100" fill="rgba(0,0,0,0.5)"><polyline points="0,50 75,0 75,100"></polyline></svg>';
			        datetime.appendChild(rwd);
			      }
			      var today = document.createElement('div');
			      today.className += ' today';
			      today.innerHTML = months[calendar.Selected.Month] + ", " + calendar.Selected.Year;
			      datetime.appendChild(today);
			      if(calendar.Options.NavShow && !calendar.Options.NavVertical){
			        var fwd = document.createElement('div');
			        fwd.className += " cld-fwd cld-nav";
			        fwd.addEventListener('click', function(){createCalendar(calendar, element, 1);} );
			        fwd.innerHTML = '<svg height="15" width="15" viewBox="0 0 75 100" fill="rgba(0,0,0,0.5)"><polyline points="0,0 75,50 0,100"></polyline></svg>';
			        datetime.appendChild(fwd);
			      }
			      if(calendar.Options.DatetimeLocation){
			        document.getElementById(calendar.Options.DatetimeLocation).innerHTML = "";
			        document.getElementById(calendar.Options.DatetimeLocation).appendChild(datetime);
			      }
			      else{mainSection.appendChild(datetime);}
			  }
			
			  function AddLabels(){
			    var labels = document.createElement('ul');
			    labels.className = 'cld-labels';
			    var labelsList = ["Dom", "Lun", "Mar", "Mier", "Jue", "Vier", "Sab"];
			    for(var i = 0; i < labelsList.length; i++){
			      var label = document.createElement('li');
			      label.className += "cld-label";
			      label.innerHTML = labelsList[i];
			      labels.appendChild(label);
			    }
			    mainSection.appendChild(labels);
			  }
			  function AddDays(){
			    // Create Number Element
			    function DayNumber(n){
			      var number = document.createElement('p');
			      number.className += "cld-number";
			      number.innerHTML += n;
			      return number;
			    }
			    var days = document.createElement('ul');
			    days.className += "cld-days";
			    // Previous Month's Days
			    for(var i = 0; i < (calendar.Selected.FirstDay); i++){
			      var day = document.createElement('li');
			      day.className += "cld-day prevMonth";
			      //Disabled Days
			      var d = i%7;
			      for(var q = 0; q < calendar.Options.DisabledDays.length; q++){
			        if(d==calendar.Options.DisabledDays[q]){
			          day.className += " disableDay";
			        }
			      }
			
			      var number = DayNumber((calendar.Prev.Days - calendar.Selected.FirstDay) + (i+1));
			      day.appendChild(number);
			
			      days.appendChild(day);
			    }
			    // Current Month's Days
			    for(var i = 0; i < calendar.Selected.Days; i++){
			      var day = document.createElement('li');
			      day.className += "cld-day currMonth";
			      //Disabled Days
			      var d = (i + calendar.Selected.FirstDay)%7;
			      for(var q = 0; q < calendar.Options.DisabledDays.length; q++){
			        if(d==calendar.Options.DisabledDays[q]){
			          day.className += " disableDay";
			        }
			      }
			      var number = DayNumber(i+1);
			      // Check Date against Event Dates
			      for(var n = 0; n < calendar.Model.length; n++){
			        var evDate = calendar.Model[n].Date;
			        var toDate = new Date(calendar.Selected.Year, calendar.Selected.Month, (i+1));
			        if(evDate.getTime() == toDate.getTime()){
			          number.className += " eventday";
			          var title = document.createElement('span');
			          title.className += "cld-title";
			          if(typeof calendar.Model[n].Link == 'function' || calendar.Options.EventClick){
			            var a = document.createElement('a');
			            a.setAttribute('href', '#');
			            a.innerHTML += calendar.Model[n].Title;
			            if(calendar.Options.EventClick){
			              var z = calendar.Model[n].Link;
			              if(typeof calendar.Model[n].Link != 'string'){
			                  a.addEventListener('click', calendar.Options.EventClick.bind.apply(calendar.Options.EventClick, [null].concat(z)) );
			                  if(calendar.Options.EventTargetWholeDay){
			                    day.className += " clickable";
			                    day.addEventListener('click', calendar.Options.EventClick.bind.apply(calendar.Options.EventClick, [null].concat(z)) );
			                  }
			              }else{
			                a.addEventListener('click', calendar.Options.EventClick.bind(null, z) );
			                if(calendar.Options.EventTargetWholeDay){
			                  day.className += " clickable";
			                  day.addEventListener('click', calendar.Options.EventClick.bind(null, z) );
			                }
			              }
			            }else{
			              a.addEventListener('click', calendar.Model[n].Link);
			              if(calendar.Options.EventTargetWholeDay){
			                day.className += " clickable";
			                day.addEventListener('click', calendar.Model[n].Link);
			              }
			            }
			            title.appendChild(a);
			          }else{
			            title.innerHTML += '<a href="' + calendar.Model[n].Link + '">' + calendar.Model[n].Title + '</a>';
			          }
			          number.appendChild(title);
			        }
			      }
			      day.appendChild(number);
			      // If Today..
			      if((i+1) == calendar.Today.getDate() && calendar.Selected.Month == calendar.Today.Month && calendar.Selected.Year == calendar.Today.Year){
			        day.className += " today";
			      }
			      days.appendChild(day);
			    }
			    // Next Month's Days
			    // Always same amount of days in calander
			    var extraDays = 13;
			    if(days.children.length>35){extraDays = 6;}
			    else if(days.children.length<29){extraDays = 20;}
			
			    for(var i = 0; i < (extraDays - calendar.Selected.LastDay); i++){
			      var day = document.createElement('li');
			      day.className += "cld-day nextMonth";
			      //Disabled Days
			      var d = (i + calendar.Selected.LastDay + 1)%7;
			      for(var q = 0; q < calendar.Options.DisabledDays.length; q++){
			        if(d==calendar.Options.DisabledDays[q]){
			          day.className += " disableDay";
			        }
			      }
			
			      var number = DayNumber(i+1);
			      day.appendChild(number);
			
			      days.appendChild(day);
			    }
			    mainSection.appendChild(days);
			  }
			  if(calendar.Options.Color){
			    mainSection.innerHTML += '<style>.cld-main{color:' + calendar.Options.Color + ';}</style>';
			  }
			  if(calendar.Options.LinkColor){
			    mainSection.innerHTML += '<style>.cld-title a{color:' + calendar.Options.LinkColor + ';}</style>';
			  }
			  element.appendChild(mainSection);
			
			  if(calendar.Options.NavShow && calendar.Options.NavVertical){
			    AddSidebar();
			  }
			  if(calendar.Options.DateTimeShow){
			    AddDateTime();
			  }
			  AddLabels();
			  AddDays();
			}
			
			function caleandar(el, data, settings){
			  var obj = new Calendar(data, settings);
			  createCalendar(obj, el);
			}
		</script>
		<script>
			var events = [
			  {'Date': new Date(2019, 4, 6), 'Title': 'Entrega Ingesoft'},
			  {'Date': new Date(2019, 4, 6), 'Title': 'New Garfield movie comes out!', 'Link': 'https://garfield.com'},
			  {'Date': new Date(2019, 4, 6), 'Title': '25 year anniversary', 'Link': 'https://www.google.com.au/#q=anniversary+gifts'},
			];
			var settings = {};
			var element = document.getElementById('caleandar');
			caleandar(element, events, settings);
			
			
			
		</script>
	</body>
</html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	<title>Bienvenido</title>
	<style>
	
		body {
          font-family: Arial;
          background-color:#f1f1f1;
          
        }
        
		html,body,header,h1,a,p {
			padding:0;
			margin:0;
		}
	
		#navbar {
		  overflow: hidden;
		  background-color: #333;
		}		
		#navbar a {
		  float: left;
		  display: block;
		  color: #333;
		  text-align: center;
		  padding: 14px 20px;
		  text-decoration: none;
		  font-size: 17px;
		}
		
		.Title1 {
			background-color:#333;
			padding:0px 20px;
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
		   .my-header .button {
		   
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
		
		* {
		  box-sizing: border-box;
		}
		
		.my-header .search-container {
		  float: right;
		}
		
		.my-header .log-out {
		  float: right;
		}
		
		.my-header input[type=text] {
		  padding: 6px;
		  margin-top: 8px;
		  font-size: 17px;
		  border: none;
		}
		
		.my-header .search-container button {
		  float: right;
		  padding: 6px 10px;
		  margin-top: 8px;
		  margin-right: 16px;
		  background:#990000;
		  font-size: 17px;
		  border: none;
		  cursor: pointer;
		}
		
		.my-header .search-container button:hover {
		  background: #800000;
		}
		
		.Projects {
			text-align:center; 
			color:red;
		}
		
		
		.row {
          margin: 10px -16px;
        }
        
        
        /* Add padding BETWEEN each column */
        .row,
        .row > .column {
          padding: 8px;
        }
        /* Create three equal columns that floats next to each other */
        .column {
          float: left;
          width: 25%; 
        }

        /* Clear floats after rows */ 
        .row:after {
          content: "";
          display: table;
          clear: both;
        }
        /* Content */
        .content {
          background-color: white;
          padding: 10px;
          margin:auto;
        }
        
		.main {
		  max-width: 960px;
		  margin:0px 100px;
		}
		
		
	</style>
</head>
<body>
  	<div id="navbar" class="my-header">
  	 	<h1>SIGERE</h1>
  	 	<button class="button">Cerrar Sesión</button>
  	 	<div class="search-container">
		    <form action="/action_page.php">
		      <input type="text" placeholder="Buscar" name="search">
		      <button type="submit"><i class="fa fa-search"></i></button>
		    </form>
	    </div>
		<button class="button">Crear Nuevo Proyecto</button>
	
	</div>
	<div class="main">
		<div class="Zone">
			<p style="font-size:150%; color:rgb(0,0,0); padding:10px 0px"> Zona de Proyectos:</p>
		
		</div>
		<div class="row">
	        <div class="column project">
	          <div class="content">
	            <img src="https://static.thenounproject.com/png/213124-200.png" alt="Market" style="width:50%; float:center">
	            <h4>Supermercado</h4>
	          </div>
	        </div>
	        <div class="column project">
	          <div class="content">
	            <img src="https://static.thenounproject.com/png/213124-200.png" alt="Market" style="width:50%">
	            <h4>Minimarket</h4>
	          </div>
	        </div>
	        <div class="column project">
	          <div class="content">
	            <img src="https://static.thenounproject.com/png/213124-200.png" alt="Market" style="width:50%">
	            <h4>Franquicia</h4>
	          </div>
	        </div>
	        
	        <div class="column project">
	          <div class="content">
	            <img src="https://static.thenounproject.com/png/213124-200.png" alt="Market" style="width:50%">
	            <h4>Sucursal</h4>
	          </div>
	        </div>
	  	</div>
	 </div>
  	<script>
		window.onscroll = function() {myFunction()};
		var navbar = document.getElementById("Title");
		var sticky = navbar.offsetTop;
		function myFunction() {
		  if (window.pageYOffset >= sticky) {
		    navbar.classList.add("sticky")
		  } else {
		    navbar.classList.remove("sticky");
		  }
		}
	</script>
</body>
</html>

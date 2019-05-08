<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<title>Bienvenido</title>
	<style>
		.lupa{
			color:white;
		}
	
		body {
          font-family: Arial, sans-serif;
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
        a:link,
        a:visited{
        	color:Black;
        	font:Arial,bold;
        	text-decoration:none;
        	font-size:110%;
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
        
        .CreateProject{
        	float: right;
          	overflow: hidden;
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
			
			.btn, .btn:hover {
	          background-color:#333;
	          border: none;
	          color: white;
	          font-size: 20px;
	          cursor: pointer;
	          float:bottom;
	          padding: 16px 35px;
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
	                      <form action="logout" method="get">
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
	    <div class="CreateProject">
		    <form action="crearproyecto">
				<button class="btn"><i class="fa fa-plus-circle"></i></button>
			</form>
		</div>
	
	</div>
	<div class="main">
		<div class="Zone">
			<p style="font-size:150%; color:rgb(0,0,0); padding-top:30px"> Tus proyectos:</p>
		
		</div>
		
		 <div class="row">
			 ${projects}
	         
	  	</div>
	 </div>
	 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
	 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
		
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Biblioteca</title>
</head>
<body>
	<header>
		<ul class="lista">
			<li class="lista__contenido"><a href="index.html">Volver</a></li>
			<li class="lista__contenido">Administración de las bibliotecas</li>
			<li class="lista__contenido">Bienvenido ${usuarioActual}</li>
		</ul>
	</header>

	<main>
		<div class="bodys">
	
		<table>
			<thead>
  			<tr>
    			<th>ID</th>
    			<th>Libro</th>
    			<th>Fecha de Alta</th>
    			<th>Estado</th>
    			<th><button> Actualizar </button></th>
    			<th><button> Eliminar </button></th>
  			</tr>
			</thead>
  			
  			  <c:forEach var= "item" items="${bibliotecas}">
  			     <tr>
  			        <td>${item.getID()}</td>
					<td>${item.getLibro()}</td>
					<td>${item.getFechaDeAlta()}</td>
					<td>${item.getEstado()}</td>
					
  			     </tr>
  			   </c:forEach>
  			  
  			</tr>
		</table>
	</div>
	</main>
</body>
<style>
header {
	height: 40px;
	align-content: center;
	background: salmon;
	font-size: 20px;
	padding: 15px;
}

.color {
	color: rgb(255, 255, 255);
	text-align: center;
	background-color: #F3A984;
	width: 300px;
	margin: auto;
}

body {
	width: 100%;
	height: 1500px;
	background-image: url(img/BibliotecaJose.jpg);
	background-position: center;
	background-repeat: no-repeat;
	background-size: cover;
}

.bodys {
	background-color: 632432;
	font-family: Arial;
}

.lista {
	display: flex;
	flex-direction: row;
	justify-content: space-around;
	color: white;
}

.lista__contenido {
	list-style-type: none;
	font-weight: bold;
}

main {
	display: flex;
	justify-content: center;
}

table {
	width: 500px;
}

table {
	background-color: white;
	text-align: left;
	width: 100px;
	margin: 0 auto;
	border-collapse: collapse;
}

thead {
	background-color: #F3A984;
	border-bottom: solid 5px #0f362d;
	color: rgb(255, 255, 255);
}

th {
	font-size: 15px;
	padding: 20px;
	text-align: center;
}

td {
	align-content: center;
	text-align: center;
}
</style>


</html>



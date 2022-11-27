<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clientes</title>
<style>
            <%@include file="/WEB-INF/vistas/css/index.css"%>
        </style>
</head>


<body>
	<main>

<header class="header">
            <div class="category">
                <div>
                    <h2>Clientes</h2>
                    <div>
                        <form method="get" action="AltaCliente.html" class="form">
                            <input type="submit" value="Alta Cliente" class="buttonStyle" />
                        </form>
                        <form method="get" action="ListaCliente.html" class="form">
                            <input type="submit" value="Lista Cliente" class="buttonStyle" />
                        </form>
                    </div>
                </div>
                <div>
                    <h2>Biblioteca</h2>
                    <div>
                        <form method="get" action="AltaLibro.html" class="form">
                            <input type="submit" value="Alta Libro" class="buttonStyle" />
                        </form>
                        <form method="get" action="ListaLibro.html" class="form">
                            <input type="submit" value="Lista Libro" class="buttonStyle" />
                        </form>
                    </div>
                </div>
                <div>
                    <h2>Préstamos</h2>
                    <div>
                        <form method="get" action="AltaPrestamo.html" class="form">
                            <input type="submit" value="Alta Préstamo" class="buttonStyle" />
                        </form>
                        <form method="get" action="ListaPrestamo.html" class="form">
                            <input type="submit" value="Lista Préstamo" class="buttonStyle" />
                        </form>
                    </div>
                </div>
            </div>
            <div class="user">
                <h2 class="navegacion">Bienvenido: ${usuarioActual}</h2>
                <form method="get" action="login.html" class="form">
                    <input type="submit" value="Cerrar Sesión" class="buttonStyle" />
                </form>
            </div>
        </header>
		<table id="example" class="table">
        	<thead>
					<tr>
						<th>ID</th>
						<th>NOMBRES</th>
						<th>APELLIDOS</th>
						<th>NACIONALIDAD</th>
						<th>EMAIL</th>
						<th>DIRECCION</th>
						<th>LOCALIDAD</th>
						<th>TELEFONO</th>
						<th>FECHA NACIMIENTO</th>
						<th>Eliminar</th>
						<th>Modificar</th>
						<th>Actualizar</th>
					</tr>
        	</thead>
        <tbody>
                <c:forEach items="${data}" var="item">
  				<tr>
					<td class="columna">${item.getID()}</td>
					<td class="columna_a">${item.getNombre()}</td>
					<td class="columna">${item.getApellido()}</td>
					<td class="columna_a">${item.getNacionalidad().getDescripcion()}</td>
					<td class="columna">${item.getEmail()}></td>
					<td class="columna_a">${item.getDireccion()}</td>
					<td class="columna">${item.getLocalidad()}</td>
					<td class="columna_a">${item.getTelefono()}</td>
					<td class="columna">${item.getFechaNacimiento().toString()}</td>
					<td>
						<form method="GET">
						<input type="button" value="Eliminar" class="buttonStyle" onClick="location.href = 'eliminarCliente.html?id=${item.getID()}'"></input>
					</form>
					</td>
					<td>
						<form method="GET">
							<input type="button" value="Modificar" id="button_eliminar" class="buttonStyle" onclick="location.href = 'paginaModificarCliente.html?id=${item.getID()}'">
							</input>
						</form>
					</td>
  				</tr>
			</c:forEach>
            </tbody>
    </table>

</main>

</body>

</html>



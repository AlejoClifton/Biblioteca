<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> <%@
taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
        <title>Alta Clientes</title>
        <style><%@include file="/WEB-INF/vistas/css/index.css"%></style>
    </head>

    <body>
        <main>
            <header class="header">
            <div class="category">
                <div>
                    <h2>Clientes</h2>
                    <div>
                        <form method="get" action="AltaCliente.html" class="form">
                            <input type="submit" value="Alta Cliente" class="buttonRedirect" />
                        </form>
                        <form method="get" action="ListaCliente.html" class="form">
                            <input type="submit" value="Lista Cliente" class="buttonRedirect" />
                        </form>
                    </div>
                </div>
                <div>
                    <h2>Biblioteca</h2>
                    <div>
                        <form method="get" action="AltaLibro.html" class="form">
                            <input type="submit" value="Alta Libro" class="buttonRedirect" />
                        </form>
                        <form method="get" action="ListaLibro.html" class="form">
                            <input type="submit" value="Lista Libro" class="buttonRedirect" />
                        </form>
                    </div>
                </div>
                <div>
                    <h2>Préstamos</h2>
                    <div>
                        <form method="get" action="AltaPrestamo.html" class="form">
                            <input type="submit" value="Alta Préstamo" class="buttonRedirect" />
                        </form>
                        <form method="get" action="ListaPrestamo.html" class="form">
                            <input type="submit" value="Lista Préstamo" class="buttonRedirect" />
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

            <div class="container">
                <h2>ALTA CLIENTE</h2>
                <div class="form">
                    <div class="formulario">
                        <form action="AgregarCliente.html" method="post">
                            <div>
                                <label for="DNI"> DNI </label>
                                <input id="DNI" type="text" name="dni" />
                            </div>
                            <div>
                                <label for="NOMBRE"> NOMBRE </label>
                                <input id="NOMBRE" type="text" name="nombre" />
                            </div>
                            <div>
                                <label for="APELLIDO"> APELLIDO </label>
                                <input id="APELLIDO" type="text" name="apellido" />
                            </div>
                            <div>
                                <label for="nacionalidad">
                                	NACIONALIDAD
                                </label>
                                <select name="nacionalidad">
                                    <option value="">--</option>
                                    <c:forEach var="obj" items="${nacionalidades}">
                                        <option value="${obj.getID()}">
                                            ${obj.getDescripcion()}
                                        </option>
                                    </c:forEach>
                                </select>
                            </div>
                            <div>
                                <label for="EMAIL"> EMAIL </label>
                                <input id="EMAIL" type="email" name="email" />
                            </div>
                            <div>
                                <label for="DIRECCION"> DIRECCION </label>
                                <input id="DIRECCION" type="text" name="direccion" />
                            </div>
                            <div>
                                <label for="LOCALIDAD"> LOCALIDAD </label>
                                <input id="LOCALIDAD" type="text" name="localidad" />
                            </div>
                            <div>
                                <label for="TELEFONO"> TELEFONO </label>
                                <input id="TELEFONO" type="text" name="telefono" />
                            </div>
                            <div>
                                <label for="FECHANACIMIENTO"> FECHA DE NACIMIENTO </label>
                                <input id="FECHANACIMIENTO" type="date" name="fechanacimiento" />
                            </div>
                            <input type="submit" value="Guardar" class="buttonRedirect"/>
                        </form>
                    </div>
                </div>
            </div>
        </main>
    </body>
</html>

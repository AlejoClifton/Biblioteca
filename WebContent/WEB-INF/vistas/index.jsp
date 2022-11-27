<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
        <title>Panel</title>
        <style><%@include file="/WEB-INF/vistas/css/index.css"%></style>
    </head>

    <body>
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
    </body>
</html>

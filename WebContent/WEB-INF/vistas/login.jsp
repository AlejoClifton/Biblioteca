<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
        <title>Login</title>
        <style><%@include file="/WEB-INF/vistas/css/index.css"%></style>
    </head>

    <body>
        <div class="container">
            <h2 class="title">ADMINISTRACIÓN</h2>

            <form method="get" action="index.html" class="form">
                <div>
                    <label for="txtUsuario">Ingrese su usuario: </label
                    ><input
                        type="text"
                        name="txtUsuario"
                        id="txtUsuario"
                    />
                </div>
                <div>
                    <label for="txtContrasenia">Ingrese su contraseña: </label>
                    <input
                        type="password"
                        name="txtContrasenia"
                        id="txtContrasenia"
                    />
                </div>
                <input type="submit" value="Logearse" class="buttonRedirect" />
            </form>
        </div>
    </body>
</html>
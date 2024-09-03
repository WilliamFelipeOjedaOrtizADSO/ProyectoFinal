<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registro</title>
    <link rel="stylesheet" href="recursos/css/styles.css">
</head>
<body>
<div class="contenedor">
    <img src="recursos/multimedia/logo.png" alt="Logo" class="contenedor__logo">
    <h2 class="contenedor__titulo">Registro</h2>
    <form action="RegistroServlet" method="post" id="formulario-registro" class="formulario">
        <div class="formulario__grupo">
            <label for="TipoDocumento" class="formulario__label">Tipo de Documento</label>
            <select class="formulario__input" id="TipoDocumento">
                <option value="">Seleccione su documento</option>
                <option value="TI">Tarjeta de identidad</option>
                <option value="CC">Cédula de ciudadanía</option>
                <option value="CE">Cédula de extranjería</option>
            </select>
        </div>
        <div class="formulario__grupo">
            <label for="nuevoDocumento" class="formulario__label">Documento</label>
            <input autocomplete="off" type="text" id="nuevoDocumento" class="formulario__input">
        </div>
        <div class="formulario__grupo">
            <%--@declare id="nuevonombre"--%><label for="nuevoNombre" class="formulario__label">Nombre y Apellido</label>
            <input autocomplete="off" type="text" id="nombre" class="formulario__input">
        </div>
        <div class="formulario__grupo">
            <label for="nuevaContrasena" class="formulario__label">Contraseña</label>
            <input autocomplete="off" type="password" id="nuevaContrasena" class="formulario__input">
        </div>
        <div class="formulario__grupo">
            <label for="ficha" class="formulario__label">N° de Ficha</label>
            <input autocomplete="off" type="text" id="ficha" class="formulario__input">
        </div>
        <div class="formulario__grupo">
            <label for="telefono" class="formulario__label">N° de Teléfono</label>
            <input autocomplete="off" type="text" id="telefono" class="formulario__input">
        </div>
        <div class="formulario__grupo">
            <label for="email" class="formulario__label">Correo Electrónico</label>
            <input autocomplete="off" type="text" id="email" class="formulario__input">
        </div>
        <button type="submit" class="formulario__boton">Registrarse</button>
        <div class="warnings">
            <p class="parrafo__warning" id="warnings"></p>
        </div>
    </form>
    <div class="contenedor__pie">
        <p>¿Ya tienes una cuenta? <a href="index.jsp">Inicia sesión aquí</a></p>
    </div>
</div>
<script src="recursos/js/register.js"></script>
</body>
</html>

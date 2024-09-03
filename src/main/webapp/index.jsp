<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="recursos/css/styles.css">
</head>
<body>
<div class="contenedor">
    <img src="recursos/multimedia/logo.png" alt="Logo" class="contenedor__logo">
    <h2 class="contenedor__titulo">Iniciar Sesión</h2>
    <form id="formulario-login" class="formulario">
        <div class="formulario__grupo">
            <label for="Documento" class="formulario__label">Documento</label>
            <select class="formulario__input" id="TipoDocumento" >
                <option value="">Seleccione su documento</option>
                <option value="TI">Tarjeta de identidad</option>
                <option value="CC">Cédula de ciudadanía</option>
                <option value="CE">Cédula de extranjería</option>
            </select>
        </div>
        <div class="formulario__grupo">
            <label class="formulario__label">Documento</label>
            <input autocomplete="off" type="text" id="Documento" class="formulario__input">
        </div>
        <div class="formulario__grupo">
            <label class="formulario__label">Nombre y Apellido</label>
            <input autocomplete="off" type="text" id="nombre" class="formulario__input">
        </div>
        <div class="formulario__grupo">
            <label for="password" class="formulario__label">Contraseña</label>
            <input type="password" id="password" class="formulario__input" >
        </div>
        <button type="submit" class="formulario__boton">Login</button>
        <div class="warnings">
            <p class="parrafo__warning" id="warnings"></p>
        </div>
    </form>
    <div class="contenedor__pie">
        <a href="reset-pasword.jsp" class="contenedor__enlace">¿Olvidaste tu contraseña?</a>
        <p>¿No tienes una cuenta? <a href="registro.jsp" class="contenedor__enlace">Regístrate aquí</a></p>
    </div>
</div>
<script src="recursos/js/login.js"></script>
</body>
</html>

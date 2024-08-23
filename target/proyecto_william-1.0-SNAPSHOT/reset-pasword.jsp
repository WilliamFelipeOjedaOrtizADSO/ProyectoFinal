<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Restablecer Contraseña</title>
    <link rel="stylesheet" href="recursos/css/styles.css">
</head>
<body>
<div class="contenedor">
    <img src="recursos/multimedia/logo.png" alt="Logo" class="contenedor__logo">
    <h2 class="contenedor__titulo">Restablecer Contraseña</h2>
    <form id="formulario-restablecer" class="formulario">
        <div class="formulario__grupo">
            <label for="resetEmail" class="formulario__label">Correo Electrónico</label>
            <input type="email" id="resetEmail" class="formulario__input" required>
        </div>
        <button type="submit" class="formulario__boton">Enviar</button>
    </form>
    <p>¿Ya tienes una cuenta? <a href="index.html" class="contenedor__enlace">Inicia sesión aquí</a></p>
</div>
<script src="recursos/js/script.js"></script>
</body>
</html>

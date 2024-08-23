document.getElementById("formulario-registro").addEventListener("submit", function(event) {
    let warnings = "";
    let entrar = false;
    let tipoDocumento = document.getElementById("TipoDocumento").value;
    let documento = document.getElementById("nuevoDocumento").value;
    let nombre = document.getElementById("nombre").value;
    let contrasena = document.getElementById("nuevaContrasena").value;
    let ficha = document.getElementById("ficha").value;
    let telefono = document.getElementById("telefono").value;
    let email = document.getElementById("email").value;
    let regexEmail = /^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/;

    if (tipoDocumento === "") {
        warnings += "Seleccione un tipo de documento.<br>";
        entrar = true;
    }

    if (documento.length < 6) {
        warnings += "El número de documento es demasiado corto.<br>";
        entrar = true;
    }

    if (nombre.length < 3) {
        warnings += "El nombre y apellido es demasiado corto.<br>";
        entrar = true;
    }

    if (contrasena.length < 8) {
        warnings += "La contraseña debe tener al menos 8 caracteres.<br>";
        entrar = true;
    }

    if (ficha === "") {
        warnings += "Ingrese su número de ficha.<br>";
        entrar = true;
    }

    if (telefono.length < 7) {
        warnings += "El número de teléfono es demasiado corto.<br>";
        entrar = true;
    }

    if (!regexEmail.test(email)) {
        warnings += "El correo electrónico no es válido.<br>";
        entrar = true;
    }

    if (entrar) {
        event.preventDefault();
        document.getElementById("warnings").innerHTML = warnings;
    }
});

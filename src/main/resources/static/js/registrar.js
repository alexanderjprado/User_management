$(document).ready(function() {
    //On ready
});


async function registrarUsuario() {

    let datos = {};
    datos.nombre = document.getElementById('textNombre').value;
    datos.apellido = document.getElementById('textApellido').value;
    datos.email = document.getElementById('textEmail').value;
    datos.password = document.getElementById('textPassword').value;

    let repetirPassword = document.getElementById('textRepeatPassword').value;

    if (repetirPassword != datos.password) {
        alert('Las contraseñas no coinciden.');
        return;
    }

    const request = await fecth('api/usuarios', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });
    const usuarios = await request.json();
}
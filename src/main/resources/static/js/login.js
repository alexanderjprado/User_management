$(document).ready(function() {
   // on ready
});


async function iniciarSesion() {
    let datos = {};
    datos.email = document.getElementById('textEmail').value;
    datos.password = document.getElementById('textPassword').value;

    const request = await fetch('api/login', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
    });
    const response = await request.text();
    if (response == 'OK') {
        window.location.href = 'usuarios.html'
    } else {
        alert("Alguno de los datos es incorrecto. Por favor, intenta nuevamente")
    }
}
function validarEmail(email) {
	var email = document.getElementById("email").value;
    var emailRegex = /^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$/;
    
    if (email.trim() === '') {
        return false;
        }
    
    if (!emailRegex.test(email)) {
        alert("El correo electrónico no es válido. Por favor, ingresa un correo electrónico válido.");
        return false;}
    
    return true;
}

function validaMinimode3(campo){
	if (campo.trim() === '') {
        return false;
        }
	if (campo.length < 3) {           
            return false;
        }
    return true;
}
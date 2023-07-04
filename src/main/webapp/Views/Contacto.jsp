<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="es" data-bs-theme="dark">
<head>
	<meta charset="UTF-8">

  	<meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<title>Formulario de contacto</title>
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" 
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
	<script <%@include file="Validaciones.js" %>></script>
	<script>
		function validar() {
			var email = document.getElementById("email").value;
			var nombre = document.getElementById("nombre").value;
	        var mensaje = document.getElementById("mensaje").value;
			 if (!validarEmail(email)) {
		            alert("El correo electrónico no es válido. Por favor, ingresa un correo electrónico válido.");
		            return false;
		        }
			 if (!validarMinimode3(nombre)) {
		            alert("El nombre no es válido. Por favor, ingresa un nombre válido.");
		            return false;
		        }
			 if (!validarMinimode3(mensaje)) {
		            alert("El mensaje no es válido. Por favor, ingresa un mensaje válido.");
		            return false;
		        }
			 return true;
    	} 
	</script>
</head>
<body class="text-white">
	<style type="text/css">
  		<%@include file="styles.css" %>
	</style>  	
	<div>
		<%@ include file="Menu.jsp" %>
	</div>
	
  	<div class="container pt-3 text-white cont-form">
    <h1 class="text-center titulo">Formulario de contacto</h1>
    <form action="Contacto" method="post" onsubmit="return validar();">

      <div class="form-group">
        <label for="nombre">Nombre:</label>
        <input type="text" class="form-control" name="nombre" id="nombre" placeholder="Ingresa tu nombre" minlength="3">
      </div>
      <div class="form-group">
        <label for="email">Email:</label>
        <input type="email" class="form-control" name="email" id="email" placeholder="Ingresa tu email">
      </div>
      <div class="form-group">
        <label for="mensaje">Mensaje:</label>
        <textarea class="form-control" name="mensaje" id="mensaje" rows="5" placeholder="Escribe tu mensaje" minlength="3"></textarea>
      </div>
      <button type="submit" class="btn btn-dark">Enviar</button>
    </form>
  </div>

	<div>
	<%@ include file="Footer.jsp" %>
	</div>

  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script> 
  
</body>
</html>

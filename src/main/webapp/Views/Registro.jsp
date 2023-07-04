<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro de usuarios</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
</head>
<body class="text-white">
	<style type="text/css">
  		<%@include file="styles.css" %>
	</style>
  	<div>
		<%@ include file="Menu.jsp" %>
	</div>
  	<div class="container pt-3 cont-form">

    	<h1 class="text-center titulo">Registro de Usuarios</h1>

    <form class="form" action="${pageContext.request.contextPath}/Usuario" method="POST" onsubmit="return validarFormulario()">
      	<div class="form-group">       		     
      		<input type="hidden" name="id" id="id" value="${usuario.getIdUsuario()}" required>      
      	</div>     
      <div class="form-group">
        <label for="rut">ingrese nombre<span class="text-danger">*</span></label>        
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="nombre" id="nombre" value="${usuario.getNombre()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="nombre" id="nombre" placeholder="Pedro Pablito" value="${usuario.getNombre()}" required>
		</c:if>		            
      </div>    
      
      <div class="form-group">
        <label for="username">Ingrese usuario <span class="text-danger">*</span></label>              
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="username" id="username" value="${usuario.getUsername()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="username" id="username" value="${usuario.getUsername()}">
  			
		</c:if>        
      </div>   
      <div class="form-group">
        <label for="password">Ingrese contraseña<span class="text-danger">*</span></label>              
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="password" id="password" value="${usuario.getPassword()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
					<input type="text" class="form-control" name="password" id="password" value="${usuario.getPassword()}">  			
		</c:if>        
      </div>  
      <div class="form-group">
        <label for="password2"> Ingrese nuevamente su contraseña <span class="text-danger">*</span></label>              
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="password2" id="password2" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="password2" id="password2">  			
		</c:if>        
      </div>    
     
      <a href="${pageContext.request.contextPath}/UsuariosList" class="btn btn-dark">Volver</a>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<button class="btn btn-dark" type="submit">Guardar</button>
		</c:if>        
    </form>
  </div>
  <div>
	<%@ include file="Footer.jsp" %>
	</div>
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <script>
  		function validarFormulario() {
  			var password1 = document.getElementById("password").value;
  			var password2 = document.getElementById("password2").value;
  			
  			if (password1 !== password2) {
  				alert("Las contraseñas no coinciden");
  				return false; // Prevenir el envío del formulario
  			}
  			return true; // Permitir el envío del formulario
  		}
  	</script>  
</body>
</html>
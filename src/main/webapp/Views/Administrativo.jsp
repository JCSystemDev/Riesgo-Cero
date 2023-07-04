<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang = "es">
<head>
<meta charset="ISO-8859-1">
<title>Formulario de Administrativos</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script <%@include file="Validaciones.js" %>></script>
<script>
		function validar() {
			var email = document.getElementById("correo").value;		
			 if (!validarEmail(email)) {
		            alert("El correo electrónico no es válido. Por favor, ingresa un correo electrónico válido.");
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
  	<div class="container pt-3 cont-form">

    	<h1 class="text-center titulo">Formulario de Administrativos</h1>

    <form class="form" action="${pageContext.request.contextPath}/Administrativo" method="POST" onsubmit="return validar();">
      	<div class="form-group">       		     
      		<input type="hidden" name="id" id="id" value="${administrativo.getIdAdministrativo()}" required>      
      	</div>     
      <div class="form-group">
        <label for="nombre">Nombre <span class="text-danger">*</span></label>        
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="nombre" id="nombre" value="${administrativo.getNombre()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="nombre" id="nombre" placeholder="Pedro Pablito" value="${administrativo.getNombre()}" required>
		</c:if>		            
      </div>    
      <div class="form-group">
        <label for="apellido">Apellido <span class="text-danger">*</span></label>        
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="apellido" id="apellido" value="${administrativo.getApellido()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="apellido" id="apellido" placeholder="Pedro Pablito" value="${administrativo.getApellido()}" required>
		</c:if>		            
      </div>  
      
      <div class="form-group">
        <label for="run">Run <span class="text-danger">*</span></label>              
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="run" id="run" value="${administrativo.getRun()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="run" id="run" value="${administrativo.getRun()}">  			
		</c:if>        
      </div>   
      <div class="form-group">
        <label for="correo">Correo <span class="text-danger">*</span></label>              
        <c:if test="${op.equals('read')}">
			<input type="email" class="form-control" name="correo" id="correo" value="${administrativo.getCorreo()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="email" class="form-control" name="correo" id="correo" value="${administrativo.getCorreo()}">  			
		</c:if>        
      </div> 
      <div class="form-group">
        <label for="area">Area <span class="text-danger">*</span></label>              
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="area" id="area" value="${administrativo.getArea()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="area" id="area" value="${administrativo.getArea()}">  			
		</c:if>        
      </div>    
     
      <a href="${pageContext.request.contextPath}/AdministrativoList" class="btn btn-dark">Volver</a>
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
</body>
</html>
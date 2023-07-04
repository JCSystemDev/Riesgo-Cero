<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es" data-bs-theme="dark">
<head>
<meta charset="ISO-8859-1">
<title>Formulario para Profesionales</title>
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

    	<h1 class="text-center titulo">Formulario para Profesionales</h1>
    	
    	<div>
    	<p class="h4 p-3"> Por favor, ingrese sus datos para facilitar el registro de sus futuras solicitudes</p>
    	</div>

    <form class="form" action="${pageContext.request.contextPath}/Profesional" method="POST">
      	<div class="form-group">       		     
      		<input type="hidden" name="id" id="id" value="${profesional.getIdProfesional()}" required>      
      	</div>     
      	
      	<div class="form-group">
        <label for="run">RUN <span class="text-danger">*</span></label>              
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="run" id="run" value="${profesional.getRun()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="run" id="run" value="${profesional.getRun()}">  			
		</c:if>        
      </div>   
      <div class="form-group">
        <label for="nombre">Nombre <span class="text-danger">*</span></label>        
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="nombre" id="nombre" value="${profesional.getNombreProfesional()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="nombre" id="nombre" placeholder="Pedro Pablito" value="${profesional.getNombreProfesional()}" required>
		</c:if>		            
      </div>    
      <div class="form-group">
        <label for="apellido">Apellido <span class="text-danger">*</span></label>        
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="apellido" id="apellido" value="${profesional.getApellidoProfesional()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="apellido" id="apellido" placeholder="Poblete Parra" value="${profesional.getApellidoProfesional()}" required>
		</c:if>		            
      </div>  
      
            <div class="form-group">
        <label for="correo">Correo Electrónico <span class="text-danger">*</span></label>              
        <c:if test="${op.equals('read')}">
			<input type="email" class="form-control" name="correo" id="correo" value="${profesional.getCorreo()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="email" class="form-control" name="correo" id="correo" value="${profesional.getCorreo()}">  			
		</c:if>        
      </div> 
      <div class="form-group">
        <label for="telefono"> Número de teléfono (+56_) <span class="text-danger">*</span></label>              
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="telefono" id="telefono" value="${profesional.getTelefono()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="telefono" id="telefono" placeholder="9XXXXXXXX" value="${profesional.getTelefono()}">  			
		</c:if>        
      </div>    
            
        <div class="form-group">
        <label for="cargo"> Cargo <span class="text-danger">*</span></label>        
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="cargo" id="cargo" value="${profesional.getCargo()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="cargo" id="cargo"  value="${profesional.getCargo()}" required>
		</c:if>		            
      </div>     
      
      <a href="${pageContext.request.contextPath}/ProfesionalList" class="btn btn-dark">Volver</a>
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
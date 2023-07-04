<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang = "es">
<head>
 	<meta charset="UTF-8">
 	<title>Formulario de Usuarios</title>  	
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

    	<h1 class="text-center titulo">Formulario de Usuarios</h1>

    <form class="form" action="${pageContext.request.contextPath}/Usuario" method="POST">
      	<div class="form-group">       		     
      		<input type="hidden" name="id" id="id" value="${usuario.getIdUsuario()}" required>      
      	</div>     
      <div class="form-group">
        <label for="rut">Nombre Usuario <span class="text-danger">*</span></label>        
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="nombre" id="nombre" value="${usuario.getNombre()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="nombre" id="nombre" placeholder="Pedro Pablito" value="${usuario.getNombre()}" required>
		</c:if>
		            
      </div>    
      
      <div class="form-group">
        <label for="lugar">Tipo <span class="text-danger">*</span></label>              
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="detalle" id="detalle" value="${usuario.getTipo()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="tipo" id="tipo" value="${usuario.getTipo()}" required>  			
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
</body>
</html>
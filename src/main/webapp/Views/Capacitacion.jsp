<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang = "es">
<head>
 	<meta charset="UTF-8">
 	<title>Formulario de Capacitación</title>  	
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

    	<h1 class="text-center titulo">Formulario de Capacitación</h1>

    <form class="form" action="${pageContext.request.contextPath}/Capacitacion" method="POST">
      	<div class="form-group">       		     
      		<input type="hidden" name="id" id="id" value="${capacitacion.getIdCapacitacion()}" required>      
      	</div>     
      <div class="form-group">
        <label for="rut">Nombre Cliente <span class="text-danger">*</span></label>        
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="nombre" id="nombre" value="${capacitacion.getNombre()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="nombre" id="nombre" placeholder="Pedro Pablito" value="${capacitacion.getNombre()}" required>
		</c:if>
		            
      </div>    
      
      <div class="form-group">
        <label for="lugar">Detalle <span class="text-danger">*</span></label>              
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="detalle" id="detalle" value="${capacitacion.getDetalle()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="detalle" id="detalle" value="${capacitacion.getDetalle()}" required>
		</c:if>        
      </div>         
      <div class="form-group">
        <label for="lugar">Lugar<span class="text-danger">*</span></label>              
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="lugar" id="lugar" value="${capacitacion.getLugar()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="lugar" id="lugar" value="${capacitacion.getLugar()}" required>
		</c:if>        
      </div> 
      <div class="form-group">
        <label for="lugar">Duración <span class="text-danger">*</span></label>              
        <c:if test="${op.equals('read')}">
			<input type="number" class="form-control" name="duracion" id="duracion" value="${capacitacion.getDuracion()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="number" class="form-control" name="duracion" id="duracion" value="${capacitacion.getDuracion()}" required>
		</c:if>        
      </div>  
      <div class="form-group">
        <label for="lugar">Cantidad<span class="text-danger">*</span></label>              
        <c:if test="${op.equals('read')}">
			<input type="number" class="form-control" name="cantidad" id="cantidad" value="${capacitacion.getCantidad()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="number" class="form-control" name="cantidad" id="cantidad" value="${capacitacion.getCantidad()}" required>
		</c:if>        
      </div>     
          
     
      <a href="${pageContext.request.contextPath}/Listados" class="btn btn-dark">Volver</a>
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

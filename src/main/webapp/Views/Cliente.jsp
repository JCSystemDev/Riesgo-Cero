<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es" data-bs-theme="dark">
<head>
<meta charset="ISO-8859-1">
<title>Formulario para Clientes</title>
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

    	<h1 class="text-center titulo">Formulario para Clientes</h1>
    	
    	<div>
    	<p class="h4 p-3"> Por favor, ingrese sus datos para facilitar el registro de sus futuras solicitudes</p>
    	</div>

    <form class="form" action="${pageContext.request.contextPath}/Cliente" method="POST">
      	<div class="form-group">       		     
      		<input type="hidden" name="id" id="id" value="${cliente.getIdCliente()}" required>      
      	</div>     
      	
      	<div class="form-group">
        <label for="run">RUN <span class="text-danger">*</span></label>              
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="run" id="run" value="${cliente.getRun()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="run" id="run" value="${cliente.getRun()}">  			
		</c:if>        
      </div>   
      <div class="form-group">
        <label for="nombre">Nombre <span class="text-danger">*</span></label>        
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="nombre" id="nombre" value="${cliente.getNombreCliente()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="nombre" id="nombre" placeholder="Pedro Pablito" value="${cliente.getNombreCliente()}" required>
		</c:if>		            
      </div>    
      <div class="form-group">
        <label for="apellido">Apellido <span class="text-danger">*</span></label>        
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="apellido" id="apellido" value="${cliente.getApellidoCliente()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="apellido" id="apellido" placeholder="Poblete Parra" value="${cliente.getApellidoCliente()}" required>
		</c:if>		            
      </div>  
      
            <div class="form-group">
        <label for="correo">Correo Electrónico <span class="text-danger">*</span></label>              
        <c:if test="${op.equals('read')}">
			<input type="email" class="form-control" name="correo" id="correo" value="${cliente.getCorreo()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="email" class="form-control" name="correo" id="correo" value="${cliente.getCorreo()}">  			
		</c:if>        
      </div> 
      <div class="form-group">
        <label for="telefono"> Número de teléfono (+569) <span class="text-danger">*</span></label>              
        <c:if test="${op.equals('read')}">
			<input type="number" class="form-control" name="telefono" id="telefono" value="${cliente.getTelefono()}" maxlength="8" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="number" class="form-control" name="telefono" id="telefono" placeholder="XXXXXXXX" value="${cliente.getTelefono()}" maxlength="8" >  			
		</c:if>        
      </div>    
      
      <div class="form-group">
        <label for="afp">AFP <span class="text-danger">*</span></label>        
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="afp" id="afp" value="${cliente.getAfp()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="afp" id="afp" value="${cliente.getAfp()}" required>
		</c:if>		            
      </div>       
    	<div class="form-group">
    		<label for="salud">Sistema de Salud <span class="text-danger">*</span></label>        
    		<c:if test="${op.equals('read')}">
        		<input type="text" class="form-control" name="sistema_salud" id="sistema_salud" value="${cliente.getSistemaSalud()}" disabled>
    		</c:if>
    		<c:if test="${op.equals('edit') || op.equals('new')}">
        		<select type="text" class="form-control" name="sistema_salud" id="sistema_salud" value="${cliente.getSistemaSalud()}" required>
            		<option value="Fonasa" ${cliente.getSistemaSalud() == 'Fonasa' ? 'selected' : ''}>Fonasa</option>
            		<option value="ISapre" ${cliente.getSistemaSalud() == 'ISapre' ? 'selected' : ''}>Isapre</option>
        		</select>
    		</c:if>		            
		</div>  
      <div class="form-group">
        <label for="direccion">Dirección (Ingrese sólo calle y número)<span class="text-danger">*</span></label>        
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="direccion" id="direccion" value="${cliente.getDireccion()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="direccion" id="direccion"  value="${cliente.getDireccion()}" required>
		</c:if>		            
      </div>  
      <div class="form-group">
        <label for="comuna"> Comuna <span class="text-danger">*</span></label>        
        <c:if test="${op.equals('read')}">
			<input type="text" class="form-control" name="comuna" id="comuna" value="${cliente.getComuna()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="text" class="form-control" name="comuna" id="comuna"  value="${cliente.getComuna()}" required>
		</c:if>		            
      </div>  
      
      <div class="form-group">
        <label for="edad">Edad <span class="text-danger">*</span></label>        
        <c:if test="${op.equals('read')}">
			<input type="number" class="form-control" name="edad" id="edad" value="${cliente.getEdad()}" disabled>
		</c:if>
		<c:if test="${op.equals('edit') || op.equals('new')}">
			<input type="number" class="form-control" name="edad" id="edad" placeholder="00" value="${cliente.getEdad()}" required>
		</c:if>		            
      </div>  
      
      <a href="${pageContext.request.contextPath}/ClienteList" class="btn btn-dark">Volver</a>
      
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
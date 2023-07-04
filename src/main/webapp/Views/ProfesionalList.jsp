<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es" data-bs-theme="dark">
<head>
	<meta charset="UTF-8">

  	<meta name="viewport" content="width=device-width, initial-scale=1.0">
  	<title>Profesionales</title>
  	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  	<link href="https://cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css" rel="stylesheet">
	<script src="https://kit.fontawesome.com/81a2ed02b0.js" crossorigin="anonymous"></script>
</head>
<body>
	<style type="text/css">
  		<%@include file="styles.css" %>
	</style>
	<%@ include file="Menu.jsp" %>
  	<div class="container pt-3 text-white">
    <h1 class="text-center titulo">Listado de Profesionales</h1>
   
    <table class="table" id="table_profesionales">
		<thead class="table-dark">
			<tr>
				<th>ID</th>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>RUN</th>	
				<th>Teléfono</th>
				<th>Correo electrónico</th>
				<th>Cargo</th>
				<th>Acciones</th>
					
			</tr>
		</thead>
		<tbody>
			<c:forEach var="l" items="${profesional}">
				<tr>
					<td><c:out value="${l.getIdProfesional()}"></c:out></td>	
					<td><c:out value="${l.getNombreProfesional()}"></c:out></td>			
					<td><c:out value="${l.getApellidoProfesional()}"></c:out></td>
					<td><c:out value="${l.getRun()}"></c:out></td>	
					<td><c:out value="${l.getTelefono()}"></c:out></td>	
					<td><c:out value="${l.getCorreo()}"></c:out></td>	
					<td><c:out value="${l.getCargo()}"></c:out></td>	
					<td>
						<a href="${pageContext.request.contextPath}/Profesional?id=${l.getIdProfesional()}&op=read"><i class="fa-solid fa-eye"></i></a>				
						<a href="${pageContext.request.contextPath}/Profesional?id=${l.getIdProfesional()}&op=edit"><i class="fa-solid fa-pen-to-square"></i></a>
						<a href="${pageContext.request.contextPath}/Profesional?id=${l.getIdProfesional()}&op=delete"><i class="fa-solid fa-trash"></i></a>					
					</td>
								
				</tr>
			</c:forEach>
				
		</tbody>
	</table>
  
  	</div>

	<div>
	<%@ include file="Footer.jsp" %>
	</div>

  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <script src="https://cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js"></script>
  
  <script>
			$(document).ready( function () {
		    	$('#table_profesionales').DataTable();
			});
		</script>
</body>
</html>
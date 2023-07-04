<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<!DOCTYPE html>
<html lang="es" data-bs-theme="dark">
<head>
	<meta charset="UTF-8">  
	<title>Inicio de sesión</title>	 
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" 
    integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" 
    crossorigin="anonymous">        
 </head>
  
<body class="body-login">
<style type="text/css">
  <%@include file="styles.css" %>
</style>
<div class="container cont_login">
    <h2>Inicio de sesión</h2>   
    <form class="form" action="${pageContext.request.contextPath}/Login" method="POST">
        <div class="form-group">
            <label for="username">Usuario:</label>
            <input type="text" id="username" name="username" class="form-control">
        </div>
        <div class="form-group">
            <label for="password">Contraseña:</label>
            <input type="password" id="password" name="password" class="form-control">	
        </div>
        <div class="form-group">
           <button type="submit" class="btn btn-primary">Iniciar</button>
        </div>
        <p class = "text-center">¿Primera vez con nosotros?</p>        
        <label class = "text-center" for="registro" align="center">   
        <a class="nav-link" href="<%=request.getContextPath()%>/Registro?op=new">Registrarse</a>
</label>
    </form>
</div>
	
</body>	
</html>
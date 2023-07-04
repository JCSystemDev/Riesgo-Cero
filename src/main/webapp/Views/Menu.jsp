<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="es" data-bs-theme="dark">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>RCASESORÍAS</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
</head>
<body>
  <nav class="gap-4 navbar navbar-expand-lg navbar-dark bg-black bg-opacity-50">
    <a class="navbar-brand" href="<%=request.getContextPath()%>/">
      <img class="redondeado float-end op-75" width=75 src=https://i.ibb.co/vY8d5bB/Logorc.png alt="logo">
    </a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
      aria-controls="navbarNav" aria-expanded="false" aria-label="Alternar navegación">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/">Inicio</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/Contacto">Contacto</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/Capacitacion?op=new">Capacitación</a>
        </li>
       
         <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Usuarios
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="<%=request.getContextPath()%>/Administrativo?op=new">Administrativo</a></li>
            <li><a class="dropdown-item" href="<%=request.getContextPath()%>/Cliente?op=new">Cliente</a></li>
            <li><a class="dropdown-item" href="<%=request.getContextPath()%>/Profesional?op=new">Profesional</a></li>
            
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/Listados">Listados Capacitaciones</a>
        </li>
        
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Listado de Usuarios
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="<%=request.getContextPath()%>/AdministrativoList">Listado de Administrativos</a></li>
            <li><a class="dropdown-item" href="<%=request.getContextPath()%>/ClienteList">Listado de Clientes</a></li>
            <li><a class="dropdown-item" href="<%=request.getContextPath()%>/ProfesionalList">Listado de Profesionales</a></li>
             <li><a class="dropdown-item" href="<%=request.getContextPath()%>/UsuariosList">Listado de Usuarios</a></li>
            
          </ul>
        </li>
       
        <c:choose>
          <c:when test="${sessionScope.isLogged}">
            <li class="nav-item">
              <a class="nav-link" href="<%=request.getContextPath()%>/Logout">Cerrar sesión</a>
            </li>
          </c:when>
          <c:otherwise>
            <li class="nav-item">
              <a class="nav-link" href="<%=request.getContextPath()%>/Login">Iniciar sesión</a>
            </li>
          </c:otherwise>
        </c:choose>               
      </ul>
    </div>
  </nav>

  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
  <script>
    document.getElementById('usuariosDropdown').addEventListener('click', function() {
      document.getElementById('usuariosMenu').classList.toggle('show');
    });
  </script>
</body>
</html>



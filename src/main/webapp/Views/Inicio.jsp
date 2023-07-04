<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" data-bs-theme="dark">
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"
 integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<title>RCASESORÍAS</title>
</head>
<body class="text-white">
	<style type="text/css">
  		<%@include file="styles.css" %>
	</style>  	
  	<%@ include file="Menu.jsp" %>
  	<div class="container pt-3">
  	<h2 class="text-center fw-bold display-8 titulo"> Bienvenidos a Riesgo Cero</h2>	
		<div class="p-3 mt-4 fw-semibold fs-4">
                    <div id="carouselExampleCaptions" class="carousel slide">

                        <div class="carousel-indicators">
                            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0"
                                class="active" aria-current="true" aria-label="Slide 1"></button>
                            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1"
                                aria-label="Slide 2"></button>
                            <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2"
                                aria-label="Slide 3"></button>
                        </div>
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <img class=" opacity-50 d-block w-100 border border-black rounded-end" height=250rem
                                    alt="handshake" src="https://i.ibb.co/Pm4LwXg/R-1.jpg">
                                <div class="carousel-caption d-¿one d-md-block">
                                    <h5>¿Por qué elegirnos?</h5>
                                    <p>Nos dedicamos a brindar soluciones integrales en asesorías de prevención de
                                        riesgos.</p>
                                </div>
                            </div>
                            <div class="carousel-item">
                                <img height=250rem
                                    src="https://i.ibb.co/Sv7Fq8Y/Y0jm-Qa3f-OVl-Ba-VIE6p-G1r-Lesk7ng1-P9fzk-QTb-Ksm.jpg"
                                    class="d-block w-100 opacity-50 border border-black rounded-end" alt="meeting">
                                <div class="carousel-caption d-none d-md-block">
                                    <h5>¿Qué nos mueve?</h5>
                                    <p>Nuestro principal objetivo es garantizar la seguridad y bienestar de tu empresa y
                                        sus trabajadores.</p>
                                </div>
                            </div>
                            <div class="carousel-item">
                                <img height=250rem src="https://i.ibb.co/ZgPFXPG/R.png"
                                    class="opacity-50 d-block w-100 border border-black rounded-end align-center"
                                    alt="accident">
                                <div class="carousel-caption d-none d-md-block">
                                    <h3>¿Qué esperas para contactarte con nosotros? </h3>
                                    <p></p>
                                </div>
                            </div>
                            <div class="carousel-item">
                                <img height=250rem width=900rem src="https://i.ibb.co/BGLTgpd/logo2-0.png"
                                    class="border border-black rounded-end d-block opacity-50" alt="logo">
                                <div class="carousel-caption d-none d-md-block">
                                    <h1 class="text-light">Riesgo Cero</h1>
                                    <h3 class="text-light">Nosotros te cuidamos.</h3>
                                </div>
                            </div>
                        </div>
                        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions"
                            data-bs-slide="prev">
                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                            <span class="visually-hidden">Anterior</span>
                        </button>
                        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions"
                            data-bs-slide="next">
                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                            <span class="visually-hidden">Siguiente</span>
                        </button>
                    </div>
                </div>

                <div class="container w-75">
                    <div class="accordion" id="accordionExample">
                        <div class="accordion-item">
                            <h2 class="accordion-header">
                                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                                    data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                                    Experiencia y conocimiento:
                                </button>
                            </h2>
                            <div id="collapseOne" class="accordion-collapse collapse"
                                data-bs-parent="#accordionExample">
                                <div class="accordion-body">
                                    <p>Contamos con un equipo de expertos altamente capacitados en el campo de
                                        la prevención de riesgos. Con años de experiencia en diversas industrias,
                                        estamos preparados para enfrentar
                                        cualquier desafío y ofrecer las mejores soluciones.</p>
                                </div>
                            </div>
                        </div>
                        <div class="accordion-item">
                            <h2 class="accordion-header">
                                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                                    data-bs-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
                                    Enfoque personalizado:
                                </button>
                            </h2>
                            <div id="collapseTwo" class="accordion-collapse collapse"
                                data-bs-parent="#accordionExample">
                                <div class="accordion-body">
                                    <p>Reconocemos que cada empresa es única, por lo que adaptamos nuestras
                                        estrategias y planes de acción de acuerdo
                                        a tus necesidades específicas. Trabajamos de cerca contigo para entender tus
                                        requerimientos y desarrollar un plan de prevención de
                                        riesgos personalizado.</p>
                                </div>
                            </div>
                        </div>
                        <div class="accordion-item">
                            <h2 class="accordion-header">
                                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                                    data-bs-target="#collapseThree" aria-expanded="true" aria-controls="collapseThree">
                                    Soluciones integrales:
                                </button>
                            </h2>
                            <div id="collapseThree" class="accordion-collapse collapse"
                                data-bs-parent="#accordionExample">
                                <div class="accordion-body">
                                    <p>Ofrecemos una amplia gama de servicios en prevención de riesgos,
                                        incluyendo evaluaciones de riesgos,implementación de medidas de seguridad, 
                                        capacitación para empleados, auditoríasy mucho  más. Nuestro enfoque integral nos permite
                                        cubrir todos los aspectos necesarios para garantizar un entorno laboral seguro y
                                        cumplir con las normativas vigentes.</p>

                                </div>
                            </div>
                        </div>
                        <div class="accordion-item">
                            <h2 class="accordion-header">
                                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                                    data-bs-target="#collapseFour" aria-expanded="true" aria-controls="collapseFour">
                                    Calidad y compromiso:
                                </button>
                            </h2>
                            <div id="collapseFour" class="accordion-collapse collapse"
                                data-bs-parent="#accordionExample">
                                <div class="accordion-body">
                                    <p>Nos enorgullece brindar un servicio de la más alta calidad a nuestros
                                        clientes. Trabajamos con ética,
                                        responsabilidad y compromiso, asegurando resultados excelentes y la satisfacción
                                        total de nuestros clientes.</p>
                                </div>
                            </div>
                        </div>
                        <div class="accordion-item">
                            <h2 class="accordion-header">
                                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse"
                                    data-bs-target="#collapseFive" aria-expanded="true" aria-controls="collapseFive">
                                    Tecnología y actualización:
                                </button>
                            </h2>
                            <div id="collapseFive" class="accordion-collapse collapse"
                                data-bs-parent="#accordionExample">
                                <div class="accordion-body">
                                    <p>Mantenemos un enfoque constante en la actualización de nuestros
                                        conocimientos y herramientas.
                                        Utilizamos tecnología de vanguardia y seguimos de cerca las últimas tendencias y
                                        regulaciones en prevención de riesgos para
                                        brindarte soluciones efectivas y actualizadas.</p>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
                <div class="p-4">
                    <div class="d-flex container gap-2 justify-content-center lead">

                        <a class="fs-4 link-body-emphasis text-decoration-none" href="<%=request.getContextPath()%>/Contacto">
                        Contáctanos hoy mismo!</a>                        
                    </div>
                    <div class="container">
                        <p class="fs-5 text-center">Así podrás conocer más sobre nuestros servicios y sobre cómo podemos ayudarte. </p>
                        <p class="fs-5 text-center">¡Estamos listos para trabajar contigo!</p>
                    </div>
                </div>

		
		<div>
	<%@ include file="Footer.jsp" %>
	</div>
		</div>
		 <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>        
         <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
		
	</body>
</html>
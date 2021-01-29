<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ attribute name="title" fragment="true"%>

<!DOCTYPE html>
<html>
<head>
	<title><jsp:invoke fragment="title" /></title>

 	<!-- <meta charset="UTF-8"> -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

	<base href="/adopteunchat-filrouge-maven-jee/" />
	<link rel="stylesheet"
		href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
		integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
		crossorigin="anonymous" />
	<link rel="stylesheet" href="assets/style.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css" integrity="sha512-HK5fgLBL+xu6dm/Ii3z4xhlSUyZgTT9tuc/hSrtw6uzJOvgRr2a9jyxxT1ely+B+xFAmJKVSTbpM/CuL7qxO8w==" crossorigin="anonymous" />
   <!--  <link rel="stylesheet" href="/asset/fontawesome-free-5.15.2-web/css/all.css"> -->
   <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/js/all.min.js" integrity="sha512-UwcC/iaz5ziHX7V6LjSKaXgCuRRqbTp1QHpbOJ4l1nw2/boCfZ2KlFIqBUA/uRVF0onbREnY9do8rM/uT/ilqw==" crossorigin="anonymous"></script>
    <!-- <script src="/asset/fontawesome-free-5.15.2-web/js/all.js"></script> -->
    
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>    
	
</head>

<body>
	<!-- 		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="nav-link" href="home">Accueil</a>
			<a class="nav-link" href="produits">Produits</a>
			<a class="nav-link" href="fournisseurs">Fournisseurs</a>
			<a class="nav-link" href="categories">Cat�gories</a>
		</nav> -->

	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">

			<a class="navbar-brand" href="accueil">Adopte un chat <i
				style="font-size: 2em;" class="fas fa-cat"></i>
			</a>

			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav me-auto mb-2 mb-lg-0">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="accueil">Accueil</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="compte">Mon compte</a></li>
						
					<c:if test="${connexionId!=null}">
						
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="mon-espace">Mon espace</a></li>
						
					</c:if>	
						
					<c:if test="${connexionId!=null}">
					
						<li class="nav-item">
							<a class="nav-link active"
							aria-current="page" href="deconnexion">
								<button type="button" class="btn btn-warning">D�connexion</button>
							</a>
						</li>
					                
					</c:if>	
					
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<div style="margin-top: 30px; margin-bottom: 30px;">
			<h4>
				<jsp:invoke fragment="title" />
			</h4>
		</div>

		<jsp:doBody />
	</div>
</body>
</html>
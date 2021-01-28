<%@ attribute name="title" fragment="true"%>

<!DOCTYPE html>
<html>
<head>
	<title><jsp:invoke fragment="title" /></title>

 	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

	<base href="/adopteunchat-filrouge-maven-jee/" />
	<link rel="stylesheet"
		href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
		integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2"
		crossorigin="anonymous" />
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="asset/style.css">
    <link rel="stylesheet" href="asset/fontawesome-free-5.15.2-web/css/all.css">
    <script src="asset/fontawesome-free-5.15.2-web/js/all.js"></script>
	
</head>

<body>
	<!-- 		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="nav-link" href="home">Accueil</a>
			<a class="nav-link" href="produits">Produits</a>
			<a class="nav-link" href="fournisseurs">Fournisseurs</a>
			<a class="nav-link" href="categories">Catégories</a>
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
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="mon-espace">Mon espace</a></li>
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
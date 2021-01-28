<%@ attribute name="title" fragment="true" %>

<!DOCTYPE html>
<html>
	<head>
		<title>
			<jsp:invoke fragment="title" />
		</title>
		
		<base href="/formation-jee/" />
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous" />
	</head>
	
	<body>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
			<a class="nav-link" href="home">Accueil</a>
			<a class="nav-link" href="produits">Produits</a>
			<a class="nav-link" href="fournisseurs">Fournisseurs</a>
			<a class="nav-link" href="categories">Catégories</a>
		</nav>
		
		<div class="container">
			<h1>
				<jsp:invoke fragment="title" />
			</h1>
			
			<jsp:doBody />
		</div>
	</body>
</html>
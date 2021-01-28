<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="asset/fontawesome-free-5.15.2-web/css/all.css">
    <script src="asset/fontawesome-free-5.15.2-web/js/all.js"></script>
</head>
<body>

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">

            <a class="navbar-brand" href="accueil.html">Adopte un chat <i style="font-size: 2em;" class="fas fa-cat"></i> </a>
  
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="accueil.html">Accueil</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="compte.html">Mon compte</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link active" aria-current="page" href="mon-espace.html">Mon espace</a>
              </li>
            </ul>
            </div>
        </div>
      </nav>
    
</body>
</html> --%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:layout>
	<jsp:attribute name="title">
		<c:if test="${ categorie == null }">Ajouter une catégorie</c:if>
		<c:if test="${ categorie != null }">Modifier la catégorie "${ categorie.libelle }"</c:if>
	</jsp:attribute>
	
	<jsp:body>
		<form method="POST">
			<div class="form-group row">
				<label for="libelle" class="col-sm-2 col-form-label">Libellé</label>
				<div class="col-sm-10">
					<input	type="text"
							class="form-control"
							id="libelle" name="libelle"
							value="${ categorie.libelle }"
							placeholder="Libellé" />
				</div>
			</div>
			
			<div class="form-group row">
				<a class="col-sm-2 mr-5 btn btn-danger" href="categories">Annuler</a>
				<c:if test="${ categorie == null }">
					<input type="submit" class="col-sm-2 btn btn-success" value="Ajouter" />
				</c:if>
				
				<c:if test="${ categorie != null }">
					<input type="submit" class="col-sm-2 btn btn-warning" value="Modifier" />
				</c:if>
			</div>
  		</form>
	</jsp:body>
</t:layout>
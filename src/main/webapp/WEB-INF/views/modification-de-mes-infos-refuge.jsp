<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

    
    <div class="container">

        <div class="container">
            <div style="margin-top: 30px; margin-bottom: 30px;">
                <h4>
                    Modification de mes informations
                </h4>
            </div>
            
            <div class="row" style="margin: 5px;">
                <div class="col-auto">
                    <label for="inputLastname" style="width: 150px;" id="inputLastname" class="col-form-label">Nom</label>
                </div>
                <div class="col-auto">
                    <input type="text" id="inputLastname" class="form-control">
                </div>
            </div>
    
            <div class="row" style="margin: 5px;">
                <div class="col-auto">
                    <label for="inputEmail" style="width: 150px;" class="col-form-label">Email</label>
                </div>
                <div class="col-auto">
                    <input type="email" id="inputEmail" class="form-control">
                </div>
            </div>
    
            <div class="row" style="margin: 5px;">
                <div class="col-auto">
                    <label for="inputPhone" style="width: 150px;" class="col-form-label">Numéro de téléphone</label>
                </div>
                <div class="col-auto">
                    <input type="tel" id="inputPhone" class="form-control" pattern="[0-9]{10}" placeholder="06 00 00 00 00">
                </div>
            </div>

            <div style="margin-top: 30px;">
                <h5>
                    Adresse:
                </h5>
            </div>
    
            <div class="row" style="margin: 5px;">
                <div class="col-auto">
                    <label for="inputAdresseNumber" style="width: 150px;" class="col-form-label">Numéro</label>
                </div>
                <div class="col-auto">
                    <input type="text" id="inputAdresseNumber" class="form-control">
                </div>
            </div>
    
            <div class="row" style="margin: 5px;">
                <div class="col-auto">
                    <label for="inputAdresseStreet" style="width: 150px;" class="col-form-label">Voie</label>
                </div>
                <div class="col-auto">
                    <input type="text" id="inputAdresseStreet" class="form-control">
                </div>
            </div>
    
            <div class="row" style="margin: 5px;">
                <div class="col-auto">
                    <label for="inputAdressePostalCode" style="width: 150px;" class="col-form-label">Code Postal</label>
                </div>
                <div class="col-auto">
                    <input type="text" id="inputAdressePostalCode" class="form-control">
                </div>
            </div>
    
            <div class="row" style="margin: 5px;">
                <div class="col-auto">
                    <label for="inputAdresseTown"  style="width: 150px;" class="col-form-label">Ville</label>
                </div>
                <div class="col-auto">
                    <input type="text" id="inputAdresseTown" class="form-control">
                </div>
            </div>
    
            <div class="row" style="margin: 5px; margin-top:40px;">
                <div class="col-auto">
                    <label for="inputOldPassword" style="width: 150px;" class="col-form-label">Ancien mot de passe</label>
                </div>
                <div class="col-auto">
                    <input type="password" id="inputOldPassword" class="form-control" aria-describedby="passwordHelpInline">
                </div>
    
                
            </div>
    
            <div class="row" style="margin: 5px;">
                <div class="col-auto">
                    <label for="inputPassword" style="width: 150px;" class="col-form-label"> Nouveau mot de passe</label>
                </div>
                <div class="col-auto">
                    <input type="password" id="inputPassword" class="form-control" aria-describedby="passwordHelpInline">
                </div>
                <div class="col-auto">
                    <span id="passwordHelpInline" class="form-text">
                    Doit faire entre 8 et 20 caractères.
                    </span>
                </div>
    
                
            </div>
            
            <div class="row" style="margin: 5px; margin-bottom: 20px;">
                <div class="col-auto">
                    <label for="confPassword" style="width: 150px;" class="col-form-label">Confirmer votre nouveau mot de passe</label>
                </div>
                <div class="col-auto">
                    <input type="password" id="confPassword" class="form-control" aria-describedby="passwordHelpInline">
                </div>
            </div>
    
            <a href="mon-espace.html" class="btn btn-secondary" role="button" aria-pressed="true">Annuler</a>
            <button type="submit" class="btn btn-success">Enregistrer mes modifications</button>
        </div>


       

</body>
</html>
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

        <div class="row">
        </div>

        

        <div class="row">
            <div class="col-2">
                
            </div>

            <div class="col-4">
              <div class="compte">
                <div>
                  <h5>Connectez-vous!</h5>
                </div>
                
                <div>
                  <h6>Vous êtes déjà inscrit</h6>
                </div>

                <div style="margin-bottom: 5px;">
                  Entrez votre adresse email et votre mot de passe pour 
                  modifier vos préférences et gérer vos abonnements :
                </div>
                
                <form>
                    <div class="mb-3">
                      <label for="InputEmail" class="form-label">Adresse mail</label>
                      <input type="email" class="form-control" id="InputEmail" aria-describedby="emailHelp">
                      <div id="emailHelp" class="form-text"></div>
                    </div>
                    <div class="mb-3">
                      <label for="InputPassword" class="form-label">Mot de passe</label>
                      <input type="password" class="form-control" id="InputPassword">
                    </div>
                    <div class="mb-3 form-check">
                      <input type="checkbox" class="form-check-input" id="Check">
                      <label class="form-check-label" for="Check">Rester connecté</label>
                    </div>
                    <button type="submit" class="btn btn-secondary">Connexion</button>
                </form>
              </div>
            </div>
            
            <div class="col-4">

                <div class="compte">
                    <div>
                      <h5>Inscription des particuliers</h5>
                    </div>
                    
                    <div>
                      <h6>Vous n'êtes pas encore inscrit</h6>
                    </div>

                    <div style="margin-bottom: 5px;">
                        Créez votre compte, il vous permettra de recevoir automatiquement 
                        par e-mail les nouvelles annonces qui correspondent à 
                        vos critères de recherche. 
                    </div>

                    <div>

                        <a href="inscription-adoptant.html" class="btn btn-secondary" role="button" aria-pressed="true">Créer mon compte</a>
                    </div>

                </div>

                <div class="compte">
                  <div>
                    <h5>Inscription des refuges et associations</h5>
                  </div>
                    <h6>Vous n'êtes pas encore inscrit</h6>
                  <div>

                  <div style="margin-bottom: 5px;">
                      En adhérant à Adopte un chat vous aurez la possibilité de vous faire connaitre 
                      et d’annoncer les animaux que vous offrez à l’adoption pour leur assurer une large 
                      diffusion sur Internet. 
                  </div>

                  <div>
                      <a href="inscription-refuge.html" class="btn btn-secondary" role="button" aria-pressed="true">Adhérer à Adopte un chat</a>
                  </div>
                </div>
                
            </div>

              <div class="col-2">
                
              </div>
          
          
        </div>

      </div>
    
</body>
</html>
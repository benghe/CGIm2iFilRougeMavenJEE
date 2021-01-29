<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:layout>
	<jsp:attribute name="title">
		Cr�ation d'un compte adoptant
	</jsp:attribute>

	<jsp:body>
    
    <div class="container">
    
    
        <form method="POST" oninput='confPassword.setCustomValidity(confPassword.value != inputPassword.value ? "Passwords do not match." : "")'>
        
        
       
		        <div class="row" style="margin: 5px;">
		            <div class="col-auto">
		                <label for="inputLastname" style="width: 150px;" id="inputLastname" class="col-form-label">Nom</label>
		            </div>
		            <div class="col-auto">
		                <input type="text" id="inputLastname" name="inputLastname" class="form-control" required>
		            </div>
		        </div>
		
		        <div class="row" style="margin: 5px;">
		            <div class="col-auto">
		                <label for="inputFirstname" style="width: 150px;" class="col-form-label">Pr�nom</label>
		            </div>
		            <div class="col-auto">
		                <input type="text" id="inputFirstname" name="inputFirstname" class="form-control" required>
		            </div>
		        </div>
		
		        <div class="row" style="margin: 5px;">
		            <div class="col-auto">
		                <label for="inputEmail" style="width: 150px;" class="col-form-label">Email</label>
		            </div>
		            <div class="col-auto">
		                <input type="email" id="inputEmail" name="inputEmail" class="form-control" required>
		            </div>
		        </div>
		
		        <div class="row" style="margin: 5px;">
		            <div class="col-auto">
		                <label for="inputPhone" style="width: 150px;" class="col-form-label">Num�ro de t�l�phone</label>
		            </div>
		            <div class="col-auto">
		                <input type="tel" id="inputPhone" name="inputPhone" class="form-control" pattern="[0-9]{10}" placeholder="06 00 00 00 00" required>
		            </div>
		        </div>
		
		        <div class="row" style="margin: 5px;">
		            <div class="col-auto">
		                <label for="inputDateOfBirth" style="width: 150px;" class="col-form-label">Date de naissance</label>
		            </div>
		            <div class="col-auto">
		               <input type="date" id="inputDateOfBirth" name="inputDateOfBirth" class="form-control" required>
		            </div>
		        </div>
		
		        <div style="margin-top: 30px;">
		            <h5>
		                Adresse:
		            </h5>
		        </div>
		
		        <div class="row" style="margin: 5px;">
		            <div class="col-auto">
		                <label for="inputAdresseNumber" style="width: 150px;" class="col-form-label">Num�ro</label>
		            </div>
		            <div class="col-auto">
		                <input type="text" id="inputAdresseNumber" name="inputAdresseNumber" class="form-control" required>
		            </div>
		        </div>
		
		        <div class="row" style="margin: 5px;">
		            <div class="col-auto">
		                <label for="inputAdresseStreet" style="width: 150px;" class="col-form-label">Voie</label>
		            </div>
		            <div class="col-auto">
		                <input type="text" id="inputAdresseStreet" name="inputAdresseStreet" class="form-control" required>
		            </div>
		        </div>
		
		        <div class="row" style="margin: 5px;">
		            <div class="col-auto">
		                <label for="inputAdressePostalCode" style="width: 150px;" class="col-form-label">Code Postal</label>
		            </div>
		            <div class="col-auto">
		                <input type="text" id="inputAdressePostalCode" name="inputAdressePostalCode" class="form-control" required>
		            </div>
		        </div>
		
		        <div class="row" style="margin: 5px;">
		            <div class="col-auto">
		                <label for="inputAdresseTown"  style="width: 150px;" class="col-form-label">Ville</label>
		            </div>
		            <div class="col-auto">
		                <input type="text" id="inputAdresseTown" name="inputAdresseTown" class="form-control" required>
		            </div>
		        </div>
		
		
		        <div class="row" style="margin: 5px; margin-top:40px;">
		            <div class="col-auto">
		                <label for="inputPassword" style="width: 150px;" class="col-form-label">Mot de passe</label>
		            </div>
		            <div class="col-auto">
		                <input type="password" id="inputPassword" name="inputPassword" class="form-control" aria-describedby="passwordHelpInline" required>
		            </div>
		            <div class="col-auto">
		                <span id="passwordHelpInline" class="form-text">
		                Doit faire entre 8 et 20 caract�res.
		                </span>
		            </div>
		
		            
		        </div>
		        
		        <div class="row" style="margin: 5px; margin-bottom: 20px;">
		            <div class="col-auto">
		                <label for="confPassword" style="width: 150px;" class="col-form-label">Confirmer votre mot de passe</label>
		            </div>
		            <div class="col-auto">
		                <input type="password" id="confPassword" name="confPassword" class="form-control" aria-describedby="passwordHelpInline" required>
		            </div>
		        </div>
		
		        <button type="submit" class="btn btn-success">Valider mon inscription</button>
		 </form>
	</div>


	</jsp:body>
</t:layout>
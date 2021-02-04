<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:layout>
	<jsp:attribute name="title">
		Création de la page d'un chat à adopter
	</jsp:attribute>

	<jsp:body>
    
    <div class="container">
    
    
        <form method="POST" >
        
        
       
		        <div class="row" style="margin: 5px;">
		            <div class="col-auto">
		                <label for="inputNom" style="width: 150px;" id="inputNom" class="col-form-label">Nom</label>
		            </div>
		            <div class="col-auto">
		                <input type="text" id="inputNom" name="inputNom" class="form-control" required>
		            </div>
		        </div>
		
		          <div class="row" style="margin: 5px;">
		            <div class="col-auto">
		                <label for="inputSexe" style="width: 150px;" id="inputSexe" class="col-form-label">Sexe</label>
		            </div>
		            <div class="col-auto">
		                <input type="text" id="inputSexe" name="inputSexe" class="form-control" required>
		            </div>
		        </div>
		
		         <div class="row" style="margin: 5px;">
		            <div class="col-auto">
		                <label for="inputAge" style="width: 150px;" id="inputAge" class="col-form-label">Age</label>
		            </div>
		            <div class="col-auto">
		                <input type="text" id="inputAge" name="inputAge" class="form-control" required>
		            </div>
		        </div>
		
		        
		       
		
		        <button type="submit" class="btn btn-success">Valider l'ajout du chat</button>
		 </form>
	</div>


	</jsp:body>
</t:layout>
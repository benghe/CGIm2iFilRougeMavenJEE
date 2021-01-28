<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>


<t:layout>
	<jsp:attribute name="title">
		Mon espace
	</jsp:attribute>

	<jsp:body>
     

      <div class="container">

        <div class="row">
            <div class="col-3">

            </div>

            <div class="col-6 justify-content-center">
                <div class="row" style="border: 30px;">
                    <!-- page de modification personnalisée en fonction du type -->
                    <div>

                        <a href="modification-adoptant" class="btn btn-secondary" 
                        role="button" aria-pressed="true">Modifier mes informations</a>

                        <!-- Button trigger modal -->
                        <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#deleteModal">
                        Supprimer mon compte
                        </button>

                    </div>

                </div>

            </div>

            <div class="col-3">
                
            </div>

        </div>

      </div>

  
    <!-- Modal -->
    <div class="modal fade" id="deleteModal" tabindex="-1" role="dialog" aria-labelledby="deleteModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
            <h5 class="modal-title" id="deleteModalLabel">Supprimer mon compte</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
            </button>
            </div>
            <div class="modal-body">
            Voulez-vous vraiment supprimer votre compte?
            </div>
            <div class="modal-footer">
            <button type="button" class="btn btn-danger" data-dismiss="modal">Non</button>
            <button type="button" class="btn btn-success">Oui</button>
            </div>
        </div>
        </div>
    </div>


	</jsp:body>
	
</t:layout>

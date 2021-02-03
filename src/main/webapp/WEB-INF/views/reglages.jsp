<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>

<t:layout>
	<jsp:attribute name="title">
		Réglages
	</jsp:attribute>

	<jsp:body>
	
				
			<table class="table">
			  <thead>
			    <tr>
			      <th scope="col">ID</th>
			      <th scope="col">Email</th>
			      <th scope="col">Type</th>
			      <th scope="col">Actions</th>
			     
			    </tr>
			  </thead>
			  <tbody>
			  
			  	<c:forEach var="personne" items="${ personnes }">
			  		
			  		<tr>
				      <th scope="row">${ personne.id }</th>
				      <td>${ personne.mail }</td>
				      <td>${ personne.type }</td>
				      <td>
				      	<c:if test="${ connexionId!= personne.id }">
				      	
				        	<a href="reglages-supprimer?id=${ personne.id }"> <i style="color:red;" class="far fa-trash-alt"></i> </a>
				      	
				      	</c:if>
				      </td>
				      
				     
			    	</tr>
			  		
			  		
			  	</c:forEach>
			  	
			  </tbody>
			</table>
			

	</jsp:body>
</t:layout>
package fr.adopteunchat.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.adopteunchat.dao.IPersonneDao;
import fr.adopteunchat.dao.jpa.PersonneDaoJpa;
import fr.adopteunchat.dao.sql.PersonneDaoSql;
import fr.adopteunchat.model.Personne;

@WebServlet(value="/modification-refuge")
public class ModificationRefugeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int personneAModifierId=(int) this.getServletContext().getAttribute("connexionId");
		
		PersonneDaoSql daoPersonne=new PersonneDaoSql();
		Personne personneAModifier=new Personne();
		personneAModifier=daoPersonne.findById(personneAModifierId);
		
		req.getSession().setAttribute("personneAModifier", personneAModifier);
		
		String adressePersonneAModifier=personneAModifier.getAdresse();
		
		int firstvirgule=adressePersonneAModifier.indexOf(',');
		int secondvirgule=adressePersonneAModifier.indexOf(',', firstvirgule+1);
		int thirdvirgule=adressePersonneAModifier.indexOf(',', secondvirgule+1);
		
		
		String numero=adressePersonneAModifier.substring(0, firstvirgule);
		String voie=adressePersonneAModifier.substring(firstvirgule+2, secondvirgule);
		String codePostal=adressePersonneAModifier.substring(secondvirgule+2, thirdvirgule);
		String ville=adressePersonneAModifier.substring(thirdvirgule+2, adressePersonneAModifier.length());

		
		req.getSession().setAttribute("numero", numero);
		req.getSession().setAttribute("voie", voie);
		req.getSession().setAttribute("codePostal", codePostal);
		req.getSession().setAttribute("ville", ville);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/modification-de-mes-infos-refuge.jsp").forward(req,resp);
	}
	
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Personne personneAModifier=new Personne();
		personneAModifier=(Personne) req.getSession().getAttribute("personneAModifier");
		
		String nomRefuge = req.getParameter("inputLastname");
		String emailRefuge = req.getParameter("inputEmail");
		String phoneRefuge = req.getParameter("inputPhone");
		String adresseNumberRefuge = req.getParameter("inputAdresseNumber");
		String adresseStreetRefuge = req.getParameter("inputAdresseStreet");
		String adressePostalCodeRefuge = req.getParameter("inputAdressePostalCode");
		String adresseTownRefuge = req.getParameter("inputAdresseTown");
		String passwordRefuge = req.getParameter("inputPassword");
		
		//Faire en sorte de mettre les anciennes valeurs si rien dans le champ pour pouvoir ne changer qu'un seul élément sans 
		//vider les autres
		String adresseRefuge = adresseNumberRefuge + ", " + adresseStreetRefuge + ", " + adressePostalCodeRefuge
				+ ", " + adresseTownRefuge;
		
		if(!nomRefuge.equals("")) {
			personneAModifier.setNom(nomRefuge);
		}
		
		if(!emailRefuge.equals("")) {
			personneAModifier.setMail(emailRefuge);
		}
		
		if(!phoneRefuge.equals("")) {
			personneAModifier.setTelephone(phoneRefuge);
		}
		
		if(!adresseRefuge.equals(", , , ")) {
			personneAModifier.setAdresse(adresseRefuge);
		}
		
		if(!passwordRefuge.equals("")) {
			personneAModifier.setPassword(passwordRefuge);
		}
		
		IPersonneDao daoPersonne=new PersonneDaoJpa();
		daoPersonne.save(personneAModifier);
		
		resp.sendRedirect("mon-espace");
	}

}

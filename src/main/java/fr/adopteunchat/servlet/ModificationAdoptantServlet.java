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

@WebServlet(value="/modification-adoptant")
public class ModificationAdoptantServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		int personneAModifierId=Integer.parseInt( (String) this.getServletContext().getAttribute("connexionId"));
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
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/modification-de-mes-infos-adoptant.jsp").forward(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Personne personneAModifier=new Personne();
		personneAModifier=(Personne) req.getSession().getAttribute("personneAModifier");
		
		String nomAdoptant = req.getParameter("inputLastname");
		String prenomAdoptant = req.getParameter("inputFirstname");
		String emailAdoptant = req.getParameter("inputEmail");
		String phoneAdoptant = req.getParameter("inputPhone");
		String dateOfBirthAdoptant = req.getParameter("inputDateOfBirth");
		String adresseNumberAdoptant = req.getParameter("inputAdresseNumber");
		String adresseStreetAdoptant = req.getParameter("inputAdresseStreet");
		String adressePostalCodeAdoptant = req.getParameter("inputAdressePostalCode");
		String adresseTownAdoptant = req.getParameter("inputAdresseTown");
		String passwordAdoptant = req.getParameter("inputPassword");
		
		String adresseAdoptant = adresseNumberAdoptant + ", " + adresseStreetAdoptant + ", " + adressePostalCodeAdoptant
				+ ", " + adresseTownAdoptant;
		
		if(!nomAdoptant.equals("")) {
			personneAModifier.setNom(nomAdoptant);
		}
		
		if(!prenomAdoptant.equals("")) {
			personneAModifier.setPrenom(prenomAdoptant);
		}
		
		if(!emailAdoptant.equals("")) {
			personneAModifier.setMail(emailAdoptant);
		}
		
		if(!phoneAdoptant.equals("")) {
			personneAModifier.setTelephone(phoneAdoptant);
		}
		
		if(!dateOfBirthAdoptant.equals("")) {
			personneAModifier.setDateNaissance(dateOfBirthAdoptant);
		}
		
		if(!adresseAdoptant.equals(", , , ")) {
			personneAModifier.setAdresse(adresseAdoptant);
		}
		
		if(!passwordAdoptant.equals("")) {
			personneAModifier.setPassword(passwordAdoptant);
		}
		
		IPersonneDao daoPersonne=new PersonneDaoJpa();
		daoPersonne.save(personneAModifier);
		
		resp.sendRedirect("mon-espace");
		
		
	}
	

}

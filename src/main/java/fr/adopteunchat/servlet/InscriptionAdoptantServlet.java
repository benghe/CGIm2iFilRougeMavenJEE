package fr.adopteunchat.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.adopteunchat.dao.IPersonneDao;
import fr.adopteunchat.dao.sql.PersonneDaoSql;
import fr.adopteunchat.model.Personne;

@WebServlet(value = "/inscription-adoptant")
public class InscriptionAdoptantServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/inscription-adoptant.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
		
		Personne nouvellePersonnnne=new Personne();
		nouvellePersonnnne.setNom(nomAdoptant);
		nouvellePersonnnne.setPrenom(prenomAdoptant);
		nouvellePersonnnne.setMail(emailAdoptant);
		nouvellePersonnnne.setTelephone(phoneAdoptant);
		nouvellePersonnnne.setAdresse(adresseAdoptant);
		nouvellePersonnnne.setDateNaissance(dateOfBirthAdoptant);
		nouvellePersonnnne.setPassword(passwordAdoptant);
		nouvellePersonnnne.setType("Adoptant");
		
	
		IPersonneDao daoPersonne=new PersonneDaoSql();
		req.setAttribute("personnes", daoPersonne.add(nouvellePersonnnne));
		
		resp.sendRedirect("mon-espace");
		

	}

}

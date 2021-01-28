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

@WebServlet(value="/inscription-refuge")
public class InscriptionRefugeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/inscription-refuge.jsp").forward(req,resp);
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomRefuge = req.getParameter("inputLastname");
		String emailRefuge = req.getParameter("inputEmail");
		String phoneRefuge = req.getParameter("inputPhone");
		String adresseNumberRefuge = req.getParameter("inputAdresseNumber");
		String adresseStreetRefuge = req.getParameter("inputAdresseStreet");
		String adressePostalCodeRefuge = req.getParameter("inputAdressePostalCode");
		String adresseTownRefuge = req.getParameter("inputAdresseTown");
		String passwordRefuge = req.getParameter("inputPassword");

		String adresseRefuge = adresseNumberRefuge + ", " + adresseStreetRefuge + " " + adressePostalCodeRefuge
				+ " " + adresseTownRefuge;
		
		Personne nouvellePersonnnne=new Personne();
		nouvellePersonnnne.setNom(nomRefuge);
		nouvellePersonnnne.setPrenom("Refuge");
		nouvellePersonnnne.setMail(emailRefuge);
		nouvellePersonnnne.setTelephone(phoneRefuge);
		nouvellePersonnnne.setAdresse(adresseRefuge);
		nouvellePersonnnne.setPassword(passwordRefuge);
		nouvellePersonnnne.setType("Refuge");
		
	
		IPersonneDao daoPersonne=new PersonneDaoSql();
		req.setAttribute("personnes", daoPersonne.add(nouvellePersonnnne));
		
		resp.sendRedirect("mon-espace");
	}
}

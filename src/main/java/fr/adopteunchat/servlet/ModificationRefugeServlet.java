package fr.adopteunchat.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	

}

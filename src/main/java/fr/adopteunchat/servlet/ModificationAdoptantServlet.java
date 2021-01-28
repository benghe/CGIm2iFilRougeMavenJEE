package fr.adopteunchat.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/modification-de-mes-infos-adoptant.jsp").forward(req,resp);
	}
	

}

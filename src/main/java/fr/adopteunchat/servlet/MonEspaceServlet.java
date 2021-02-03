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

@WebServlet(value="/mon-espace")
public class MonEspaceServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		int personneAModifierId=(int) this.getServletContext().getAttribute("connexionId");
		
		PersonneDaoSql daoPersonne=new PersonneDaoSql();
		Personne personneAModifier=new Personne();
		personneAModifier=daoPersonne.findById(personneAModifierId);
		
		//System.out.println(personneAModifierId);
		
		req.getSession().setAttribute("personneAModifier", personneAModifier);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/mon-espace.jsp").forward(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int personneASupprimerId=(int) this.getServletContext().getAttribute("connexionId");
		
		IPersonneDao daoPersonne=new PersonneDaoJpa();
		
		daoPersonne.deleteById(personneASupprimerId);
		
		this.getServletContext().setAttribute("connexionId", null);
		this.getServletContext().setAttribute("personneType", null);
		
		resp.sendRedirect("compte");
	}
	
	
	

}

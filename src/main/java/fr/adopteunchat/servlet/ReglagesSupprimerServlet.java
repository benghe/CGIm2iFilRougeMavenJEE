package fr.adopteunchat.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.adopteunchat.dao.IPersonneDao;
import fr.adopteunchat.dao.jpa.PersonneDaoJpa;

@WebServlet(value="/reglages-supprimer")
public class ReglagesSupprimerServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int personneASupprimerId=Integer.parseInt(req.getParameter("id"));
		IPersonneDao daoPersonne=new PersonneDaoJpa();
		
		daoPersonne.deleteById(personneASupprimerId);
		
//		this.getServletContext().getRequestDispatcher("/WEB-INF/views/reglages.jsp").forward(req,resp);
		resp.sendRedirect("reglages");
	}

}

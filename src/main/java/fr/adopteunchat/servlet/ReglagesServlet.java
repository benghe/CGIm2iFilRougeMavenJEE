package fr.adopteunchat.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.adopteunchat.dao.IPersonneDao;
import fr.adopteunchat.dao.jpa.PersonneDaoJpa;

@WebServlet(value="/reglages")
public class ReglagesServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		IPersonneDao daoPersonne=new PersonneDaoJpa();
		
		req.setAttribute("personnes", daoPersonne.findAll());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/reglages.jsp").forward(req,resp);
	}

}

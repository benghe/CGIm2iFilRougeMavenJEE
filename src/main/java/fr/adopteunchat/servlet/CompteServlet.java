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

@WebServlet(value="/compte")
public class CompteServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/compte.jsp").forward(req,resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String connexionEmail = req.getParameter("InputEmail");
		String connexionPassword = req.getParameter("InputPassword");
		
		Personne personneConnectee=new Personne();
		PersonneDaoSql daoPersonne=new PersonneDaoSql();
		personneConnectee=daoPersonne.findByEmail(connexionEmail);
		
		if(personneConnectee.getNom()==null) {
			resp.sendRedirect("compte");
		}else if(personneConnectee.getPassword().equals(connexionPassword)) {
			
			req.getServletContext().setAttribute("connexionId", personneConnectee.getId());
			resp.sendRedirect("mon-espace");
			System.out.println(this.getServletContext().getAttribute("connexionId"));
			System.out.println(personneConnectee);
			
		}else {
			resp.sendRedirect("compte");
		}
		
		
	}
	

}

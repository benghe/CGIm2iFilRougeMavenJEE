package fr.adopteunchat.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.adopteunchat.dao.IColorDao;
import fr.adopteunchat.dao.IDepartementDao;
import fr.adopteunchat.dao.IPersonneDao;
import fr.adopteunchat.dao.IRaceDao;
import fr.adopteunchat.dao.IRegionDao;
import fr.adopteunchat.dao.jpa.ColorDaoJpa;
import fr.adopteunchat.dao.jpa.DepartementDaoJpa;
import fr.adopteunchat.dao.jpa.PersonneDaoJpa;
import fr.adopteunchat.dao.jpa.RaceDaoJpa;
import fr.adopteunchat.dao.jpa.RegionDaoJpa;

@WebServlet(value="/reglages")
public class ReglagesServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String reglagesSection=req.getParameter("r");

		this.getServletContext().setAttribute("reglagesSection", reglagesSection);
		
		
		if(reglagesSection==null) {
			
			IPersonneDao daoPersonne=new PersonneDaoJpa();
			this.getServletContext().setAttribute("personnes", daoPersonne.findAll());

		} else if(reglagesSection.equals("comptes")) {
			
			IPersonneDao daoPersonne=new PersonneDaoJpa();
			this.getServletContext().setAttribute("personnes", daoPersonne.findAll());
			
		}
		
		if(reglagesSection.equals("races")) {
			
			IRaceDao daoRace=new RaceDaoJpa();
			this.getServletContext().setAttribute("races", daoRace.findAll());

		}
		
		if(reglagesSection.equals("couleurs")) {
			
			IColorDao daoColor=new ColorDaoJpa();
			this.getServletContext().setAttribute("couleurs", daoColor.findAll());

		}
		
		if(reglagesSection.equals("regions")) {
			
			IRegionDao daoRegion=new RegionDaoJpa();
			this.getServletContext().setAttribute("regions", daoRegion.findAll());

		}
		
		if(reglagesSection.equals("departements")) {
			
			IDepartementDao daoDepartement=new DepartementDaoJpa();
			this.getServletContext().setAttribute("departements", daoDepartement.findAll());

		}
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/reglages.jsp").forward(req,resp);
	}

}

package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modele.Utilisateur;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/Formulaire")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/Formulaire.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Utilisateur user=new Utilisateur();
		user.setNom(request.getParameter("nom"));
		user.setAge(Integer.parseInt(request.getParameter("age")));
		
		if(user.estAdulte()) {
			this.getServletContext().getRequestDispatcher("/WEB-INF/Adulte.jsp").forward(request, response);
		}
		else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/Jeune.jsp").forward(request, response);
		}
	}

}

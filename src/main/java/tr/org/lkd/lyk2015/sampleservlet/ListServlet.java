package tr.org.lkd.lyk2015.sampleservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/list")
public class ListServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Long id = Long.valueOf(req.getParameter("id"));
		
		//Long id = Storage.getById();
		
		Boolean ch = (req.getParameter("doDone")==null);
		if (!ch) {
			Storage.markAsDone(id);
		}
		
		req.setAttribute("todos", Storage.getAll());
		req.getRequestDispatcher("WEB-INF/list.jsp").forward(req, resp);
	}
	
	
}

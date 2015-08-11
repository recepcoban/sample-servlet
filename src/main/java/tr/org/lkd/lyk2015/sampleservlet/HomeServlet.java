package tr.org.lkd.lyk2015.sampleservlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/")
public class HomeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("in hello servlet");
		
		Boolean unsafe = new Boolean(req.getParameter("unsafe"));
		
		if(unsafe){
			req.setAttribute("message", "this is unsafe page");
			req.getRequestDispatcher("unsafe.jsp").forward(req, resp);
		}
		else {
			req.setAttribute("message", "this is my message");
			req.getRequestDispatcher("WEB-INF/home.jsp").forward(req, resp);
		}
	}
	
}

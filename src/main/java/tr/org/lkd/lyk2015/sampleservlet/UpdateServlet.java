package tr.org.lkd.lyk2015.sampleservlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/update")
public class UpdateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");
        req.setAttribute("todo", Storage.getById(Long.parseLong(id)));

        req.getRequestDispatcher("WEB-INF/update.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
        String name = req.getParameter("name");
        String desc = req.getParameter("desc");
        String dueDate = req.getParameter("dueDate");
        String done = req.getParameter("done");

        

        Storage.updateTodo(Long.parseLong(id), name, desc, null, Boolean.parseBoolean(done));

        req.setAttribute("message", "Successfully");
		req.getRequestDispatcher("WEB-INF/update.jsp").forward(req, resp);
	}

}

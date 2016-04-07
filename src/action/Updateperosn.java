package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PersonDao;
import entity.Person;

public class Updateperosn extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			String id1=request.getParameter("id");//目标int
			String age1=request.getParameter("age");//目标int
			String name=request.getParameter("name");
			String description=request.getParameter("description");
			int id=Integer.parseInt(id1);
			int age=Integer.parseInt(age1);
			Person p=new Person(id, name, age, description);
			PersonDao perdao=new PersonDao();
			perdao.update(p);;
		} catch (Exception e) {
			   out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
				out.println("<HTML>");
				out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
				out.println("  <BODY>");
				out.print("I'm sorry, update the person this operation is failure ");
				out.println("  </BODY>");
				out.println("</HTML>");
				out.flush();
				out.close();
			
		}
        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("You successfully update a person");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}


}

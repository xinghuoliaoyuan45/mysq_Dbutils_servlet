package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PersonDao;

public class RemovePerson extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String id=request.getParameter("id");
		String str2="you input is wrong, such as the letters you entered";
		String str1="deleted successfully";
        PersonDao perdelet=new PersonDao();
        try{
        	int i=Integer.parseInt(id); 
			perdelet.delete(i);			
			out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
			out.println("<HTML>");
			out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
			out.println("  <BODY>");
			out.print(""+str1);			
			out.println("  </BODY>");
			out.println("</HTML>");
			out.flush();
			out.close();
		}catch (Exception e) {			 
			System.out.println("“Ï≥£¥¶¿Ì");
			out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
			out.println("<HTML>");
			out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
			out.println("  <BODY>");
			out.print(""+str2);			
			out.println("  </BODY>");
			out.println("</HTML>");
			out.flush();
			out.close();
		
		}
		
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}

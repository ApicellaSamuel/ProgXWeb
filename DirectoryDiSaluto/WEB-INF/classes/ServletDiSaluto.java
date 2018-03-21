import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ServletDiSaluto extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
		String Name = request.getParameter("name");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println(
    "<html xmlns = \"http://www.w3.org/1999/xhtml\">"
		
		+ "<head>"
		+     "<title>Handling an HTTP Get Request</title>"
		+ "</head>"
		
		+ "<body>"
		+     "<h1>Hello, " + Name + "</h1>"
		+ "</body>"
		
    + "</html>");
		
		out.close();
	}
}

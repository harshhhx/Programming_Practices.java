import javax.servlet.*; 
import javax.servlet.http.*; 
import java.io.*; 
public class HelloServlet extends HttpServlet { 
public void doGet(HttpServletRequest request, HttpServletResponse response) 
throws ServletException, IOException { 
response.setContentType("text/html"); 
PrintWriter out = response.getWriter(); 
out.println("<html><body>"); 
out.println("<h1>Hello Servlet</h1>"); 
out.println("</body></html>"); 
} 
} 
package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomePage extends HttpServlet{
	private static final long serialVersionUID = 1L;
	public HomePage() {
		super();
	}
	protected void getReqest(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body>");  
		pw.println("Welcome to servlet");  
		pw.println("</body></html>");  
		  
		pw.close();//closing the stream
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
}

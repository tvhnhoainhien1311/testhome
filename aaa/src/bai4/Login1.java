package bai4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login1
 */
@WebServlet("/Login1")
public class Login1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter(); 
		String n=request.getParameter("user"); 
		String p=request.getParameter("pass");  
		
		out.print("<a href='bai4.html'>Login		</a>" + "<a href='Logout1'>Logout		</a>" + "<a href='Profile1'>Profile		</a>" +"<br>");
		
		if(n.equals("Nhien") && p.equals("123")){
			
			
			out.print("You are successfully logged in!");  
            out.print("<br>Welcome, "+n);  
              
            Cookie ck=new Cookie("name",n);  
            response.addCookie(ck);  
		}  
		else{ 
			out.print("Sorry UserName or Password Error!"); 
			RequestDispatcher rd=request.getRequestDispatcher("/bai4.html");
			rd.include(request, response);  
			}  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

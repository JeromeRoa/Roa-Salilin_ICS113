


import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public boolean isValid(String uname, String pw)
    {
    	try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/PUV_DATABASE", "root", "1234");
			Statement stmt1 = con.createStatement();
            ResultSet rs = stmt1.executeQuery("SELECT user,pw FROM USERACC WHERE '"+ uname +"'=user");
            rs.next();
            if(uname.compareTo(rs.getString(1))==0 && pw.compareTo(rs.getString(2))==0)
            { 
            	return true;
            }
            else return false; 
		} catch (Exception e) {System.out.println(e); return false;}
    }
	


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String passWord = request.getParameter("password");
		
		
		response.setContentType("text/html");
		PrintWriter output = response.getWriter();
		
		if (isValid(userName,passWord))
		{	
			request.getServletContext().setAttribute("username", userName); 
		    response.sendRedirect("index.html");    
		}
		
		else 
		{
			output.println("<script type=\"text/javascript\">");
			output.println("alert('User or password incorrect');");
			output.println("location='index6.html';");
			output.println("</script>"); 
		}
		
	}
}

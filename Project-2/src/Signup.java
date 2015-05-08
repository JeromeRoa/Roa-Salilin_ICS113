

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Signup")
public class Signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public Signup() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String User = request.getParameter("UserName");
		String Last = request.getParameter("LastName");
		String First = 	request.getParameter("FirstName");
        String Middle = request.getParameter("MiddleName");
		
		
		String Name = Last + ", " + First + Middle;
		//String Sex = request.getParameter("Sex");
		//String Age = request.getParameter("Age");
		
		String Address = request.getParameter("Address");
		String Email = request.getParameter("Email");
		String Number = request.getParameter("Number");
		
		String Floor = request.getParameter("Floor");
		String Room = request.getParameter("Room");
		String RoomComplete =  Floor + Room;
		
		String CheckIn = request.getParameter("CheckIn");
		String CheckOut = request.getParameter("CheckOut");
		
		String Guest = request.getParameter("NumGuests");
		String Adult = request.getParameter("NumAdults");
		String Child = request.getParameter("NumChildren");
		
		String CreditCard = request.getParameter("CreditCard");
		String Bank = request.getParameter("Bank");
		String Paid = request.getParameter("Paid");
		setNew(User, Last, First, Middle, Email, Number, Floor, Room, CheckIn, CheckOut, Guest, Adult, Child, CreditCard,Bank);
		System.out.println("123");
		
		out.println("<%@ page language='java' contentType='text/html'; charset='ISO-8859-1'" +
"pageEncoding='ISO-8859-1'%>" +
"<!DOCTYPE html PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN' 'http://www.w3.org/TR/html4/loose.dtd'>" +
"<html lang='en'>" +
  "<head>" +
    "<meta charset='utf-8'>" +
    "<meta http-equiv='Content-Type' content='text/html; charset=ISO-8859-1'>" +
    "<meta name='viewport' content='width=device-width, initial-scale=1.0'>" +
    "<meta name='description' content=''>" +
    "<meta name='author' content=''>" +

    "<title>Hotel Reservation/Booking</title>" +

    "<link href='assets/css/style1.css' rel='stylesheet'>" +

    "<link href='assets/css/style.css' rel='stylesheet'>" +
    "<link href='assets/css/font.css' rel='stylesheet'>" +

    "<script src='https://code.jquery.com/jquery-1.10.2.min.js'></script>" +
    "<script src='assets/js/chart.js'></script>" +

      "<script src='https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js'></script>" +
      "<script src='https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js'></script>" +
  "</head>" +

  "<body>" +

    "<div class='navbar navbar-default navbar-fixed-top'>" +
      "<div class='container'>" +
        "<div class='navbar-header'>" +
          "<button type='button' class='navbar-toggle' data-toggle='collapse' data-target='.navbar-collapse'>" +
            "<span class='icon-bar'></span>" +
            "<span class='icon-bar'></span>" +
            "<span class='icon-bar'></span>" +
          "</button>" +
          "<a class='navbar-brand' href='#'><i class='fa fa-building'></i></a>" +
        "</div>" +
        "<div class='navbar-collapse collapse'>" +
          "<ul class='nav navbar-nav navbar-right'>" +
            "<li class='active'><a href='index.jsp'>HOME</a></li>" +
          "</ul>" +
        "</div>" +
      "</div>" +
    "</div>" +

	"<div id='reserved'>" +
		"<div class='container'>" +
			"<div class='row centered'>" +
				"<h3><b>You have successfully reserved a room!</b></h3>" +
				"<h2>Thank you!</h2>" +
				"<p>Customer username: <span>" + User + "</span></p>" +
				"<p>Name of Customer: <span>" + Name + "</span></p>" +
				"<p>Address: <span>" + Address + "</span></p>" +
				"<p>E-Mail Address: <span>" + Email + "</span></p>" +
				"<p>Contact Number: <span>" + Number + "</span></p>" +
				"<p>Room:<span> " + RoomComplete + "</span></p>" +
				"<p>Check-In Date: <span>" + CheckIn + "</span></p>" +
				"<p>Check-Out Date:<span> " + CheckOut + "</span></p>" +
				"<p>Total Number of Guests: <span>" + Guest + " having " + Adult + " adults and " + Child + " children." + "</span></p>" +
				"<p>Credit Card Number: <span>" + CreditCard + "</span></p>" +
				"<p>Bank: <span>" + Bank + "</span></p>" +
				"<p>Amount Paid: <span>" + Paid + "</span></p>" +
			"</div>" +
		"</div>" +
	"</div>" +
	

	"<div id='f'>" +
		"<div class='container'>" +
			"<div class='row'>" +
				"<p>ROA | SALILIN</p>" +
			"</div>" +
		"</div>" +
	"</div>" +

    "<script src='assets/js/bootstrap.js'></script>" +
  "</body>" +
"</html>");
		
		response.sendRedirect("index.jsp");
	}
	
	public void setNew(String username, String lastname, String firstname, String middlename, String email, 
			String contact, String floor, String room, String cin, String cout, String guest, String adult, String children,
			String credit, String bank)
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/HOTEL_DB", "root", "1234");
			CallableStatement stmt = con.prepareCall("{call setUser(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			stmt.setString(1, username);
			stmt.setString(2, lastname);
			stmt.setString(3, firstname);
			stmt.setString(4, middlename);
			stmt.setString(5, email);
			stmt.setString(6, contact);
			stmt.setString(7, floor);
			stmt.setString(8, room);
			stmt.setString(9, cin);
			stmt.setString(10, cout);
			stmt.setString(11, guest);
			stmt.setString(12, adult);
			stmt.setString(13, children);
			stmt.setString(14, credit);
			stmt.setString(15, bank);		
			System.out.println("success");
			
			
			stmt.execute();
		} catch (Exception e) {System.out.println(e);}
	}
}

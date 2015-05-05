

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Success")
public class Success extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public Success() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String User = request.getParameter("UserName");
		String Name = request.getParameter("LastName") + ", " + request.getParameter("FirstName") + request.getParameter("MiddleName");
		//String Sex = request.getParameter("Sex");
		//String Age = request.getParameter("Age");
		
		String Address = request.getParameter("Address");
		String Email = request.getParameter("Email");
		String Number = request.getParameter("Number");
		
		String Room = request.getParameter("Floor") + request.getParameter("Room");
		
		String CheckIn = request.getParameter("CheckIn");
		String CheckOut = request.getParameter("CheckOut");
		
		String Guest = request.getParameter("NumGuests");
		String Adult = request.getParameter("NumAdults");
		String Child = request.getParameter("NumChildren");
		
		String CreditCard = request.getParameter("CreditCard");
		String Bank = request.getParameter("Bank");
		String Paid = request.getParameter("Paid");
		
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
				"<p>Room:<span> " + Room + "</span></p>" +
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
	}
}

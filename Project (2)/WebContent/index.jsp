<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Hotel Reservation/Booking</title>

    <link href="assets/css/style1.css" rel="stylesheet">

    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/font.css" rel="stylesheet">

    <script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="assets/js/chart.js"></script>

      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
      
      <script>
      	function validate(){
      		var user = document.getElementById("User").value;
      		
      		var last = document.getElementById("Last").value;
          	var first = document.getElementById("First").value;
          	var middle = document.getElementById("Middle").value;
          	var age = document.getElementById("Age").value;
          	
          	var address = document.getElementById("Address").value;
          	var email = document.getElementById("Email").value;
          	var contactnum = document.getElementById("ContactNum").value;
          	
          	var guests = document.getElementById("NumGuests").value;
          	var adults = document.getElementById("NumAdults").value;
          	var children = document.getElementById("NumChildren").value;
          	
          	var credcard = document.getElementById("CreditCard").value;
          	var bank = document.getElementById("Bank").value;
          	var paid = document.getElementById("AmountPaid").value;
      		
      		/*Customer Information*/
      		if(user == ""){
      			alert("Input Username");
      			return false;
      		}
      		else if(user.length < 8){
      			alert("Username should atleast have 8 characters");
      			return false;
      		}

      		else if(last=="" || first== "" || middle== ""){
      			alert("Input Name Completely");
      			return false;
      		}
      		else if(!(isNaN(last)) || !isNaN(middle) || !(isNaN(first))){
      			alert("Name cannot be a number");
      			return false;
      		}
      		else if(isNaN(age)){
      			alert("Age must be an integer");
      			return false;
      		}
      		else if(age < 0){
      			alert("Age must be positive");
      			return false;
      		}
      		else if(age== ""){
      			alert("Input Age");
      			return false;
      		}
      		/*Contact Information*/
      		else if(address== ""){
      			alert("Input Address");
      			return false;
      		}
      		else if(email== ""){
      			alert("Input E-mail Address");
      			return false;
      		}
      		else if(isNaN(contactnum)){
      			alert("Contact Number must be an integer");
      			return false;
      		}
      		else if(contactnum.length != 11){
      			alert("Contact Number must have 11 digits");
      			return false;
      		}
      		else if(contactnum== ""){
      			alert("Input Contact Number");
      			return false;
      		}
      		/*Reservation Information*/
      		else if((guests== "" || isNaN(guests)) || (adults== "" || isNaN(adults)) || (children== "" || isNaN(children))){
      			alert("Input Number of Guests/ Number of Adults/ Number of Children (Must be a number)");
      			return false;
      		}
      		/*Payment Terms*/
      		else if(credcard== ""){
      			alert("Input Credit Card Number");
      			return false;
      		}
      		else if(isNaN(creditcard)){
      			alert("Credit Card Number must be an integer");
      			return false;
      		}
      		else if(creditcard.length < 10){
      			alert("Input valid Credit Card Number");
      			return false;
      		}
      		else if(bank== ""){
      			alert("Input Bank");
      			return false;
      		}
      		else if(paid== ""){
      			alert("Input Amount Paid");
      			return false;
      		}
      		else if(isNaN(paid)){
      			alert("Amount Paid must be an integer");
      			return false;
      		}
      		else
	      		return true;
      	}
      	      	
      </script>
  </head>

  <body>

    <div class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#"><i class="fa fa-building"></i></a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li class="active"><a href="#reserve">RESERVE NOW!</a></li>
          </ul>
        </div>
      </div>
    </div>


	<div id="hello">
	    <div class="container">
	    	<div class="row">
	    		<div class="col-lg-8 col-lg-offset-2 centered">
	    			<h1>HOTEL</h1>
	    			<h2>Reservation/Booking</h2>
	    		</div>
	    	</div>
	    </div>
	</div>
	
	<div id="green">
		<div class="container">
			<div class="row">
				<div class="col-lg-5 centered">
				</div>
				
				<div class="col-lg-7 centered">
					<h3>Hotel</h3>
					<p>A hotel is an establishment that provides 
					lodging paid on a short-term basis. Facilities 
					provided may range from a basic bed and storage 
					for clothing, to luxury features like en-suite 
					bathrooms. Larger hotels may provide additional 
					guest facilities such as a swimming pool, business 
					center, child care, conference facilities and social 
					function services. Hotel rooms are usually numbered 
					(or named in some smaller hotels and B&Bs) to allow 
					guests to identify their room. Some hotels offer 
					meals as part of a room and board arrangement.</p>
				</div>
			</div>
		</div>
	</div>
	
	<div class="container">
		<div class="row centered mt grid">
			<h3>A PEEK INSIDE</h3>
			<div class="mt"></div>
			<div class="col-lg-4">
				<a href="#"><img src="assets/img/01.jpg" alt=""></a>
			</div>
			<div class="col-lg-4">
				<a href="#"><img src="assets/img/02.jpg" alt=""></a>
			</div>
			<div class="col-lg-4">
				<a href="#"><img src="assets/img/03.jpg" alt=""></a>
			</div>
		</div>
		
		<div class="row centered mt grid">
			<div class="mt"></div>		
			<div class="col-lg-4">
				<a href="#"><img src="assets/img/04.jpg" alt=""></a>
			</div>
			<div class="col-lg-4">
				<a href="#"><img src="assets/img/05.jpg" alt=""></a>
			</div>
			<div class="col-lg-4">
				<a href="#"><img src="assets/img/06.jpg" alt=""></a>
			</div>
		</div>
		</div>
	</div>

	<div id="reserve">
		<div class="container">
			<div class="row centered">
				<h3><b>RESERVE/BOOK</b></h3>
				
				<form onsubmit = "return validate();" action = "Success" method = "get">
					<h2>Customer Information</h2><br>
					<p>Customer Username: </p>
					<input  class = "input" type = "text" name = "UserName" placeholder = "Username" id = "User"/><br><br>
					<input  class = "input" type = "text" name = "LastName" placeholder = "Last Name" id = "Last"/>
					<input  class = "input" type = "text" name = "FirstName" placeholder = "First Name" id = "First"/>
					<input  class = "input" type = "text" name = "MiddleName" placeholder = "Middle Name" id = "Middle"/><br>
					<label for = "Sex">Sex: </label><br>
					<label  class = "input" for = "Sex">M </label><input type="radio" name="Sex" value="Male">
					<label  class = "input" for = "Sex">F </label><input type="radio" name="Sex" value="Female"><br>
					<input  class = "input" type = "text" name = "Age" placeholder = "Age" id = "Age"/><br><br>
					
					<h2>Customer Contact Information</h2><br>
					<input  class = "input" type = "text" name = "Address" placeholder = "Address" id = "Address"/><br>
					<input  class = "input" type = "email" name = "Email" placeholder = "e-mail@yahoo.com" id = "Email"/><br>
					<input  class = "input" type = "text" name = "Number" placeholder = "09XXXXXXXXX" id = "ContactNum"/><br><br>
					
					<h2>Room Reservation</h2><br>
					<label for = "Floor">Floor: </label>
					<select class = "input" name = "Floor">
						<option value = "1">1</option>
						<option value = "2">2</option>
						<option value = "3">3</option>
						<option value = "4">4</option>
						<option value = "5">5</option>
						<option value = "6">6</option>
					</select>
					<label for = "Room">Room Number: </label>
					<select class = "input" name = "Room">
						<option value = "00">00</option>
						<option value = "01">01</option>
						<option value = "02">02</option>
						<option value = "03">03</option>
						<option value = "04">04</option>
						<option value = "05">05</option>
						<option value = "06">06</option>
						<option value = "07">07</option>
						<option value = "08">08</option>
						<option value = "09">09</option>
						<option value = "10">10</option>
					</select><br>
					<p>Room Rate is: </p>
					<p>Maximum Number in Room is: <br>
					<span> 8 </span></p>
					
					<h2>Reservation Information</h2><br>
					<label class = "input" for = "CheckIn">Check-in Date: </label><input type = "date" name = "CheckIn" placeholder = "Check-in Date"/>
					<label class = "input" for = "CheckOut">Check-out Date: </label><input type = "date" name = "CheckOut" placeholder = "Check-Out Date"/><br><br>
					<input class = "input" type = "number" name = "NumGuests" placeholder = "Total Number of Guests" id = "NumGuests"/><br>
					<input class = "input" type = "number" name = "NumAdults" placeholder = "Number of Adults" id = "NumAdults"/>
					<input class = "input" type = "number" name = "NumChildren" placeholder = "Number of Children" id = "NumChildren"/><br><br>
					
					<h2>Terms of Payment</h2>
					<input class = "input" type = "text" name = "CreditCard" placeholder = "Credit Card Number" id = "CreditCard"/><br>
					<input class = "input" type = "text" name = "Bank" placeholder = "Bank" id = "Bank"/><br>
					<p>Total amount is: </p><br>
					<input class = "input" type = "text" name = "Paid" placeholder = "Amount Paid" id = "AmountPaid"/><br>
					<p>Amount Due: </p><br><br>
					
					<input type = "submit" value = "Reserve"/>
				</form>
			</div>
		</div>
	</div>
	
	<section id="contact"></section>
	<div id="social">
		<div class="container">
			<div class="row centered">
				<div class="col-lg-8 col-lg-offset-2">
					<div class="col-md-3">
						<a href="#"><i class="fa fa-facebook"></i></a>
					</div>
					<div class="col-md-3">
						<a href="#"><i class="fa fa-instagram"></i></a>
					</div>
					<div class="col-md-3">
						<a href="#"><i class="fa fa-twitter"></i></a>
					</div>
					<div class="col-md-3">
						<a href="#"><i class="fa fa-envelope"></i></a>
					</div>
				</div>
			</div>
		</div>
	</div>


	<div id="f">
		<div class="container">
			<div class="row">
				<p>ROA | SALILIN</p>
			</div>
		</div>
	</div>

    <script src="assets/js/bootstrap.js"></script>
  </body>
</html>

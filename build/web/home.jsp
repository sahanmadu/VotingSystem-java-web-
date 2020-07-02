<%-- 
    Document   : home
    Created on : May 14, 2020, 10:15:42 PM
    Author     : Eranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link rel="stylesheet" type="text/css" href="CSS/home.css">
    </head>
    <style>
        
body{
	width: 100%;
	height: 100vh;
	background-image:url('Images/homeBack.jpeg');
	background-repeat: no-repeat;
	background-size: cover;
	display: table;
    font-family: Montserrat;
    
    
    
}

img{
    height: 90px;
    width:120px;
}
    </style>
    <body>
       
        <div class="wrapper">
		<div class="nav">
			
				<img src="Images/logo1.png">
			
			<div class="menu">
				<ul>
					<li><a href="home.jsp">Home</a></li>
					
					
					<li><a href="electionView.jsp"> Previous Elections </a></li>

					<li><a href="Voters.html">Register</a></li>
					<li><a href="privacyPolicy.jsp">Privacy Policy</a></li>
                                         <li><a href="contactus.jsp">Contact Us</a></li>
                                        <li><a href="sendEmail.jsp">Email</a></li>
                                          <li><a href="Showall">Results</a></li>
                                           <li><a href="map.jsp">Location</a></li>
                                            <li><a href="Aboutus.jsp">About Us</a></li>
                                             <li><a href="Service.jsp">Services</a></li>
                                       
                                        
				</ul>
			</div>
		</div>
		<div class="header">
			<h1> Easy VoteZ</h1>
			<p>
				Secure Online Voting Platform 
			</p>
			<a href="login.jsp"><button type="button"> Click here to Login</button> </a>
		</div>
	</div>
       
    </body>
</html>

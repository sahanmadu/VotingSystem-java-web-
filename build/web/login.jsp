<%-- 
    Document   : login
    Created on : May 15, 2020, 1:22:46 AM
    Author     : Eranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %> 

<%
   
   if(request.getParameter("submit")!=null)
   { 
     String eid= request.getParameter("uname1");
     String name= request.getParameter("pass1");
   
     
     Connection con=null;
     PreparedStatement pst=null;
     ResultSet rs=null;
     PreparedStatement pst1=null;
     ResultSet rs1=null;
     
     Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost/votingsystem","root","");
     pst = con.prepareStatement("select * from vote where username=? and password=?");
     pst1 = con.prepareStatement("select * from admin where usernmae=? and password=?");
   
     pst.setString(1,eid);
     pst.setString(2,name);
    
      pst1.setString(1,eid);
     pst1.setString(2,name);
     rs=pst.executeQuery();
       rs1=pst1.executeQuery();
     if(rs.next()){
     response.sendRedirect("Vote.jsp");
     
     
     }
   
     else if(rs1.next()){
     response.sendRedirect("admin.jsp");
     
     
     }
     else{

       response.sendRedirect("login.jsp"); 

}
   }
%>
  
     
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        
        <link rel="stylesheet" type="text/css" href="CSS/login.css">
        <style>
           body{
             	background-image: url("Images/loginVote.jpg");
               background-size: cover;
           }
           ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  border: 1px solid #e7e7e7;
  background-color: #f3f3f3;
  opacity: .8;
}

li {
  float: left;
}

li a {
  display: block;
  color: #666;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color:#32CD32;
  text-decoration: none;
}

.imht{
    width: 80px;
    height: 80px;
    margin-left: 90px;
     margin-top: 30px;
}

       </style>

    </head>
    <body>
       
      <ul>
  
  <li><a href="home.jsp">Home</a></li>
  <li><a href="contactus.jsp">Contact</a></li>
  <li><a href="Showall">Result</a></li>
  <li><a  href="Aboutus.jsp">About Us</a></li>
</ul>
	<img src="Images/logo1.png" class ="imht">		

	
	<div class="wrap">
		<h2> Login Here </h2>
		<form method="POST" action="">
			
			<input type="text" id="uname" placeholder="Username" name="uname1" required >
			<input type="password" id="pass" placeholder="Password" required name="pass1">
		
                        <input type="submit" value="Submit" name="submit">

		</form>
	</div>
        
        
    </body>
</html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %> 

<%
   
   if(request.getParameter("submit")!=null)
   { 
     
     String fname= request.getParameter("firstname");
     String address= request.getParameter("address");
     String email= request.getParameter("email");
     String phone= request.getParameter("pno");
     String message= request.getParameter("message");
   
     
     Connection con;
     PreparedStatement pst;
     ResultSet rs;
     
     Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost/votingsystem","root","");
     pst = con.prepareStatement("insert into contactus(firstname,address,email,pno,message)values(?,?,?,?,?)");
    
     pst.setString(1,fname);
     pst.setString(2,address);
     pst.setString(3,email);
     pst.setString(4,phone);
     pst.setString(5,message);
     
   
     pst.executeUpdate();
      
     %>
     <script>
         alert("Thank You!!");
      </script>
      <%
          }
          %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Us</title>
          <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <style> 
        
        body  {
  background-image: url("Images/Web 1920 – 1.png");
      }
      


ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  border: 1px solid #e7e7e7;
  background-color: #f3f3f3;
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

li a:hover:not(.active) {
  background-color: #ddd;
}

li a.active {
  color: white;
  background-color: #4CAF50;
}
        
        </style>
    </head>
    <body>
        <ul>
  
  <li><a href="home.jsp">Home</a></li>
  <li><a class="active" href="contactus.jsp">Contact</a></li>
  <li><a href="Showall">Result</a></li>
  <li><a  href="Aboutus.jsp">About Us</a></li>
</ul>
        <div align="left">
           
            <img src="imagesc/contact-uscreakidz3.jpg" alt=""/>
        </div>
      
         <div align="center"  class="alert-dark">
            <div  class="col-sm-4">
                <form   method="POST" action="">
                    
                    
                    </br>
                    <div align="left">
                        <label class="form-label"><b>Tell Us Your Name*</b></label></br>
                        <input type="text" class="form-control" placeholder="Your Name" name="firstname" id="firstname" required>
                        <label class="form-label"><b>Enter Your Address*</b></label></br>
                        <input type="text" class="form-control" placeholder="Your address" name="address" id="address" required>
                    </div>
                    
                      <div align="left">
                          <label class="form-label"><b>Enter Your E-mail*</b></label>
                        <input type="text" class="form-control" placeholder="Eg.example@email.com" name="email" id="email" required>
                     </div>
                    <div align="left">
                          <label class="form-label"><b>Enter Phone Number*</b></label>
                        <input type="text" class="form-control" placeholder="Eg.+94076986888" name="pno" id="pno" required>
                     </div>
                          <div align="left">
                              <label class="form-label"><b>Message</b></label>
                              <textarea name="message"class="form-control" placeholder="Send Us a Message" name="message" placeholder="Write Us a Message" name="message" id="message" required></textarea> 
                      </div>
                         
                                        
                          </br>
                          <div align="right">
                              <input type="submit" id="submit" value="Send Message" name="submit" class="btn btn-success"> 
                     
                          </div>
                          </br>
                </form>
            </div>
          </div>
       
        <div align="right">
            <img src="imagesc/contact-uscreakidz3.jpg" alt=""/>
           
        </div>
    </body>
    
</html>

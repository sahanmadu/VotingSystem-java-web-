<%-- 
    Document   : addNewElection
    Created on : May 17, 2020, 2:29:13 PM
    Author     : Eranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %> 

<%
   
   if(request.getParameter("submit")!=null)
   { 
     
     String types= request.getParameter("etype");
     String edates= request.getParameter("edate");
     String candi1= request.getParameter("c1");
     String candi2= request.getParameter("c2");
     String candi3= request.getParameter("c3");
   
     
     Connection con;
     PreparedStatement pst;
     ResultSet rs;
     
     Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost/votingsystem","root","");
     pst = con.prepareStatement("insert into addelection(etype,edate,candidate1,candidate2,candidate3)values(?,?,?,?,?)");
    
     pst.setString(1,types);
     pst.setString(2,edates);
     pst.setString(3,candi1);
     pst.setString(4,candi2);
     pst.setString(5,candi3);
     
   
     pst.executeUpdate();
      
     %>
     <script>
         alert("Inserted successfully!!");
      </script>
      <%
       
          }
          %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Election Page</title>
        
         <link rel="stylesheet" href="CSS/addNewElection.css">
         <style>
             body{
 
  font-family: sans-serif;
  background-image:url('Images/b1.jpeg');
  background-size: cover;

}
         </style>
    </head>
    <body>
        
        <h1 style="color:white; text-align: center; margin-top: 130px">Add new election </h1>
        <div class="login-box">
             <form action="" method="POST">
 
 
  <div class="textbox">
    
      <input type="text" placeholder="Election type" name="etype" required>
  </div>

  <div class="textbox">
    
      <input type="date" placeholder="Election date" name="edate" required>
  </div>
  
   <div class="textbox">
   
       <input type="text" placeholder="Candidate 1" name="c1" required>
  </div>
  
   <div class="textbox">
   
       <input type="text" placeholder="Candidate 2" name="c2" required>
  </div>
  
   <div class="textbox">
    
       <input type="text" placeholder="Candidate 3" name="c3" required>
  </div>

  <input type="submit" class="btn btn-success" value="ADD" name="submit">
  
   </form> 
</div>
      
​
    </body>
</html>

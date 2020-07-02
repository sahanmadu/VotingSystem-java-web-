<%-- 
    Document   : Showall
    Created on : May 2, 2020, 8:31:44 PM
    Author     : Sahan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<style> 
    body{
        background-image: url('Images/my123.jpg');
        background-size: cover;
    }
    
    h1{
        color: white;
        font-weight: bold;
        font-family: arial;
        text-align: center;
    }
    
    table{
        opacity:0.8;
        font-weight: bold;
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
  <li><a href="contactus.jsp">Contact</a></li>
  <li><a  class="active" href="Showall">Result</a></li>
  <li><a  href="Aboutus.jsp">About Us</a></li>
</ul>
        <br>
        <h1>RESULT OF PRESIDENTAIL ELECTION 2020</h1><br>
      <table cellpadding="10" class="table table-striped text-nowrap text-white bg-dark">
            <tr>
              
                <th scope="col">Partie</th>
                 <th scope="col">Total Number Of Votes Received</th>
                
            </tr> 
            <c:forEach items="${Showall}" var="p"> 
                <tr>
                  
                  
                    <td>${p.partie}</td>
                      <td>${p.candidate}</td>
                       
             
                </tr>
            
            </c:forEach>
            
        </table>
          
    </body>
</html>

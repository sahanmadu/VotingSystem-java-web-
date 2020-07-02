<%-- 
    Document   : deleteElection
    Created on : May 17, 2020, 2:56:39 PM
    Author     : Eranga
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete election Page</title>
        
         <link rel="stylesheet" href="CSS/addNewElection.css">
         <style>
             table{
                 color: white;
                 font-family: arial;
                 font-weight: bold;
             }
               
        body{
  margin: 0;
  padding: 0;
  font-family: sans-serif;
  background-image:url("Images/b3.jpg");
  background-size: cover;
  background-color: grey;
}
      
         </style>
    </head>
    <body>
         
         <table id="tbl-student" class="table alert-success" cellpadding ="" width="100%">
                        <thead>
                            <tr>
                                <th>E-ID</th>
                                <th>Election Type</th>
                                 <th>Election Date</th>
                                  <th>Candidate 1</th>
                                  <th>Candidate 2</th>
                                   <th>Candidate 3</th>
                                   
                            </tr>
                            
                            
                            
                               
                               <%
                            
                             Connection con;
                             PreparedStatement pst;
                             ResultSet rs;
     
                            
                              Class.forName("com.mysql.jdbc.Driver");
                              con = DriverManager.getConnection("jdbc:mysql://localhost/votingsystem","root","");
                             
                              String query = "select * from addelection";
                              Statement st = con.createStatement();
                              
                              rs = st.executeQuery(query);
                              
                             while(rs.next())
                             {
                             String id =rs.getString("id");
                             
                            
                            %> 
           
                            
                            
                            
                            <tr>
                                 <td><%=rs.getString("id")%></td>
                                <td><%=rs.getString("etype")%></td>
                                <td><%=rs.getString("edate")%></td>
                                <td><%=rs.getString("candidate1")%></td>
                                <td><%=rs.getString("candidate2")%></td>
                                 <td><%=rs.getString("candidate3")%></td>
                              
                                <td><a href="deleteElection2.jsp?id=<%=id%>"><input type="submit" id="submit" value="Delete" name="submit" class="btn btn-danger"> </a></td>
                             
                                
                            </tr>
                            <%
                                }
                                %>
                       
                    </table>

         
​
    </body>
</html>


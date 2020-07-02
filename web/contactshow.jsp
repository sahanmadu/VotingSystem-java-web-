

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Details</title>
        
          <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body><div align="center">
            <h2> <b>Client Feedback!</b> </h2>
        </div>
        <div>
          
            <div align="center">
            <img src="imagesc/pic.jpg" alt=""/>
            </div>
        </div>
        
         </div>
            </br>
            <div class="col-sm-12">
                <div class="panel-body">
           
                    
                    <table  id="tbl-student" class="table table-dark" cellpadding ="" width="100%">
                        <thead>
                            <tr>
                                <th>C-ID</th>
                                <th>Client Name</th>
                                 <th> Address</th>
                                  <th>E-mail</th>
                                  <th>Phone Number</th>
                                   <th>Message</th>
                                 
                                    <th>Delete</th>
                                  
                             
     
                            </tr>
                       
                               <%
                            
                            
                              Connection con;
                              PreparedStatement pst;
                              ResultSet rs;
     
                              Class.forName("com.mysql.jdbc.Driver");
                              con = DriverManager.getConnection("jdbc:mysql://localhost/votingsystem","root","");
                             
                              String query = "select *from contactus";
                              Statement st = con.createStatement();
                              
                              rs = st.executeQuery(query);
                              
                             while(rs.next())
                             {
                             String id =rs.getString("id");
                             
                            
                            %> 
           
                            
                            
                            
                            <tr>
                                 <td><%=rs.getString("id")%></td>
                                <td><%=rs.getString("firstname")%></td>
                                <td><%=rs.getString("address")%></td>
                                <td><%=rs.getString("email")%></td>
                                <td><%=rs.getString("pno")%></td>
                                 <td><%=rs.getString("message")%></td>
                                 
                                <td><a href="deletec.jsp?id=<%=id%>"><input type="submit" id="submit" value="Delete" name="submit" class="btn btn-danger"> </a></td>
                             
                             
                               
                             
                                
                            </tr>
                            <%
                                }
                                %>
                       
                    </table>
                            </br>
                             </br>
                </div>
                
            </div>
    </body>
</html>


<%@page import="java.sql.*" %> 



<%
     String id= request.getParameter("id");
    
     Connection con;
     PreparedStatement pst;
     ResultSet rs;
     
     Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost/votingsystem","root","");
     pst = con.prepareStatement("delete from records where id =?");
    
     pst.setString(1, id);
     pst.executeUpdate();
      
     %>
     <script>
         alert("Record Deleted Successfully!!");
      </script>
      
                          <div align="left">
                              <p><a href="index.jsp">Click Back</a></p>
                            
                              <div align="center">
                                  <img src="Images/CANDI1.png" alt=""/>
                                  
                              </div>
                              
                              
                             
           
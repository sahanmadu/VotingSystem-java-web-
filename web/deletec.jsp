
<%@page import="java.sql.*" %> 



<%
     String id= request.getParameter("id");
    
     Connection con;
     PreparedStatement pst;
     ResultSet rs;
     
     Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost/votingsystem","root","");
     pst = con.prepareStatement("delete from contactus where id =?");
    
     pst.setString(1, id);
     pst.executeUpdate();
      
     %>
     <script>
         alert("Record Deleted Successfully!!");
      </script>
      
                          <div align="left">
                              <p><a href="contactshow.jsp">Click Back</a></p>
                            
                              <div align="center">
                                  
                                  <img src="imagesc/pic.jpg" alt=""/>
                                  
                              </div>
                              
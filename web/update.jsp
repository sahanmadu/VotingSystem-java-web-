
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %> 

<%
   
   if(request.getParameter("submit")!=null)
   { 
       
     String id= request.getParameter("id");
     String name= request.getParameter("cname");
     String party= request.getParameter("party");
     String age= request.getParameter("age");
     String nic= request.getParameter("nic");
     String email= request.getParameter("email");
     String electiontype= request.getParameter("electiontype");
     
     Connection con;
     PreparedStatement pst;
     ResultSet rs;
     
     Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost/votingsystem","root","");
     pst = con.prepareStatement("update records set cname=?, party=?, age=?,nic=?,email=?,electiontype=? where id =?");
     pst.setString(1, name);
     pst.setString(2, party);
     pst.setString(3, age);
     pst.setString(4, nic);
     pst.setString(5, email);
     pst.setString(6, electiontype);
     pst.setString(7, id);
     pst.executeUpdate();
      
     %>
     <script>
         alert("Record Updated Successfully!!");
      </script>
      <%
          }
          %>




<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Candidate Update</title>
         <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <div align="center">
            <h2><b>Candidate Update</b></h2>
        </div>  
    <div align="center">
        <img src="Images/CANDI1.png" alt=""/>
    </div>
    </head>
    <body>
        
        
        <div align="center">
            <div class="col-sm-4">
                <form  method="POST" action="">
                    
                    <%
                      Connection con;
                      PreparedStatement pst;
                      ResultSet rs;
     
                      Class.forName("com.mysql.jdbc.Driver");
                      con = DriverManager.getConnection("jdbc:mysql://localhost/votingsystem","root","");
                      
                      String id = request.getParameter("id");
                      pst =con.prepareStatement("select *from records where id= ?");
                      pst.setString(1,id);
                      rs=pst.executeQuery();
                      
                      while(rs.next()){
                          
                    %>
                   
                    <div align="left">
                        <label class="form-label"><b>Candidate Name</b></label>
                        <input type="text" class="form-control" placeholder="Candidate name" value="<%=rs.getString("cname")%>" name="cname" id="cname" required>
                    </div>
                      <div align="left">
                          <label class="form-label"><b>Party</b></label>
                        <input type="text" class="form-control" placeholder="Party" value="<%=rs.getString("party")%>" name="party" id="patty" required>
                     </div>
                          <div align="left">
                              <label class="form-label"><b>Age</b></label>
                        <input type="text" class="form-control" placeholder="Age" value="<%=rs.getString("age")%>" name="age" id="age" required>
                      </div>
                       <div align="left">
                              <label class="form-label"><b>NIC Number</b></label>
                        <input type="text" class="form-control" placeholder=" NIC number" value="<%=rs.getString("nic")%>" name="nic" id="nic" required>
                      </div>
                       
                    <div align="left">
                        <label class="form-label"><b>E-mail</b></label>
                        <input type="text" class="form-control" placeholder="E-mail" value="<%=rs.getString("email")%>" name="email" id="email" required>
                      </div>
                       <div align="left">
                           <label class="form-label"><b>Election Type</b> </label></br>
                        <select name="electiontype" class="form-control" value="<%=rs.getString("electiontype")%>">
                            <option>Presidential Election</option>
                             <option>Parliament Election</option>
                             <option>Provincial Council Election</option>
                             <option>Local Government Election</option>
                        </select>
                    </div>
            
                    <% 
                       }
                     %>

                          </br>
                          <div align="right">
                              <input type="submit" id="submit" value="Update" name="submit" class="btn btn-primary"> 
                              <input type="reset" id="reset" value="reset" name="reset" class="btn btn-warning"> 
                          </div> 
                          
                          
                          <div align="right">
                              <p><a href="index.jsp">Click Back</a></p>
                               
                </form>
        </div>
            
        </div>
                     
                    
                     <img src="Images/miscellaneous.png" alt=""/>
                    
                    
    </body>
</html>

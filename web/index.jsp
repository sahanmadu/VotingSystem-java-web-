
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %> 

<%
   
   if(request.getParameter("submit")!=null)
   { 
     String eid= request.getParameter("id");
     String name= request.getParameter("cname");
     String party= request.getParameter("party");
     String age= request.getParameter("age");
     String nic= request.getParameter("nic");
     String email= request.getParameter("email");
     String electiontype = request.getParameter("electiontype");
     
     Connection con;
     PreparedStatement pst;
     ResultSet rs;
     
     Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection("jdbc:mysql://localhost/votingsystem","root","");
     pst = con.prepareStatement("insert into records(id,cname,party,age,nic,email,electiontype)values(?,?,?,?,?,?,?)");
     pst.setString(1,eid);
     pst.setString(2,name);
     pst.setString(3,party);
     pst.setString(4,age);
     pst.setString(5,nic);
     pst.setString(6,email); 
     pst.setString(7,electiontype);
     
     pst.executeUpdate();
      
     %>
     <script>
         alert("Record Added Successfully!!");
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
    </br>

    </head>
    <body>
       
     
        <div class="row">
            <div  class="col-sm-4">
                <form  method="POST" action="">
                    
                        
                    <div align="left">
                        <label class="form-label"><b>Candidate Full Name</b></label>
                        <input type="text" class="form-control" placeholder="Enter candidate full name" name="cname" id="cname" required>
                    </div>
                    
                      <div align="left">
                          <label class="form-label"><b>Party</b></label>
                        <input type="text" class="form-control" placeholder="Enter candidate party" name="party" id="patty" required>
                     </div>
                          <div align="left">
                              <label class="form-label"><b>Age</b></label>
                        <input type="text" class="form-control" placeholder="Enter candidate age" name="age" id="age" required>
                      </div>
                     <div align="left">
                              <label class="form-label"><b>NIC Number</b></label>
                        <input type="text" class="form-control" placeholder="Enter candidate NIC number" name="nic" id="nic" required>
                      </div>
                    <div align="left">
                        <label class="form-label"><b>E-mail</b></label>
                        <input type="text" class="form-control" placeholder="Enter candidate e-mail" name="email" id="email" required>
                      </div>
                    <div align="left">
                        <label class="form-label"><b>Election Type</b> </label></br>
                        <select name="electiontype" class="form-control">
                            <option>Presidential Election</option>
                             <option>Parliament Election</option>
                             <option>Provincial Council Election</option>
                             <option>Local Government Election</option>
                        </select>
                    </div>
                   
                          </br>
                          <div align="right">
                              <input type="submit" id="submit" value="Submit" name="submit" class="btn btn-primary"> 
                              <input type="reset" id="reset" value="reset" name="reset" class="btn btn-warning"> 
                          </div>
                    
                    
                </form>
        </div>
            </br>
            <div class="col-sm-8">
                <div class="panel-body">
           
                    
                    <table id="tbl-student" class="table alert-success" cellpadding ="" width="100%">
                        <thead>
                            <tr>
                                <th>E-ID</th>
                                <th>Candidate Name</th>
                                 <th>Party</th>
                                  <th>Age</th>
                                  <th>C-NIC</th>
                                   <th>E-mail</th>
                                   <th>E-Type</th>
                                   <th>Edit</th>
                                    <th>Delete</th>
                            </tr>
                            
                            
                            
                               
                               <%
                            
                            
                              Connection con;
                              PreparedStatement pst;
                              ResultSet rs;
     
                              Class.forName("com.mysql.jdbc.Driver");
                              con = DriverManager.getConnection("jdbc:mysql://localhost/votingsystem","root","");
                             
                              String query = "select *from records";
                              Statement st = con.createStatement();
                              
                              rs = st.executeQuery(query);
                              
                             while(rs.next())
                             {
                             String id =rs.getString("id");
                             
                            
                            %> 
           
                            
                            
                            
                            <tr>
                                 <td><%=rs.getString("id")%></td>
                                <td><%=rs.getString("cname")%></td>
                                <td><%=rs.getString("party")%></td>
                                <td><%=rs.getString("age")%></td>
                                <td><%=rs.getString("nic")%></td>
                                 <td><%=rs.getString("email")%></td>
                               <td><%=rs.getString("electiontype")%></td>
                                <td><a href="update.jsp?id=<%=id%>"><input type="submit" id="submit" value="Edit" name="submit" class="btn btn-success"> </a></td>
                                <td><a href="delete.jsp?id=<%=id%>"><input type="submit" id="submit" value="Delete" name="submit" class="btn btn-danger"> </a></td>
                             
                                
                            </tr>
                            <%
                                }
                                %>
                       
                    </table>
                            </br>
                             </br>
                </div>
                
            </div>
                               
                                <div>
                                <img src="Images/miscellaneous.png" alt=""/>
                                <img src="Images/miscellaneous.png" alt=""/>
                                <img src="Images/miscellaneous.png" alt=""/>
                                </div>
                                
         
    </body>
</html>

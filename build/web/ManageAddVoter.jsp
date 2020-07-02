<%-- 
    Document   : ManageAddVoter
    Created on : Apr 19, 2020, 2:29:07 PM
    Author     : Sahan
--%>
<%@page import="Classes.DbAccess"%>
<%@page import="Classes.Vote"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
      
    </head>
    <body>
             <%
            String nic=request.getParameter("hid");
            String name=request.getParameter("hname");
             String address=request.getParameter("haddress");
              String email=request.getParameter("hemail");
               String district=request.getParameter("district");
                String username=request.getParameter("uname");
                  String pass=request.getParameter("pwd");
                    String cpass=request.getParameter("cpwd");
               int tele=Integer.parseInt(request.getParameter("htele"));
               

               Vote n=new Vote(0,nic,name,address,email,district,username,pass,cpass,tele);
               DbAccess da=new DbAccess();
               da.addNew(n);
              
    response.sendRedirect("Voters.html");
            
            %>
    </body>
</html>

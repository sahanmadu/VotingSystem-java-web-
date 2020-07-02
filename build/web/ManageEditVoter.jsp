<%-- 
    Document   : ManageEditVoter
    Created on : Apr 19, 2020, 3:22:30 PM
    Author     : Sahan
--%>

<%@page import="Classes.DbAccess"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <%
            String idTemp=request.getParameter("id");
            int id=Integer.parseInt(idTemp);
             String nic=request.getParameter("hid");
            String name=request.getParameter("hname");
            String address=request.getParameter("haddress");
            String email=request.getParameter("hemail");
              String district=request.getParameter("district");
                String username=request.getParameter("uname");
                  String pass=request.getParameter("pwd");
                    String cpass=request.getParameter("cpwd");
            int tele=Integer.parseInt(request.getParameter("htele"));
            

               DbAccess da=new DbAccess();
               da.edit(id,nic, name, address, email,district,username,pass,cpass,tele);

            response.sendRedirect("/VotingSystem/Allposts");
            %>
    </body>
</html>

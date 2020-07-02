<%-- 
    Document   : Addvote
    Created on : May 2, 2020, 8:12:28 PM
    Author     : Sahan
--%>

<%@page import="Sankas.DbAccess1"%>
<%@page import="Sankas.new12"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String partie=request.getParameter("partie");
            String candidate=request.getParameter("candi");
            
               

               new12 n=new new12(0,partie,candidate);
               DbAccess1 da=new DbAccess1();
               da.addNew(n);
              
   
     response.sendRedirect("Vote.jsp");
    
    %>
    
            
    </body>
</html>

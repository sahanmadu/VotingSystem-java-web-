<%-- 
    Document   : Allposts
    Created on : Apr 19, 2020, 2:19:13 PM
    Author     : Sahan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="CSS/display.css"/>
        <title>JSP Page</title>
    </head>
    <body class="bg">
     
        <h6 style="float:right;color:#ffffff"><%=new java.util.Date()%> </h6> 

        <h1 style="text-align: center;color: #ffffff">Voters data</h1>
        
        <table cellpadding="10" class="table table-striped text-nowrap text-white bg-dark">
            <tr>
                <th scope="col">id</th>
                <th scope="col">nic</th>
                 <th scope="col">name</th>
                  <th scope="col">address</th>
                   <th scope="col">email</th>
                    <th scope="col">district</th>
                     <th scope="col">usernmae</th>
                      <th scope="col">password</th>
                       <th scope="col">confirm password</th>
                    <th scope="col">tele</th>
                    <th scope="col">Edit & Delete</th>
            </tr> 
            <c:forEach items="${Allposts}" var="p"> 
                <tr>
                  
                    <td>${p.id}</td>
                    <td>${p.nic}</td>
                      <td>${p.name}</td>
                        <td>${p.address}</td>
                          <td>${p.email}</td>
                            <td>${p.district}</td>
                               <td>${p.username}</td>
                                  <td>${p.pwd}</td>
                                     <td>${p.cpwd}</td>
                                         <td>${p.tele}</td>
                            <td>
                                <a href="edit?id=${p.id}" class="btn btn-success btn-lg active " role="button" aria-pressed="true">edit</a>
                                 <a href="delete?id=${p.id}" class="btn btn-danger btn-lg active" role="button" aria-pressed="true">DELETE</a>
                            </td>
                            
             
                </tr>
            
            </c:forEach>
            
        </table>
          
       
    </body>
</html>

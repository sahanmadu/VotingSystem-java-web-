<%-- 
    Document   : Editpost
    Created on : Apr 19, 2020, 2:37:42 PM
    Author     : Sahan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
       <link rel="stylesheet" href="CSS/index.css"/>
       <style>
           body{
               background-image: url('Images/signup.jpg');
               background-size: cover;
           }
       </style>
    </head>
    <body>
      <div class="bg">
<div class="container">
	<br><br>
	<h1 class="text-center text-white font-weight-bold">UPDATE DETAILS</h1>
         <c:forEach items="${getNewById}" var="p">
	<div class="col-lg-8-m-auto d-block">
            
		<form class="bg-info text-white" action="ManageEditVoter.jsp" method="POST">
                    <div class="form-group">
				
			            <input type="hidden" name="id" value="${p.id}">  
				
				
			</div>
			<div class="form-group">
				<label class="text-white font-weight-bold">NIC</label>
                                <input type="text" name="hid" id="nic" class="form-control" autocomplete="off" value="${p.nic}">
				<span id="hid1" class="text-danger font-weight-bold"></span>
				
			</div>
			<div class="form-group">
				<label class="text-white font-weight-bold">FULL NAME</label>
                                <input type="text" name="hname" id="fname" class="form-control" autocomplete="off" value="${p.name}">
				<span id="hname1" class="text-danger font-weight-bold"></span>
				
			</div>
			<div class="form-group">
				<label class="text-white font-weight-bold">ADDRESS</label>
                                <input type="text" name="haddress" id="vaddress" class="form-control" autocomplete="off" value="${p.address}">
				<span id="haddress1" class="text-danger font-weight-bold"></span>
				
			</div>
				<div class="form-group">
				<label class="text-white font-weight-bold">EMAIL</label>
                                <input type="text" name="hemail" id="hospitalemail" class="form-control" autocomplete="off" value="${p.email}">
				<span id="hemail1" class="text-danger font-weight-bold"></span>
				
			</div>
                        <div class="form-group">
				<label class="text-white font-weight-bold">DISTRICT</label>
                                <select class="mdb-select md-form" id="dist" name="district">
                                    <option value="${p.district}"> ${p.district} </option>
                                  
                                     <option  value="Ampara">Ampara</option>
                                      <option  value="Badulla">Badulla</option>
                                       <option  value="Batticaloa">Batticaloa</option>
                                       <option  value="Colombo">Colombo</option>
                                      <option  value="Galle">Galle</option>
                                       <option  value="Gampaha">Gampaha</option>
                                       <option  value="Hambantota">Hambantota</option>
                                      <option  value="Jaffna">Jaffna</option>
                                       <option  value="Kaluthara">Kaluthara</option>
                                       <option  value="Kandy">Kandy</option>
                                      <option  value="Kagalle">Kagalle</option>
                                       <option  value="Kilinochchi">Kilinochchi</option>
                                       <option  value="Kurunegala">Kurunegala</option>
                                      <option  value="Mannar">Mannar</option>
                                       <option  value="Matale">Matale</option>
                                        <option  value="Matara">Matara</option>
                                       <option  value="Moneragala">Moneragala</option>
                                       <option  value="Mullaitivu">Mullaitivu</option>
                                      <option  value="Nuwara Eliya">Nuwara Eliya</option>
                                       <option  value="Plonnaruwa">Polonnaruwa</option>
                                        <option  value="Puttalam">Puttalam</option>
                                       <option  value="Ratnapura">Ratnapura</option>
                                      <option  value="Trincomalee">Trincomalee</option>
                                       <option  value="Vavuniya">Vavuniya</option>
                                </select>
				<span id="hroom" class="text-danger font-weight-bold"></span>
				
			</div>
                                     
                          <div class="form-group">
				<label class="text-white font-weight-bold">USERNAME</label>
				<input type="text" name="uname" id="hospitaluname" class="form-control" autocomplete="off" value="${p.username}">
				<span id="huname" class="text-danger font-weight-bold"></span>
				
			</div>
        
                        <div class="form-group">
				<label class="text-white font-weight-bold">PASSWORD</label>
				<input type="password" name="pwd" id="hospitalpwd" class="form-control" autocomplete="off" value="${p.pwd}">
				<span id="hpwd" class="text-danger font-weight-bold"></span>
				
			</div>
                            
                         <div class="form-group">
				<label class="text-white font-weight-bold">CONFIRM PASSWORD</label>
				<input type="password" name="cpwd" id="hospitalcpwd" class="form-control" autocomplete="off" value="${p.cpwd}">
				<span id="hcpwd" class="text-danger font-weight-bold"></span>
				
			</div>            
                        <div class="form-group">
				<label class="text-white font-weight-bold">TELEPHONE NO</label>
                                <input type="text" name="htele" id="teleno" class="form-control" autocomplete="off" value="${p.tele}">
				<span id="hno" class="text-danger font-weight-bold" ></span>
				
			</div>
			  <input type="submit" name="submit"  value="Update" class="btn btn-success">
                          <button class="btn btn-success"><a href="Allposts"></a>Cancel</button>
		</form>
		
	</div>
          </c:forEach>
</div>
</div>
       

        
    </body>
    </body>
</html>
